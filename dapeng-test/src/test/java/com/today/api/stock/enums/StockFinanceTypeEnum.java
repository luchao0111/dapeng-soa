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
package com.today.api.stock.enums;

        /**
         * Autogenerated by Dapeng-Code-Generator (2.1.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING

        * 

 商品财务类型

        **/
        public enum StockFinanceTypeEnum implements com.github.dapeng.org.apache.thrift.TEnum{
        
            /**
            *

 正常商品

            **/
            NORMAL_SKU(1),
          
            /**
            *

 代售商品

            **/
            COMMISSION_SKU(2),
          
            /**
            *

 包材

            **/
            PACKING_SKU(3),
          
            /**
            *

 门店用品

            **/
            STORE_USE_SKU(4),
          
        /*
        * 未定义的枚举类型
        */
        UNDEFINED(-1);
        private final int value;

        private StockFinanceTypeEnum(int value){
          this.value = value;
        }

        public int getValue(){
          return this.value;
        }

        public static StockFinanceTypeEnum findByValue(int value){
          switch(value){
            
                case 1:
                return NORMAL_SKU;
              
                case 2:
                return COMMISSION_SKU;
              
                case 3:
                return PACKING_SKU;
              
                case 4:
                return STORE_USE_SKU;
              
            case -1:
              return UNDEFINED;
            default:
            return null;
          }
        }
      }
      