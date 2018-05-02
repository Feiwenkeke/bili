package top.kooriookami.bili;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: fei
 * @Date: 2018/5/2
 * @Time: 0:05
 * @Description:
 */
public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BiliApplication.class);
    }


}
