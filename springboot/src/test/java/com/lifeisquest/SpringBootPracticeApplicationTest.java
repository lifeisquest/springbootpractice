package com.lifeisquest;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author Jason Park
 * @since v1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@IntegrationTest
@Configuration
@EnableAutoConfiguration
@ComponentScan({ "com.lifeisquest" })
@Ignore
public class SpringBootPracticeApplicationTest {

  @Before
  public void setUp() throws Exception {

  }

  @After
  public void tearDown() throws Exception {

  }
}