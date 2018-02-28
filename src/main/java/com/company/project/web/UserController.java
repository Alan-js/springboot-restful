package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.User;
import com.company.project.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
* Created by CodeGenerator on 2018/02/03.
*/
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/add")
    public Result add(User user) {
        userService.save(user);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        userService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(User user) {
        userService.update(user);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        User user = userService.findById(id);
        return ResultGenerator.genSuccessResult(user);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = userService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @GetMapping("/login")
    public Result login(@RequestParam Map<String, String> params) {
        String username = params.get("userName");
        String password = params.get("password");
        Condition condition = new Condition(User.class);
        condition.createCriteria().andCondition("username ='"+ username +"'" + "and password ='"+ password +"'");
        List<User> userList = userService.findByCondition(condition);
        if(userList.size() > 0) {
            return ResultGenerator.genSuccessResult();
        } else {
            return ResultGenerator.login_message();
        }
    }

    @GetMapping("/getName")
    public Result getName(@RequestParam Map<String, String> params) {
        String username = params.get("userName");
        Condition condition = new Condition(User.class);
        condition.createCriteria().andCondition("username ='"+ username +"'");
        List<User> userList = userService.findByCondition(condition);
        if(userList.size() > 0) {
            return ResultGenerator.username_message();
        } else {
            return ResultGenerator.genSuccessResult(username);
        }
    }
}
