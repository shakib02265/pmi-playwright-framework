package pages;

import com.microsoft.playwright.Page;

public class CheckInPage {

    private final Page page;

    public CheckInPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/check-in"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("check-in");
    }
}