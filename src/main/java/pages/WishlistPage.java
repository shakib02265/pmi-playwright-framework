package pages;

import com.microsoft.playwright.Page;

public class WishlistPage {

    private Page page;

    public WishlistPage(Page page){
        this.page = page;
    }

    public void open(){
        page.navigate(
                "https://estore.link3.net/user/login?redirect=/user/wishlist"
        );
    }

    public boolean isLoaded(){
        return page.url()
                .contains("wishlist");
    }
}