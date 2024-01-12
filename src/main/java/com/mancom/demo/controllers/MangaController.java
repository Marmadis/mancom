package com.mancom.demo.controllers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MangaController {
    @GetMapping("/manga")
    public String manga (@RequestParam(value = "manga", required = false)String manga ,
                        @RequestParam(value = "chapter", required = false) int chapter,
                        @RequestParam(value = "page" , required = false)int page ,Model model){
        int result = page+chapter;
        model.addAttribute("message",manga+" "+result+" ");

        System.out.println(manga+" "+chapter+" "+page+" ");


        return "manga";
    }
}
