package pages;

import com.microsoft.playwright.Page;

public class AwardsListPage {

    private final Page page;

    public AwardsListPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/admin/awards"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("awards");
    }
}