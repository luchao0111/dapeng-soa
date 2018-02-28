package com.github.dapeng.eventbus.api.message;

      import com.github.dapeng.core.*;
      import com.github.dapeng.org.apache.thrift.*;
      import java.util.ServiceLoader;
      import com.github.dapeng.eventbus.api.message.MsgScheduledServiceCodec.*;
      import com.github.dapeng.eventbus.api.message.service.MsgScheduledService;

      /**
       * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

      **/
      public class MsgScheduledServiceClient implements MsgScheduledService{
      private final String serviceName;
      private final String version;

      private SoaConnectionPool pool;

      public MsgScheduledServiceClient() {
        this.serviceName = "com.github.dapeng.eventbus.api.message.service.MsgScheduledService";
        this.version = "1.0.0";

        ServiceLoader<SoaConnectionPoolFactory> factories = ServiceLoader.load(SoaConnectionPoolFactory.class);
        for (SoaConnectionPoolFactory factory: factories) {
          this.pool = factory.getPool();
          break;
        }
        this.pool.registerClientInfo(serviceName,version);
      }

      
          
            /**
            * 

## 定时消息轮询任务

            **/
            
              public void fetchMessage() throws SoaException{

              String methodName = "fetchMessage";

              fetchMessage_args fetchMessage_args = new fetchMessage_args();
              

              fetchMessage_result response = pool.send(serviceName,version,"fetchMessage",fetchMessage_args, new FetchMessage_argsSerializer(), new FetchMessage_resultSerializer());

              
                  
                
            }
            
          

        

      /**
      * getServiceMetadata
      **/
      public String getServiceMetadata() throws SoaException {
        String methodName = "getServiceMetadata";
        getServiceMetadata_args getServiceMetadata_args = new getServiceMetadata_args();
        getServiceMetadata_result response = pool.send(serviceName,version,methodName,getServiceMetadata_args, new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer());
        return response.getSuccess();
      }

    }
    