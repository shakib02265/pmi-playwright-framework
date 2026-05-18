package pages;

import com.microsoft.playwright.Page;

public class MentorshipPage {

    private final Page page;

    public MentorshipPage(Page page){

        this.page = page;
    }




    public boolean open(){



        page.navigate(

                "https://demo.pmibdchapter.org/mentorship-applications"
        );




        page.waitForLoadState();




        page.waitForTimeout(

                5000
        );




        return page.url()

                .contains("mentorship-applications");
    }
}