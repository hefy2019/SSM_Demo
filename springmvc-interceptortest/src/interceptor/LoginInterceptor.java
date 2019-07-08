package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// ��ȡ�����URL
		StringBuffer url = request.getRequestURL();
		// login.jsp���¼����ִ�У�������
		if (url.indexOf("/toLogin") >= 0 || url.indexOf("/login") >= 0) {
			return true;
		}
		// ��ȡsession
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("user");
		if (obj != null)
			return true;
		// û�е�¼�Ҳ��ǵ�¼ҳ�棬ת������¼ҳ�棬��������ʾ������Ϣ
		request.setAttribute("msg", "��û��¼�����ȵ�¼��");
		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
		return false;
	}
}
