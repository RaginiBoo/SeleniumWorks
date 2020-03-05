package PracticeApplication;

import java.io.IOException;

public class CallingGitUpMethod {

	public static void main(String[] args) throws IOException 
	{
		
		GitUpMethod ptm = new GitUpMethod();
		ptm.launchapp("https://github.com/git-up/GitUp");
		
		ptm.moveto("/html/body/div[1]/header/div/div[2]/nav/ul/li[1]/details/summary");
		ptm.moveto("/html/body/div[1]/header/div/div[2]/nav/ul/li[1]/details/div/ul[1]/li[1]/a");
		
		
		
		ptm.clickbyxpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]");
	
		ptm.enterbyid("login_field","raginiboobalan@gmail.com");
		ptm.enterbyid("password", "123456789");
	
		ptm.clickbyxpath("//*[@id=\"login\"]/form/div[3]/input[8]");
		
		ptm.screenshot("C:\\Users\\BLTuser.BLT1227\\Desktop\\Software\\eclipse-workspace\\Selenium\\ScreenShot\\gitup.png");
		//ptm.closeapp();
		
		
	}

}
