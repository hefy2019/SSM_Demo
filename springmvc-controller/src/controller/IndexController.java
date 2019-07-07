package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * "@Controller" ��ʾ IndexController��ʵ����һ��������
 * 
 * @Controller �����@Controller("indexController")
 *             ��@Controller(value="indexController")
 */
@Controller
@RequestMapping("/index")
public class IndexController {
	@RequestMapping(value = "/login")
	public String login() {
		/**
		 * login�����߼���ͼ���ƣ���Ҫ����Springmvc���� �ļ���internalResourceViewResolver��ǰ׺�ͺ�׺�ҵ���Ӧ��������ͼ
		 */
		return "login";		//��ת��/WEB-INF/jsp�µ�login.jsp
	}

	@RequestMapping(value = "/register")
	public String register() {
		/*
		 * ����ͼ�п���ʹ��EL���ʽ${success}ȡ��model�е�ֵ
		 */
		return "register";
	}
}
