
      package com.isuwang.soa.user.scala.service

      import com.github.dapeng.core.{Processor, Service}
      import com.github.dapeng.core.SoaGlobalTransactional
      import scala.concurrent.Future

      /**
       * Autogenerated by Dapeng-Code-Generator (2.0.4)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

      * 
      **/
      @Service(name ="com.isuwang.soa.user.service.UserService" , version = "1.0.0")
      @Processor(className = "com.isuwang.soa.user.scala.UserServiceAsyncCodec$Processor")
      trait UserServiceAsync extends com.github.dapeng.core.definition.AsyncService {
      
          /**
          * 
          **/
          
          @throws[com.github.dapeng.core.SoaException]
          def createUser(
          user: com.isuwang.soa.user.scala.domain.User ): Future[Unit]

        
          /**
          * 
          **/
          
          @throws[com.github.dapeng.core.SoaException]
          def getUserById(
          userId: Int ): Future[com.isuwang.soa.user.scala.domain.User]

        
    }
    