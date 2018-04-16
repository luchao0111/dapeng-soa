import com.github.dapeng.core.InvocationContextImpl;
import com.github.dapeng.router.Route;
import com.github.dapeng.router.RoutesExecutor;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 描述:
 *
 * @author hz.lei
 * @date 2018年04月13日 下午10:00
 */
public class TestRouter {

    public Set<InetAddress> prepare(InvocationContextImpl ctx, List<Route> routes) {
        List<String> server = new ArrayList<>();
        server.add("192.168.1.101");
        server.add("192.168.1.102");
        server.add("192.168.1.103");
        server.add("192.168.1.104");
        Set<InetAddress> execute = RoutesExecutor.execute(ctx, routes, server);
        return execute;
    }

    public Set<InetAddress> expectResult(List<String> ips) {
        Set<InetAddress> expect = new HashSet<>();
        ips.forEach(x -> {
            try {
                expect.add(InetAddress.getByName(x));
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        });
        return expect;
    }


    @Test
    public void testRouterOneMatch() throws UnknownHostException {
        String pattern = "  method match 'getFoo' , 'setFoo' ; version match '1.0.0' => ip\"192.168.1.101/23\" " +
                System.getProperty("line.separator") + "method match 'getFoo' , 'setFoo' ; version match '1.0.0' => ip\"192.168.1.101/23\"";

//        String onePattern_oneMatcher = "method match 'get.*ById'  => ip'192.168.1.101/23' , ip'192.168.1.103/24' ";
        List<Route> routes = RoutesExecutor.parseAll(pattern);
        InvocationContextImpl ctx = (InvocationContextImpl) InvocationContextImpl.Factory.currentInstance();
        ctx.serviceName("getSkuById");
        ctx.versionName("1.0.0");
        Set<InetAddress> prepare = prepare(ctx, routes);


        List<String> ips = new ArrayList<>();
        ips.add("192.168.1.101");
        ips.add("192.168.1.103");

        Assert.assertArrayEquals(expectResult(ips).toArray(), prepare.toArray());
    }

    @Test
    public void testRouter() throws UnknownHostException {
        String onePattern_oneMatcher = "method match 'getFoo' , 'setFoo' ; version match '1.0.0' => ip'192.168.1.101/23' , ip'192.168.1.103/24' ";
        List<Route> routes = RoutesExecutor.parseAll(onePattern_oneMatcher);
        InvocationContextImpl ctx = (InvocationContextImpl) InvocationContextImpl.Factory.currentInstance();
        ctx.serviceName("getFoo");
        ctx.versionName("1.0.0");

        Set<InetAddress> prepare = prepare(ctx, routes);

        Set<InetAddress> expect = new HashSet<>();
        expect.add(InetAddress.getByName("192.168.1.101"));
        expect.add(InetAddress.getByName("192.168.1.103"));

        Assert.assertArrayEquals(expect.toArray(), prepare.toArray());
    }

    @Test
    public void testRouter2() {
        String onePattern_oneMatcher = "method match 'getFoo' , 'setFoo' ; version match '1.0.0' => ip'192.168.1.101/23' , ip'192.168.1.103/24' ";
        List<Route> routes = RoutesExecutor.parseAll(onePattern_oneMatcher);
        InvocationContextImpl ctx = (InvocationContextImpl) InvocationContextImpl.Factory.currentInstance();
        ctx.serviceName("setFoo");
        ctx.versionName("1.0.0");

        Set<InetAddress> prepare = prepare(ctx, routes);

        System.out.println(prepare);

    }

    @Test
    public void testRouterOneMatch3() throws UnknownHostException {
        String pattern = "  method match 'get1' , 'setFoo' ; version match '1.0.0' => ip\"192.168.1.101/23\" " +
                System.getProperty("line.separator") + " otherwise => ip\"192.168.1.101/23\" , ip\"192.168.1.103/23\"";

//        String onePattern_oneMatcher = "method match 'get.*ById'  => ip'192.168.1.101/23' , ip'192.168.1.103/24' ";
        List<Route> routes = RoutesExecutor.parseAll(pattern);
        InvocationContextImpl ctx = (InvocationContextImpl) InvocationContextImpl.Factory.currentInstance();
        ctx.serviceName("getSkuById");
        ctx.versionName("1.0.0");
        Set<InetAddress> prepare = prepare(ctx, routes);


        List<String> ips = new ArrayList<>();
        ips.add("192.168.1.101");
        ips.add("192.168.1.103");

        Assert.assertArrayEquals(expectResult(ips).toArray(), prepare.toArray());
    }

    /**
     * 取模测试
     *
     * @throws UnknownHostException
     */
    @Test
    public void testRouterOneMatch4() throws UnknownHostException {
        String pattern = "  userId match %\"1024n+2..4\" ; version match '1.0.0' => ip\"192.168.1.101/23\" ";

        List<Route> routes = RoutesExecutor.parseAll(pattern);
        InvocationContextImpl ctx = (InvocationContextImpl) InvocationContextImpl.Factory.currentInstance();
        ctx.serviceName("getSkuById");
        ctx.versionName("1.0.0");
        ctx.userId(2052L);
        Set<InetAddress> prepare = prepare(ctx, routes);


        List<String> ips = new ArrayList<>();
        ips.add("192.168.1.101");
//        ips.add("192.168.1.103");

        Assert.assertArrayEquals(expectResult(ips).toArray(), prepare.toArray());
    }


    public static void main(String[] args) {
        String s = "";
        int i = Integer.parseInt(s);
        System.out.println(i);


    }
}
