/**
 * 
 */
package com.example.template;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bean.MyBean;
import com.example.yaml.YamlConfig;

/**
 * @author Administrator
 *
 */
@Controller
public class Example {

	@Autowired
	private Environment env;

	@Autowired
	private ApplicationArguments args;

	@Autowired
	private MyBean mybean;

	@Autowired
	private YamlConfig config;

	/**
	 * 返回html模板.
	 */
	@RequestMapping("/demo")
	public String demo(Map<String, Object> map) {

		if (StringUtils.isEmpty(args)) {
			System.err.println("empty");
		}

		List<String> argsList = args.getNonOptionArgs();
		if (CollectionUtils.isEmpty(argsList)) {
			System.err.println("emptyList");
		}

		Set<String> optionNames = args.getOptionNames();
		if (CollectionUtils.isEmpty(optionNames)) {
			System.err.println("emptySet");
		} else {
			System.err.println("--------------");
			System.err.println(optionNames);
		}

		String[] sourceArgs = args.getSourceArgs();
		if (StringUtils.isEmpty(sourceArgs)) {
			System.err.println("emptySourceArgs");
		} else {
			System.err.println("#############");
			for (String string : sourceArgs) {
				System.err.println(string);
			}

		}
		map.put("hello", mybean.getName());
		map.put("world", config.getServers());

		map.put("test", env.getProperty("spring.thymeleaf.content-type"));
		return "demo/demo";
	}

	/**
	 * 
	 * helloHtml:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author Administrator
	 * @param map
	 * @return
	 * @since JDK 1.6
	 */

	@RequestMapping("/helloHtml")
	public String helloHtml(Map<String, Object> map) {

		map.put("hello", "from TemplateController.helloHtml");
		return "/helloHtml";
	}

}
