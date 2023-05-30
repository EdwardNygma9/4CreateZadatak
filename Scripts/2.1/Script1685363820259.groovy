import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By

import com.kms.katalon.core.webui.driver.DriverFactory
import org.apache.commons.lang3.StringUtils

import java.io.*;
import java.text.*;

import java.util.ArrayList;
import java.util.Iterator;


cheapest_item = ""
temp=0
empty_check = null
i=0
res=""
min=0
max=0
int[] item = {}
n=0



/*for(;i<el.size();i++){
	String podeli = "-"
	String text=el.get(i).getText();
	String res = StringUtils.join(text, podeli)
	//item[i] = Integer.parseInt(res)
	}
*/	
/*	String[] splitString = res.split("-")
	for(String s :splitString) {
		item[i].add(Integer.valueOf(s))
	}
*/
	
	public List<String> WebelementToString(List<WebElement> elementList){
		List<String> stringList = new ArrayList<String>()
		for (WebElement element : elementList) {
		stringList.add(element.getText().toString())
		System.out.println(element.getText())
		}
		for(String s : stringList) {
		System.out.println("Element of the list into String formate")
		System.out.println(s)
		}
		return stringList
		}
	
		public List<Integer> WebelementToInteger(List<WebElement> elementList){
			List<Integer> integerList = new ArrayList<Integer>()
			for (WebElement element : elementList ) {
			integerList.add(element.getText().toInteger())
			System.out.println(element.getText())
			}
			for(Integer n : integerList) {
			System.out.println("Element of the list into Integer formate")
			System.out.println(n)
			}
			return integerList
			}
		
		
			
			
			
			public static void main(String[] args) {
				
				try {
				 
				if (!el.isEmpty() && el.size() > 0) {
	                 empty_check = el.get(0)
                 }
				 
				 WebUI.openBrowser('')
				 
				 WebUI.navigateToUrl('https://rahulshettyacademy.com/seleniumPractise/#/')
				 
				 WebDriver driver = DriverFactory.getWebDriver()
				 
				 //List<WebElement> el = driver.findElements(By.xpath("//div[@class='products']//div[@class='product']//div[@class=product-price]/text"))
				 
				 List<WebElement> el = driver.findElements(By.xpath("//div[@id='root']/div/div/div/div/p"))
				 
				 
				 List<String> strlist  = WebelementToString(el)
				 
				 
				 } catch (Exception e) {
				 e.printStackTrace()
				 }
			   }
	
/*for(WebElement e:el) {

   String item_string = e.getText()
   println(item_string)
   item =Integer.parseInt(item_string.replaceAll(",",""))
   println(item)
   
}*/

cheapest_item = item[i]
println(cheapest_item)

for(Integer n:item) {
	
	if(n<cheapest_item) {
		cheapest_item=n
	}
    
}
println(cheapest_item)



//for(WebElement e:el) {

 
//}
//println(res)
//String[] split(String delimiter, int limit) {}

//for (i=0;i<res.length();i++) {
	
/*	String[] splitString = res.split("-")
	for(String s : el) {
		intList.add(Integer.valueOf(s))
	}
	intList.addAll(strList.stream().map(Integer::valueOf).collect(Collectors.toList()))
	*/
	
//	while (res[i]!=podeli) {
/*	for (Integer i:splitString.size) {
     cheapest_item = Integer.parseInt(splitString[i])
	}*/
//		break
//}















/*
for(WebElement e:el) {
	
	cheapest_item=e.getText()
}*/
/*



for(i=0;i<res.length();i++) {
	while(res[i]!=podeli) {
		
	   if ((Integer)e.getText() < cheapest_item) {
		   cheapest_item = e.getText()
	   }
	}
//	println(e.getText())
}
*/
//println(cheapest_item)


/*
static void traverseString(String str)
{
	CharacterIterator it = new StringCharacterIterator(str);

	// Iterate and print current character
	while (it.current() != CharacterIterator.DONE) {
		System.out.print(it.current() + " ");

		// Moving onto next element in the object
		// using next() method
		it.next();
	}
}
*/

/*
for(WebElement e:el) {
	println(e.getText())
	if ((Integer)e.getText() < cheapest_item) {
		cheapest_item = e.getText()
	}
//	println(e.getText())
}
println(cheapest_item)
*/




	/*
	if((WebUI.getText(findTestObject(e)))<min) {
		min = (WebUI.getText(findTestObject(e))).toInteger()
	}*/
	//arrayOfInts[i++] = e.getText()
	

//System.out.print('ovdeeeeeeee ispis' + min)

/*
for (i=0;i=arrayOfInts.length;i++) {
	min = arrayOfInts[i].toInteger()
	System.out.print(min)
}*/
//WebUI.comment('Cheapest item value on this site is ', + min)
/*
min = arrayOfInts[0].toInteger()
System.out.print(min) 

for (i=1;i<arrayOfInts.size;i++) {
	if(arrayOfInts[i].toInteger()<min) {
		min=arrayOfInts[i].toInteger()
	}
}

WebUI.comment('Cheapest item value on this site is ' + min.toString())

//min = WebUI.getText(findTestObject('Object Repository/Get_element/Page_GreenKart - veg and fruits kart/p_120'))


//Collections.sort(arrayOfInts)

//def cheapest_item = Collections.min(arrayOfInts)

//WebUI.comment('Cheapest item value on this site is ' + cheapest_item.toString())

//def most_expensive_item = Collection.max(arrayOfInts)

//WebUI.comment('Most expensive item value on this site is ' + most_expensive_item.toString())

//WebUI.click(findTestObject('Object Repository/Adding_in_basket/Page_GreenKart - veg and fruits kart/button_ADD TO CART'))
*/