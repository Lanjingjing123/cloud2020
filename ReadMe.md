# 1 项目概述

## 1.1 cloud-api-commons

### 1.1.1 说明

​		API模块：提供数据库表模型模块

```

```



## 1.2 cloud-consumer-order-80

### 1.2.1 说明

​		消费者模块

### 1.2.2 注册进Eureka 中

- pom增加Eureke Client依赖

  ```xml
   <!--2020/4/26 eureka-client-->
   <dependency> 
       <groupId>org.springframework.cloud</groupId>
       <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
    </dependency>
  ```

  

- application.xml增加EurekaClient配置

  ```yaml
  ## 注册进Eureka的服务名
  spring:
    application:
      name: cloud-order-service
  
  ## eureka 注册信息
  eureka:
    client:
      # 表示是否将自己注册进EurekaServer 默认为true
      register-with-eureka: true
      # 是否从EurekaServer抓取已有的的注册信息，默认为true.单节点无所谓，集群必须设置为true才能配合ribbon使用负载均衡
      fetch-registry: true
      service-url:
        # 注册中心地址
        defaultZone: http://localhost:7001/eureka/
  ```

- 主启动类增加EurekaClient 启动注解

  ```java
  /**
   * @author lanjingjing
   * @description 订单主启动类
   * @date 2020/4/6
   */
  
  @SpringBootApplication
  @EnableEurekaClient
  public class OrderMain80 {
      public static void main(String[] args) {
          SpringApplication.run(OrderMain80.class,args);
      }
  }
  
  ```

  

## 1.3 cloud-provider-payment8001 

### 1.3.1 说明

​		生产者模块

### 1.3.2 注册进Eureka中

-  pom增加 EurekaServer相关依赖

- application.yml 配置参数

- 主启动类增加启动EurekaSrever注解

  **注：同1.2.2的配置**

## 1.4 cloud-eureka-server7001

### 1.4.1 说明

​		此工程为eureka Server 注册中心

### 1.4.2 启用EurekaServer

- pom增加 EurekaServer相关依赖

  ```xml
  <!--eureka-server 与老版本的引入不一致-->
  <dependency>
      <groupId>org.springframework.cloud</groupId>
      <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
  </dependency>
  ```

- application.yml 配置参数

  ```yaml
  server:
    port: 7001
  eureka:
    instance:
      hostname: localhost  # eureka 服务端的实列名称
    client:
      # false表示不向注册中心注册自己
      register-with-eureka: false
      service-url:
        # 设置与Eureka Server交互的地址查询服务和注册服务都需要依赖这个地址
        defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/
  
  ```

- 主启动类增加启动EurekaSrever注解

  ```java
  package com.huayi.ljj.springcloud;
  
  import org.springframework.boot.SpringApplication;
  import org.springframework.boot.autoconfigure.SpringBootApplication;
  import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
  
  /**
   * @author lanjingjing
   * @description Server
   * @date 2020/4/25
   */
  @SpringBootApplication
  @EnableEurekaServer
  public class EurekaServerMain7001 {
      public static void main(String[] args) {
          SpringApplication.run(EurekaServerMain7001.class,args);
      }
  }
  
  ```

  