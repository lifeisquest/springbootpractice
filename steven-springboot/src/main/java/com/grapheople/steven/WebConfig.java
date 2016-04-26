package com.grapheople.steven;

import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Map;

/**
 * @author Steven Jee
 * @since v.
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.grapheople.steven"})
public class WebConfig extends WebMvcConfigurerAdapter {



}
