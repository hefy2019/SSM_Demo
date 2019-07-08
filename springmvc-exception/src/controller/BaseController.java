package controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;

import exception.MyException;

public abstract class BaseController {
	/**
	 * ����@ExceptionHandler�쳣����
	 */
	@ExceptionHandler
	public String exception(HttpServletRequest request, Exception ex) {
		request.setAttribute("ex", ex);
		// ���ݲ�ͬ����ת��ͬҳ�棬���쳣��View�Ķ�Ӧ��ϵ
		if (ex instanceof SQLException) {
			return "sql-error";
		} else if (ex instanceof MyException) {
			return "my-error";
		} else {
			return "error";
		}
	}
}
