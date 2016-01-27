/**
 * 
 */
package com.zpd.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.zpd.json.JsonMessage;
import com.zpd.pojo.Shop;
import com.zpd.service.IShopService;
import com.zpd.utils.Const;
import com.zpd.utils.Msg;

/**
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/shop")
public class ShopController {
	private IShopService shopService;

	public void setShopService(IShopService shopService) {
		this.shopService = shopService;
	}

	@RequestMapping("/get")
	public String updateOBase(ModelMap model) {
		int code = 1;
		Shop s = new Shop();
		s.setName("wuyize");
		s.setPhone("13548558596");
		s.setId(1);
		s.setAddress("chengdu");
		code = this.shopService.save(s);
		String jsonData = JsonMessage.getJsonMsg(new Msg(code));
		model.addAttribute("data", jsonData);
		return Const.VIEW_JSON;
	}
}
