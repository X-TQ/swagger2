package cn.nchfly.swagger2.controller;

import cn.nchfly.swagger2.api.UserControllerApi;
import cn.nchfly.swagger2.pojo.User;
import org.springframework.web.bind.annotation.*;

/**
 * @Author xtq
 * @Date 2020/5/4 21:46
 * @Description
 */
@RestController
@RequestMapping("/user")
public class UserController implements UserControllerApi {

    @PostMapping("/save")
    public User add(User user) {
        return null;
    }

    @GetMapping("/find/{userId}")
    public User findByUserId(@PathVariable("userId") String userId) {
        return null;
    }

    @DeleteMapping("/del/{userId}")
    public void deleteByUserId(@PathVariable("userId") String userId) {

    }

    @PutMapping("/upd/{userId}")
    public void updateByUserId(@PathVariable("userId") String userId) {

    }
}
