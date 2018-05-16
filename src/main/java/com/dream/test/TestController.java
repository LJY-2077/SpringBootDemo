/**  
* @Title: TestController.java
* @Package com.dream.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author lijingyang   
* @date 2018年5月10日 下午5:26:57
* @version V1.0  
*/
package com.dream.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author li jingyang
 * @date 2018年5月10日 下午5:26:57
 *
 */
@RestController
public class TestController
{
	@RequestMapping("/hello")
	public String hello()
	{
		return "hello world!";
	}

}
