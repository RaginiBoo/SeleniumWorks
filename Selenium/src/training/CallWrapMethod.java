package training;

import java.io.IOException;

public class CallWrapMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WrapperMethod wm = new WrapperMethod();
		wm.launchapp("https://www.linkedin.com/");
		wm.clickbyxpath("/html/body/nav/a[3]");
		wm.enterbyid("username", "raginiboobalan@gmail.com");
		wm.enterbyid("password", "123456");
		wm.clickbyxpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button");
		wm.screenshot("C:\\Users\\BLTuser.BLT1227\\Desktop\\Software\\eclipse-workspace\\Selenium\\ScreenShot\\login.png");
		wm.closeapp();
		
	}

}
