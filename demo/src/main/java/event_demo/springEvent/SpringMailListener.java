package event_demo.springEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author psl
 * @date 2020/9/25
 */
@Component
public class SpringMailListener  {// implements ApplicationListener<SpringMailEvent>
//	@Override
	public void onApplicationEvent(SpringMailEvent event) {
		System.out.println("mail send========");
	}
}
