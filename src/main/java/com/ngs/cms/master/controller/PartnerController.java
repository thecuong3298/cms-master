package com.ngs.cms.master.controller;

import com.common.dto.ResponseWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Cộng tác viên")
@RestController
public class PartnerController {

  @GetMapping("partner")
  public ResponseWrapper<String> getPartner() {
    return new ResponseWrapper<>("oke");
  }
}
