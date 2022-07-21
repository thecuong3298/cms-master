package com.ngs.cms.master.controller;

import com.common.dto.ResponseWrapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Cộng tác viên")
@RequestMapping("partner")
@RestController
public class PartnerController {

  @Operation(summary = "Báo cáo số lượng bài đăng cộng tác viên")
  @GetMapping("posts-quantity-report")
  public ResponseWrapper<String> getPartner() {
    return new ResponseWrapper<>("oke");
  }

  @Operation(summary = "Báo cáo số lượng bài đăng cộng tác viên")
  @GetMapping("test")
  public ResponseWrapper<String> test() {
    return new ResponseWrapper<>("oke");
  }
}
