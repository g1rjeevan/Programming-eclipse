package dataPulley;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;

public class API {

	public static void main(String[] args) throws Exception {
		java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(java.util.logging.Level.OFF);
		String url="https://www.facebook.com";
		final WebClient wB=new WebClient(BrowserVersion.CHROME);
		HtmlPage page=wB.getPage(url);
		HtmlInput email=page.getElementByName("email");
		email.setValueAttribute("jeevan.jeevan60@gmail.com");
		HtmlInput pass=page.getElementByName("pass");
		pass.setValueAttribute("MrRobotIsG1HeW!llNeverD!e");
		HtmlSubmitInput submitBtn = page.getHtmlElementById("u_0_w"); //Find element called Submit to submit form.
	    page = submitBtn.click();
	    
	    String pageContent=page.asText();
		System.out.println(pageContent);
	}

}
