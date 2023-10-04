package service;

import page.FeedGlobalPage;

public class FeedGlobalPageService {
    final int POST_POSITION = 0;

    private FeedGlobalPage feedGlobalPage = new FeedGlobalPage();

    public DashBoardService clickEditPost() {
        feedGlobalPage.clickEditPostLink();
        return new DashBoardService();
    }

    public DashBoardService clickReplayToUser() {
        feedGlobalPage.clickReplay(POST_POSITION);
        return new DashBoardService();
    }

    public boolean clickHugToUser() {
        return feedGlobalPage.clickHug(POST_POSITION).isSuccessMessageAboutHug();
    }
}
