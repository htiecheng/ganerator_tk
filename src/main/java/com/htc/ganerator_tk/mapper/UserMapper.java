package com.htc.ganerator_tk.mapper;

import com.htc.ganerator_tk.pojo.User;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UserMapper extends Mapper<User>, MySqlMapper<User> {
}