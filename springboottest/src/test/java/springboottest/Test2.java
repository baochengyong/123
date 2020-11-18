package springboottest;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mapper.MapperDemo;
import com.mapper.Student;
import com.service.TestServiceImp;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {Test2.class})
@ComponentScan(basePackages = "com.*")
public class Test2 {
	
	//@Autowired
	//private TestServiceImp testServiceImp;
	
	@Autowired
	@Lazy
	JdbcTemplate jdbcTemplate;
	
	//@Autowired
	//@Lazy
	//private MapperDemo mapper;
	
	@Test
	public void test() {
		System.out.println(22);
		/*List<Student> list = mapper.getList();
		System.out.println(list.toString());*/
		//testServiceImp.getName();
		//int i = 1/0;
	}
	
	@Test
	public void test2() {
		/*int num = new Integer(1);
		//Assert.assertEquals(num, 2);
*/	}
	
	@Test
	public void test3() {
		/*String sql = "select * from student";
		//jdbcTemplate.execute("select * from teacher");
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		System.out.println(list.toString());*/
	}
}
