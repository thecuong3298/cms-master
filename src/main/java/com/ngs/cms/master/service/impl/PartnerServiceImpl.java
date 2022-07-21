package com.ngs.cms.master.service.impl;

import com.common.dto.ResponseWrapper;
import com.common.dto.RestResponsePage;
import com.common.utils.CommonUtils;
import com.ngs.cms.master.client.VinhPhucClient;
import com.ngs.cms.master.dto.PostQuantityReportDto;
import com.ngs.cms.master.service.PartnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;

@RequiredArgsConstructor
@Service
public class PartnerServiceImpl implements PartnerService {

  private final VinhPhucClient vinhPhucClient;

  /**
   *
   * @param fromDate date from
   * @param toDate date to
   * @param pageable page, size, sort to pagination
   * @return Page<PostQuantityReportDto>
   */
  @Override
  public Page<PostQuantityReportDto> getPostQuantityReport(Date fromDate, Date toDate, Pageable pageable) {
    ResponseWrapper<RestResponsePage<PostQuantityReportDto>> response =  vinhPhucClient.getPostQuantityReport(fromDate, toDate, pageable);
    CommonUtils.checkResponseSuccess(response);
    return response.getData();
  }
}
