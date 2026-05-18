package pages;

import com.microsoft.playwright.Page;

public class FiveYearClubPage {

    private final Page page;

    public FiveYearClubPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/admin/club-pages/five-year/edit"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("five-year");
    }
}