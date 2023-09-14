package top.chen.coupon.customer;

import feign.Logger;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    /**
     * 注册一个 WebClient 的实例用来远程调用
     * @return WebClient.Builder
     */
//    @Bean
//    @LoadBalanced
//    public WebClient.Builder register(){
//        return WebClient.builder();
//    }
    @Bean
    Logger.Level feignLogger(){
        return Logger.Level.FULL;
    }
}
