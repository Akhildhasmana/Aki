package Book_Myshow_Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import All_Generic_Methods.ClickElement;
import Book_Myshow_Utility.Base_class;
import Book_myshow_pages.Home_page;
import Book_myshow_pages.Landing_Page;
import Book_myshow_pages.List_Formpage;


public class BookMyShow_Test extends Base_class{


@Test
			public void Page_Runner () {
			webdriver.get(url);
					ClickElement.impicitwait();

			}
@Test(dependsOnMethods ="Page_Runner" )
			public void CenterSpeciality () {
		    ClickElement.btnClick(Home_page.City_selection());
		    ClickElement.btnClick(Home_page.Sign_in());
		    Home_page.Entermob().sendKeys("7417759711");
		    ClickElement.btnClick(Home_page.Continue_button());
		    Home_page.Otp_popup();
		    ClickElement.btnClick(Landing_Page.List_Your_Show());
		    ClickElement.btnClick(Landing_Page.List_Btn());
		    ClickElement.btnClick(Landing_Page.List_Popup_Btn());
//		    List_Formpage.Enter_Details().
//		    List_Formpage.Email.sendKeys("Akhil@mailinator.com");
//		    List_Formpage.phone_no.sendKeys("7417759711");
//		    List_Formpage.Select_region().get(3);

}



			}
