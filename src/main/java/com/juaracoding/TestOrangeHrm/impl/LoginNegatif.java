package com.juaracoding.TestOrangeHrm.impl;

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
Created on 02/09/2024 1:57
@Last Modified 02/09/2024 1:57
Version 1.0
*/
public class LoginNegatif {

    private static final Logger log = LoggerFactory.getLogger(LoginNegatif.class);
    private WebDriver driver;
    private LoginPage loginPage;
    private static ExtentTest extentTest;

    public LoginNegatif(){
        this.driver = Test1Hooks.driver;
        loginPage = new LoginPage(driver);
        extentTest =Test1Hooks.extentTest;
    }

    @Given("TCLN001 Mengakses Halaman Login")
    public void tcln001_mengakses_halaman_login(){
        this.driver.get(Constants.URL_LOGIN1);
        extentTest.log(LogStatus.PASS, "TCLN001 Mengakses Halaman Login");
    }
    @And("TCLN001 Validasi Halaman Login")
    public void tcln001_validasi_halaman_login(){
        String strLogin = loginPage.getTxtLogin()==null?"Element Tidak di temukan" : loginPage.getTxtLogin().getText();
        extentTest.log(LogStatus.PASS, "TCLN001 Validasi Halaman Login");
    }
    @And("TCLN001 Clear Input Username Dan Password")
    public void tcln001_clear_input_username_dan_password(){
        loginPage.getTxtInputUsername().clear();
        loginPage.getTxtInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TCLN001 Clear Input Username Dan Password");
    }
    @And("TCLN001 Input Username Empty String")
    public void tcln001_input_username_empty_string(){
        loginPage.getTxtInputUsername().sendKeys("");
        extentTest.log(LogStatus.PASS, "TCLN001 Input Username Empty String");
    }
    @And("TCLN001 Input Password Empty String")
    public void tcln001_input_password_empty_string(){
        loginPage.getTxtInputPassword().sendKeys("");
        extentTest.log(LogStatus.PASS, "TCLN001 Input Password Empty String");
    }
    @And("TCLN001 Tekan Tombol Login")
    public void tcln001_tekan_tombol_login(){
        loginPage.getBtnLogin().click();
        extentTest.log(LogStatus.PASS, "TCLN001 Tekan Tombol Login");
    }
    @Then("TCLN001 Validasi Setelah Tombol Di Tekan")
    public void tcln001_validasi_setelah_tombol_di_tekan(){
        String txtAlert = loginPage.getTxtAlert1()==null?"Element tidak ditemukan" : loginPage.getTxtAlert1().getText();
        System.out.println(txtAlert);
        extentTest.log(LogStatus.PASS, "TCLN001 Validasi Setelah Tombol Di Tekan");
    }
    @Given("TCLN002 Mengakses Halaman Login")
    public void tcln002_mengakses_halaman_login(){
        this.driver.get(Constants.URL_LOGIN1);
        extentTest.log(LogStatus.PASS, "TCLN002 Mengakses Halaman Login");
    }
    @And("TCLN002 Validasi Halaman Login")
    public void tcln002_validasi_halaman_login(){
        String strLogin = loginPage.getTxtLogin()==null?"Element Tidak di temukan" : loginPage.getTxtLogin().getText();
        System.out.println(strLogin);
        extentTest.log(LogStatus.PASS, "TCLN002 Validasi Halaman Login");
    }
    @And("TCLN002 Clear Input Username Dan Password")
    public void tcln002_clear_input_username_dan_password(){
        loginPage.getTxtInputUsername().clear();
        loginPage.getTxtInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TCLN002 Clear Input Username Dan Password");
    }
    @And("TCLN002 Input Username Valid")
    public void tcln002_input_username_valid(){
        loginPage.getTxtInputUsername().sendKeys("Admin");
        extentTest.log(LogStatus.PASS, "TCLN002 Input Username Valid");
    }
    @And("TCLN002 Input Password Tidak Valid")
    public void tcln002_input_password_tidak_valid(){
        loginPage.getTxtInputPassword().sendKeys("asdfgag");
        extentTest.log(LogStatus.PASS, "TCLN002 Input Password Tidak Valid");
    }
    @And("TCLN002 Tekan Tombol Login")
    public void tcln002_tekan_tombol_login(){
        loginPage.getBtnLogin().click();
        extentTest.log(LogStatus.PASS, "TCLN002 Tekan Tombol Login");
    }
    @Then("TCLN002 Validasi Setelah Tombol Di Tekan")
    public void tcln002_validasi_setelah_tombol_di_tekan(){
        String txtAlert2 =loginPage.getTxtAlert2()==null?"Element tidak ditemukan " : loginPage.getTxtAlert2().getText();
        System.out.println(txtAlert2);
        extentTest.log(LogStatus.PASS, "TCLN002 Validasi Setelah Tombol Di Tekan");
    }
    @Given("TCLN003 Mengakses Halaman Login")
    public void tcln003_mengakses_halaman_login(){
        this.driver.get(Constants.URL_LOGIN1);
        extentTest.log(LogStatus.PASS, "TCLN003 Mengakses Halaman Login");
    }
    @And("TCLN003 Validasi Halaman Login")
    public void tcln003_validasi_halaman_login(){
        String strLogin = loginPage.getTxtLogin()==null?"Element Tidak di temukan" : loginPage.getTxtLogin().getText();
        System.out.println(strLogin);
        extentTest.log(LogStatus.PASS, "TCLN003 Validasi Halaman Login");
    }
    @And("TCLN003 Clear Input Username Dan Password")
    public void tcln003_clear_input_username_dan_password(){
        loginPage.getTxtInputUsername().clear();
        loginPage.getTxtInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TCLN003 Clear Input Username Dan Password");
    }
    @And("TCLN003 Input Username Tidak Valid")
    public void tcln003_input_username_tidak_valid(){
        loginPage.getTxtInputUsername().sendKeys("hshshs");
        extentTest.log(LogStatus.PASS, "TCLN003 Input Username Tidak Valid");
    }
    @And("TCLN003 Input Password Valid")
    public void tcln003_input_password_valid(){
        loginPage.getTxtInputPassword().sendKeys("admin123");
        extentTest.log(LogStatus.PASS, "TCLN003 Input Password Valid");
    }
    @And("TCLN003 Tekan Tombol Login")
    public void tcln003_tekan_tombol_login(){
        loginPage.getBtnLogin().click();
        extentTest.log(LogStatus.PASS, "TCLN003 Tekan Tombol Login");
    }
    @Then("TCLN003 Validasi Setelah Tombol Di Tekan")
    public void tcln003_validasi_setelah_tombol_di_tekan(){
        String txtAlert = loginPage.getTxtAlert2()==null?"Element tidak ditemukan" : loginPage.getTxtAlert2().getText();
        System.out.println(txtAlert);
        extentTest.log(LogStatus.PASS, "TCLN003 Validasi Setelah Tombol Di Tekan");
    }
    @Given("TCLN004 Mengakses Halaman Login")
    public void tcln004_mengakses_halaman_login(){
        this.driver.get(Constants.URL_LOGIN1);
        extentTest.log(LogStatus.PASS, "TCLN004 Mengakses Halaman Login");
    }
    @And("TCLN004 Validasi Halaman Login")
    public void tcln004_validasi_halaman_login(){
        String strLogin = loginPage.getTxtLogin()==null?"Element Tidak di temukan" : loginPage.getTxtLogin().getText();
        System.out.println(strLogin);
        extentTest.log(LogStatus.PASS, "TCLN004 Validasi Halaman Login");
    }
    @And("TCLN004 Clear Input Username Dan Password")
    public void tcln004_clear_input_username_dan_password(){
        loginPage.getTxtInputUsername().clear();
        loginPage.getTxtInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TCLN004 Clear Input Username Dan Password");
    }
    @And("TCLN004 Input Username Kosong")
    public void tcln004_input_username_kosong(){
        loginPage.getTxtInputUsername().sendKeys("");
        extentTest.log(LogStatus.PASS, "TCLN004 Input Username Kosong");
    }
    @And("TCLN004 Input Password Valid")
    public void tcln004_input_password_valid(){
        loginPage.getTxtInputPassword().sendKeys("admin123");
        extentTest.log(LogStatus.PASS, "TCLN004 Input Password Valid");
    }
    @And("TCLN004 Tekan Tombol Login")
    public void tcln004_tekan_tombol_login(){
        loginPage.getBtnLogin().click();
        extentTest.log(LogStatus.PASS, "TCLN004 Tekan Tombol Login");
    }
    @Then("TCLN004 Validasi Setelah Tombol Di Tekan")
    public void tcln004_validasi_setelah_tombol_di_tekan(){
        String txtAlert = loginPage.getTxtAlert1()==null?"Element tidak ditemukan" : loginPage.getTxtAlert1().getText();
        System.out.println(txtAlert);
        extentTest.log(LogStatus.PASS, "TCLN004 Validasi Setelah Tombol Di Tekan");
    }
    @Given("TCLN005 Mengakses Halaman Login")
    public void tcln005_mengakses_halaman_login(){
        this.driver.get(Constants.URL_LOGIN1);
        extentTest.log(LogStatus.PASS, "TCLN005 Mengakses Halaman Login");
    }
    @And("TCLN005 Validasi Halaman Login")
    public void tcln005_validasi_halaman_login(){
        String strLogin = loginPage.getTxtLogin()==null?"Element Tidak di temukan" : loginPage.getTxtLogin().getText();
        System.out.println(strLogin);
        extentTest.log(LogStatus.PASS, "TCLN005 Validasi Halaman Login");
    }
    @And("TCLN005 Clear Input Username Dan Password")
    public void tcln005_clear_input_username_dan_password(){
        loginPage.getTxtInputUsername().clear();
        loginPage.getTxtInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TCLN005 Clear Input Username Dan Password");
    }
    @And("TCLN005 Input Username Kosong")
    public void tcln005_input_username_kosong(){
        loginPage.getTxtInputUsername().sendKeys("");
        extentTest.log(LogStatus.PASS, "TCLN005 Input Username Kosong");
    }
    @And("TCLN005 Input Password Tidak Valid")
    public void tcln005_input_password_tidak_valid(){
        loginPage.getTxtInputPassword().sendKeys("jsjhhja");
        extentTest.log(LogStatus.PASS, "TCLN005 Input Password Tidak Valid");
    }
    @And("TCLN005 Tekan Tombol Login")
    public void tcln005_tekan_tombol_login(){
        loginPage.getBtnLogin().click();
        extentTest.log(LogStatus.PASS, "TCLN005 Tekan Tombol Login");
    }
    @Then("TCLN005 Validasi Setelah Tombol Di Tekan")
    public void tcln005_validasi_setelah_tombol_di_tekan(){
        String txtAlert = loginPage.getTxtAlert1()==null?"Element tidak ditemukan" : loginPage.getTxtAlert1().getText();
        System.out.println(txtAlert);
        extentTest.log(LogStatus.PASS, "TCLN005 Validasi Setelah Tombol Di Tekan");
    }
    @Given("TCLN006 Mengakses Halaman Login")
    public void tcln006_mengakses_halaman_login(){
        this.driver.get(Constants.URL_LOGIN1);
        extentTest.log(LogStatus.PASS, "TCLN006 Mengakses Halaman Login");
    }
    @And("TCLN006 V6alidasi Halaman Login")
    public void tcln006_v6alidasi_halaman_login(){
        String strLogin = loginPage.getTxtLogin()==null?"Element Tidak di temukan" : loginPage.getTxtLogin().getText();
        System.out.println(strLogin);
        extentTest.log(LogStatus.PASS, "TCLN006 V6alidasi Halaman Login");
    }
    @And("TCLN006 Clear Input Username Dan Password")
    public void tcln006_clear_input_username_dan_password(){
        loginPage.getTxtInputUsername().clear();
        loginPage.getTxtInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TCLN006 Clear Input Username Dan Password");
    }
    @And("TCLN006 Input Username Valid")
    public void tcln006_input_username_valid(){
        loginPage.getTxtInputUsername().sendKeys("Admin");
        extentTest.log(LogStatus.PASS, "TCLN006 Input Username Valid");
    }
    @And("TCLN006 Input Password Kosong")
    public void tcln006_input_password_kosong(){
        loginPage.getTxtInputPassword().sendKeys("");
        extentTest.log(LogStatus.PASS, "TCLN006 Input Password Kosong");
    }
    @And("TCLN006 Tekan Tombol Login")
    public void tcln006_tekan_tombol_login(){
        loginPage.getBtnLogin().click();
        extentTest.log(LogStatus.PASS, "TCLN006 Tekan Tombol Login");
    }
    @Then("TCLN006 Validasi Setelah Tombol Di Tekan")
    public void tcln006_validasi_setelah_tombol_di_tekan(){
        String txtAlert = loginPage.getTxtAlert3()==null?"Element tidak ditemukan" : loginPage.getTxtAlert3().getText();
        System.out.println(txtAlert);
        extentTest.log(LogStatus.PASS, "TCLN006 Validasi Setelah Tombol Di Tekan");
    }
    @Given("TCLN007 Mengakses Halaman Login")
    public void tcln007_mengakses_halaman_login(){
        this.driver.get(Constants.URL_LOGIN1);
        extentTest.log(LogStatus.PASS, "TCLN007 Mengakses Halaman Login");
    }
    @And("TCLN007 Validasi Halaman Login")
    public void tcln007_validasi_halaman_login(){
        String strLogin = loginPage.getTxtLogin()==null?"Element Tidak di temukan" : loginPage.getTxtLogin().getText();
        extentTest.log(LogStatus.PASS, "TCLN007 Validasi Halaman Login");
    }
    @And("TCLN007 Clear Input Username Dan Password")
    public void tcln007_clear_input_username_dan_password(){
        loginPage.getTxtInputUsername().clear();
        loginPage.getTxtInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TCLN007 Clear Input Username Dan Password");
    }
    @And("TCLN007 Input Username Tidak Valid")
    public void tcln007_input_username_tidak_valid(){
        loginPage.getTxtInputUsername().sendKeys("jhsdhs");
        extentTest.log(LogStatus.PASS, "TCLN007 Input Username Tidak Valid");
    }
    @And("TCLN007 Input Password Kosong")
    public void tcln007_input_password_kosong(){
        loginPage.getTxtInputPassword().sendKeys("");
        extentTest.log(LogStatus.PASS, "TCLN007 Input Password Kosong");
    }
    @And("TCLN007 Tekan Tombol Login")
    public void tcln007_tekan_tombol_login(){
        loginPage.getBtnLogin().click();
        extentTest.log(LogStatus.PASS, "TCLN007 Tekan Tombol Login");
    }
    @Then("TCLN007 Validasi Setelah Tombol Di Tekan")
    public void tcln007_validasi_setelah_tombol_di_tekan(){
        String txtAlert = loginPage.getTxtAlert3()==null?"Element tidak ditemukan" : loginPage.getTxtAlert3().getText();
        extentTest.log(LogStatus.PASS, "TCLN007 Validasi Setelah Tombol Di Tekan");
    }


}





