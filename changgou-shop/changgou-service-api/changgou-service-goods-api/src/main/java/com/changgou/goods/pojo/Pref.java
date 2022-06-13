package com.changgou.goods.pojo;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="tb_pref")
@Data
@Builder
public class Pref implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /** ID */
    @Column(name = "id")
	private Integer id;

    /** 分类ID */
    @Column(name = "cate_id")
	private Integer cateId;

    /** 消费金额 */
    @Column(name = "buy_money")
	private Integer buyMoney;

    /** 优惠金额 */
    @Column(name = "pre_money")
	private Integer preMoney;

    /** 活动开始日期 */
    @Column(name = "start_time")
	private Date startTime;

    /** 活动截至日期 */
    @Column(name = "end_time")
	private Date endTime;

    /** 类型 */
    @Column(name = "type")
	private String type;

    /** 状态 */
    @Column(name = "state")
	private String state;




}
