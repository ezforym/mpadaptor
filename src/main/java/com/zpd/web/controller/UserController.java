/**
 * 
 */
package com.zpd.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zpd.json.JsonMessage;
import com.zpd.pojo.User;
import com.zpd.service.IUserService;
import com.zpd.utils.Const;
import com.zpd.utils.Msg;

/**
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	private IUserService userService;

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/get")
	public String updateOBase(ModelMap model) {
		int code = 1;
		User u = new User();
		u.setName("wuyize");
		u.setPhone("13548558596");
		code = this.userService.save(u);
		String jsonData = JsonMessage.getJsonMsg(new Msg(code));
		model.addAttribute("data", jsonData);
		return Const.VIEW_JSON;
	}
}
