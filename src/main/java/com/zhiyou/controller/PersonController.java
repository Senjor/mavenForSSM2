package com.zhiyou.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou.model.Person;
import com.zhiyou.service.IPersonService;

/**
* @author 		laosun
* @version 		创建时间：Nov 22, 2018 12:13:06 PM
* @ClassName 	类名称
* @Description 	类描述
*/
@Controller
@RequestMapping("/personController")
public class PersonController{
    
    private IPersonService personService;
    
    public IPersonService getPersonService() {
        return personService;
    }

    @Autowired
    public void setPersonService(IPersonService personService) {
        this.personService = personService;
    }

    @RequestMapping("/showPerson")
    public String showPersons(Model model){
        List<Person> persons = personService.loadPersons();
        System.out.println("--------" + persons);
        
        model.addAttribute("persons", persons);
        for (int i = 0; i < persons.size(); i++) {
			Person person = persons.get(i);
			System.out.println(person.getName());
		}
        return "showperson";
    }
}
