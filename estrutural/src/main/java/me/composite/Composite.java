package me.composite;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class Composite {

    @GetMapping(value = "/test")
    public String test(Model model){
        MenuPrincipal menuPrincipal = new MenuPrincipal("menuPrincipal", "/principal");
        Menu menu = new Menu("menu","/menu");
        MenuItem subMenu = new MenuItem("subMenu", "/subMenu");


        Menu menu2 = new Menu("menu2", "/menu2");
        MenuItem subMenu2 = new MenuItem("subMenu2", "/subMenu2");


        menuPrincipal.add(menu);
        menuPrincipal.add(menu2);
        menu.add(subMenu);
        menu2.add(subMenu2);

        List<String> urls = menuPrincipal.getUrls();
        model.addAttribute("urls",urls);
        return "bla";
    }
}
