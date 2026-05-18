package pages;

import com.microsoft.playwright.Page;

public class CorporateOutreachPage {

    private final Page page;

    public CorporateOutreachPage(Page page){

        this.page = page;
    }




    public boolean open(){



        page.navigate(

                "https://demo.pmibdchapter.org/corporate-outreach-enquiries"
        );




        page.waitForLoadState();




        page.waitForTimeout(

                5000
        );




        return page.url()

                .contains("corporate-outreach-enquiries");
    }
}