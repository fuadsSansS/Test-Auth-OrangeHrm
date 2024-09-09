package com.juaracoding.TestOrangeHrm.impl;

import com.juaracoding.TestOrangeHrm.page.HomePage;
import com.juaracoding.TestOrangeHrm.page.LoginPage;
import com.juaracoding.TestOrangeHrm.util.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on 02/09/2024
@Author Acer a.k.a. Fuady Wahyudi
Java Developer
Created on 02/09/2024 1:56
@Last Modified 02/09/2024 1:56
Version 1.0
*/
public class LoginPositif {
    private static final Logger log = LoggerFactory.getLogger(LoginPositif.class);
    private WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage;
    private HomePage homePage;

    public LoginPositif(){
        this.driver = Test1Hooks.driver;
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        extentTest =Test1Hooks.extentTest;
    }

    @Given("TCLP001 Mengakses Halaman Login")
    public void tclp001_mengakses_halaman_login(){
        this.driver.get(Constants.URL_LOGIN1);
        extentTest.log(LogStatus.PASS, "TCLP001 Mengakses Halaman Login");
    }
    @And("TCLP001 Validasi Berada Di Halaman Login")
    public void tclp001_validasi_berada_di_halaman_login(){
        String strLogin = loginPage.getTxtLogin()==null?"Element Tidak di temukan" : loginPage.getTxtLogin().getText();
        if (strLogin.equalsIgnoreCase("Login")){
            extentTest.log(LogStatus.PASS, "TCLP001 Validasi Berada Di Halaman Login");
        }else {
            extentTest.log(LogStatus.FAIL, "TCLP001 Validasi Berada Di Halaman Login");
        }

    }
    @And("TCLP001 Clear Input Username Dan Password")
    public void tclp001_clear_input_username_dan_password(){
        loginPage.getTxtInputUsername().clear();
        loginPage.getTxtInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TCLP001 Clear Input Username Dan Password");
    }
    @And("TCLP001 Input Username Di FIeld Username")
    public void tclp001_input_username_di_field_username(){
        loginPage.getTxtInputUsername().sendKeys("Admin");
        extentTest.log(LogStatus.PASS, "TCLP001 Input Username Di FIeld Username");
    }
    @And("TCLP001 Input Password Di Field Password")
    public void tclp001_input_password_di_field_password(){
        loginPage.getTxtInputPassword().sendKeys("admin123");
        extentTest.log(LogStatus.PASS, "TCLP001 Input Password Di Field Password");
    }
    @And("TCLP001 Tekan Tombol Login")
    public void tclp001_tekan_tombol_login(){
        loginPage.getBtnLogin().click();
        extentTest.log(LogStatus.PASS, "TCLP001 Tekan Tombol Login");
    }
    @And("TCLP001 Validasi Halaman Home")
    public void tclp001_validasi_halaman_home(){
        String txtBreadcrum = homePage.getTxtBreadcrumd()==null?"element tidak ditemukan":homePage.getTxtBreadcrumd().getText();
        if (txtBreadcrum.equalsIgnoreCase("Dashboard")){
            extentTest.log(LogStatus.PASS, "TCLP001 Validasi Halaman Home");
        }else {
            extentTest.log(LogStatus.FAIL, "TCLP001 Validasi Halaman Home");
        }

    }
    @And("TCLP001 Tekan Dropdown Menuju Logout")
    public void tclp001_tekan_dropdown_menuju_logout(){
        homePage.getBtnDropdown().click();
        extentTest.log(LogStatus.PASS, "TCLP001 Tekan Dropdown Menuju Logout");
    }
    @And("TCLP001 Tekan Tombol Logout")
    public void tclp001_tekan_tombol_logout(){
        homePage.getBtnLogout().click();
        extentTest.log(LogStatus.PASS, "TCLP001 Tekan Tombol Logout");
    }
    @Then("TCLP001 Validasi Berhasil Logout")
    public void tclp001_validasi_berhasil_logout(){
        String strLogin = loginPage.getTxtLogin()==null?"Element Tidak di temukan" : loginPage.getTxtLogin().getText();
        if (strLogin.equalsIgnoreCase("Login")) {
            extentTest.log(LogStatus.PASS, "TCLP001 Validasi Berhasil Logout");
        }else {
            extentTest.log(LogStatus.FAIL, "TCLP001 Validasi Berhasil Logout");
        }
    }
}





