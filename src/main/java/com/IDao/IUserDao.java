package com.IDao;

import com.entity.User;
import org.springframework.stereotype.Repository;

@Repository("IUserDao")
public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    User selectByEmail(String email);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int updateByEmail(User record);
}