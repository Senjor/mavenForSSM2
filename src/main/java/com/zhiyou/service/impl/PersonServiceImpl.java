package com.zhiyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.dao.PersonMapper;
import com.zhiyou.model.Person;
import com.zhiyou.service.IPersonService;

/**
* @author 		laosun
* @version 		创建时间：Nov 22, 2018 12:18:51 PM
* @ClassName 	类名称
* @Description 	类描述
*/

@Service("personService")
public class PersonServiceImpl implements IPersonService {

	private PersonMapper personMapper;

	public PersonMapper getPersonMapper() {
		return personMapper;
	}

	@Autowired
	public void setPersonMapper(PersonMapper personMapper) {
		this.personMapper = personMapper;
	}

	@Override
	public List<Person> loadPersons() {
		return personMapper.queryAll();
	}

}
