package pages;

import com.microsoft.playwright.Page;

public class WarrantyPolicyPage {

    private Page page;

    public WarrantyPolicyPage(Page page){
        this.page = page;
    }

    public void open(){
        page.navigate(
                "https://estore.link3.net/page/warranty-policy"
        );
    }

    public boolean isLoaded(){
        return page.url()
                .contains("warranty-policy");
    }
}