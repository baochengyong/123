package com.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapper.MapperDemo;
import com.mapper.Student;
import com.service.TestService;

@RestController
@RequestMapping("controllerTest")
public class ControllerTest {
	
	@Autowired
	private TestService testService;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private MapperDemo mapperDemo;
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	@RequestMapping("/test")
	public String test() {
		int i = 1/0;
		testService.getName();
		return "测试！2";
	}
	@RequestMapping("/dbtest")
	public String dbtest() {
		String sql = "select * from student";
		//jdbcTemplate.execute("select * from teacher");
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		return list.toString();
	}
	@RequestMapping("/testMapper")
	public String testMapper() {
		List<Student> list = mapperDemo.getData();
		return list.toString();
	}
	
	@RequestMapping("/testRedisPut")
	public String testRedisPut() {
		
		try {
			redisTemplate.opsForValue().set("key", "hello");
		} catch (Exception e) {
			return e.getMessage();
		}
		return "ok";
	}
	@RequestMapping("/testRedisGet")
	public String testRedisGet() {
		return	(String)redisTemplate.opsForValue().get("key");
	}
}

