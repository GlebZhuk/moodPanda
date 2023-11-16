package test;

import model.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.DashBoardService;
import service.FeedGlobalPageService;
import service.LoginPageService;

public class CommentsTest extends BaseTest {

    LoginPageService loginPageService = new LoginPageService();
    FeedGlobalPageService feedGlobalPageService;
    DashBoardService dashBoardService;

    @Test
    public void verifyCommentsTest() {
        boolean successReplayMessage;
        User user = new User();
        feedGlobalPageService = loginPageService.login(user);
        dashBoardService = feedGlobalPageService.clickReplayToUser();
        successReplayMessage = dashBoardService.sendReplayMessage();
        Assert.assertTrue(successReplayMessage, "Error of comments Test");
    }
}
