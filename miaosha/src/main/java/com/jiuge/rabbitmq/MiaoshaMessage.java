package com.jiuge.rabbitmq;

import com.jiuge.pojo.MiaoshaUser;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MiaoshaMessage {
	private MiaoshaUser user;
	private long goodsId;

}
