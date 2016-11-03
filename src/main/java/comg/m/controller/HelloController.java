package comg.m.controller;


import comg.m.DAO.ComputerDAO;
import comg.m.DTO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalTime;
import java.util.List;

/**
 * Created by MingGong on 2016/11/3.
 */

@Controller
@RequestMapping("/Hello")
public class HelloController {

    @RequestMapping("/say")
    public String say(){
        return "Hello/say";
    }

    @RequestMapping("/now")
    public ModelAndView nowT(HttpServletResponse resp, HttpServletRequest httpServletRequest){
        ModelAndView modelAndView=new ModelAndView("Hello/nowtime");
        String strNow=LocalTime.now().toString();
        modelAndView.addObject("now",strNow);

        return modelAndView;
    }

    @Autowired
    public ComputerDAO computerDAO;

    @RequestMapping("/users")
    public ModelAndView getUsers(){
        List<User> users=computerDAO.getUsers();
        System.out.println("User count:"+users.size());
        return new ModelAndView("Hello/users","users",users);
    }
}
