package pages;

import com.microsoft.playwright.Page;

public class ProfileLoginPage {

    private Page page;

    public ProfileLoginPage(Page page){
        this.page = page;
    }

    public void open(){
        page.navigate(
                "https://estore.link3.net/user/login?redirect=/user/profile"
        );
    }

    public boolean isLoaded(){
        return page.url()
                .contains("profile");
    }
}