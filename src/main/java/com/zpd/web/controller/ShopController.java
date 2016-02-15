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
import com.zpd.utils.ErrorCode;
import com.zpd.utils.Msg;

/**
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/shop")
public class ShopController implements ErrorCode {
	private IShopService shopService;

	public void setShopService(IShopService shopService) {
		this.shopService = shopService;
	}

	/**
	 * 新增shop
	 */
	@RequestMapping("/add")
	public String add(ModelMap model, Shop shop) {
		int code = FAILED;
		if (shop != null) {
			code = this.shopService.save(shop);
		}
		String jsonData = JsonMessage.getJsonMsg(new Msg(code));
		model.addAttribute("data", jsonData);
		return Const.VIEW_JSON;
	}

	/**
	 * 删 除shop
	 */
	@RequestMapping("/delete")
	public String delete(ModelMap model, Integer id) {
		int code = FAILED;
		if (id != null) {
			code = this.shopService.delete(id);
		}
		String jsonData = JsonMessage.getJsonMsg(new Msg(code));
		model.addAttribute("data", jsonData);
		return Const.VIEW_JSON;
	}
}
