package mvc.init;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @author psl
 * @date 2020/9/26
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context =
				new AnnotationConfigWebApplicationContext();
		context.register(App.class);
		context.refresh();

		// 添加servlet
		DispatcherServlet dispatcherServlet = new DispatcherServlet(context);

		ServletRegistration.Dynamic registration =
				servletContext.addServlet("dispatcherServlet", dispatcherServlet);
		registration.addMapping("/");

		registration.setLoadOnStartup(1);
	}
}
