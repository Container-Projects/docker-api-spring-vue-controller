package io.github.rajpratik71.infra_controller.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import io.github.rajpratik71.infra_controller.InfraControllerApp;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = InfraControllerApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
