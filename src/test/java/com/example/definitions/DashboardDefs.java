package com.example.definitions;

import com.example.steps.DashboardSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import org.apache.commons.io.output.BrokenWriter;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class DashboardDefs {
    @Steps
    DashboardSteps dashboardSteps;

    @Then("I verify dashboards is displayed")
    public void iVerifyDashboardsIsDisplayed(DataTable dataTable) {
        List<String> list = new ArrayList<>(dataTable.asList());
        list.remove(0);
         for(String row:list){
             Assert.assertTrue(dashboardSteps.isDashboardDisplayed(row));
             System.out.println(row+": is displayed");
         }
    }
}
