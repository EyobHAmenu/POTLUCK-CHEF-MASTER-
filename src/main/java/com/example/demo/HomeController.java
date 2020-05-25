package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class HomeController {
    ArrayList<Chef> chefList = new ArrayList<>();

    @RequestMapping("/home")
    public String homePage(Model model){
        model.addAttribute("chefs", chefList);
        return "homePage";
    }
    @GetMapping("/add")
    public String addChef(Model model){
        model.addAttribute("newChef", new Chef());
        return "addChef";
    }
    @PostMapping("/check")
    public String checkAddForm(Chef chef, BindingResult result){
        if (result.hasErrors()){
            return "addChef";
        }
        chefList.add(chef);
        return "redirect:/home";
    }
    @GetMapping("/author")
    public String aboutAuthor(){
        return "profile";
    }
}
