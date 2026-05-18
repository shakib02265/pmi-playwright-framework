package pages;

import com.microsoft.playwright.Page;

public class AcademicOutreachPage {

    private final Page page;

    public AcademicOutreachPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/admin/academic-outreach-page"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("academic-outreach-page");
    }
}