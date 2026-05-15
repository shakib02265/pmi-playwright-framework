package pages;

import com.microsoft.playwright.Page;

public class AllShopsPage {

    private Page page;

    public AllShopsPage(Page page){
        this.page = page;
    }

    public void open(){
        page.navigate(
                "https://estore.link3.net/all-shops"
        );
    }

    public boolean isLoaded(){
        return page.url()
                .contains("all-shops");
    }
}