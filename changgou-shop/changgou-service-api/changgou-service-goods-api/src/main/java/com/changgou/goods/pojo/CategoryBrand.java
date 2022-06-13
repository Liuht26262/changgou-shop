package com.changgou.goods.pojo;

import java.io.Serializable;

import javax.persistence.Column;
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
@Table(name="tb_category_brand")
@Data
@Builder
public class CategoryBrand implements Serializable{

	@Id
    /** 分类ID */
    @Column(name = "category_id")
	private Integer categoryId;

    /** 品牌ID */
    @Column(name = "brand_id")
	private Integer brandId;




}
