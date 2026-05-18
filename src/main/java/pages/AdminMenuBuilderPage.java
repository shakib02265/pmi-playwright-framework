package pages;

import com.microsoft.playwright.Page;

public class AdminMenuBuilderPage {

    private final Page page;

    public AdminMenuBuilderPage(Page page){

        this.page = page;
    }




    public boolean open(){



        page.navigate(

                "https://demo.pmibdchapter.org/admin/menus/menu"
        );




        page.waitForLoadState();




        page.waitForTimeout(

                5000
        );




        return page.url()

                .contains("admin/menus/menu");
    }
}