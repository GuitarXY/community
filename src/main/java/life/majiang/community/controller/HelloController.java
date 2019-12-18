package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
/**
 * Created by xiaoy on 2019/12/18
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String  hello(@RequestParam(name = "name")String name,Model model){
        model.addAttribute("name",name);
        return "hello" ;
    }
}
