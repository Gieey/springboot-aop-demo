package net.gieey.com.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author china_
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "hello home";
    }
}
