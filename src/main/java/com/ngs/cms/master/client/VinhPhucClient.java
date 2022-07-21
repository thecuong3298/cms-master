package com.ngs.cms.master.client;


import com.common.dto.ResponseWrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "vinh-phuc", url = "${ngs.clients.vinh-phuc.url}")
public interface VinhPhucClient {

  @GetMapping("posts-quantity-report")
  ResponseWrapper test();
}
