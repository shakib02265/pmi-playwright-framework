package pages;

import com.microsoft.playwright.Page;

public class SearchPage {

    private Page page;


    public SearchPage(Page page){
        this.page = page;
    }


    public void open(){

        page.navigate(

                "https://estore.link3.net/search"
        );
    }


    public boolean isLoaded(){

        return page.url()

                .contains("search");
    }
}