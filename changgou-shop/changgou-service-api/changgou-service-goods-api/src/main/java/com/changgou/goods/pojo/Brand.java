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
@Table(name="tb_brand")
@Data
@Builder
public class Brand implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /** 品牌id */
    @Column(name = "id")
	private Integer id;

    /** 品牌名称 */
    @Column(name = "name")
	private String name;

    /** 品牌图片地址 */
    @Column(name = "image")
	private String image;

    /** 品牌的首字母 */
    @Column(name = "letter")
	private String letter;

    /** 排序 */
    @Column(name = "seq")
	private Integer seq;




}
