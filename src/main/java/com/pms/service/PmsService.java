package com.pms.service;

import java.util.List;

public interface PmsService {

	void createProject(PmsVO pmsvo);
	List<PmsVO> selectProjectList();
	PmsVO selectProject(PmsVO pmsvo);
	PmsVO updateProject(PmsVO pmsvo);
	void deleteProject(PmsVO pmsvo);
}
