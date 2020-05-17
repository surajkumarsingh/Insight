package com.smokeTest;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;



public class Delahize_page {
	 public static AndroidDriver<MobileElement> driver;
	    //public static AppiumDriver driver;
	    public static WebDriverWait wait;



	    @BeforeMethod
	    public static void setup () throws Exception {
	        DesiredCapabilities caps = new DesiredCapabilities();
	     
	        caps.setCapability("app", "F:/DCInsights v7.1.5.apk");
	        //  caps.setCapability("app", "F:/DCInsightsV6-release-6.1.39.apk");
	        //caps.setCapability("app", "/Users/sjacob/AndroidStudioProjects/apk/DCInsightsV6-release-6.1.39.apk");
	        //caps.setCapability("app", "/Users/sjacob/AndroidStudioProjects/apk/DCInsightsV7-release-7.0.7.apk");
	        caps.setCapability("platformName", "Android");
	        //caps.setCapability("platformVersion", "5.1");
	        //caps.setCapability("platformVersion", "7.0");
	        caps.setCapability("platformVersion", "8.1.0");
	        caps.setCapability("deviceName", "Redmi");
	       caps.setCapability("autoGrantPermissions","true");
    
	        caps.setCapability("appPackage", "com.trimble.harvestmark.insights");
	        caps.setCapability("appActivity","com.trimble.harvestmark.insights.activity.LoginActivity");
	      //  caps.setCapability("fullReset","true");
	      //  caps.setCapability("deviceName", "emulator-5554");
	        //caps.setCapability("deviceName", "3406278c");
	  
	     //   caps.setCapability("appActivity","com.trimble.harvestmark.insights.LauncherActivity");

	        
	    //    caps.setCapability("skipUnlock","true");

	        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
	        //driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
	        wait = new WebDriverWait(driver, 10);

	    }

	    public static void scroolToText(String string) {
	        System.out.println("Running method --> scroolToText --> " + string);
	        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+string+"\").instance(0))").click();
	    }


	 //   android:id/button2
	    public static class Delhaize_Login {
	        public static void emialField(String emial) {
	        	driver.findElement(By.id("com.trimble.harvestmark.insights:id/email")).click();
	            driver.findElement(By.id("com.trimble.harvestmark.insights:id/email")).sendKeys(emial);
	        }
	        public static void passwordField(String password) {
	        	 driver.findElement(By.id("com.trimble.harvestmark.insights:id/password")).click();
	            driver.findElement(By.id("com.trimble.harvestmark.insights:id/password")).sendKeys(password);
	        }
	        public static void sign_in_button() {
	            driver.findElement(By.id("com.trimble.harvestmark.insights:id/sign_in_button")).click();
	                                     
	        }
	    }
	    public static void allow() {
	    	 driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
	    	// com.android.packageinstaller:id/permission_allow_button
	    	//com.android.packageinstaller:id/permission_allow_button
	    	//com.android.packageinstaller:id/permission_allow_button
	    	//com.android.packageinstaller:id/permission_allow_button
	    }
	   // com.android.packageinstaller:id/permission_allow_button
	    public static void cancelBtn() {
	    	
	    	 driver.findElement(By.id("android:id/button2")).click();
	    }
	    public static void clickInsight() {
	    	
	    	
	    	 driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Insights\"]")).click();
//	    	List<MobileElement> elementsOne	= driver.findElementsByAccessibilityId("Insights");
//	    elementsOne.
	    }
	  
	    public static void LocationsScreen(int index) {
	        System.out.println("Inside LocationsScreen Function");
	        driver.findElement(By.xpath
	                //("//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[" + index  + "]/android.widget.TextView[1]")).click();
	                        ("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[" + index  + "]")).click();
	        System.out.println("Clicked on find by Xpath LocationsScreen");
	    }

	    public static void oKButton () {
	        driver.findElement(By.id("android:id/button1")).click();
	        System.out.println("Clicked OK Button");
	    }

	    public static class EndPoints {
	        public static final int LOCALHOST = 0;
	        public static final int QA_AWS = 1;
	        public static final int QA5_EXT = 2;
	        public static final int PROD = 3;
	        //public static final int STG = 4;
	        //public static final int PROD = 5;
	    }

	    public static class HomePage {
	        public static void openEndPointSelection() {
	            WebElement accessPoint = driver.findElement(By.id("com.trimble.harvestmark.insights:id/headerImage"));
	            for (int i = 0; i < 10; i++) {
	                System.out.println(i);
	                accessPoint.click();
	            }
	        }

	        public static void chooseEndPoint(int endPoint) {
	            switch (endPoint) {
	                case EndPoints.LOCALHOST:
	                    selectEndPoint("LOCALHOST");
	                    break;
	                case EndPoints.QA_AWS:
	                    selectEndPoint("QA_AWS");
	                    break;
	                case EndPoints.QA5_EXT:
	                    selectEndPoint("QA5_EXT");
	                    break;
	                case EndPoints.PROD:
	                    selectEndPoint("PROD");
	                    break;
	                default:
	                    selectEndPoint("QA_AWS");
	            }
	        }

	        private static void selectEndPoint(String endPoint) {
	            WebElement endPointElement = driver.findElement(By.name(endPoint));
	            endPointElement.click();
	            driver.findElement(By.id("android:id/button1")).click();

	        }

	        public static void orderDataIcon() {
	            driver.findElement(By.id("com.trimble.harvestmark.insights:id/action_order_data")).click();
	            System.out.println("Clicked on Order Data Icon");
	        }

	        public static void startNewButton() {
	            //driver.findElement(By.id("com.trimble.harvestmark.insights:id/newInspectionButton")).click();
	            driver.findElement(By.id("com.trimble.harvestmark.insights:id/newInspectionButton")).click();
	        }

	        public static void uploadInspections() {
	            driver.findElement(By.id("com.trimble.harvestmark.insights:id/action_sync")).click();
	        }

	    }

	        public static class ContainerScreen {
	            public static void supplierSelection() {
	                driver.findElement(By.xpath
	                        ("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.GridView/android.widget.LinearLayout[1]/android.widget.Button")).click();
	            }
	            public static void firstSupplier(int index) {
	                driver.findElement(By.xpath
	                        ("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[" + index + "]/android.widget.TextView")).click();
	            }
	            public static void pOSelection() {
	                driver.findElement(By.xpath
	                        ("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.GridView/android.widget.LinearLayout[2]/android.widget.Button")).click();
	            }
	            public static void firstPo(int index) {
	                driver.findElement(By.xpath
	                        ("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[" + index + "]/android.widget.TextView")).click();
	            }
	            public static void startInspection() {
	                driver.findElement(By.id
	                        ("com.trimble.harvestmark.insights:id/action_start")).click();
	            }
	        }

	    public static class ProductScreen {

	        public static void productSelection (int index) {
	            System.out.println("productSelection (int index)");
	            driver.findElement(By.xpath
	                    //("/hierarchy/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ExpandableListView[1]/android.widget.LinearLayout[" + index  + "]")).click();
	            ("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ExpandableListView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[" + index  + "]")).click();
	        }
	        public static void productName (int index) {
	            driver.findElement(By.xpath
	                    ("/hierarchy/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ExpandableListView[1]/android.widget.LinearLayout[" + index  + "]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).getText();
	        }
	        public static void poSelection () {
	            System.out.println("poSelection (int index)");

	            driver.findElement(By.xpath
	                    ("/hierarchy/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.ListView[1]/android.widget.LinearLayout[2]")).click();
	        }

	        public static void backButton () {
	            driver.findElement(By.xpath
	                    ("/hierarchy/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]")).click();

	        }

	    }

}
