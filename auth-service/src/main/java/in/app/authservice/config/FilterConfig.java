package in.app.authservice.config;

import in.app.authservice.filter.RateLimitFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
//    @Bean
//    public FilterRegistrationBean<RateLimitFilter> rateLimitFilter() {
//        FilterRegistrationBean<RateLimitFilter> registrationBean = new FilterRegistrationBean<>();
//        registrationBean.setFilter(new RateLimitFilter());
//        registrationBean.addUrlPatterns("/api/*"); // Apply filter to specific URL patterns
//        return registrationBean;
//    }
}