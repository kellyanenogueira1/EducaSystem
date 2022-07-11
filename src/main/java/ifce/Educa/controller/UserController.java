package ifce.Educa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ifce.Educa.service.UserService;

@Controller
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/users")
	public String listAllUsers(Model model) {
		model.addAttribute("users", userService.getAllUsers());
		return "users";
	}
}