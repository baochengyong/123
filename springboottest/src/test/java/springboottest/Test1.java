package springboottest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {Test1.class})
@ComponentScan(basePackages = "com.*")
public class Test1 {
	@Autowired
	@Lazy
	JdbcTemplate jdbcTemplate;
	@Test
	public void tess() {
		//333
	}

}
