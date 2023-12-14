package com.onlee.dtmp.manage.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.onlee.dtmp.manage.entity.PublishSystemEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PublishSystemDao extends BaseMapper<PublishSystemEntity> {

    List<PublishSystemEntity> queryAllPublishSystem();

    List<PublishSystemEntity> queryPublishSystemByName(String name);

    PublishSystemEntity getPublishSystemById(int id);

}
