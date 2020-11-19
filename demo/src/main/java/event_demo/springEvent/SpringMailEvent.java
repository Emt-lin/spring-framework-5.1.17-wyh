package event_demo.springEvent;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author psl
 * @date 2020/9/25
 */
public  class SpringMailEvent{ // extends ApplicationEvent
	// 可以是事件发生的内容
	private String content;

	public SpringMailEvent(Object source) {
//		super(source);
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
