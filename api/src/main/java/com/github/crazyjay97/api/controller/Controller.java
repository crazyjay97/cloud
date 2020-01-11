package com.github.crazyjay97.api.controller;

        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.Random;
        import java.util.concurrent.TimeUnit;

@RestController
public class Controller {

    @RequestMapping("hello")
    public String Hello() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-==-=-=-=");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-==-=-=-=");
        try {
            TimeUnit.SECONDS.sleep(new Random().nextInt(3));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "word";
    }
}
