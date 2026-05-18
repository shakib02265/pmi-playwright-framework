package pages;

import com.microsoft.playwright.Page;

public class MentorsPage {

    private final Page page;

    public MentorsPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/mentors"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("mentors");
    }
}