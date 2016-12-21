/**
 * 
 */
package com.example.rest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 *
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/")
public class ExampleRest {

	/**
	 * 
	 * home:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author Administrator
	 * @return
	 * @since JDK 1.6
	 */
	@RequestMapping("/test")
	String home() {
		return "sdfasd32323";
	}
}
