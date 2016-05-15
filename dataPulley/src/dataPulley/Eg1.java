package dataPulley;


	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileWriter;
	import java.util.Iterator;
	import java.util.Set;

	//Import htmlunit classes    

	import com.gargoylesoftware.htmlunit.WebClient;
	import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
	import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
	import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
	import com.gargoylesoftware.htmlunit.util.Cookie;


	//This Class attempts to submit user and password credentials
	//and mirrors how a login button would be clicked on a webpage:
	public class Eg1 {

	    public static void main(String[] args) throws Exception {

	        WebClient webClient = new WebClient();

	        // Get the first page
	        HtmlPage page = (HtmlPage) webClient.getPage("https://www.facebook.com");
	        HtmlInput email=page.getElementByName("email");
			email.setValueAttribute("jeevan.jeevan60@gmail.com");
			HtmlInput pass=page.getElementByName("pass");
			pass.setValueAttribute("MrRobotIsG1HeW!llNeverD!e");
			HtmlSubmitInput submitBtn = (HtmlSubmitInput)page.getHtmlElementById("u_0_w"); //Find element called Submit to submit form.
		    page = submitBtn.click();
	        /*// Get the form that we are dealing with and within that form,
	        // find the submit button and the field that we want to change.
	        HtmlForm form = page1.getFormByName("loginform");

	        // Enter login and passwd
	        form.getInputByName("user_id").setValueAttribute("#####");
	        form.getInputByName("password").setValueAttribute("#####");

	        // Click "Sign In" button/link
	        page1 = (HtmlPage) form.getInputByValue("Log In").click();
*/
	        // I added the cookie section but this returns a null pointer exception    
	        Set<Cookie> cookie = webClient.getCookieManager().getCookies();

	        if(cookie != null){

	            Iterator<Cookie> i = cookie.iterator();

	            while (i.hasNext()) {

	                webClient.getCookieManager().addCookie(i.next());

	            }

	        }


	        //  Get page as Html
	        String htmlBody = page.getWebResponse().getContentAsString();
	        //  Save the response in a file
	        String filePath = "c:/temp/test_out.html";

	        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filePath)));
	        bw.write(htmlBody);
	        bw.close();

	        // Change the value of the text field
	        // userField.setValueAttribute("alwalsh");
	        // passwordField.setValueAttribute("1REland6");

	        // Now submit the form by clicking the button and get back the second page.
	        // final HtmlPage page2 = button.click();


	        webClient.close();
	    }
	}
