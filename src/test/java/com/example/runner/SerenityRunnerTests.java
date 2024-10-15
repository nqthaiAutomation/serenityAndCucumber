package com.example.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = { "pretty" },
        features = "src/test/resources/features/LoginPage.feature", // Đường dẫn đến file feature
        tags = "@InValidCredentials,@ForgetPassword", // Chạy kịch bản có một trong hai tag
        glue = "com.example.definitions" // Đường dẫn đến Step Definitions
)

public class SerenityRunnerTests {}
