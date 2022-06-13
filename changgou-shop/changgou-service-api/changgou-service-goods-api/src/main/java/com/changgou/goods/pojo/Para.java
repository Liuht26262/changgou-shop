package com.changgou.goods.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

/**
 * TODO
 *
 * @author liuht26262@yunrong.cn
 * @version V3.0
 * @description
 * @since 2022/5/20 17:07
 */
@Table(name="tb_para")
@Data
@Builder
public class Para implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /** id */
    @Column(name = "id")
	private Integer id;

    /** 名称 */
    @Column(name = "name")
	private String name;

    /** 选项 */
    @Column(name = "options")
	private String options;

    /** 排序 */
    @Column(name = "seq")
	private Integer seq;

    /** 模板ID */
    @Column(name = "template_id")
	private Integer templateId;




}
