package event_demo.springEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author psl
 * @date 2020/9/25
 */
@Component
public class MailBean {

//	@Autowired
//	ApplicationContext applicationContext;
//
//
//	public void sendMail() {
//		// ApplicationContext也是事件源。
//		// 发布一个事件
//		applicationContext.publishEvent(new SpringMailEvent(applicationContext));
//	}
}
