package pages;

import com.microsoft.playwright.Page;

public class FaqPage {

    private Page page;

    public FaqPage(Page page){
        this.page = page;
    }

    public void open(){
        page.navigate(
                "https://estore.link3.net/page/faq"
        );
    }

    public boolean isLoaded(){
        return page.url()
                .contains("faq");
    }
}