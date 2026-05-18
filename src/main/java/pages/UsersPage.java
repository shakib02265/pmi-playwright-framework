package pages;

import com.microsoft.playwright.Page;

public class UsersPage {

    private final Page page;

    public UsersPage(Page page){

        this.page = page;
    }




    public boolean open(){



        page.navigate(

                "https://demo.pmibdchapter.org/users"
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

                "users"
        );
    }
}