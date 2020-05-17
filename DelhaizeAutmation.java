package com.smokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.StartsActivity;

public class DelhaizeAutmation extends Delahize_page {

    String southportland ="CLEVELAND/3Z";
    String DCName, userName, orderdatastatus, productselected;
    String unitofmeasurestr ="Unit of Measurement";
    String usebystr ="Use By";
    String commentsstr ="Comments";

    @Test
    
    public void Delhaize_Automation() throws InterruptedException {
    	// Thread.sleep(5000);
//    	  DesiredCapabilities caps = new DesiredCapabilities();
//  	 caps.setCapability("autoGrantPermissions","true");
//    	//com.trimble.harvestmark.insights.activity.LoginActivity
//	Activity activity = new Activity("com.trimble.harvestmark.insights", "com.trimble.harvestmark.insights.activity.LoginActivity");
//  	((StartsActivity) driver).startActivity(activity);
 //	activity.setStopApp(false);
//   	
    	
    	//activity.setStopApp(false);
    	
        System.out.println("Delhaize Test Started");
        Thread.sleep(3000);
//        Delahize_page.allow();
//        Delahize_page.allow();
//        Delahize_page.allow();
//        Delahize_page.allow();
        

    /* Delhaize_Automation.HomePage.openEndPointSelection();
     Thread.sleep(2000);
     for (int i = 0; i < 10; i++) {
         System.out.println(i);
         TouchAction logoimage = new TouchAction (driver);
         logoimage.tap(PointOption.point(660, 400)).perform(); // Galaxy S5 Emulator
         //logoimage.tap(335, 263).perform(); // TC70
         Thread.sleep(5000);
     }
     */
     //Delahize_page.HomePage.chooseEndPoint(EndPoints.QA_AWS);
     //Thread.sleep(1000);
     //   Thread.sleep(5000);
        Delhaize_Login.emialField("user@delhaize.com");
        Delhaize_Login.passwordField("password");
       // Thread.sleep(2000);
        Delhaize_Login.sign_in_button();
       Thread.sleep(3000);
      // Delahize_page.cancelBtn();
//       Thread.sleep(3000);
//       Delahize_page.clickInsight();
//     ((StartsActivity) driver).startActivity(activity);
//     Delhaize_Login.emialField("user@delhaize.com");
//     Delhaize_Login.passwordField("password");
//    // Thread.sleep(2000);
//     Delhaize_Login.sign_in_button();
//    Thread.sleep(3000);

  WebDriverWait wait = new WebDriverWait(driver, 1000);
  System.out.println("Waiting for Sync to Finish");
  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/customPanel")));
  System.out.println("Processing Data.......");

//        Thread.sleep(15000);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.trimble.harvestmark.insights:id/selectStoreText")));
//        System.out.println("At Select Location Screen");
//        Delahize_page.LocationsScreen(7);
//        System.out.println("Selected void LocationsScreen before clicking Order Data");
//        //Thread.sleep(4000);
//
//        Delahize_page.HomePage.orderDataIcon();
//        WebDriverWait wait4 = new WebDriverWait(driver, 1000);
//        //wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.ScrollView[1]/android.widget.TextView[1]")));
//        System.out.println("Waiting for Order data Download");
//        wait4.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/topPanel")));
//
//        System.out.println("Order Data Download Finished!");
//        Delahize_page.oKButton();
//        Thread.sleep(2000);
//        Delahize_page.HomePage.startNewButton();
//        Thread.sleep(2000);
//
//        Delahize_page.ContainerScreen.supplierSelection();
//        Thread.sleep(2000);
//        Delahize_page.ContainerScreen.firstSupplier(1);
//        Thread.sleep(2000);
//        Delahize_page.ContainerScreen.pOSelection();
//        Thread.sleep(2000);
//        Delahize_page.ContainerScreen.firstPo(2); // index 2 is first PO
//        Thread.sleep(2000);
//        Delahize_page.ContainerScreen.startInspection();
//        Thread.sleep(2000);
//
//        System.out.println("Selecting First Product");
//        Delahize_page.ProductScreen.productSelection(1);
//        System.out.println("First Product Selected");
//        Thread.sleep(2000);
//
//        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+commentsstr+"\").instance(0))").click();
//        System.out.println("Scrolled To Comments");
//        Thread.sleep(2000);
//
//



    }
}