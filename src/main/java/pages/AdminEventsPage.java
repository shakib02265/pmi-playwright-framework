package pages;

import com.microsoft.playwright.Page;

public class AdminEventsPage {

    private final Page page;

    public AdminEventsPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/admin/events"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("admin/events");
    }
}