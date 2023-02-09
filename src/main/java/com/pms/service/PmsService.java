package com.pms.service;

import java.util.List;

public interface PmsService {

	void createProject(PmsVO pmsvo);
	List<PmsVO> selectProjectList();
	PmsVO selectProject(PmsVO pmsvo);
	PmsVO updateProject(PmsVO pmsvo);
	void deleteProject(PmsVO pmsvo);
	List<UserVO> selectUserList(PmsVO pmsvo);
	List<CodeVO> getDeptList();
	List<CodeVO> getDeptInfo(String commonCode);
	List<CodeVO> getUserInfo(String userDept);
	List<UserVO> projectUserList(PmsVO pmsvo);;
	void insertProjectMangerUser(List<UserVO> uservo, PmsVO pmsvo);
	void insertProjectParticipantUser(List<UserVO> uservo, PmsVO pmsvo);

}
