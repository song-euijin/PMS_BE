package com.pms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pms.service.PmsService;
import com.pms.service.PmsVO;

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

}
