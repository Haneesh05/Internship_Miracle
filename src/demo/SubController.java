package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class SubController {

           @GetMapping("/sub")
        public int sub(@RequestParam int num1,@RequestParam int num2)
        {
            return num1-num2;

    }


}
