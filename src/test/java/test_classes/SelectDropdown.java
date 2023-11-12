package test_classes;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropdown extends TestBase {
    /*

    <select>
    <option value="option1">Option 1</option>
    <option value="option2">Option 2</option>
    <option value="option3">Option 3</option>
   </select>

    How to handle <select> type dropdowns in Selenium
	We use Select class that comes from Selenium
	1- Locate the dropdown using any of Locators
	2- Create an object of Select Class
	3- Pass the located web element into Select(located)

    3 way of selecting from dropdown option:

	1- select.byVisibleText("visible text")
	-this method accepts a string parameter
	-expects you to pass the text that is visible in the dropdown
	2- select.byIndex(index here)
	-this method accepts integer parameter as the index number of the option that
	 will be selected
	3- select.byValue(attribute values here)
	-this method accepts a string parameter as the attribute value of  "value" attribute

	getFirstSelectedOption(); To get first selected option from select dropdown as web element

	getAllSelectedOptions(); To get all selected options as List of Web element from Multi-select dropdown

	select.getOptions(); get all options from select dropdown as List of Web elements

     */

    @Test
    public void selectDropdown() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");

        // locating select dropdown
        WebElement oldStyleSelect = driver.findElement(By.id("oldSelectMenu"));

        // create an object of select class
        Select select = new Select(oldStyleSelect);

        // to get the text of default selected option (Red)
        System.out.println(select.getFirstSelectedOption().getText());

        // select by visible text
        select.selectByVisibleText("Yellow");
        Thread.sleep(2000);

        // select by value
        select.selectByValue("6");

        Thread.sleep(2000);

        // select by index
        select.selectByIndex(4);

        Thread.sleep(2000);

        // to get first selected option text (Purple)
        System.out.println(select.getFirstSelectedOption().getText());

        // get all options as list of web element
        List<WebElement> allOptions = select.getOptions();

        // loop through, and select each option and print the text for each
        for (WebElement eachOption : allOptions){
            Thread.sleep(1000);
            // getting text of each web element (option)
            String eachOptionVisibleText = eachOption.getText();
            System.out.println(eachOptionVisibleText);

            // select each option by visible text
            select.selectByVisibleText(eachOptionVisibleText);

        }

    }

}
