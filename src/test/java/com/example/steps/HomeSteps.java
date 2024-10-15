package com.example.steps;

import com.example.pages.HomePage;

public class HomeSteps {
    HomePage homePage;
    public void clickLinkIntoOnTheHeaderPage(String link) {
        homePage.clickLinkIntoOnTheHeaderPage(link);
    }

    public void clickButtonOnTheHeaderPage(String button) {
        homePage.clickButtonOnTheHeaderPage(button);
    }
}
