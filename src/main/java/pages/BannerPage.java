package pages;

import com.microsoft.playwright.Page;

public class BannerPage {

    private final Page page;

    public BannerPage(Page page){

        this.page = page;
    }




    public boolean open(){



        page.navigate(

                "https://demo.pmibdchapter.org/banner"
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

                "banner"
        );
    }
}