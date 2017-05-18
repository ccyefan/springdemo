package com.alec.demo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alec.demo.dao.DemoRepository;
import com.alec.demo.domain.Demo;

@Service
public class DemoService {
	@Resource
	private DemoRepository demoRepository;
	@Transactional
	public void save(Demo demo){
		demoRepository.save(demo);
	}
}
