package xiaozhi.eureka.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/getInfo")
    public String getInfo() {
        return "first";
    }
}
