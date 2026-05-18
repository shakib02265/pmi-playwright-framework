package pages;

import com.microsoft.playwright.Page;

public class CalendarPage {

    private final Page page;

    public CalendarPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/calendar"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("calendar");
    }
}