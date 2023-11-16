package test;

import model.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.DashBoardService;
import service.FeedGlobalPageService;
import service.LoginPageService;

public class MoodPandaTest extends BaseTest {
    private final static int POST_POSITION = 0;
    private final static String RATING = "1";
    private LoginPageService loginPageService = new LoginPageService();
    private DashBoardService dashBoardService = new DashBoardService();

    @Test
    public void checkRatingTest() {
        User user = new User();
        FeedGlobalPageService feedGlobalPageService = loginPageService.login(user);
        dashBoardService = feedGlobalPageService.clickEditPost();
        dashBoardService.setRating(POST_POSITION,RATING);
        Assert.assertTrue(dashBoardService.getSuccessMessage(), "Error of MoodPanda Test");
    }
}
