package pages;

import com.microsoft.playwright.Page;

public class MentorshipProgrammeSettingsPage {

    private final Page page;

    public MentorshipProgrammeSettingsPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/mentorship-programme-settings"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains(
                "mentorship-programme-settings"
        );
    }
}