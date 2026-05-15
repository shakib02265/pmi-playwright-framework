package pages;

import com.microsoft.playwright.Page;

public class InternetNetworkingPage {

    private Page page;

    public InternetNetworkingPage(Page page){
        this.page = page;
    }

    public void open(){
        page.navigate(
                "https://estore.link3.net/category/internet-networking"
        );
    }

    public boolean isLoaded(){
        return page.url()
                .contains("internet-networking");
    }
}