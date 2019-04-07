package com.htc.ganerator_tk.mapper;

import com.htc.ganerator_tk.pojo.Orders;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface OrdersMapper extends Mapper<Orders>, MySqlMapper<Orders> {
}