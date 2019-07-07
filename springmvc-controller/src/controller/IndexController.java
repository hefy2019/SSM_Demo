package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * "@Controller" 表示 IndexController的实例是一个控制器
 * 
 * @Controller 相对于@Controller("indexController")
 *             或@Controller(value="indexController")
 */
@Controller
@RequestMapping("/index")
public class IndexController {
	@RequestMapping(value = "/login")
	public String login() {
		/**
		 * login代表逻辑视图名称，需要根据Springmvc配置 文件中internalResourceViewResolver的前缀和后缀找到对应的物理视图
		 */
		return "login";		//跳转到/WEB-INF/jsp下的login.jsp
	}

	@RequestMapping(value = "/register")
	public String register() {
		/*
		 * 在视图中可以使用EL表达式${success}取出model中的值
		 */
		return "register";
	}
}
