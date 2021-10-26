package com.enjoy.jack;

import com.enjoy.jack.bean.X;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@Configuration
@ComponentScan("com.enjoy.jack")
@PropertySource(value = "classpath:application1.properties")
@EnableAspectJAutoProxy
//@EnableTransactionManagement
//@EnableWebMvc

@DependsOn
@Scope
@Import(Config.con.class)
public class Config {

    @Value("sblxc")
    String s;

    class con{}
}
