package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TestDao;

@Service
public class TestServiceImp implements TestService {
	
	@Autowired
	private TestDao testDao;
	
	@Override
	public void getName() {
		System.out.println("依赖注入！");
		testDao.t();
	}

}
