package com.diprella.framework;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import static com.diprella.framework.BasePage.driver;
import static com.diprella.framework.BasePage.settings;

public class BaseTest {

   

	@BeforeSuite(alwaysRun = true)
    public void beforeSuite(ITestContext context) throws MalformedURLException {
        settings = new Settings();
        driver = settings.getDriver();
        driver.manage().window().fullscreen();
        driver.get(settings.getBaseUrl());
    }
	
    @AfterSuite(alwaysRun = true)
    public void afterTest() {
        driver.quit();
    }
//
//    @Attachment(value = "Screenshot attachment", type = "image/png")
//    public static byte[] addImgAttachment() throws IOException, AWTException {
//        //BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd_MM_yyyy_H_m_s");
//        //File file = new File("target\\screenshot_" + LocalDateTime.now().format(formatter).toString() + ".png");
//        File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(file, new File("target\\screenshot_" + LocalDateTime.now().format(formatter).toString() + ".png"));
//        //ImageIO.write(image, "PNG", file);
//        return Files.readAllBytes(file.toPath());
//    }

   /* @AfterTest(alwaysRun = true)
    public void takeScreenShot(){
        try {
            addImgAttachment();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    } */


}
