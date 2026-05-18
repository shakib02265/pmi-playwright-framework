package pages;

import com.microsoft.playwright.Page;

public class ClubMembersPage {

    private final Page page;

    public ClubMembersPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/club-members"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("club-members");
    }
}