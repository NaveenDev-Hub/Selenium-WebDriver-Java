package com.practicetestautomation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExceptionPage extends BasePage {

    private By addButtonInputLocator = By.id("add_btn");
    private By row2InputFieldLocator = By.xpath("//div[@id='row2']/input");
    private By saveButtonLocator = By.xpath("//div[@id='row2']/button[@name='Save']");
    private By successMessageLocator = By.id("confirmation");
    private By editButtonLocator = By.id("edit_btn");
    private By row1InputFieldLocator =  By.xpath("//div[@id='row1']/input");
    private By row1SaveButtonLocator = By.xpath("//div[@id='row1']/button[@name='Save']");
    private By instructionsTextLocator = By.id("instructions");

    public ExceptionPage(WebDriver driver) {
        super(driver);
    }

    public void visit() {
        super.visit("https://practicetestautomation.com/practice-test-exceptions/");
    }

    public void clickAddButton() {
        driver.findElement(addButtonInputLocator).click();
    }

    public boolean isRow2Displayed() {
        return waitForIsDisplayed(row2InputFieldLocator);
    }

    public void sendValueToRow2InputField(String inputValue) {
        driver.findElement(row2InputFieldLocator).sendKeys(inputValue);
    }

    public void clickSaveButton() {
        driver.findElement(saveButtonLocator).click();
    }

    public String successMessage() {
        return driver.findElement(successMessageLocator).getText();
    }

    public void clickEditButton() {
        driver.findElement(editButtonLocator).click();
    }

    public void clearRow1InputField() {
        waitForElement(row1InputFieldLocator).clear();
    }

    public void sendValueToRow1InputField(String inputValue) {
        driver.findElement(row1InputFieldLocator).sendKeys(inputValue);
    }

    public void clickRow1SaveButton() {
        driver.findElement(row1SaveButtonLocator).click();
    }

    public boolean isInstructionsElementHiddenAfterWait() {
        return waitForIsHidden(instructionsTextLocator);
    }


}
