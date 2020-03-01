
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
package com.today.api.stock.service;

        import com.github.dapeng.core.Processor;
        import com.github.dapeng.core.Service;
        import com.github.dapeng.core.SoaGlobalTransactional;

        import java.util.concurrent.Future;

        /**
         * Autogenerated by Dapeng-Code-Generator (2.2.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING

        * 
        **/
        @com.github.dapeng.core.CustomConfig()
        @Service(name="com.today.api.stock.service.StockOpenService",version = "1.0.0")
        @Processor(className = "com.today.api.stock.StockOpenServiceAsyncCodec$Processor")
        public interface StockOpenServiceAsync  extends com.github.dapeng.core.definition.AsyncService {
        
            /**
            * 

# APP 业务查询库存
## 业务描述
        根据门店号、货号列表，批量查询门店剩余库存
## 接口依赖
        无
## 边界异常说明
        无
## 输入
        1. storeId 财务店号
        2. List<skuNo>
## 前置检查
        1. 财务店号必须是八位
        2. skuNo 必须是八位
        3. 最多查询200个商品
## 逻辑处理
        1. 查询指定店铺指定货号的库存
## 数据库变更
        无
## 后置检查
        无
## 事务处理
        默认事务处理
## 输出
        1.

            **/
            
            
              
              Future<java.util.List<com.today.api.stock.response.GetStoreStockResponse>> getStoreStock(com.today.api.stock.request.GetStoreStockRequest request) throws com.github.dapeng.core.SoaException;
            
          
            /**
            * 

# APP 检查系统库存是否足量
## 业务描述
        根据门店号、货号列表，批量 查询门店剩余库存量是否在安全库存范围内
## 接口依赖
        无
## 边界异常说明
        无
## 输入
        1. storeId 财务店号
        2. List<skuNo>
## 前置检查
        1. 财务店号必须是八位
        2. skuNo 必须是八位
        3. 最多查询200个商品
## 逻辑处理
        1. 查询指定店铺指定货号的库存
## 数据库变更
        无
## 后置检查
        无
## 事务处理
        默认事务处理
## 输出
        1.

            **/
            
            
              
              Future<java.util.List<com.today.api.stock.response.CheckStoreStockResponse>> checkStoreStock(com.today.api.stock.request.CheckStoreStockRequest request) throws com.github.dapeng.core.SoaException;
            
          
            /**
            * 

# APP 订单扣减库存
## 业务描述
        PP 订单扣根据门店号、货号列表, 扣减库存，批量扣减库存量
## 接口依赖
        无
## 边界异常说明
        无
## 输入
        1. storeId 财务店号
        2. List<DeductStockByAppRequestItem>
## 前置检查
        1. 财务店号必须是八位
        2. skuNo 必须是八位
        3. 最多扣减200个商品
## 逻辑处理
        1. 查询指定店铺指定货号的库存, 如果不成在则扣减不成功
        2. 判断是否所有的库存都能扣减成功, 只要有一个 sku  扣减库存之后,库存量少于等于=3 则扣减不成功.
## 数据库变更
        update stock
        insert stock_jounarl
## 后置检查
        无
## 事务处理
        默认事务处理
## 输出
        1.

            **/
            
            
              
              Future<com.today.api.stock.response.DeductStockByAppResponse> deductStockByApp(com.today.api.stock.request.DeductStockByAppRequest request) throws com.github.dapeng.core.SoaException;
            
          
            /**
            * 

# APP 订单退货, 库存增加
## 业务描述
        APP 订单退货根据门店号、货号列表, 扣减库存，批量增加库存量
## 接口依赖
        无
## 边界异常说明
        无
## 输入
        1. storeId 财务店号
        2. List<DeductStockByAppRequestItem>
## 前置检查
        1. 财务店号必须是八位
        2. skuNo 必须是八位
        3. 最多扣减200个商品
## 逻辑处理
        1. 查询指定店铺指定货号的库存, 如果不成在则扣减不成功
        2. 判断是否所有的库存都能扣减成功, 只要有一个 sku  扣减库存之后,库存量少于等于=3 则扣减不成功.
## 数据库变更
        update stock
        insert stock_jounarl
## 后置检查
        无
## 事务处理
        默认事务处理
## 输出
        1.

            **/
            
            
              
              Future<com.today.api.stock.response.AddStockByAppReturnResponse> addStockByAppReturn(com.today.api.stock.request.AddStockByAppReturnRequest request) throws com.github.dapeng.core.SoaException;
            
          
      }
      