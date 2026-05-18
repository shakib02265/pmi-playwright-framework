package pages;

import com.microsoft.playwright.Page;

public class ContactPage {

    private final Page page;

    public ContactPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/admin/contact-page"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("contact-page");
    }
}