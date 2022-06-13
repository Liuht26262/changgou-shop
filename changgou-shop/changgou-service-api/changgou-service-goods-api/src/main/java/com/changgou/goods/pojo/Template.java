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
@Table(name="tb_template")
@Data
@Builder
public class Template implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /** ID */
    @Column(name = "id")
	private Integer id;

    /** 模板名称 */
    @Column(name = "name")
	private String name;

    /** 规格数量 */
    @Column(name = "spec_num")
	private Integer specNum;

    /** 参数数量 */
    @Column(name = "para_num")
	private Integer paraNum;




}
