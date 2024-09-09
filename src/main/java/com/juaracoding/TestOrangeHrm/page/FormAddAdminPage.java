package com.juaracoding.TestOrangeHrm.page;

import com.juaracoding.TestOrangeHrm.util.Constants;
import com.juaracoding.TestOrangeHrm.util.GlobalFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on 05/09/2024
@Author Acer a.k.a. Fuady Wahyudi
Java Developer
Created on 05/09/2024 23:48
@Last Modified 05/09/2024 23:48
Version 1.0
*/
public class FormAddAdminPage {
    private WebDriver driver;


    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
    private WebElement txtLableUser;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div")
    private WebElement txtUserRole;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div")
    private WebElement listRole;

    public FormAddAdminPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getTxtUserRole() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT))
                .until(ExpectedConditions.visibilityOf(txtUserRole));
    }

    public WebElement getTxtLableUser() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT))
                .until(ExpectedConditions.visibilityOf(txtLableUser));
    }

    public List<WebElement> getTxtRole(){
        List<WebElement> roleList = new ArrayList<>();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY));
        try {
            WebElement selectRole = wait.until(ExpectedConditions.visibilityOf(listRole));

            List<WebElement> pilihRole = new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtUserRole)).findElements(By.className("oxd-select-dropdown"));
            for (WebElement pilih : pilihRole){
                roleList.add(pilih);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return roleList;

    }

}





