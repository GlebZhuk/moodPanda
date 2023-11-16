package test;

import model.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.FeedGlobalPageService;
import service.LoginPageService;

public class HugTest {

    LoginPageService loginPageService = new LoginPageService();
    FeedGlobalPageService feedGlobalPageService;

    @Test
    public void verifyHugButtonTest() {
        boolean successHug;
        User user = new User();
        feedGlobalPageService = loginPageService.login(user);
        successHug = feedGlobalPageService.clickHugToUser();
        Assert.assertTrue(successHug, "Error of Hug Test");
    }
}
