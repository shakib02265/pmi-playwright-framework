package pages;

import com.microsoft.playwright.Page;

public class SponsorshipBrandingPage {

    private final Page page;

    public SponsorshipBrandingPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/admin/sponsorship-branding-page"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("sponsorship-branding-page");
    }
}