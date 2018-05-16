/**  
* @Title: UserController.java
* @Package com.dream.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author lijingyang   
* @date 2018年5月16日 上午9:58:56
* @version V1.0  
*/
package com.dream.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dream.domain.User;
import com.dream.service.UserService;

/**
 * @ClassName: UserController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author li jingyang
 * @date 2018年5月16日 上午9:58:56
 *
 */

// 证明是controller层并且返回json
@Controller
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.dream.service" }) // 添加的注解
public class UserController {
	// 依赖注入
	@Autowired
	UserService userService;

	/**
	 * @RestController代表这个类是用Restful风格来访问的，如果是普通的WEB页面访问跳转时，我们通常会使用@Controller value
	 *                                                                         =
	 *                                                                         "/users/{username}"
	 *                                                                         代表访问的URL是"http://host:PORT/users/实际的用户名"
	 *                                                                         method
	 *                                                                         =
	 *                                                                         RequestMethod.GET
	 *                                                                         代表这个HTTP请求必须是以GET方式访问
	 *                                                                         consumes="application/json"
	 *                                                                         代表数据传输格式是json
	 * @PathVariable将某个动态参数放到URL请求路径中
	 * @RequestParam指定了请求参数名称
	 */
	@RequestMapping(value = "queryU/{username}", method = RequestMethod.GET)
	@ResponseBody
	public List<User> queryProduct(@PathVariable String username, HttpServletResponse httpServletResponse) {
		System.out.println(username);
		List<User> ulist = userService.queryUserByUserName(username);
		return ulist;
	}

	@RequestMapping(value = "/findAll")
	@ResponseBody
	public List<User> findAll() {
		List<User> ulist = userService.findAll();
		return ulist;
	}

	@RequestMapping(value = "/jsp")
	public String returnJsp(Model model) {
		List<User> ulist = userService.findAll();
		model.addAttribute("users", ulist);
		return "/user_list";
	}
}
