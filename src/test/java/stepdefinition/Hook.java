package stepdefinition;

import base.BasePage;
import Utils.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import Utils.ElementUtil;

public class Hook {
    ElementUtil elementUtil = new ElementUtil();
    private static Logger logger = Logger.getLogger(Hook.class);
    //Hook class
    @Before
    public void setUp(){
        logger.info("**********************************");
        logger.info("Test setup method is starting....!");
        ConfigReader.getProperty("browser");
        BasePage.get().manage().window().maximize();
        BasePage.get().get(ConfigReader.getProperty("url"));
    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            logger.error("Test is failed....!");
            byte[] screenshot = ((TakesScreenshot) BasePage.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
            elementUtil.getScreenShot("failure_image");
        }
        else{
            logger.info("Cleanup!");
            logger.info("Test completed...");
        }
        logger.info("************************************");
        BasePage.closeBrowser();

    }
}
