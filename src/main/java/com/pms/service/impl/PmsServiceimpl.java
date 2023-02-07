package com.pms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pms.service.PmsService;
import com.pms.service.PmsVO;
import com.pms.service.UserVO;

@Service("PmsService")
public class PmsServiceimpl implements PmsService{

	@Resource(name = "PmsMapper")
	private PmsMapper PmsMapper;
	
	@Override
	public void createProject(PmsVO pmsvo) {
		PmsMapper.createProject(pmsvo);
	}

	@Override
	public List<PmsVO> selectProjectList() {
		return PmsMapper.selectProjectList();
	}

	@Override
	public PmsVO selectProject(PmsVO pmsvo) {
		return PmsMapper.selectProject(pmsvo);
	}

	@Override
	public PmsVO updateProject(PmsVO pmsvo) {
		PmsMapper.updateProject(pmsvo);
		return PmsMapper.selectProject(pmsvo);
	}

	@Override
	public void deleteProject(PmsVO pmsvo) {
		PmsMapper.deleteProject(pmsvo);
		
	}

	@Override
	public List<UserVO> selectUserList(PmsVO pmsvo) {
		return PmsMapper.selectUserList(pmsvo);
	}

}
