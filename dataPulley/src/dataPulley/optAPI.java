package dataPulley;

import java.util.List;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;

public class optAPI {
	public static void main(String[] args) throws Exception {
		java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(java.util.logging.Level.OFF);
		
		String url="http://api.tuimobilityhub.com/Username=developer&Password=McPhxToJ9IVQ";
		final WebClient wB=new WebClient(BrowserVersion.CHROME);
		wB.getOptions().setThrowExceptionOnFailingStatusCode(false);
		HtmlPage page=wB.getPage(url);
		String pageContent=page.asXml();
		System.out.println(pageContent);
		HtmlInput email= page.getHtmlElementById("Username");
		email.setValueAttribute("developer");
		HtmlInput pass= page.getHtmlElementById("Password");
		pass.setValueAttribute("McPhxToJ9IVQ");
		HtmlSubmitInput submitBtn = page.getElementByName("OK"); //Find element called Submit to submit form.
		page = submitBtn.click();
		String pageContent1=page.asXml();
		System.out.println(pageContent1);
	}
}

