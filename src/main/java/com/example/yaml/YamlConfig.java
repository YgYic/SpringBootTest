/**
 * Project Name:demo
 * File Name:YamlConfig.java
 * Package Name:com.example.yaml
 * Date:2016年12月20日下午11:54:52
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.example.yaml;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ClassName:YamlConfig <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2016年12月20日 下午11:54:52 <br/>
 * 
 * @author Administrator
 * @version
 * @since JDK 1.6
 * @see
 */
@Component
@ConfigurationProperties(prefix = "my")
public class YamlConfig {
	private List<String> servers = new ArrayList<String>();

	public List<String> getServers() {
		return this.servers;
	}
}
