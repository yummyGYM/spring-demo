package cn.nju.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: Gu Yaming
 * @Description:
 * @Date:Create：in 2019/9/6 15:03
 * @Modified By：
 */
@Configuration //声明一个类是java配置类，相当于xml文件
@PropertySource("classpath:jdbc.properties") //读取资源文件
public class JdbcConfiguration {
/*    @Value()
    private String url;

    private String driverClassName;

    private String username;

    private String password;
    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName();
        dataSource.setUrl();
        dataSource.setUsername();
        dataSource.setPassword();
        return dataSource;
    }*/
}
