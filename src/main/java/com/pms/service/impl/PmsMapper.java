package com.pms.service.impl;

import java.util.List;

import com.pms.service.PmsVO;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("PmsMapper")
public interface PmsMapper {

	public void createProject(PmsVO pmsvo);
	public List<PmsVO> selectProjectList();
	public PmsVO selectProject(PmsVO pmsvo);
}
