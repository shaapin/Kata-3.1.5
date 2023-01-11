package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String helloPage() {
        return "/login";
    }
    @GetMapping("/logout")
    public String logoutPage() {
        return "/login";
    }
}
