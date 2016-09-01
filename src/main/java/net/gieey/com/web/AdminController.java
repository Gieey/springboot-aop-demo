package net.gieey.com.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author china_
 */
@RestController
public class AdminController {

    @RequestMapping("/api/admin")
    public String helloAdmin(){
        return "hello admin";
    }
}
