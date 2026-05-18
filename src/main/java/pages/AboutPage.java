package pages;

import com.microsoft.playwright.Page;

public class AboutPage {

    private final Page page;

    public AboutPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/admin/about-page"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("about-page");
    }
}