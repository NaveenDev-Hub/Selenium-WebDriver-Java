package com.practicetestautomation.tests.exception;

import com.practicetestautomation.pageobjects.ExceptionPage;
import com.practicetestautomation.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExceptionsTests extends BaseTest {

    @Test
    public void noSuchElementExceptionTest() {

        logger.info("Starting noSuchElementExceptionTest");
        ExceptionPage exceptionPage = new ExceptionPage(driver);
        exceptionPage.visit();
        exceptionPage.clickAddButton();
        Assert.assertTrue(exceptionPage.isRow2Displayed(), "Row 2 input filed is not displayed");
   }

    @Test
    public void timeoutExceptionTest() {

        logger.info("Starting timeoutExceptionTest");
        ExceptionPage exceptionPage = new ExceptionPage(driver);
        exceptionPage.visit();
        exceptionPage.clickAddButton();
        Assert.assertTrue(exceptionPage.isRow2Displayed(), "Row 2 input filed is not displayed");
    }

    @Test
    public void elementNotInteractableExceptionTest() {

        logger.info("Starting elementNotInteractableExceptionTest");
        ExceptionPage exceptionPage = new ExceptionPage(driver);
        exceptionPage.visit();
        exceptionPage.clickAddButton();
        Assert.assertTrue(exceptionPage.isRow2Displayed(), "Row 2 input filed is not displayed");
        exceptionPage.sendValueToRow2InputField("Sushi");
        exceptionPage.clickSaveButton();
        Assert.assertEquals(exceptionPage.successMessage(), "Row 2 was saved");
    }

    @Test
    public void invalidElementStateExceptionTest() {

        logger.info("Starting invalidElementStateExceptionTest");
        ExceptionPage exceptionPage = new ExceptionPage(driver);
        exceptionPage.visit();
        exceptionPage.clickEditButton();
        exceptionPage.clearRow1InputField();
        exceptionPage.sendValueToRow1InputField("briyani");
        exceptionPage.clickRow1SaveButton();
        Assert.assertEquals(exceptionPage.successMessage(), "Row 1 was saved");
    }

    @Test
    public void staleElementReferenceExceptionTest() {

        logger.info("Starting staleElementReferenceExceptionTest");
        ExceptionPage exceptionPage = new ExceptionPage(driver);
        exceptionPage.visit();
        exceptionPage.clickAddButton();
        Assert.assertTrue(exceptionPage.isInstructionsElementHiddenAfterWait(), "Instructions text is still displayed");
    }
}
