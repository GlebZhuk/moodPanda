package service;

import page.DashboardPage;

public class DashBoardService {
    final int POST_POSITION = 0;
    final String RATING = "1";
    private DashboardPage dashboardPage = new DashboardPage();

    public void setRating() {
        dashboardPage.setupRating(POST_POSITION, RATING)
                .clickUpdateButton(POST_POSITION);
    }

    public boolean getSuccessMessage() {
        return dashboardPage.isSuccessMessageDisplay();
    }

    public boolean sendReplayMessage() {
        return dashboardPage.textReply().clickSendReply().isSuccessMessageAboutReply();
    }

}
