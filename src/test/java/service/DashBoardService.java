package service;

import page.DashboardPage;

public class DashBoardService {

    private DashboardPage dashboardPage = new DashboardPage();

    public void setRating(int postPosition, String rating) {
        dashboardPage.setupRating(postPosition, rating)
                .clickUpdateButton(postPosition);
    }

    public boolean getSuccessMessage() {
        return dashboardPage.isSuccessMessageDisplay();
    }

    public boolean sendReplayMessage() {
        return dashboardPage.textReply().clickSendReply().isSuccessMessageAboutReply();
    }
}
