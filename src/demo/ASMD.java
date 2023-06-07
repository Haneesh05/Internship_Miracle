package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ASMD {
        @GetMapping("/addition")
        public String addition(@RequestParam int num1,@RequestParam int num2)
        {
            return ("Addition of "+num1+ " & "+num2+" "+num1+num2);
        }

        @GetMapping("/subtraction")
        public String subtraction(@RequestParam int num1,@RequestParam int num2)
        {
            return ("subtraction of "+num1+ " & "+num2+" "+(num1-num2));
        }

        @GetMapping("/multiplication")
        public String multiplication(@RequestParam int num1, @RequestParam int num2)
        {
            return ("multiplication of "+num1+ " & "+num2+" is "+(num1*num2));
        }

        @GetMapping("/division")
        public String division(@RequestParam int num1, @RequestParam int num2)
        {
            try {
                return ("The Value of the division "+num1+" & "+num2+" "+num1/num2);
            }
            catch(Exception e)
            {
                return "The division is not possible using as you used 0 in denominator";
            }
        }


}


