package com.xfleet.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {
                    // "pretty",
                    "html:target/reports/cucumber-report.html",
                    "json:target/reports/cucumber-report.json",
                    "rerun:target/reports/cucumber-report.txt",
                    "me.jvt.cucumber.report.PrettyReports:target/cucumber"
            },
            features = "src/test/resources/features", // copy and chose content root
            glue = "com/xfleet/stepdefinitions",   // sağ klik stepDefinition ve  source root
            dryRun = false,
            tags = "@Login",
            publish = false

    )
    public class CukesRunner {

    }

