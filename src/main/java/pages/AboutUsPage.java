package pages;

import com.microsoft.playwright.Page;

public class AboutUsPage {

    private Page page;


    public AboutUsPage(Page page){

        this.page = page;
    }


    public void open(){

        page.navigate(

                "https://estore.link3.net/page/about-us"
        );
    }


    public boolean isLoaded(){

        return page.url()

                .contains("about-us");
    }
}