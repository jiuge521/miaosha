package com.jiuge.vo;

import com.jiuge.pojo.MiaoshaUser;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GoodsDetailVo {
	private int miaoshaStatus = 0;
	private int remainSeconds = 0;
	private GoodsVo goods ;
	private MiaoshaUser user;

}
