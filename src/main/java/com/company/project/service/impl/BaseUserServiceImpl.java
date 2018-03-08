package com.company.project.service.impl;

import com.company.project.dao.BaseUserMapper;
import com.company.project.model.BaseUser;
import com.company.project.service.BaseUserService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/03/07.
 */
@Service
@Transactional
public class BaseUserServiceImpl extends AbstractService<BaseUser> implements BaseUserService {
    @Resource
    private BaseUserMapper baseUserMapper;

}
