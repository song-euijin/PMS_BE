package com.pms.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pms.service.PmsVO;
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
	
	//!!!!
	@RequestMapping(value = "/selectProjectList.do")
	public List<PmsVO> selectProjectList() {
		return PmsService.selectProjectList();
	}
}
