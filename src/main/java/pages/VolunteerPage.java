package pages;

import com.microsoft.playwright.Page;

public class VolunteerPage {

    private final Page page;

    public VolunteerPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/admin/volunteer-page"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("volunteer-page");
    }
}