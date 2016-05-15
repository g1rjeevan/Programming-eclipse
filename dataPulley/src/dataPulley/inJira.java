package dataPulley;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;

public class inJira {
	public static void main(String[] args) throws Exception {
//		java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(java.util.logging.Level.OFF);
		String url="https://injira.symphonyteleca.com/login.jsp";
		final WebClient wB=new WebClient(BrowserVersion.CHROME);
		HtmlPage page=wB.getPage(url);
		HtmlInput username=page.getElementByName("os_username");
		username.setValueAttribute("injrangara");
		HtmlInput password=page.getElementByName("os_password");
		password.setValueAttribute("P@sswd123");
		HtmlSubmitInput submitBtn = page.getElementByName("login");
		System.out.println("Complete1");
	    page = submitBtn.click();
	    System.out.println("Complete1");
	    

	}

}
