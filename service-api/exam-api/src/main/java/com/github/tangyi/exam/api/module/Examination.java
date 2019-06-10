package com.github.tangyi.exam.api.module;

import com.github.tangyi.common.core.persistence.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 考试
 *
 * @author tangyi
 * @date 2018/11/8 20:47
 */
@Data
public class Examination extends BaseEntity<Examination> {

    /**
     * 考试名称
     */
    @NotBlank(message = "考试名称不能为空")
    private String examinationName;

    /**
     * 考试类型
     */
    @NotBlank(message = "考试类型不能为空")
    private String type;

    /**
     * 考试注意事项
     */
    private String attention;

    /**
     * 考试开始时间
     */
    private String startTime;

    /**
     * 考试结束时间
     */
    private String endTime;

    /**
     * 考试持续时间
     */
    private String duration;

    /**
     * 总分
     */
    @NotBlank(message = "总分不能为空")
    private String totalScore;

    /**
     * 总题目数
     */
    private String totalSubject;

    /**
     * 考试状态
     */
    private String status;

    /**
     * 封面
     */
    private String avatar;

    /**
     * 封面对应的附件id
     */
    private String avatarId;

    /**
     * 学院
     */
    private String collegeId;

    /**
     * 专业
     */
    private String majorId;

    /**
     * 课程
     */
    private String courseId;

    /**
     * 备注
     */
    private String remark;
}