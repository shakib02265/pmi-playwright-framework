package pages;

import com.microsoft.playwright.Page;

public class AnnouncementPage {

    private final Page page;

    public AnnouncementPage(Page page){

        this.page = page;
    }




    public boolean open(){



        page.navigate(

                "https://demo.pmibdchapter.org/announcement"
        );




        page.waitForLoadState();




        page.waitForTimeout(

                5000
        );




        String currentUrl =

                page.url();




        System.out.println(

                "CURRENT URL = "

                        +

                        currentUrl
        );




        return currentUrl.contains(

                "announcement"
        );
    }
}