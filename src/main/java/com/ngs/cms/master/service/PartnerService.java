package com.ngs.cms.master.service;

import com.ngs.cms.master.dto.PostQuantityReportDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Date;

public interface PartnerService {

  Page<PostQuantityReportDto> getPostQuantityReport(Date fromDate, Date toDate, Pageable pageable);
}
