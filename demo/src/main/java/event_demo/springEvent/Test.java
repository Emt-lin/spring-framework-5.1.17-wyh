package event_demo.springEvent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author psl
 * @date 2020/9/25
 */

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(App.class);

		MailBean bean = context.getBean(MailBean.class);
		// 发布一个SpringMailEvent事件
//		bean.sendMail();
	}
}
