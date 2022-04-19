package Native;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Demo1 extends Capabilities{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver = capability();
		//if i run this what will happen
		driver.findElement(MobileBy.AccessibilityId("Preference")).click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.AccessibilityId("3. Preference dependencies")).click();
		//beacuse id is a locator of selenium so i can use By.id directly //
		//i use mobile By only if it is android locator
		Thread.sleep(3000);
		driver.findElement(By.id("android:id/checkbox")).click();
		//if i dont have accessibilty id and i cnnot use xpath as it is big
		//so i can identify the element using text
		//Whenever i am identifing the element with attribute not locator then i that case  i use uiautomator
		//and uiSelector is a method i am using this to identify the elemnt with a attribute 
	//	driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"WiFi settings\")")).click();
		//or
		//driver.findElementByAndroidUIAutomator("UiSelector().text(\"WiFi settings\")").click();
		//or
		driver.findElement(By.xpath("//*[@text='WiFi settings']")).click();
		
		driver.findElement(By.className("android.widget.EditText")).sendKeys("sunil");
		//keyboard is comming
		driver.hideKeyboard();
		//This is an example of when twoelements have same locator value so differentiate them using index
		//if i make the index as 0 it will click on cancel
		//if i make the index as 1 it ill click on ok button
		driver.findElements(By.className("android.widget.Button")).get(0).click();
		//i want to go back //navigate back ? how will i do it
		//App_switch is basically to switch between two apps.
		//This command will take you back one step
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		//it will take you to the home page 
		//driver.pressKey(new KeyEvent(AndroidKey.HOME));
		//i want to open notification 
		driver.openNotifications();
		Thread.sleep(3000);
		//driver.findElement(By.id("Battery Saver")).click();
		driver.findElement(MobileBy.AccessibilityId("Battery Saver")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("Battery Saver")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		System.out.println("dxvfdvfdxv");
		
	}
	}


