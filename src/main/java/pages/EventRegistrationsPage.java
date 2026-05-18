package pages;

import com.microsoft.playwright.Page;

public class EventRegistrationsPage {

    private final Page page;

    public EventRegistrationsPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/event-registrations"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("event-registrations");
    }
}