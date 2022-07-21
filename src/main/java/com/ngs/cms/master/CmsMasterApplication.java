package com.ngs.cms.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.ngs.cms.*", "com.common.*"})
@SpringBootApplication
@EnableFeignClients
public class CmsMasterApplication {

  public static void main(String[] args) {
    SpringApplication.run(CmsMasterApplication.class, args);
  }
}
