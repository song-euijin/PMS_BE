package com.pms.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pms.service.PmsVO;
import com.pms.service.UserVO;
import com.pms.service.CodeVO;
import com.pms.service.PmsService;

@RestController
public class PmsContoller {
	
	@Autowired
	private PmsService PmsService;

	@RequestMapping(value = "/createProject.do")
	public String userList(PmsVO pmsvo) {
		PmsService.createProject(pmsvo);
		return "test";
	}
	//!!!!!!!!!
	@RequestMapping(value = "/selectProjectList.do")
	public List<PmsVO> selectProjectList() {
		return PmsService.selectProjectList();
	}
	///
	@RequestMapping(value = "/selectProject.do")
	public PmsVO selectProjectList(PmsVO pmsvo) {
		return PmsService.selectProject(pmsvo);
	}
	
	@RequestMapping(value = "/updateProject.do")
	public PmsVO updateProject(PmsVO pmsvo) {
		return PmsService.updateProject(pmsvo);
	}
	
	@RequestMapping(value = "/deleteProject.do")
	public void deleteProject(PmsVO pmsvo) {
		 PmsService.deleteProject(pmsvo);
	}
	
	@RequestMapping(value = "/selectUserList.do")
	public List<UserVO> selectUserList(PmsVO pmsvo) {
		 return PmsService.selectUserList(pmsvo);
	}
	
	@RequestMapping(value = "/projectUserList.do")
	public List<UserVO> projectUserList(PmsVO pmsvo) {
		 return PmsService.projectUserList(pmsvo);
	}
	
	@RequestMapping(value = "/insertProjectMangerUser.do")
	public void insertProjectMangerUser(List<UserVO> uservo , PmsVO pmsvo) {
		 PmsService.insertProjectMangerUser(uservo,pmsvo);
	}
	
	@RequestMapping(value = "/insertProjectParticipantUser.do")
	public void insertProjectParticipantUser(List<UserVO> uservo, PmsVO pmsvo) {
		 PmsService.insertProjectParticipantUser(uservo,pmsvo);
	}
	
	
	
	// 부서 목록 조회
		@RequestMapping(value = "/CMN/organi/deptList.do")
		public List<CodeVO> getDeptList() throws Exception {
			List<CodeVO> deptList = PmsService.getDeptList();
			
			return deptList;
		}
		
		// 부서 상세 조회(부서)
		@RequestMapping(value = "/CMN/organi/deptInfo.do")
		public List<CodeVO> getDeptInfo(@RequestParam("commonCode")String commonCode) throws Exception {
			List<CodeVO> deptInfo = PmsService.getDeptInfo(commonCode);
			
			return deptInfo;
		}
		
		// 부서 상세 조회(사원)
		@RequestMapping(value = "/CMN/organi/userInfo.do")
		public List<CodeVO> getUserInfo(@RequestParam("userDept")String userDept) throws Exception {
			List<CodeVO> userInfo = PmsService.getUserInfo(userDept);

			
			return userInfo;
		}
	
}
