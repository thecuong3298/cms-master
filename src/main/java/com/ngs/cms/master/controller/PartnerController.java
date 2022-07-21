package com.ngs.cms.master.controller;

import com.common.dto.ResponseWrapper;
import com.ngs.cms.master.config.ClientsProperties;
import com.ngs.cms.master.dto.PostQuantityReportDto;
import com.ngs.cms.master.service.PartnerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Tag(name = "Cộng tác viên")
@RequestMapping("partner")
@RestController
@RequiredArgsConstructor
public class PartnerController {

  private final PartnerService partnerService;

  private final ClientsProperties clientsProperties;

  @Operation(summary = "Báo cáo số lượng bài đăng cộng tác viên")
  @GetMapping("posts-quantity-report")
  public ResponseWrapper<Page<PostQuantityReportDto>> getPartner(
      @Parameter(name = "fromDate", required = true, description = "Từ ngày", example = "01/12/2020 22:03:03") @RequestParam Date fromDate,
      @Parameter(name = "toDate", required = true, description = "Đến ngày", example = "22/12/2020 22:03:03") @RequestParam Date toDate,
      @ParameterObject Pageable pageable) {
    return new ResponseWrapper<>(partnerService.getPostQuantityReport(fromDate, toDate, pageable));
  }
}
