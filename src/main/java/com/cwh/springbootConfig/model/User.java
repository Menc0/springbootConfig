package com.cwh.springbootConfig.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@Configuration
//@PropertySource(value = "classpath:test.properties")
@ConfigurationProperties(prefix = "my")
/**
 * "@ConfigurationProperties"主动加载resource下的application.properties文件，
 * 如果自定义一个其他名配置文件可以加上以上两个注解@Configuration和@PropertySource,
 * 需要注意一点是：自定义的test.properties如果也是和application.properties的prefix一样的话，
 * 那么他还是会去自动加载application.properties文件
*/

//@Component
public class User {

	private String name;
    private int age;
    private int number;
    private String uuid;
    private int max;
    private String value;
    private String greeting;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
    
    
}
