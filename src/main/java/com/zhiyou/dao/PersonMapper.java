package com.zhiyou.dao;

import java.util.List;

import com.zhiyou.model.Person;

/**
* @author 		laosun
* @version 		创建时间：Nov 22, 2018 12:14:12 PM
* @ClassName 	类名称
* @Description 	类描述
*/
public interface PersonMapper {
    /**
     * 插入一条记录
     * @param person
     */
    void insert(Person person);
    
    /**
     * 查询所有
     * @return
     */
    List<Person> queryAll();
}
