package pages;

import com.microsoft.playwright.Page;

public class EnquiryPage {

    private final Page page;

    public EnquiryPage(Page page){

        this.page = page;
    }




    public boolean open(){



        page.navigate(

                "https://demo.pmibdchapter.org/enquiry"
        );




        page.waitForLoadState();




        page.waitForTimeout(

                5000
        );




        return page.url()

                .contains("enquiry");
    }
}