 package com.github.dapeng.basic.api.counter.domain.serializer;
        import com.github.dapeng.basic.api.counter.domain.serializer.*;

        import com.github.dapeng.core.*;
        import com.github.dapeng.org.apache.thrift.*;
        import com.github.dapeng.org.apache.thrift.protocol.*;

        import java.util.Optional;
        import java.util.concurrent.CompletableFuture;
        import java.util.concurrent.Future;

        /**
        * Autogenerated by Dapeng-Code-Generator (2.1.1)
        *
        * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
        *
        **/
        public class DataPointSerializer implements BeanSerializer<com.github.dapeng.basic.api.counter.domain.DataPoint>{
        
      @Override
      public com.github.dapeng.basic.api.counter.domain.DataPoint read(TProtocol iprot) throws TException{

      com.github.dapeng.basic.api.counter.domain.DataPoint bean = new com.github.dapeng.basic.api.counter.domain.DataPoint();
      com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setBizTag(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 2:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.MAP){
              com.github.dapeng.org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
        java.util.Map<String,Long> elem0 = new java.util.HashMap<>(_map0.size);
        for(int _i0 = 0; _i0 < _map0.size; ++ _i0){
          String elem1 = iprot.readString();
          long elem2 = iprot.readI64();
          elem0.put(elem1, elem2);
        }
        iprot.readMapEnd();
       bean.setValues(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 3:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.I64){
              long elem0 = iprot.readI64();
       bean.setTimestamp(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 4:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.MAP){
              com.github.dapeng.org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
        java.util.Map<String,String> elem0 = new java.util.HashMap<>(_map0.size);
        for(int _i0 = 0; _i0 < _map0.size; ++ _i0){
          String elem1 = iprot.readString();
          String elem2 = iprot.readString();
          elem0.put(elem1, elem2);
        }
        iprot.readMapEnd();
       bean.setTags(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 5:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setDatabase(elem0);
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
      public void write(com.github.dapeng.basic.api.counter.domain.DataPoint bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("DataPoint"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("bizTag", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 1));
            String elem0 = bean.getBizTag();
            oprot.writeString(elem0);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("values", com.github.dapeng.org.apache.thrift.protocol.TType.MAP, (short) 2));
            java.util.Map<String, Long> elem1 = bean.getValues();
            
          oprot.writeMapBegin(new com.github.dapeng.org.apache.thrift.protocol.TMap(com.github.dapeng.org.apache.thrift.protocol.TType.STRING, com.github.dapeng.org.apache.thrift.protocol.TType.I64, elem1.size()));
          for(java.util.Map.Entry<String, Long> _it1 : elem1.entrySet()){

          String elem2 = _it1.getKey();
          Long elem3 = _it1.getValue();
          oprot.writeString(elem2);
          oprot.writeI64(elem3);
        }
          oprot.writeMapEnd();
        
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("timestamp", com.github.dapeng.org.apache.thrift.protocol.TType.I64, (short) 3));
            Long elem2 = bean.getTimestamp();
            oprot.writeI64(elem2);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("tags", com.github.dapeng.org.apache.thrift.protocol.TType.MAP, (short) 4));
            java.util.Map<String, String> elem3 = bean.getTags();
            
          oprot.writeMapBegin(new com.github.dapeng.org.apache.thrift.protocol.TMap(com.github.dapeng.org.apache.thrift.protocol.TType.STRING, com.github.dapeng.org.apache.thrift.protocol.TType.STRING, elem3.size()));
          for(java.util.Map.Entry<String, String> _it3 : elem3.entrySet()){

          String elem4 = _it3.getKey();
          String elem5 = _it3.getValue();
          oprot.writeString(elem4);
          oprot.writeString(elem5);
        }
          oprot.writeMapEnd();
        
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("database", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 5));
            String elem4 = bean.getDatabase();
            oprot.writeString(elem4);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(com.github.dapeng.basic.api.counter.domain.DataPoint bean) throws TException{
      
              if(bean.getBizTag() == null)
              throw new SoaException(SoaCode.StructFieldNull, "bizTag字段不允许为空");
            
              if(bean.getValues() == null)
              throw new SoaException(SoaCode.StructFieldNull, "values字段不允许为空");
            
              if(bean.getTags() == null)
              throw new SoaException(SoaCode.StructFieldNull, "tags字段不允许为空");
            
              if(bean.getDatabase() == null)
              throw new SoaException(SoaCode.StructFieldNull, "database字段不允许为空");
            
    }
    
        @Override
        public String toString(com.github.dapeng.basic.api.counter.domain.DataPoint bean)
        {return bean == null ? "null" : bean.toString();}
      }
      

      