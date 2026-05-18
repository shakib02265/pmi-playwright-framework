package pages;

import com.microsoft.playwright.Page;

public class BoardMembersPage {

    private final Page page;

    public BoardMembersPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/admin/board-members"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("board-members");
    }
}