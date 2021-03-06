package com.hz.learnboot.freemarker;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot 应用启动类
 *
 * Created by hezhao on 28/06/2018.
 */
@SpringBootApplication
// mapper 接口类扫描包配置
@MapperScan("com.hz.learnboot.freemarker.dao")
public class SpringBootFreemarkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFreemarkerApplication.class, args);
	}
}
