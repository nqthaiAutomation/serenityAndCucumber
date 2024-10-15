package com.example.definitions;

import com.example.steps.SellSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SellDefs {
    @Steps
    SellSteps sellSteps;
    @Then("I verify icons displayed")
    public void iVerifyIconsDisplayed(DataTable dataTable) {
        List<String> list = new ArrayList<>(dataTable.asList());
        list.remove(0);
        for(String row:list){
            sellSteps.verifyIconsDisplayed(row);
        }

    }
}
