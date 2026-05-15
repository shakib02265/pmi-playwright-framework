package pages;

import com.microsoft.playwright.Page;

public class AllCategoriesPage {

    private Page page;

    public AllCategoriesPage(Page page){
        this.page = page;
    }

    public void open(){
        page.navigate(
                "https://estore.link3.net/all-categories"
        );
    }

    public boolean isLoaded(){
        return page.url()
                .contains("all-categories");
    }
}