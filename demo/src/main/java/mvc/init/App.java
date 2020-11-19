package mvc.init;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author psl
 * @date 2020/9/26
 */
@Configuration
@ComponentScan("mvc")
//@EnableWebMvc // 加上这个注解后，需要ServletContext初始化完成后才能成功
public class App implements WebMvcConfigurer {

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

	}
}
