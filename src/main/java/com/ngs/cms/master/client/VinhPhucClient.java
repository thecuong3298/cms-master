package com.ngs.cms.master.client;

import com.common.dto.ResponseWrapper;
import com.common.dto.RestResponsePage;
import com.ngs.cms.master.dto.PostQuantityReportDto;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@FeignClient(name = "vinh-phuc", url = "${ngs.clients.vinh-phuc.url}")
public interface VinhPhucClient {

  //  @GetMapping("posts-quantity-report")
  @GetMapping("partner/test")
  ResponseWrapper<RestResponsePage<PostQuantityReportDto>> getPostQuantityReport(
      @RequestParam Date fromDate, @RequestParam Date toDate, @ParameterObject Pageable pageable);
}
