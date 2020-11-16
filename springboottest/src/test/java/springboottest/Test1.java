package springboottest;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.service.TestServiceImp;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {Test1.class})
@ComponentScan(basePackages = "com.*")
public class Test1 {
	
	@Autowired
	private TestServiceImp testServiceImp;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Test
	public void test() {
		//testServiceImp.getName();
		int i = 1/0;
	}
	
	@Test
	public void test2() {
		int num = new Integer(1);
		Assert.assertEquals(num, 2);
	}
	
	@Test
	//@Transactional
	public void test3() {
		String sql = "select * from teacher";
		//jdbcTemplate.execute("select * from teacher");
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		System.out.println(list.toString());
	}
}
