package pages;

import com.microsoft.playwright.Page;

public class MentorshipAdminPage {

    private final Page page;

    public MentorshipAdminPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/admin/mentorship-page"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("mentorship-page");
    }
}