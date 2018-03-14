package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.BaseUser;
import com.company.project.service.BaseUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/03/07.
*/
@RestController
@RequestMapping("/base/user")
public class BaseUserController {
    @Resource
    private BaseUserService baseUserService;

    @PostMapping("/add")
    public Result add(@RequestBody BaseUser baseUser) {
        baseUserService.save(baseUser);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        baseUserService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(@RequestBody BaseUser baseUser) {
        baseUserService.update(baseUser);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        BaseUser baseUser = baseUserService.findById(id);
        return ResultGenerator.genSuccessResult(baseUser);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<BaseUser> list = baseUserService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @PostMapping("/login")
    public Result login(@RequestBody BaseUser baseUser) {
       String username = baseUser.getUsername();
       String password = baseUser.getPassword();
       Condition condition = new Condition(BaseUser.class);
       condition.createCriteria().andCondition("username ='"+ username +"'" + "and password ='"+ password +"'");
       List<BaseUser> baseUserList = baseUserService.findByCondition(condition);
       if(baseUserList.size() > 0) {
           return ResultGenerator.genSuccessResult(baseUserList);
       }
        else {
           return ResultGenerator.loginMessage();
       }
    }
}
