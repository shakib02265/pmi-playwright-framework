package pages;

import com.microsoft.playwright.Page;

public class PastEventsPage {

    private final Page page;

    public PastEventsPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/admin/past-events"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("past-events");
    }
}