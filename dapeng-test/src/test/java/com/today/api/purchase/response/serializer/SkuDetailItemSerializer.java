 /*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.today.api.purchase.response.serializer;
        import com.today.api.purchase.request.serializer.*;import com.today.api.common.serializer.*;import com.today.api.purchase.response.serializer.*;import com.today.api.stock.response.serializer.*;import com.today.api.stock.request.serializer.*;import com.today.api.stock.events.serializer.*;import com.today.api.stock.vo.serializer.*;

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
        public class SkuDetailItemSerializer implements BeanSerializer<com.today.api.purchase.response.SkuDetailItem>{
        
      @Override
      public com.today.api.purchase.response.SkuDetailItem read(TProtocol iprot) throws TException{

      com.today.api.purchase.response.SkuDetailItem bean = new com.today.api.purchase.response.SkuDetailItem();
      TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == TType.I64){
              long elem0 = iprot.readI64();
       bean.setId(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 3:
              if(schemeField.type == TType.I64){
              long elem0 = iprot.readI64();
       bean.setGoodsId(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 6:
              if(schemeField.type == TType.STRING){
              String elem0 = iprot.readString();
       bean.setInventoryAccountValue(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 7:
              if(schemeField.type == TType.STRING){
              String elem0 = iprot.readString();
       bean.setSkuNo(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 8:
              if(schemeField.type == TType.STRING){
              String elem0 = iprot.readString();
       bean.setSkuName(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 9:
              if(schemeField.type == TType.STRING){
              String elem0 = iprot.readString();
       bean.setSkuNameEn(Optional.of(elem0));
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 10:
              if(schemeField.type == TType.STRING){
              String elem0 = iprot.readString();
       bean.setPosname(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 11:
              if(schemeField.type == TType.STRING){
              String elem0 = iprot.readString();
       bean.setBrand(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 12:
              if(schemeField.type == TType.STRING){
              String elem0 = iprot.readString();
       bean.setSpec(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 13:
              if(schemeField.type == TType.STRING){
              String elem0 = iprot.readString();
       bean.setSaleUnit(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 14:
              if(schemeField.type == TType.I32){
               int elem0 = iprot.readI32();
       bean.setShelflife(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 17:
              if(schemeField.type == TType.I64){
              long elem0 = iprot.readI64();
       bean.setCategoryId(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 18:
              if(schemeField.type == TType.STRING){
              String elem0 = iprot.readString();
       bean.setCategoryCode(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 20:
              if(schemeField.type == TType.STRING){
              String elem0 = iprot.readString();
       bean.setMasterBarcode(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 21:
              if(schemeField.type == TType.I64){
              long elem0 = iprot.readI64();
       bean.setHeadquarterEffectiveDate(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 22:
              if(schemeField.type == TType.I64){
              long elem0 = iprot.readI64();
       bean.setStoreEffectiveDate(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 23:
              if(schemeField.type == TType.I32){
               int elem0 = iprot.readI32();
       bean.setMinOrderNum(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 24:
              if(schemeField.type == TType.I32){
               int elem0 = iprot.readI32();
       bean.setMinOrderTimes(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 25:
              if(schemeField.type == TType.I32){
               int elem0 = iprot.readI32();
       bean.setMaxOrderTimes(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 26:
              if(schemeField.type == TType.DOUBLE){
               double elem0 = iprot.readDouble();
       bean.setBuyingPrice(Optional.of(elem0));
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 27:
              if(schemeField.type == TType.DOUBLE){
               double elem0 = iprot.readDouble();
       bean.setSellingPrice(Optional.of(elem0));
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 28:
              if(schemeField.type == TType.DOUBLE){
               double elem0 = iprot.readDouble();
       bean.setInputTax(Optional.of(elem0));
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 29:
              if(schemeField.type == TType.DOUBLE){
               double elem0 = iprot.readDouble();
       bean.setOutputTax(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 30:
              if(schemeField.type == TType.DOUBLE){
               double elem0 = iprot.readDouble();
       bean.setLogisticsOutputTax(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 31:
              if(schemeField.type == TType.DOUBLE){
               double elem0 = iprot.readDouble();
       bean.setGrossMargin(Optional.of(elem0));
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 32:
              if(schemeField.type == TType.I64){
              long elem0 = iprot.readI64();
       bean.setSupplierId(Optional.of(elem0));
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 33:
              if(schemeField.type == TType.STRING){
              String elem0 = iprot.readString();
       bean.setSupplierNo(Optional.of(elem0));
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 35:
              if(schemeField.type == TType.STRING){
              String elem0 = iprot.readString();
       bean.setShippingMethodValue(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 36:
              if(schemeField.type == TType.I32){
               int elem0 = iprot.readI32();
       bean.setLength(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 37:
              if(schemeField.type == TType.I32){
               int elem0 = iprot.readI32();
       bean.setWidth(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 38:
              if(schemeField.type == TType.I32){
               int elem0 = iprot.readI32();
       bean.setHeight(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 39:
              if(schemeField.type == TType.I32){
               int elem0 = iprot.readI32();
       bean.setWeight(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 40:
              if(schemeField.type == TType.I32){
               int elem0 = iprot.readI32();
       bean.setFlag(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 41:
              if(schemeField.type == TType.I64){
              long elem0 = iprot.readI64();
       bean.setCreatedAt(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 42:
              if(schemeField.type == TType.I32){
               int elem0 = iprot.readI32();
       bean.setCreatedBy(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 43:
              if(schemeField.type == TType.I64){
              long elem0 = iprot.readI64();
       bean.setUpdatedAt(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 44:
              if(schemeField.type == TType.I32){
               int elem0 = iprot.readI32();
       bean.setUpdatedBy(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 45:
              if(schemeField.type == TType.STRING){
              String elem0 = iprot.readString();
       bean.setRemark(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 46:
              if(schemeField.type == TType.STRING){
              String elem0 = iprot.readString();
       bean.setMasterSupplierName(Optional.of(elem0));
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 50:
              if(schemeField.type == TType.I32){
               int elem0 = iprot.readI32();
       bean.setDeliveryTime(Optional.of(elem0));
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 51:
              if(schemeField.type == TType.STRING){
              String elem0 = iprot.readString();
       bean.setDistrictValue(Optional.of(elem0));
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 52:
              if(schemeField.type == TType.DOUBLE){
               double elem0 = iprot.readDouble();
       bean.setLogisticsPrice(Optional.of(elem0));
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
          
            default:
            TProtocolUtil.skip(iprot, schemeField.type);
          
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      validate(bean);
      return bean;
    }
    
      @Override
      public void write(com.today.api.purchase.response.SkuDetailItem bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new TStruct("SkuDetailItem"));

      
            oprot.writeFieldBegin(new TField("id", TType.I64, (short) 1));
            Long elem0 = bean.getId();
            oprot.writeI64(elem0);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("goodsId", TType.I64, (short) 3));
            Long elem1 = bean.getGoodsId();
            oprot.writeI64(elem1);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("inventoryAccountValue", TType.STRING, (short) 6));
            String elem2 = bean.getInventoryAccountValue();
            oprot.writeString(elem2);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("skuNo", TType.STRING, (short) 7));
            String elem3 = bean.getSkuNo();
            oprot.writeString(elem3);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("skuName", TType.STRING, (short) 8));
            String elem4 = bean.getSkuName();
            oprot.writeString(elem4);
            
            oprot.writeFieldEnd();
          if(bean.getSkuNameEn().isPresent()){
              oprot.writeFieldBegin(new TField("skuNameEn", TType.STRING, (short) 9));
              String elem5 = bean.getSkuNameEn().get();
              oprot.writeString(elem5);
              
            }
            
            oprot.writeFieldBegin(new TField("posname", TType.STRING, (short) 10));
            String elem6 = bean.getPosname();
            oprot.writeString(elem6);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("brand", TType.STRING, (short) 11));
            String elem7 = bean.getBrand();
            oprot.writeString(elem7);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("spec", TType.STRING, (short) 12));
            String elem8 = bean.getSpec();
            oprot.writeString(elem8);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("saleUnit", TType.STRING, (short) 13));
            String elem9 = bean.getSaleUnit();
            oprot.writeString(elem9);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("shelflife", TType.I32, (short) 14));
            Integer elem10 = bean.getShelflife();
            oprot.writeI32(elem10);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("categoryId", TType.I64, (short) 17));
            Long elem11 = bean.getCategoryId();
            oprot.writeI64(elem11);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("categoryCode", TType.STRING, (short) 18));
            String elem12 = bean.getCategoryCode();
            oprot.writeString(elem12);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("masterBarcode", TType.STRING, (short) 20));
            String elem13 = bean.getMasterBarcode();
            oprot.writeString(elem13);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("headquarterEffectiveDate", TType.I64, (short) 21));
            Long elem14 = bean.getHeadquarterEffectiveDate();
            oprot.writeI64(elem14);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("storeEffectiveDate", TType.I64, (short) 22));
            Long elem15 = bean.getStoreEffectiveDate();
            oprot.writeI64(elem15);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("minOrderNum", TType.I32, (short) 23));
            Integer elem16 = bean.getMinOrderNum();
            oprot.writeI32(elem16);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("minOrderTimes", TType.I32, (short) 24));
            Integer elem17 = bean.getMinOrderTimes();
            oprot.writeI32(elem17);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("maxOrderTimes", TType.I32, (short) 25));
            Integer elem18 = bean.getMaxOrderTimes();
            oprot.writeI32(elem18);
            
            oprot.writeFieldEnd();
          if(bean.getBuyingPrice().isPresent()){
              oprot.writeFieldBegin(new TField("buyingPrice", TType.DOUBLE, (short) 26));
              Double elem19 = bean.getBuyingPrice().get();
              oprot.writeDouble(elem19);
              
            }
            if(bean.getSellingPrice().isPresent()){
              oprot.writeFieldBegin(new TField("sellingPrice", TType.DOUBLE, (short) 27));
              Double elem20 = bean.getSellingPrice().get();
              oprot.writeDouble(elem20);
              
            }
            if(bean.getInputTax().isPresent()){
              oprot.writeFieldBegin(new TField("inputTax", TType.DOUBLE, (short) 28));
              Double elem21 = bean.getInputTax().get();
              oprot.writeDouble(elem21);
              
            }
            
            oprot.writeFieldBegin(new TField("outputTax", TType.DOUBLE, (short) 29));
            Double elem22 = bean.getOutputTax();
            oprot.writeDouble(elem22);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("logisticsOutputTax", TType.DOUBLE, (short) 30));
            Double elem23 = bean.getLogisticsOutputTax();
            oprot.writeDouble(elem23);
            
            oprot.writeFieldEnd();
          if(bean.getGrossMargin().isPresent()){
              oprot.writeFieldBegin(new TField("grossMargin", TType.DOUBLE, (short) 31));
              Double elem24 = bean.getGrossMargin().get();
              oprot.writeDouble(elem24);
              
            }
            if(bean.getSupplierId().isPresent()){
              oprot.writeFieldBegin(new TField("supplierId", TType.I64, (short) 32));
              Long elem25 = bean.getSupplierId().get();
              oprot.writeI64(elem25);
              
            }
            if(bean.getSupplierNo().isPresent()){
              oprot.writeFieldBegin(new TField("supplierNo", TType.STRING, (short) 33));
              String elem26 = bean.getSupplierNo().get();
              oprot.writeString(elem26);
              
            }
            
            oprot.writeFieldBegin(new TField("shippingMethodValue", TType.STRING, (short) 35));
            String elem27 = bean.getShippingMethodValue();
            oprot.writeString(elem27);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("length", TType.I32, (short) 36));
            Integer elem28 = bean.getLength();
            oprot.writeI32(elem28);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("width", TType.I32, (short) 37));
            Integer elem29 = bean.getWidth();
            oprot.writeI32(elem29);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("height", TType.I32, (short) 38));
            Integer elem30 = bean.getHeight();
            oprot.writeI32(elem30);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("weight", TType.I32, (short) 39));
            Integer elem31 = bean.getWeight();
            oprot.writeI32(elem31);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("flag", TType.I32, (short) 40));
            Integer elem32 = bean.getFlag();
            oprot.writeI32(elem32);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("createdAt", TType.I64, (short) 41));
            Long elem33 = bean.getCreatedAt();
            oprot.writeI64(elem33);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("createdBy", TType.I32, (short) 42));
            Integer elem34 = bean.getCreatedBy();
            oprot.writeI32(elem34);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("updatedAt", TType.I64, (short) 43));
            Long elem35 = bean.getUpdatedAt();
            oprot.writeI64(elem35);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("updatedBy", TType.I32, (short) 44));
            Integer elem36 = bean.getUpdatedBy();
            oprot.writeI32(elem36);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("remark", TType.STRING, (short) 45));
            String elem37 = bean.getRemark();
            oprot.writeString(elem37);
            
            oprot.writeFieldEnd();
          if(bean.getMasterSupplierName().isPresent()){
              oprot.writeFieldBegin(new TField("masterSupplierName", TType.STRING, (short) 46));
              String elem38 = bean.getMasterSupplierName().get();
              oprot.writeString(elem38);
              
            }
            if(bean.getDeliveryTime().isPresent()){
              oprot.writeFieldBegin(new TField("deliveryTime", TType.I32, (short) 50));
              Integer elem39 = bean.getDeliveryTime().get();
              oprot.writeI32(elem39);
              
            }
            if(bean.getDistrictValue().isPresent()){
              oprot.writeFieldBegin(new TField("districtValue", TType.STRING, (short) 51));
              String elem40 = bean.getDistrictValue().get();
              oprot.writeString(elem40);
              
            }
            if(bean.getLogisticsPrice().isPresent()){
              oprot.writeFieldBegin(new TField("logisticsPrice", TType.DOUBLE, (short) 52));
              Double elem41 = bean.getLogisticsPrice().get();
              oprot.writeDouble(elem41);
              
            }
            
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(com.today.api.purchase.response.SkuDetailItem bean) throws TException{
      
              if(bean.getInventoryAccountValue() == null)
              throw new SoaException(SoaCode.StructFieldNull, "inventoryAccountValue字段不允许为空");
            
              if(bean.getSkuNo() == null)
              throw new SoaException(SoaCode.StructFieldNull, "skuNo字段不允许为空");
            
              if(bean.getSkuName() == null)
              throw new SoaException(SoaCode.StructFieldNull, "skuName字段不允许为空");
            
              if(bean.getPosname() == null)
              throw new SoaException(SoaCode.StructFieldNull, "posname字段不允许为空");
            
              if(bean.getBrand() == null)
              throw new SoaException(SoaCode.StructFieldNull, "brand字段不允许为空");
            
              if(bean.getSpec() == null)
              throw new SoaException(SoaCode.StructFieldNull, "spec字段不允许为空");
            
              if(bean.getSaleUnit() == null)
              throw new SoaException(SoaCode.StructFieldNull, "saleUnit字段不允许为空");
            
              if(bean.getCategoryCode() == null)
              throw new SoaException(SoaCode.StructFieldNull, "categoryCode字段不允许为空");
            
              if(bean.getMasterBarcode() == null)
              throw new SoaException(SoaCode.StructFieldNull, "masterBarcode字段不允许为空");
            
              if(bean.getShippingMethodValue() == null)
              throw new SoaException(SoaCode.StructFieldNull, "shippingMethodValue字段不允许为空");
            
              if(bean.getRemark() == null)
              throw new SoaException(SoaCode.StructFieldNull, "remark字段不允许为空");
            
    }
    
        @Override
        public String toString(com.today.api.purchase.response.SkuDetailItem bean)
        {return bean == null ? "null" : bean.toString();}
      }
      

      