package com.vytrack.task_test;


import com.vytrack.pages.CalenderEventsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task extends TestBase {


    LoginPage loginPage = new LoginPage();
    CalenderEventsPage calenderEventsPage = new CalenderEventsPage();

    //        1. Go to “https://qa1.vytrack.com/"
//        2. Login as a store manager
//        3. Navigate to “Activities -> Calendar Events”
//        4. Verify that page subtitle "Options" is displayed
   @Test
    public void test1(){

       extentLogger = report.createTest("Test 1");
       extentLogger.info("Login as Store Manager");
       loginPage.loginAsStoreManager();
       extentLogger.info("Navigate to “Activities -> Calendar Events”");
       new DashboardPage().navigateToModule("Activities","Calendar Events");
       new CalenderEventsPage().waitUntilLoaderScreenDisappear();
       extentLogger.info("Verify that page subtitle 'Options' is displayed");
       Assert.assertTrue(calenderEventsPage.options.isDisplayed(), "Verify that page subtitle 'Options' is displayed");

       extentLogger.pass("Test 1 PASSED");
    }

//    Test case #2
//            1. Go to “https://qa1.vytrack.com/"
//            2. Login as a store manager
//            3. Navigate to “Activities -> Calendar Events”
//            4. Verify that page number is equals to "1"
    @Test
    public void test2(){

        extentLogger = report.createTest("Test 2");
        extentLogger.info("Login as Store Manager");
        loginPage.loginAsStoreManager();
        extentLogger.info("Navigate to “Activities -> Calendar Events”");
        new DashboardPage().navigateToModule("Activities","Calendar Events");
        new CalenderEventsPage().waitUntilLoaderScreenDisappear();
        extentLogger.info("Verify that page number is equals to 1");
        Assert.assertEquals(calenderEventsPage.pageNumber.getAttribute("value"), "1", "Verify that page number is equals to 1");

        extentLogger.pass("Test 2 PASSED");
    }

//    Test case #3
//            1. Go to “https://qa1.vytrack.com/"
//            2. Login as a store manager
//            3. Navigate to “Activities -> Calendar Events”
//            4. Verify that view per page number is equals to"25"
    @Test
    public void test3(){

        extentLogger = report.createTest("Test 3");
        extentLogger.info("Login as Store Manager");
        loginPage.loginAsStoreManager();
        extentLogger.info("Navigate to “Activities -> Calendar Events”");
        new DashboardPage().navigateToModule("Activities","Calendar Events");
        new CalenderEventsPage().waitUntilLoaderScreenDisappear();
        extentLogger.info("Verify that view per page number is equals to 25");
        Assert.assertEquals(calenderEventsPage.viewPerPage25.getAttribute("data-size"), "25", "Verify that view per page number is equals to 25");

        extentLogger.pass("Test 3 PASSED");
    }

//    Test case #4
//            1. Go to “https://qa1.vytrack.com/"
//            2. Login as a store manager
//            3. Navigate to “Activities -> Calendar Events”
//            4. Verify that number of calendar events (rows in the table) is equals to number of records

    @Test
    public void test4(){

        extentLogger = report.createTest("Test 4");
        extentLogger.info("Login as Store Manager");
        loginPage.loginAsStoreManager();
        extentLogger.info("Navigate to “Activities -> Calendar Events”");
        new DashboardPage().navigateToModule("Activities","Calendar Events");
        new CalenderEventsPage().waitUntilLoaderScreenDisappear();
        extentLogger.info("Verify that number of calendar events (rows in the table) is equals to number of records");

        String actualRowNumber = calenderEventsPage.numberOfRecords("testers meeting");
        String expectedEventsNumber = calenderEventsPage.numberOfRecordsOfEvents.getText().split(" ")[2].trim();

        Assert.assertEquals(actualRowNumber, expectedEventsNumber, "Verify that number of calendar events (rows in the table) is equals to number of records");
        extentLogger.pass("Test 4 PASSED");
    }








}
