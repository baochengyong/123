package com.springboottest;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.TestService;

@RestController
public class ControllerTest {
	
	@Autowired
	private TestService testService;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/test")
	public String test() {
		int i = 1/0;
		testService.getName();
		return "测试！2";
	}
	@RequestMapping("/dbtest")
	public String dbtest() {
		String sql = "select * from teacher";
		//jdbcTemplate.execute("select * from teacher");
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		return list.toString();
	}
}
