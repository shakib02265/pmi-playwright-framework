package pages;

import com.microsoft.playwright.Page;

public class LifestyleGadgetsPage {

    private Page page;

    public LifestyleGadgetsPage(Page page){
        this.page = page;
    }

    public void open(){
        page.navigate(
                "https://estore.link3.net/category/lifestyle-gadgets"
        );
    }

    public boolean isLoaded(){
        return page.url()
                .contains("lifestyle-gadgets");
    }
}