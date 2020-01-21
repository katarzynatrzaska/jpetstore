package tests;

import org.testng.annotations.Test;
import page.objects.*;

import static org.testng.Assert.assertTrue;

public class PositiveLoginTests extends TestBase {

    @Test
    public void asUserLoginUsingValidLoginAndPassword() {

        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink()
                .clickOnSignInLink()
                .typeIntoUserNameField("j2ee")
                .typeIntoPasswordField("j2ee")
                .clickOnLoginButton();
        //FooterPage footerPage = new FooterPage();

        //  assertTrue(footerPage.isBannerAfterLoginDisplayed());
    }

}
