package com.example.ansarspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AnsarspringApplication {
	
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/s317ansar/SpringFrist.git
//	git push -u origin main
   @GetMapping("welcome")
	public String welcome() {
		return "hello ansar how are you";
	}
	public static void main(String[] args) {
		SpringApplication.run(AnsarspringApplication.class, args);
	}

}
