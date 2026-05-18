package pages;

import com.microsoft.playwright.Page;

public class SpeakerOpportunitiesPage {

    private final Page page;

    public SpeakerOpportunitiesPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/admin/speaker-opportunities-page"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("speaker-opportunities-page");
    }
}