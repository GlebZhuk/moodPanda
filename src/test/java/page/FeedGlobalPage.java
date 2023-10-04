package page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class FeedGlobalPage {
    private static final String EDIT_POST_LINK = "//aside[contains(@class, 'column')]//a[contains(@href, 'mydata')]";
    private static final String REPLAY_BUTTON = "//a[contains(text(), 'Reply')]";
    private static final String HUG_BUTTON = "//a[contains(text(), 'Hug')]";
    private static final String SUCCESS_HUG = "//*[contains(text(), 'Your hug was sent')]";

    public DashboardPage clickEditPostLink() {
        $(By.xpath(EDIT_POST_LINK)).click();
        return new DashboardPage();
    }

    public DashboardPage clickReplay(int ratingPosition) {
        $$(By.xpath(REPLAY_BUTTON)).get(ratingPosition).click();
        return new DashboardPage();
    }

    public FeedGlobalPage clickHug(int ratingPosition) {
        $$(By.xpath(HUG_BUTTON)).get(ratingPosition).click();
        return this;
    }

    public boolean isSuccessMessageAboutHug() {
        return $(By.xpath(SUCCESS_HUG)).shouldBe(Condition.visible, Duration.ofSeconds(10)).isDisplayed();
    }
}
