package com.github.dapeng.soa;
        import com.github.dapeng.soa.domain.serializer.*;

        import com.github.dapeng.core.*;
        import com.github.dapeng.org.apache.thrift.*;
        import com.github.dapeng.org.apache.thrift.protocol.*;

        import com.github.dapeng.core.definition.SoaServiceDefinition;
        import com.github.dapeng.core.definition.SoaFunctionDefinition;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;

        import java.util.Optional;
        import java.util.concurrent.CompletableFuture;
        import java.util.concurrent.Future;

        /**
        * Autogenerated by Dapeng-Code-Generator (2.0.0-SNAPSHOT)
        *
        * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
        *  @generated
        **/
        public class PrintServiceCodec {

        
            public static class print_args {
            

            @Override
            public String toString(){
              StringBuilder stringBuilder = new StringBuilder("{");
                
                if(stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                stringBuilder.append("}");

              return stringBuilder.toString();
            }

          }

            public static class print_result {

            
                  @Override
                  public String toString(){
                  return "{}";
                }
                
          }

            public static class Print_argsSerializer implements BeanSerializer<print_args>{
            
      @Override
      public print_args read(TProtocol iprot) throws TException{

      print_args bean = new print_args();
      com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
          
            default:
            com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      validate(bean);
      return bean;
    }
    
      @Override
      public void write(print_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("print_args"));

      
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(print_args bean) throws TException{
      
    }
    

            @Override
            public String toString(print_args bean) { return bean == null ? "null" : bean.toString(); }

          }

            public static class Print_resultSerializer implements BeanSerializer<print_result>{
            @Override
            public print_result read(TProtocol iprot) throws TException{

              print_result bean = new print_result();
              com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
              iprot.readStructBegin();

              while(true){
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

                switch(schemeField.id){
                  case 0:  //SUCCESS
                  if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.VOID){
                    
      com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }else{
                    com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }
                  break;
                  /*
                  case 1: //ERROR
                  bean.setSoaException(new SoaException());
                  new SoaExceptionSerializer().read(bean.getSoaException(),iprot);
                  break A;
                  */
                  default:
                  com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
              }
              iprot.readStructEnd();

              validate(bean);
              return bean;
            }
            
      @Override
      public void write(print_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("print_result"));

      
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
      public void validate(print_result bean) throws TException{
      
    }
    

            @Override
            public String toString(print_result bean) { return bean == null ? "null" : bean.toString(); }
          }

            public static class print<I extends com.github.dapeng.soa.service.PrintService> extends SoaFunctionDefinition.Sync<I, print_args, print_result>
            {
              public print()
              {
                super("print", new Print_argsSerializer(),  new Print_resultSerializer());
              }

              @Override
              public print_result apply(I iface, print_args print_args) throws SoaException
              {

                print_result result = new print_result();


                
                 iface.print();
                

                return result;

              }

            }
          
            public static class printInfo_args {
            
                private com.github.dapeng.soa.domain.Info info;
                public com.github.dapeng.soa.domain.Info getInfo(){
                return this.info;
              }
                public void setInfo(com.github.dapeng.soa.domain.Info info){
                this.info = info;
              }
              

            @Override
            public String toString(){
              StringBuilder stringBuilder = new StringBuilder("{");
                
      stringBuilder.append("\"").append("info").append("\":").append(this.info == null ? "null" : this.info.toString()).append(",");
    
                if(stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                stringBuilder.append("}");

              return stringBuilder.toString();
            }

          }

            public static class printInfo_result {

            
                  private String success;
                  public String getSuccess(){
                  return success;
                }

                  public void setSuccess(String success){
                  this.success = success;
                }


                  @Override
                  public String toString(){
                  StringBuilder stringBuilder = new StringBuilder("{");
                    
      stringBuilder.append("\"").append("success").append("\":\"").append(success).append("\",");
    
                    stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                    stringBuilder.append("}");

                  return stringBuilder.toString();
                }

                
          }

            public static class PrintInfo_argsSerializer implements BeanSerializer<printInfo_args>{
            
      @Override
      public printInfo_args read(TProtocol iprot) throws TException{

      printInfo_args bean = new printInfo_args();
      com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT){
              com.github.dapeng.soa.domain.Info elem0 = new com.github.dapeng.soa.domain.Info();
        elem0=new com.github.dapeng.soa.domain.serializer.InfoSerializer().read(iprot);
       bean.setInfo(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
          
            default:
            com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      validate(bean);
      return bean;
    }
    
      @Override
      public void write(printInfo_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("printInfo_args"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("info", com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT, (short) 1));
            com.github.dapeng.soa.domain.Info elem0 = bean.getInfo();
             new com.github.dapeng.soa.domain.serializer.InfoSerializer().write(elem0, oprot);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(printInfo_args bean) throws TException{
      
              if(bean.getInfo() == null)
              throw new SoaException(SoaCode.NotNull, "info字段不允许为空");
            
                if(bean.getInfo() != null)
                new com.github.dapeng.soa.domain.serializer.InfoSerializer().validate(bean.getInfo());
              
    }
    

            @Override
            public String toString(printInfo_args bean) { return bean == null ? "null" : bean.toString(); }

          }

            public static class PrintInfo_resultSerializer implements BeanSerializer<printInfo_result>{
            @Override
            public printInfo_result read(TProtocol iprot) throws TException{

              printInfo_result bean = new printInfo_result();
              com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
              iprot.readStructBegin();

              while(true){
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

                switch(schemeField.id){
                  case 0:  //SUCCESS
                  if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING){
                    String elem0 = iprot.readString();
       bean.setSuccess(elem0);
                  }else{
                    com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }
                  break;
                  /*
                  case 1: //ERROR
                  bean.setSoaException(new SoaException());
                  new SoaExceptionSerializer().read(bean.getSoaException(),iprot);
                  break A;
                  */
                  default:
                  com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
              }
              iprot.readStructEnd();

              validate(bean);
              return bean;
            }
            
      @Override
      public void write(printInfo_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("printInfo_result"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("success", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 0));
            String elem0 = bean.getSuccess();
            oprot.writeString(elem0);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
      public void validate(printInfo_result bean) throws TException{
      
              if(bean.getSuccess() == null)
              throw new SoaException(SoaCode.NotNull, "success字段不允许为空");
            
    }
    

            @Override
            public String toString(printInfo_result bean) { return bean == null ? "null" : bean.toString(); }
          }

            public static class printInfo<I extends com.github.dapeng.soa.service.PrintService> extends SoaFunctionDefinition.Sync<I, printInfo_args, printInfo_result>
            {
              public printInfo()
              {
                super("printInfo", new PrintInfo_argsSerializer(),  new PrintInfo_resultSerializer());
              }

              @Override
              public printInfo_result apply(I iface, printInfo_args printInfo_args) throws SoaException
              {

                printInfo_result result = new printInfo_result();


                
                result.success = iface.printInfo(printInfo_args.info);
                

                return result;

              }

            }
          
            public static class printInfo2_args {
            
                private String name;
                public String getName(){
                return this.name;
              }
                public void setName(String name){
                this.name = name;
              }
              

            @Override
            public String toString(){
              StringBuilder stringBuilder = new StringBuilder("{");
                
      stringBuilder.append("\"").append("name").append("\":\"").append(name).append("\",");
    
                if(stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                stringBuilder.append("}");

              return stringBuilder.toString();
            }

          }

            public static class printInfo2_result {

            
                  private String success;
                  public String getSuccess(){
                  return success;
                }

                  public void setSuccess(String success){
                  this.success = success;
                }


                  @Override
                  public String toString(){
                  StringBuilder stringBuilder = new StringBuilder("{");
                    
      stringBuilder.append("\"").append("success").append("\":\"").append(success).append("\",");
    
                    stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                    stringBuilder.append("}");

                  return stringBuilder.toString();
                }

                
          }

            public static class PrintInfo2_argsSerializer implements BeanSerializer<printInfo2_args>{
            
      @Override
      public printInfo2_args read(TProtocol iprot) throws TException{

      printInfo2_args bean = new printInfo2_args();
      com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setName(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
          
            default:
            com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      validate(bean);
      return bean;
    }
    
      @Override
      public void write(printInfo2_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("printInfo2_args"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("name", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 1));
            String elem0 = bean.getName();
            oprot.writeString(elem0);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(printInfo2_args bean) throws TException{
      
              if(bean.getName() == null)
              throw new SoaException(SoaCode.NotNull, "name字段不允许为空");
            
    }
    

            @Override
            public String toString(printInfo2_args bean) { return bean == null ? "null" : bean.toString(); }

          }

            public static class PrintInfo2_resultSerializer implements BeanSerializer<printInfo2_result>{
            @Override
            public printInfo2_result read(TProtocol iprot) throws TException{

              printInfo2_result bean = new printInfo2_result();
              com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
              iprot.readStructBegin();

              while(true){
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

                switch(schemeField.id){
                  case 0:  //SUCCESS
                  if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING){
                    String elem0 = iprot.readString();
       bean.setSuccess(elem0);
                  }else{
                    com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }
                  break;
                  /*
                  case 1: //ERROR
                  bean.setSoaException(new SoaException());
                  new SoaExceptionSerializer().read(bean.getSoaException(),iprot);
                  break A;
                  */
                  default:
                  com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
              }
              iprot.readStructEnd();

              validate(bean);
              return bean;
            }
            
      @Override
      public void write(printInfo2_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("printInfo2_result"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("success", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 0));
            String elem0 = bean.getSuccess();
            oprot.writeString(elem0);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
      public void validate(printInfo2_result bean) throws TException{
      
              if(bean.getSuccess() == null)
              throw new SoaException(SoaCode.NotNull, "success字段不允许为空");
            
    }
    

            @Override
            public String toString(printInfo2_result bean) { return bean == null ? "null" : bean.toString(); }
          }

            public static class printInfo2<I extends com.github.dapeng.soa.service.PrintService> extends SoaFunctionDefinition.Sync<I, printInfo2_args, printInfo2_result>
            {
              public printInfo2()
              {
                super("printInfo2", new PrintInfo2_argsSerializer(),  new PrintInfo2_resultSerializer());
              }

              @Override
              public printInfo2_result apply(I iface, printInfo2_args printInfo2_args) throws SoaException
              {

                printInfo2_result result = new printInfo2_result();


                
                result.success = iface.printInfo2(printInfo2_args.name);
                

                return result;

              }

            }
          
            public static class printInfo3_args {
            

            @Override
            public String toString(){
              StringBuilder stringBuilder = new StringBuilder("{");
                
                if(stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                stringBuilder.append("}");

              return stringBuilder.toString();
            }

          }

            public static class printInfo3_result {

            
                  private String success;
                  public String getSuccess(){
                  return success;
                }

                  public void setSuccess(String success){
                  this.success = success;
                }


                  @Override
                  public String toString(){
                  StringBuilder stringBuilder = new StringBuilder("{");
                    
      stringBuilder.append("\"").append("success").append("\":\"").append(success).append("\",");
    
                    stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                    stringBuilder.append("}");

                  return stringBuilder.toString();
                }

                
          }

            public static class PrintInfo3_argsSerializer implements BeanSerializer<printInfo3_args>{
            
      @Override
      public printInfo3_args read(TProtocol iprot) throws TException{

      printInfo3_args bean = new printInfo3_args();
      com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
          
            default:
            com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      validate(bean);
      return bean;
    }
    
      @Override
      public void write(printInfo3_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("printInfo3_args"));

      
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(printInfo3_args bean) throws TException{
      
    }
    

            @Override
            public String toString(printInfo3_args bean) { return bean == null ? "null" : bean.toString(); }

          }

            public static class PrintInfo3_resultSerializer implements BeanSerializer<printInfo3_result>{
            @Override
            public printInfo3_result read(TProtocol iprot) throws TException{

              printInfo3_result bean = new printInfo3_result();
              com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
              iprot.readStructBegin();

              while(true){
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

                switch(schemeField.id){
                  case 0:  //SUCCESS
                  if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING){
                    String elem0 = iprot.readString();
       bean.setSuccess(elem0);
                  }else{
                    com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }
                  break;
                  /*
                  case 1: //ERROR
                  bean.setSoaException(new SoaException());
                  new SoaExceptionSerializer().read(bean.getSoaException(),iprot);
                  break A;
                  */
                  default:
                  com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
              }
              iprot.readStructEnd();

              validate(bean);
              return bean;
            }
            
      @Override
      public void write(printInfo3_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("printInfo3_result"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("success", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 0));
            String elem0 = bean.getSuccess();
            oprot.writeString(elem0);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
      public void validate(printInfo3_result bean) throws TException{
      
              if(bean.getSuccess() == null)
              throw new SoaException(SoaCode.NotNull, "success字段不允许为空");
            
    }
    

            @Override
            public String toString(printInfo3_result bean) { return bean == null ? "null" : bean.toString(); }
          }

            public static class printInfo3<I extends com.github.dapeng.soa.service.PrintService> extends SoaFunctionDefinition.Sync<I, printInfo3_args, printInfo3_result>
            {
              public printInfo3()
              {
                super("printInfo3", new PrintInfo3_argsSerializer(),  new PrintInfo3_resultSerializer());
              }

              @Override
              public printInfo3_result apply(I iface, printInfo3_args printInfo3_args) throws SoaException
              {

                printInfo3_result result = new printInfo3_result();


                
                result.success = iface.printInfo3();
                

                return result;

              }

            }
          

        public static class getServiceMetadata_args {

          @Override
          public String toString() {
            return "{}";
          }
        }


        public static class getServiceMetadata_result {

          private String success;

          public String getSuccess() {
            return success;
          }

          public void setSuccess(String success) {
            this.success = success;
          }

          @Override
          public String toString() {
            StringBuilder stringBuilder = new StringBuilder("{");
              stringBuilder.append("\"").append("success").append("\":\"").append(this.success).append("\",");
              stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
              stringBuilder.append("}");

            return stringBuilder.toString();
          }
        }

        public static class GetServiceMetadata_argsSerializer implements BeanSerializer<getServiceMetadata_args> {

          @Override
          public getServiceMetadata_args read(TProtocol iprot) throws TException {

            getServiceMetadata_args bean =new getServiceMetadata_args();
            com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
              schemeField = iprot.readFieldBegin();
              if (schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {
                break;
              }
              switch (schemeField.id) {
                default:
                com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);

              }
              iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
            return bean;
          }


          @Override
          public void write(getServiceMetadata_args bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getServiceMetadata_args"));
            oprot.writeFieldStop();
            oprot.writeStructEnd();
          }

          public void validate(getServiceMetadata_args bean) throws TException {}

          @Override
          public String toString(getServiceMetadata_args bean) {
            return bean == null ? "null" : bean.toString();
          }

        }

        public static class GetServiceMetadata_resultSerializer implements BeanSerializer<getServiceMetadata_result> {
          @Override
          public getServiceMetadata_result read(TProtocol iprot) throws TException {

            getServiceMetadata_result bean = new getServiceMetadata_result();
            com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
              schemeField = iprot.readFieldBegin();
              if (schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {
                break;
              }

              switch (schemeField.id) {
                case 0:  //SUCCESS
                if (schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING) {
                  bean.setSuccess(iprot.readString());
                } else {
                  com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
                default:
                com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
            return bean;
          }

          @Override
          public void write(getServiceMetadata_result bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getServiceMetadata_result"));

            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("success", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 0));
            oprot.writeString(bean.getSuccess());
            oprot.writeFieldEnd();

            oprot.writeFieldStop();
            oprot.writeStructEnd();
          }

          public void validate(getServiceMetadata_result bean) throws TException {

            if (bean.getSuccess() == null)
            throw new SoaException(SoaCode.NotNull, "success字段不允许为空");
          }

          @Override
          public String toString(getServiceMetadata_result bean) {
            return bean == null ? "null" : bean.toString();
          }
        }

        public static class getServiceMetadata<I extends com.github.dapeng.soa.service.PrintService> extends SoaFunctionDefinition.Sync<I, getServiceMetadata_args, getServiceMetadata_result> {
          public getServiceMetadata() {
            super("getServiceMetadata", new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer());
          }

          @Override
          public getServiceMetadata_result apply(I iface, getServiceMetadata_args args) {
            getServiceMetadata_result result = new getServiceMetadata_result();

            try (InputStreamReader isr = new InputStreamReader(PrintServiceCodec.class.getClassLoader().getResourceAsStream("com.github.dapeng.soa.service.PrintService.xml"));
            BufferedReader in = new BufferedReader(isr)) {
              int len = 0;
              StringBuilder str = new StringBuilder("");
              String line;
              while ((line = in.readLine()) != null) {

                if (len != 0) {
                  str.append("\r\n").append(line);
                } else {
                  str.append(line);
                }
                len++;
              }
              result.success = str.toString();

            } catch (Exception e) {
              e.printStackTrace();
              result.success = "";
            }

            return result;
          }

        }

        @SuppressWarnings("unchecked")
        public static class Processor<I extends com.github.dapeng.soa.service.PrintService> extends SoaServiceDefinition<com.github.dapeng.soa.service.PrintService>
        {

          public Processor(com.github.dapeng.soa.service.PrintService iface, Class<com.github.dapeng.soa.service.PrintService> ifaceClass)
          {
            super(iface, ifaceClass, buildMap(new java.util.HashMap<>()));
          }

          @SuppressWarnings("unchecked")
          private static <I extends com.github.dapeng.soa.service.PrintService> java.util.Map<String, SoaFunctionDefinition<I, ?, ?>> buildMap(java.util.Map<String, SoaFunctionDefinition<I, ?, ?>> processMap)
          {
            
                processMap.put("print", new print());
              
                processMap.put("printInfo", new printInfo());
              
                processMap.put("printInfo2", new printInfo2());
              
                processMap.put("printInfo3", new printInfo3());
              
            processMap.put("getServiceMetadata", new getServiceMetadata());
            return processMap;
          }
        }

      }
      