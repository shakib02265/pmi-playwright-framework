package pages;

import com.microsoft.playwright.Page;

public class MobileAccessoriesPage {

    private Page page;

    public MobileAccessoriesPage(Page page){
        this.page = page;
    }

    public void open(){
        page.navigate(
                "https://estore.link3.net/category/mobile-accessories"
        );
    }

    public boolean isLoaded(){
        return page.url()
                .contains("mobile-accessories");
    }
}