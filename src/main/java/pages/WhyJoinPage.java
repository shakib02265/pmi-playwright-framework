package pages;

import com.microsoft.playwright.Page;

public class WhyJoinPage {

    private final Page page;

    public WhyJoinPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/admin/why-join-page"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("why-join-page");
    }
}