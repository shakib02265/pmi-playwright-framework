package pages;

import com.microsoft.playwright.Page;

public class VolunteerApplicationsPage {

    private final Page page;

    public VolunteerApplicationsPage(Page page){

        this.page = page;
    }




    public boolean open(){



        page.navigate(

                "https://demo.pmibdchapter.org/volunteer-applications"
        );




        page.waitForLoadState();




        page.waitForTimeout(

                5000
        );




        return page.url()

                .contains("volunteer-applications");
    }
}