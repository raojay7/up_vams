//package up_vams.user.controller;
//
//import com.up_vams.user.service.UserService;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import javax.annotation.Resource;
//
///**
// * Created by 隽 on 2017/3/28.
// */
//@Controller
//@RequestMapping("/user")
//public class UserAction
//{
//    @Resource
//    private UserService userService;
//
//    @RequestMapping("hello")
//    public String toHellojsp()
//    {
//        return "hello";
//    }
//
//    @RequestMapping("findUser")
//    public String findUser(Model model)
//    {
//        String str=userService.findUserById("1");
//        model.addAttribute("user",str);
//        return "findUser";
//    }
//
//}
