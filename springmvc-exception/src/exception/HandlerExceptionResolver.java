package exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface HandlerExceptionResolver {
	public ModelAndView resolveException(HttpServletRequest arg0,HttpServletResponse arg1,Object arg2,Exception arg3);
}
