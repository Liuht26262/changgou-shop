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
@Table(name="tb_album")
@Data
@Builder
public class Album implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /** 编号 */
    @Column(name = "id")
	private Long id;

    /** 相册名称 */
    @Column(name = "title")
	private String title;

    /** 相册封面 */
    @Column(name = "image")
	private String image;

    /** 图片列表 */
    @Column(name = "image_items")
	private String imageItems;




}
