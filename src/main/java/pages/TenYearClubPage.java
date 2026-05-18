package pages;

import com.microsoft.playwright.Page;

public class TenYearClubPage {

    private final Page page;

    public TenYearClubPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/admin/club-pages/ten-year/edit"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("ten-year");
    }
}