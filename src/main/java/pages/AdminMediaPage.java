package pages;

import com.microsoft.playwright.Page;

public class AdminMediaPage {

    private final Page page;

    public AdminMediaPage(Page page){

        this.page = page;
    }




    public boolean open(){



        page.navigate(

                "https://demo.pmibdchapter.org/admin/media"
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

                "admin/media"
        );
    }
}