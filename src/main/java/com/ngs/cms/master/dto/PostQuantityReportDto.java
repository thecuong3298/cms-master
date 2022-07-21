package com.ngs.cms.master.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
public class PostQuantityReportDto {
  @JsonProperty("user_id")
  private Long userId;

  private String username;

  @JsonProperty("tuyen_dung")
  private Long tuyenDung;

  @JsonProperty("rao_vat")
  private Long raoVat;

  @JsonProperty("thue_nha")
  private Long thueNha;

  private Long voucher;

  private Long tong;
}
