package com.onlee.dtmp.manage.service.impl;

import com.onlee.dtmp.manage.dao.PublishSystemDao;
import com.onlee.dtmp.manage.entity.PublishSystemEntity;
import com.onlee.dtmp.manage.service.PublishSystemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublishSystemServiceImpl extends ServiceImpl<PublishSystemDao, PublishSystemEntity> implements PublishSystemService {

    @Autowired
    PublishSystemDao publishSystemDao;

}
