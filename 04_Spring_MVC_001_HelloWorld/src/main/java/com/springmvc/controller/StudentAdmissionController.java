package com.springmvc.controller;



import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.editor.NameBinder;
import com.springmvc.model.Student;

@Controller
public class StudentAdmissionController {

	@ModelAttribute
	public void addingCommonObj(Model modelView){
		
		modelView.addAttribute("headerMsg","Welcome to College online processing");
		
	}
	
	@InitBinder
	public void initDataBinder(WebDataBinder binder){
		binder.setDisallowedFields(new String[]{"studentMobile"});
		binder.registerCustomEditor(String.class, "studentName", new NameBinder());
	}
	
	
	@RequestMapping(value="/admission.html" , method = RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		
		ModelAndView modelView = new ModelAndView ("admissionForm");
		
		return modelView;
		
	}
	
	@RequestMapping(value="/submitadmission.html" , method=RequestMethod.POST)
    public ModelAndView getSubmitAdmissionForm(@RequestParam("studentName") String studentName,
											@RequestParam("studentHobby") String studentHobby){
		
		System.out.println(studentName);
		System.out.println(studentHobby);
	
		
		Student student1= new Student();
		student1.setStudentHobby(studentHobby);
		student1.setStudentName(studentName);
		
		ModelAndView modelView = new ModelAndView ("admissionFormSuccess");
		modelView.addObject("name", studentName);
		modelView.addObject("hobby", studentHobby);
				
		
		return modelView;
		
	}

	
	@RequestMapping(value="/submitadmissionModel.html" , method=RequestMethod.POST)
    public ModelAndView getSubmitAdmissionFormModel(@RequestParam("studentName") String studentName,
											@RequestParam("studentHobby") String studentHobby){
		
		System.out.println(studentName);
		System.out.println(studentHobby);
	
		
		Student student1= new Student();
		student1.setStudentHobby(studentHobby);
		student1.setStudentName(studentName);
		
		ModelAndView modelView = new ModelAndView ("admissionFormSuccess");
		modelView.addObject("student1", student1);
				
		
		return modelView;
		
	}

	@RequestMapping(value="/submitadmissionModel1.html" , method=RequestMethod.POST)
    public ModelAndView getSubmitAdmissionFormModel(@Valid @ModelAttribute("student1") Student student1, BindingResult result){
		
		
		if(result.hasErrors()){
			
			System.out.println(result.getFieldError());
			
			ModelAndView modelView = new ModelAndView ("admissionForm");
			modelView.addObject("errorMsg", result.getAllErrors().toString());
			return modelView;
			
		}
		
	
		
		
		ModelAndView modelView = new ModelAndView ("admissionFormSuccess");
		//modelView.addObject("student1", student1);
				
		
		return modelView;
		
	}
	
	
	
}
