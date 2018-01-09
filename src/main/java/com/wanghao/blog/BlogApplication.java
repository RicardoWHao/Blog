package com.wanghao.blog;
import com.wanghao.blog.dao.user.UserDao;
import com.wanghao.blog.dao.user.impl.UserDaoImpl;
import com.wanghao.blog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan(basePackages={"com.wanghao.blog"})
@SpringBootApplication
@RestController
public class BlogApplication {
	@Autowired
	UserDao userDao;
	@RequestMapping("/hello")
	public String Hello() {
		User user = new User();
		user.setId(234);
		user.setName("wanghao");
		userDao.insertUser(user);
		return "insert success!";
	}

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}
}
