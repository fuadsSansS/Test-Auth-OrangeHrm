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
Build #IC-223.8214.52, built on 02/09/2024
@Author Acer a.k.a. Fuady Wahyudi
Java Developer
Created on 02/09/2024 1:27
@Last Modified 02/09/2024 1:27
Version 1.0
*/
public class HomePage {

    private WebDriver driver;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    private WebElement txtBreadcrumd;

    @FindBy(xpath = "//li[1]//a[1]//span[1]")
    private WebElement getAdmin;

    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    private WebElement btnDropdown;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    private WebElement btnLogout;


    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getTxtBreadcrumd() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT)).
                until(ExpectedConditions.visibilityOf(txtBreadcrumd)) ;
    }

    public WebElement getGetAdmin() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT)).
                until(ExpectedConditions.visibilityOf(getAdmin)) ;
    }

    public WebElement getBtnDropdown() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT)).
                until(ExpectedConditions.visibilityOf(btnDropdown)) ;
    }

    public WebElement getBtnLogout() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT)).
                until(ExpectedConditions.visibilityOf(btnLogout)) ;
    }

}





