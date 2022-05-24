package Practices;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class Q07_DropDown extends TestBase {
    // go to url : https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/
    //-->Task1 Find Dropdown on Multi Selection
    //-->Task2 Find  all Dropdown Elements on page
    //-->Task3 printout DropDown Elements' number
    //-->Task4 choose dropdown elements and printout dropdown elements' name  until choise 6

    @Test
    public void task1(){
        // go to url : https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/
        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

        //-->Task1 Find Dropdown on Multi Selection
        WebElement birinciDdm=driver.findElement(By.xpath("//input[@id='justAnInputBox']"));

        //-->Task2 Find  all Dropdown Elements on page
        WebElement ikinciDdm= driver.findElement(By.xpath("//input[@id='justAnInputBox1']"));
        WebElement ucuncuDdm= driver.findElement(By.xpath("//input[@id='justAnotherInputBox']"));

        //-->Task3 printout DropDown Elements' number
        Select select=new Select(birinciDdm);
        Select select1=new Select(ikinciDdm);
        Select select2=new Select(ucuncuDdm);
        System.out.println("1.-->"+select.getOptions().size());
        System.out.println("2.-->"+select1.getOptions().size());
        System.out.println("3.-->"+select2.getOptions().size());
    }
}
