package pages;

import com.microsoft.playwright.Page;

public class TrackOrderPage {

    private Page page;

    public TrackOrderPage(Page page){
        this.page = page;
    }

    public void open(){
        page.navigate(
                "https://estore.link3.net/user/login?redirect=/track-order"
        );
    }

    public boolean isLoaded(){
        return page.url()
                .contains("track-order");
    }
}