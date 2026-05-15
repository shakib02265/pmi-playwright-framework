package pages;

import com.microsoft.playwright.Page;

public class TravelGadgetsPage {

    private Page page;

    public TravelGadgetsPage(Page page){
        this.page = page;
    }

    public void open(){
        page.navigate(
                "https://estore.link3.net/category/travel-gadgets"
        );
    }

    public boolean isLoaded(){
        return page.url()
                .contains("travel-gadgets");
    }
}