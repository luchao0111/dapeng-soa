
        package com.github.dapeng.basic.api.counter;
        import com.github.dapeng.basic.api.counter.domain.serializer.*;

        import com.github.dapeng.core.*;
        import com.github.dapeng.org.apache.thrift.*;
        import com.github.dapeng.org.apache.thrift.protocol.*;

        /**
        * Autogenerated by Dapeng-Code-Generator (2.0.4)
        *
        * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
        *
        **/
        public class CounterServiceSuperCodec {
        
            //1. method_args
            public static class submitPoint_args {
            
                private com.github.dapeng.basic.api.counter.domain.DataPoint dataPoint;
                public com.github.dapeng.basic.api.counter.domain.DataPoint getDataPoint(){
                return this.dataPoint;
              }
                public void setDataPoint(com.github.dapeng.basic.api.counter.domain.DataPoint dataPoint){
                this.dataPoint = dataPoint;
              }
              

          }

            //2. method_result
            public static class submitPoint_result {
            

          }

           //3. args_serializer
            public static class SubmitPoint_argsSerializer implements BeanSerializer<submitPoint_args>{
            
      @Override
      public submitPoint_args read(TProtocol iprot) throws TException{

      submitPoint_args bean = new submitPoint_args();
      com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT){
              com.github.dapeng.basic.api.counter.domain.DataPoint elem0 = new com.github.dapeng.basic.api.counter.domain.DataPoint();
        elem0=new com.github.dapeng.basic.api.counter.domain.serializer.DataPointSerializer().read(iprot);
       bean.setDataPoint(elem0);
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
      public void write(submitPoint_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("submitPoint_args"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("dataPoint", com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT, (short) 1));
            com.github.dapeng.basic.api.counter.domain.DataPoint elem0 = bean.getDataPoint();
             new com.github.dapeng.basic.api.counter.domain.serializer.DataPointSerializer().write(elem0, oprot);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(submitPoint_args bean) throws TException{
      
              if(bean.getDataPoint() == null)
              throw new SoaException(SoaCode.NotNull, "dataPoint字段不允许为空");
            
                if(bean.getDataPoint() != null)
                new com.github.dapeng.basic.api.counter.domain.serializer.DataPointSerializer().validate(bean.getDataPoint());
              
    }
    

            @Override
            public String toString(submitPoint_args bean) { return bean == null ? "null" : bean.toString(); }
          }


            //4.ResultSerializer
            public static class SubmitPoint_resultSerializer implements BeanSerializer<submitPoint_result>{
            @Override
            public submitPoint_result read(TProtocol iprot) throws TException{

              submitPoint_result bean = new submitPoint_result();
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
      public void write(submitPoint_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("submitPoint_result"));

      
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
      public void validate(submitPoint_result bean) throws TException{
      
    }
    

            @Override
            public String toString(submitPoint_result bean) { return bean == null ? "null" : bean.toString(); }
          }

          
            //1. method_args
            public static class submitPoints_args {
            
                private java.util.List<com.github.dapeng.basic.api.counter.domain.DataPoint> dataPoints;
                public java.util.List<com.github.dapeng.basic.api.counter.domain.DataPoint> getDataPoints(){
                return this.dataPoints;
              }
                public void setDataPoints(java.util.List<com.github.dapeng.basic.api.counter.domain.DataPoint> dataPoints){
                this.dataPoints = dataPoints;
              }
              

          }

            //2. method_result
            public static class submitPoints_result {
            

          }

           //3. args_serializer
            public static class SubmitPoints_argsSerializer implements BeanSerializer<submitPoints_args>{
            
      @Override
      public submitPoints_args read(TProtocol iprot) throws TException{

      submitPoints_args bean = new submitPoints_args();
      com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.LIST){
               com.github.dapeng.org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
        java.util.List<com.github.dapeng.basic.api.counter.domain.DataPoint> elem0 = new java.util.ArrayList<>(_list0.size);
        for(int _i0 = 0; _i0 < _list0.size; ++ _i0){
          com.github.dapeng.basic.api.counter.domain.DataPoint elem1 = new com.github.dapeng.basic.api.counter.domain.DataPoint();
        elem1=new com.github.dapeng.basic.api.counter.domain.serializer.DataPointSerializer().read(iprot);
          elem0.add(elem1);
        }
        iprot.readListEnd();
       bean.setDataPoints(elem0);
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
      public void write(submitPoints_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("submitPoints_args"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("dataPoints", com.github.dapeng.org.apache.thrift.protocol.TType.LIST, (short) 1));
            java.util.List<com.github.dapeng.basic.api.counter.domain.DataPoint> elem0 = bean.getDataPoints();
            
          oprot.writeListBegin(new com.github.dapeng.org.apache.thrift.protocol.TList(com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT, elem0.size()));
          for(com.github.dapeng.basic.api.counter.domain.DataPoint elem1 : elem0){
           new com.github.dapeng.basic.api.counter.domain.serializer.DataPointSerializer().write(elem1, oprot);
        }
          oprot.writeListEnd();
        
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(submitPoints_args bean) throws TException{
      
              if(bean.getDataPoints() == null)
              throw new SoaException(SoaCode.NotNull, "dataPoints字段不允许为空");
            
    }
    

            @Override
            public String toString(submitPoints_args bean) { return bean == null ? "null" : bean.toString(); }
          }


            //4.ResultSerializer
            public static class SubmitPoints_resultSerializer implements BeanSerializer<submitPoints_result>{
            @Override
            public submitPoints_result read(TProtocol iprot) throws TException{

              submitPoints_result bean = new submitPoints_result();
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
      public void write(submitPoints_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("submitPoints_result"));

      
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
      public void validate(submitPoints_result bean) throws TException{
      
    }
    

            @Override
            public String toString(submitPoints_result bean) { return bean == null ? "null" : bean.toString(); }
          }

          
            //1. method_args
            public static class queryPoints_args {
            
                private com.github.dapeng.basic.api.counter.domain.DataPoint condition;
                public com.github.dapeng.basic.api.counter.domain.DataPoint getCondition(){
                return this.condition;
              }
                public void setCondition(com.github.dapeng.basic.api.counter.domain.DataPoint condition){
                this.condition = condition;
              }
              
                private String beginTimeStamp;
                public String getBeginTimeStamp(){
                return this.beginTimeStamp;
              }
                public void setBeginTimeStamp(String beginTimeStamp){
                this.beginTimeStamp = beginTimeStamp;
              }
              
                private String endTimeStamp;
                public String getEndTimeStamp(){
                return this.endTimeStamp;
              }
                public void setEndTimeStamp(String endTimeStamp){
                this.endTimeStamp = endTimeStamp;
              }
              

          }

            //2. method_result
            public static class queryPoints_result {
            
                  private java.util.List<com.github.dapeng.basic.api.counter.domain.DataPoint> success;
                  public java.util.List<com.github.dapeng.basic.api.counter.domain.DataPoint> getSuccess(){
                  return success;
                }

                  public void setSuccess(java.util.List<com.github.dapeng.basic.api.counter.domain.DataPoint> success){
                  this.success = success;
                }
                

          }

           //3. args_serializer
            public static class QueryPoints_argsSerializer implements BeanSerializer<queryPoints_args>{
            
      @Override
      public queryPoints_args read(TProtocol iprot) throws TException{

      queryPoints_args bean = new queryPoints_args();
      com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT){
              com.github.dapeng.basic.api.counter.domain.DataPoint elem0 = new com.github.dapeng.basic.api.counter.domain.DataPoint();
        elem0=new com.github.dapeng.basic.api.counter.domain.serializer.DataPointSerializer().read(iprot);
       bean.setCondition(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 2:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setBeginTimeStamp(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 3:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setEndTimeStamp(elem0);
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
      public void write(queryPoints_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("queryPoints_args"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("condition", com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT, (short) 1));
            com.github.dapeng.basic.api.counter.domain.DataPoint elem0 = bean.getCondition();
             new com.github.dapeng.basic.api.counter.domain.serializer.DataPointSerializer().write(elem0, oprot);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("beginTimeStamp", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 2));
            String elem1 = bean.getBeginTimeStamp();
            oprot.writeString(elem1);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("endTimeStamp", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 3));
            String elem2 = bean.getEndTimeStamp();
            oprot.writeString(elem2);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(queryPoints_args bean) throws TException{
      
              if(bean.getCondition() == null)
              throw new SoaException(SoaCode.NotNull, "condition字段不允许为空");
            
                if(bean.getCondition() != null)
                new com.github.dapeng.basic.api.counter.domain.serializer.DataPointSerializer().validate(bean.getCondition());
              
              if(bean.getBeginTimeStamp() == null)
              throw new SoaException(SoaCode.NotNull, "beginTimeStamp字段不允许为空");
            
              if(bean.getEndTimeStamp() == null)
              throw new SoaException(SoaCode.NotNull, "endTimeStamp字段不允许为空");
            
    }
    

            @Override
            public String toString(queryPoints_args bean) { return bean == null ? "null" : bean.toString(); }
          }


            //4.ResultSerializer
            public static class QueryPoints_resultSerializer implements BeanSerializer<queryPoints_result>{
            @Override
            public queryPoints_result read(TProtocol iprot) throws TException{

              queryPoints_result bean = new queryPoints_result();
              com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
              iprot.readStructBegin();

              while(true){
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

                switch(schemeField.id){
                  case 0:  //SUCCESS
                  if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.LIST){
                     com.github.dapeng.org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
        java.util.List<com.github.dapeng.basic.api.counter.domain.DataPoint> elem0 = new java.util.ArrayList<>(_list0.size);
        for(int _i0 = 0; _i0 < _list0.size; ++ _i0){
          com.github.dapeng.basic.api.counter.domain.DataPoint elem1 = new com.github.dapeng.basic.api.counter.domain.DataPoint();
        elem1=new com.github.dapeng.basic.api.counter.domain.serializer.DataPointSerializer().read(iprot);
          elem0.add(elem1);
        }
        iprot.readListEnd();
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
      public void write(queryPoints_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("queryPoints_result"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("success", com.github.dapeng.org.apache.thrift.protocol.TType.LIST, (short) 0));
            java.util.List<com.github.dapeng.basic.api.counter.domain.DataPoint> elem0 = bean.getSuccess();
            
          oprot.writeListBegin(new com.github.dapeng.org.apache.thrift.protocol.TList(com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT, elem0.size()));
          for(com.github.dapeng.basic.api.counter.domain.DataPoint elem1 : elem0){
           new com.github.dapeng.basic.api.counter.domain.serializer.DataPointSerializer().write(elem1, oprot);
        }
          oprot.writeListEnd();
        
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
      public void validate(queryPoints_result bean) throws TException{
      
              if(bean.getSuccess() == null)
              throw new SoaException(SoaCode.NotNull, "success字段不允许为空");
            
    }
    

            @Override
            public String toString(queryPoints_result bean) { return bean == null ? "null" : bean.toString(); }
          }

          

        //5.

        //6. meta_args
        public static class getServiceMetadata_args {}

        //7. meta_result.
        public static class getServiceMetadata_result {

          private String success;

          public String getSuccess() {
            return success;
          }

          public void setSuccess(String success) {
            this.success = success;
          }
        }

        //8. args_serializer
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

        //9. meta_resultSerializer
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
       }


      