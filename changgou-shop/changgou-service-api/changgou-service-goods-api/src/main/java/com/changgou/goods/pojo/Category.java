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
@Table(name="tb_category")
@Data
@Builder
public class Category implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /** 分类ID */
    @Column(name = "id")
	private Integer id;

    /** 分类名称 */
    @Column(name = "name")
	private String name;

    /** 商品数量 */
    @Column(name = "goods_num")
	private Integer goodsNum;

    /** 是否显示 */
    @Column(name = "is_show")
	private String isShow;

    /** 是否导航 */
    @Column(name = "is_menu")
	private String isMenu;

    /** 排序 */
    @Column(name = "seq")
	private Integer seq;

    /** 上级ID */
    @Column(name = "parent_id")
	private Integer parentId;

    /** 模板ID */
    @Column(name = "template_id")
	private Integer templateId;




}
