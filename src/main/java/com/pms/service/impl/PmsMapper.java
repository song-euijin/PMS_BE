package com.pms.service.impl;

import java.util.List;

import com.pms.service.PmsVO;
import com.pms.service.UserVO;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("PmsMapper")
public interface PmsMapper {

	void createProject(PmsVO pmsvo);
	List<PmsVO> selectProjectList();
	PmsVO selectProject(PmsVO pmsvo);
	void updateProject(PmsVO pmsvo);
	void deleteProject(PmsVO pmsvo);
	List<UserVO> selectUserList(PmsVO pmsvo);
}
