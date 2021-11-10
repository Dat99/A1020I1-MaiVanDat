package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.text.NumberFormat;

@Controller
public class ConverterController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePage(){
        return "index";
    }


    @RequestMapping(value = "/converter",method = RequestMethod.GET)
    public ModelAndView converterController(@RequestParam double usd ){
        ModelAndView modelAndView = new	ModelAndView("index");
        double result = usd*22000;
//        NumberFormat formatter = NumberFormat.getCurrencyInstance(); // tạo dấu $
//        String moneyString = formatter.format(result);
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}

