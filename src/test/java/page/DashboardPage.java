package page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DashboardPage {
    private static final String RATING_SELECT = "//td//select";

    private static final String UPDATE_BUTTON = "//button[contains(@class, 'is-outdlined')]";
    private static final String SUCCESS_MESSAGE = "//*[contains(text(), 'Post updated')]";
    private static final String TEXT_AREA_FOR_REPLAY = "//textarea";
    private static final String SEND_REPLAY_BUTTON = "//button[contains(text(), 'Send reply')]";
    private static final String SUCCESS_MESSAGE_ABOUT_REPLY = "//*[contains(text(), 'Your comment was posted')]";

    public DashboardPage setupRating(int ratingPosition, String rating) {
        $$(By.xpath(RATING_SELECT)).get(ratingPosition).selectOptionByValue(rating);
        return this;
    }

    public DashboardPage clickUpdateButton(int buttonPosition) {
        $$(By.xpath(UPDATE_BUTTON)).get(buttonPosition).click();
        return this;
    }

    public boolean isSuccessMessageDisplay() {
        return $(By.xpath(SUCCESS_MESSAGE)).shouldBe(Condition.visible, Duration.ofSeconds(10)).isDisplayed();
    }

    public DashboardPage textReply() {
        $(By.xpath(TEXT_AREA_FOR_REPLAY)).sendKeys("Wow");
        return this;
    }

    public DashboardPage clickSendReply() {
        $((By.xpath(SEND_REPLAY_BUTTON))).click();
        return this;
    }

    public boolean isSuccessMessageAboutReply() {
        return $(By.xpath(SUCCESS_MESSAGE_ABOUT_REPLY)).shouldBe(Condition.visible, Duration.ofSeconds(10)).isDisplayed();
    }
}
