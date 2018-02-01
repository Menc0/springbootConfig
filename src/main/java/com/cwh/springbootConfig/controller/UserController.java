package com.cwh.springbootConfig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cwh.springbootConfig.model.User;

@RestController
@EnableConfigurationProperties({User.class})//如果有该注解那么User里不需要@Component这个注解，如果User里写有@Component，该注解可以不需要
public class UserController {

	@Autowired
    User user;

    @RequestMapping(value = "/user")
    public String user(){
        return user.getGreeting()+" >>>>"+user.getName()+" >>>>"+ user.getUuid()+" >>>>"+user.getMax();
    }
}
