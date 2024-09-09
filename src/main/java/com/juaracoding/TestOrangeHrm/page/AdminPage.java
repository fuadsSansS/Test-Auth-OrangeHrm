package com.juaracoding.TestOrangeHrm.page;

import com.juaracoding.TestOrangeHrm.util.Constants;
import com.juaracoding.TestOrangeHrm.util.GlobalFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on 05/09/2024
@Author Acer a.k.a. Fuady Wahyudi
Java Developer
Created on 05/09/2024 2:24
@Last Modified 05/09/2024 2:24
Version 1.0
*/
public class AdminPage {
    private WebDriver driver;

    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']")
    private WebElement txtLabel;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    private WebElement btnAdd;



    public AdminPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getTxtLabel() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT))
                .until(ExpectedConditions.visibilityOf(txtLabel));
    }

    public WebElement getBtnAdd() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT))
                .until(ExpectedConditions.visibilityOf(btnAdd));
    }




}





