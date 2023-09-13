package com.onlee.dtmp.manage.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("dtmp_batch_publish_list")
public class PublishListEntity {

    /**
     * 发布清单id
     */
    @TableId
    private String id;

    /**
     * 批次信息
     */
    private String batch_info;

    /**
     * 任务信息
     */
    private String task_id;

    /**
     * 发布系统id
     */
    private String publish_system_id;

    /**
     * 表英文名
     */
    private String table_name;

    /**
     * 表中文名
     */
    private String table_name_cn;

    /**
     * 文件三位后缀
     */
    private String file_suffix;

    /**
     * 文件类型
     */
    private String file_type;

    /**
     * 省行/机构范围
     */
    private String scope;

    /**
     * 原始文件编码格式
     */
    private String origin_coding;

    /**
     * 原始文件压缩类型
     */
    private String compress_type;

    /**
     * 文件增全量类型
     */
    private String increment_type;

    /**
     * 是否为数据副本
     */
    private String is_data_copy;

    /**
     * 是否为有条件共享表
     */
    private String is_conditional_share;

    /**
     * 逻辑删除表示
     */
    @TableLogic(value = "1", delval = "0")
    private int is_delete;

    /**
     * 文件频率
     */
    private String frequency;

    /**
     * 文件是否入数据湖
     */
    private String is_dlake;

    /**
     * 对象存储id
     */
    private String obs_id;

    /**
     * 最新状态
     */
    private String latest_status;

}
