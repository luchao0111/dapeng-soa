package com.github.dapeng.registry.zookeeper;

import com.github.dapeng.core.RuntimeInstance;
import com.github.dapeng.core.enums.LoadBalanceStrategy;

import java.util.*;

/**
 * @author lihuimin
 * @date 2017/12/25
 */
public class ZkServiceInfo {

    public enum Status {

        CREATED, ACTIVE, CANCELED,
    }

    final String service;

    private Status status = Status.CREATED;

    /**
     * instances list
     */
    private List<RuntimeInstance> runtimeInstances = new ArrayList<>(16);

    public ZkServiceInfo(String service) {
        this.service = service;
    }

    public List<RuntimeInstance> getRuntimeInstances() {
        return Collections.unmodifiableList(runtimeInstances);
    }

    public void setRuntimeInstances(List<RuntimeInstance> runtimeInstances) {
        this.runtimeInstances = runtimeInstances;
    }

    public String getService() {
        return service;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    //～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～
    //                           that's begin  config                              ～
    //                                                                             ～
    //～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～
    /**
     * timeout zk config
     */
    public Config<Long> timeConfig = new Config<>();
    /**
     * loadBalance zk config
     */
    public Config<LoadBalanceStrategy> loadbalanceConfig = new Config<>();

    /**
     * config class
     */
    public static class Config<T> {
        public T globalConfig;
        public Map<String, T> serviceConfigs = new HashMap<>();
        public Map<String, T> instanceConfigs = new HashMap<>();
    }

}
