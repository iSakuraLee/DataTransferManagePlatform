package com.onlee.dtmp.manage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.onlee.dtmp.manage.dao.PublishListDao;
import com.onlee.dtmp.manage.entity.PublishListEntity;
import com.onlee.dtmp.manage.service.PublishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublishListServiceImpl extends ServiceImpl<PublishListDao, PublishListEntity> implements PublishListService {

    @Autowired
    public PublishListDao publishListDao;

}
