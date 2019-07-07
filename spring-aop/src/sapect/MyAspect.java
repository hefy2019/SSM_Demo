package sapect;

/**
 * 切面类，可以定义多个通知，即增强处理的方法
 * 
 * @author hfy 2019年5月9日
 */
public class MyAspect {
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("模拟权限控制");
	}
	public void except() {
		// TODO Auto-generated method stub
		System.out.println("模拟异常处理");
	}
	public void log() {
		// TODO Auto-generated method stub
		System.out.println("模拟日志记录");
	}
	public void monitor() {
		// TODO Auto-generated method stub
		System.out.println("性能监测");
	}
}
