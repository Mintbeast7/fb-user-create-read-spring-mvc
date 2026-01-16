package com.facebook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.facebook.entity.UserEntity;
import com.facebook.pojo.UserPojo;
import com.facebook.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
    
	@GetMapping("viewprofilepage")
	public String viewSignUp() {
		System.out.println("UserController.viewProfile()");
		return "signuppage";
	}
	
	@PostMapping("viewconfirmationpage")
	public String viewConfirmationPage(@ModelAttribute UserPojo userPojo) {
		System.out.println("UserController.viewConfirmationPage()");
		Integer rowEffected = userService.passProfile(userPojo);
		
		System.out.println("Total row effected: " + rowEffected);
		return "confirmationpage";
	}
	
	@GetMapping("viewuser")
	public String getAllUsers(Model model) {
		List<UserEntity> userlist = userService.allUserProfiles();
		model.addAttribute("allUsers", userlist);
		return "user-list";
	}
}
