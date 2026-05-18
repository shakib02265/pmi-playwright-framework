package pages;

import com.microsoft.playwright.Page;

public class PMIMembersPage {

    private final Page page;

    public PMIMembersPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/pmi-members"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("pmi-members");
    }
}