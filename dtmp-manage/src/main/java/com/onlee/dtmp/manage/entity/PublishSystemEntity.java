package com.onlee.dtmp.manage.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("dtmp_batch_publish_system")
public class PublishSystemEntity {

    @TableId
    private String id;

    private String batchInfo;

    private String scanDir;

    private String systemCode;

    private String systemName;

    private String systemNameCn;

    private String areaType;

    private String nasCode;

    private String systemType;

    private String transferType;

    private String contactName;

    private String contactPhone;

    private String contactEmail;

    private int priority;

    private String baseServer;

    private String runningServer;

    private String deployRoom;

    @TableLogic(value = "1", delval = "0")
    private int isDeleted;

    private String transferAccount;

    private Date createTime;

    private Date updateTime;

    private String taskId;

}
