package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView homePage(){
        ModelAndView modelAndView =new ModelAndView("index");
        return modelAndView;
    }

    @RequestMapping(value = "/dictionary", method = RequestMethod.GET)
    public ModelAndView dictionaryController(@RequestParam String search){
        ModelAndView modelAndView = new ModelAndView("index");
        Map<String, String> dic=new HashMap<>();
        dic.put("Hello", "Xin chào");
        dic.put("Book", "Sách");
        dic.put("Computer","Máy tính");

        String result = dic.get(search);
        if(result !=null){
           modelAndView.addObject("result", result);
           return modelAndView;
        }
        else {
            modelAndView.addObject("result", "Không tìm thấy kết quả");
            return modelAndView;
        }
    }
}
