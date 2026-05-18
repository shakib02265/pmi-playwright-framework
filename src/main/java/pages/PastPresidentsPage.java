package pages;

import com.microsoft.playwright.Page;

public class PastPresidentsPage {

    private final Page page;

    public PastPresidentsPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/admin/past-presidents"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("past-presidents");
    }
}