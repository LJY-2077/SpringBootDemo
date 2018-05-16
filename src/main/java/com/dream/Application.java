/**  
* @Title: Application.java
* @Package com.dream
* @Description: TODO(用一句话描述该文件做什么)
* @author lijingyang   
* @date 2018年5月10日 下午5:25:38
* @version V1.0  
*/
package com.dream;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName: Application
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author li jingyang
 * @date 2018年5月10日 下午5:25:38
 *
 */

// @Configuration
// @ComponentScan
// @EnableAutoConfiguration
@SpringBootApplication // 此注解可以代替上面三个注解
@EnableTransactionManagement//开启事物支持，启用注解事物管理
public class Application extends SpringBootServletInitializer
{
	public static void main(String[] args) throws Exception
	{
		SpringApplication.run(Application.class, args);
	}
	
	//②
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(Application.class);
    }

    @Bean
    public PlatformTransactionManager txManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}