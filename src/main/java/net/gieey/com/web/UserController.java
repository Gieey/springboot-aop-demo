package net.gieey.com.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author china_
 */
@RestController
public class UserController {

    @RequestMapping("/user/hello")
    public String helloUser(){
        return "hello User";
    }
}
