package com.zhiyou.service;

import java.util.List;

import com.zhiyou.model.Person;

/**
* @author 		laosun
* @version 		创建时间：Nov 22, 2018 12:17:56 PM
* @ClassName 	类名称
* @Description 	类描述
*/
public interface IPersonService {
	/**
     * 加载全部的person
     * @return
     */
    List<Person> loadPersons();
}
