package mvc.init;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author psl
 * @date 2020/9/26
 */
public class SpringApplicationDemo {

	public static void run() throws LifecycleException {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(9090);
		/**
		 * 方式一：
		 * addWebapp：表示这是一个web项目。
		 * contextPath：tomcat的访问路径。docBase：项目的web目录
		 * 所以不用addWebapp，springboot 当中也不是用的这种方式。
		 * 用addWebapp()方法，tomcat会去加载实现了 ServletContainerInitializer 接口的类。
		 * 所以在其实现类中初始化 spring web环境，tomcat就会去自动调用完成初始化
 		 */
//		tomcat.addWebapp();

		/**
		 * 方式二：
		 * 用 addContext()：代表这不是一个web项目
		 * 但是调用addContext()方法，就不能在 ServletContainerInitializer接口 去初始化spring容器，
		 * 因为tomcat不会去加载实现 ServletContainerInitializer接口的类。
		 *
		 * 解决方法：直接在run()方法中添加 DispatcherServlet 类
		 */
		Context rootCxt = tomcat.addContext("/", "/xxx");
		// 下面三步，spring IOC 的环境初始化完成
		AnnotationConfigWebApplicationContext webContext =
				new AnnotationConfigWebApplicationContext();
		webContext.register(App.class);
		// 当配置类加了@WebMvc注解后，这行应该被注释，因为如果这里refresh的时候，ServletContext环境还没有
		// 准备好，所以需要加到DispatcherServlet实例化的后面，或者不加，因为 DispatcherServlet里面也有refresh
		webContext.refresh();

		DispatcherServlet dispatcherServlet = new DispatcherServlet(webContext);
		/**
		 * tomcat启动的过程中就会调用这个 dispatcherServlet的父类HttpServlet的init()方法
		 * dispatcherServlet 这个类就是初始化 请求和controller 之间的映射
 		 */

		Tomcat.addServlet(rootCxt, "dispatcherServlet", dispatcherServlet).
				setLoadOnStartup(0);
		// 这步完成，就代表spring web的项目已经初始化完成了
		rootCxt.addServletMappingDecoded("/", "dispatcherServlet");

		tomcat.start();
		tomcat.getServer().await();
	}
}
