package pages;

import com.microsoft.playwright.Page;

public class PurchaseHistoryPage {

    private Page page;

    public PurchaseHistoryPage(Page page){
        this.page = page;
    }

    public void open(){
        page.navigate(
                "https://estore.link3.net/user/login?redirect=/user/purchase-history"
        );
    }

    public boolean isLoaded(){
        return page.url()
                .contains("purchase-history");
    }
}