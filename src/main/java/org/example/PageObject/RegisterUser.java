package org.example.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUser {
    public static WebDriver driver;
    public RegisterUser(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id='signatory_first_name']")
    private WebElement fieldFirstName;

    public void setFieldFirstname(String firstName){
        fieldFirstName.sendKeys(firstName);
    }

    @FindBy(xpath = "//input[@id='signatory_last_name']")
    private WebElement fieldLastName;

    public void setFieldLastName(String lastName){
       fieldLastName.sendKeys(lastName);
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement fieldEmail;

    public void setFieldEmail(String email){
        fieldEmail.sendKeys(email);
    }

    @FindBy(xpath = "//input[@id='password']")
    private WebElement fieldPassword;

    public void setFieldPassword(String password){
        fieldPassword.sendKeys(password);
    }

    @FindBy(xpath = "//input[@id='name']")
    private WebElement fieldCompany;

    public void setFieldCompany(String company){
        fieldCompany.sendKeys(company);
    }

    @FindBy(css = "[placeholder='812-345-678']")
    private WebElement fieldPhone;

    public void setFieldPhone(String phone){
        fieldPhone.sendKeys(phone);
    }

    @FindBy(xpath = "//select[@id='country']")
    private WebElement clickSelectCountry;

    public void setClickSelectCountry(){
        clickSelectCountry.click();
    }

    @FindBy(xpath = "//option[contains(.,'South Africa nedbank')]")
    private WebElement selectCountry;

    public void setSelectCountry(){
        selectCountry.click();
    }

    @FindBy(xpath = "//select[@id='states']")
    private WebElement clickSelectState;

    public void setClickSelectState(){
        clickSelectState.click();
    }


    @FindBy(xpath = "//option[.='Gauteng']")
    private WebElement selectState;

    public void setSelectState(){
        selectState.click();
    }

    @FindBy(xpath = "//input[@class='psa-checkbox']")
    private WebElement ceklisBox;

    public void setCeklisBox(){
        ceklisBox.click();
    }

    @FindBy(xpath = "//button[@id='btn-register']")
    private WebElement btnResgister;

    public void setBtnResgister(){
       btnResgister.click();
    }




}
