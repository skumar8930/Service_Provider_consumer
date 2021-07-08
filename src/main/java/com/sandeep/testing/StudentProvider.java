package com.sandeep.testing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class StudentProvider
{
         @GetMapping("show")
         public String showMsg() 
         {
                   return "Hello from Provider";
         }
}