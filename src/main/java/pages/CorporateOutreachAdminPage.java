package pages;

import com.microsoft.playwright.Page;

public class CorporateOutreachAdminPage {

    private final Page page;

    public CorporateOutreachAdminPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/admin/corporate-outreach-page"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("corporate-outreach-page");
    }
}