package pages;

import com.microsoft.playwright.Page;

public class AdminMenusPage {

    private final Page page;

    public AdminMenusPage(Page page){

        this.page = page;
    }




    public boolean open(){



        page.navigate(

                "https://demo.pmibdchapter.org/admin/menus"
        );




        page.waitForLoadState();




        page.waitForTimeout(

                5000
        );




        return page.url()

                .contains("admin/menus");
    }
}