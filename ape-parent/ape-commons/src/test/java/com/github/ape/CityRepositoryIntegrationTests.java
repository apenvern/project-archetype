package com.github.ape;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.ape.config.DatasourceConfig;
import com.github.ape.utils.TestConfig;

@ActiveProfiles("unit-test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {TestConfig.class})
public class CityRepositoryIntegrationTests {

	@Autowired DatasourceConfig datasourceConfig;
	
	@Autowired Environment environment;
	
	@Test
	public void testConfig() throws IOException{
		Assert.assertEquals("testuser1", datasourceConfig.getDatasources().get("DATASOURCE1").getUsername());
	}
}