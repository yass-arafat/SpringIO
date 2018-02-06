/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Employee;
import model.*;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author yassir
 */

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {
    
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public String getall(Model m){
        EmployeeModel model = new EmployeeModel();
        m.addAttribute("lst", model.getAll());
        
        return "index";
    }
    @RequestMapping(value = "/remove",method = RequestMethod.GET)
    public String remove(@RequestParam(value = "id") int id){
        EmployeeModel model = new EmployeeModel();
        Employee e  = model.getEmp(id);
        model.remove(e);
        return "redirect:all.htm";
    }
    @RequestMapping(value = "/edit",method = RequestMethod.GET)
    public String edit(@RequestParam(value = "id") int id, Model m){
        EmployeeModel model = new EmployeeModel();
        Employee e  = model.getEmp(id);
        m.addAttribute("emp", e);
        return "edit";
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(@ModelAttribute(value = "employee") Employee e){
        EmployeeModel model = new EmployeeModel();
        
        model.edit(e);
        return "redirect:all.htm";
    }
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public String create(@ModelAttribute(value = "employee") Employee e){
        EmployeeModel model = new EmployeeModel();
        model.create(e);
        return "redirect:all.htm";
    }
     
    @RequestMapping(value = "/redirectCreate",method = RequestMethod.GET)
    public String redirectCreate(){
        return "create";
    }
}
