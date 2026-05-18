package pages;

import com.microsoft.playwright.Page;

public class AwardsPage {

    private final Page page;

    public AwardsPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/admin/awards-page"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("awards-page");
    }
}