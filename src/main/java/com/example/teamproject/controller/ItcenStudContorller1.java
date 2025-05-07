package com.example.teamproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ItcenStudContorller1 {

<<<<<<< HEAD:src/main/java/com/example/teamproject/controller/ItcenStudContorller1.java
    @GetMapping("/itcenstud1")
    public @ResponseBody String itcenstud1() {
        return "Hello, itcenstud1!!";
    }
    
}
=======
    @GetMapping("/itcenstud")
    public @ResponseBody String itcenstud() {
        return "Hello, itcenstud!!";
    }
  
     @GetMapping("/asimuleo")
     public @ResponseBody String asimuleo() {
         return "hello, asimuleo";
     }
    

}

>>>>>>> 60f68d15208b77e4752069f405c95738b9a67ac4:src/main/java/com/example/teamproject/controller/ItcenStudController.java
