package com.github.ape.config;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "app")
public class DatasourceConfig {

	public Map<String, Datasource> getDatasources() {
		return datasources;
	}

	public void setDatasources(Map<String, Datasource> datasources) {
		this.datasources = datasources;
	}

	private Map<String, Datasource> datasources;
	
	public static class Datasource {
		private String name;
		private String driverClassName;
		private String url;
		private String username;
		private String password;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDriverClassName() {
			return driverClassName;
		}
		public void setDriverClassName(String driverClassName) {
			this.driverClassName = driverClassName;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
	}
}