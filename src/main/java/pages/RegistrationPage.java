package pages;

import com.microsoft.playwright.Page;

public class RegistrationPage {

    private Page page;


    public RegistrationPage(Page page){
        this.page = page;
    }


    public void open(){

        page.navigate(

                "https://estore.link3.net/user/registration"
        );
    }


    public boolean isLoaded(){

        return page.url()

                .contains("registration");
    }
}