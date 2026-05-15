package pages;

import com.microsoft.playwright.Page;

public class HomePage {

    private Page page;


    public HomePage(Page page){

        this.page = page;
    }


    public void open(){

        page.navigate(
                "https://estore.link3.net"
        );
    }


    public boolean isLoaded(){

        return page.title()

                .contains("Link3");
    }
}