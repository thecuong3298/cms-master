package com.ngs.cms.master.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "ngs.clients", ignoreUnknownFields = false)
public class ClientsProperties {

  private Url vinhPhuc;

  private Url thaiNguyen;

  private Url haiDuong;

  private Url longAn;

  @Data
  @Configuration
  public static class Url {
    private String url;
  }
}
