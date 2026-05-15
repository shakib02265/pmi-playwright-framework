package pages;

import com.microsoft.playwright.Page;

public class LoginPage {

    private Page page;


    public LoginPage(Page page){

        this.page = page;
    }




    public void open(){



        page.navigate(

                "https://estore.link3.net/user/login"
        );



        page.waitForLoadState();
    }




    public void enterLogin(

            String email,

            String password){




        // input 0 = search
        // input 1 = email
        // input 2 = password


        page.locator(

                "input"

        )

        .nth(1)

        .fill(email);




        page.locator(

                "input"

        )

        .nth(2)

        .fill(password);
    }




    public void clickLogin(){



        page.locator(

                "button:has-text('Login')"

        )

        .click();
    }




    public void login(

            String email,

            String password){




        enterLogin(

                email,

                password
        );




        clickLogin();
    }




    public boolean isLoaded(){



        return page.url()

                .contains("login");
    }




    // INVALID LOGIN


    public boolean loginFailed(){



        // wait server response


        page.waitForTimeout(

                8000
        );




        String currentUrl =

                page.url();




        System.out.println(

                "FAILED LOGIN URL = "
                        + currentUrl
        );




        // if still on login page,
        // login failed


        return currentUrl

                .contains("login");
    }




    // VALID LOGIN


    public boolean loginSuccess(){



        page.waitForTimeout(

                10000
        );




        String currentUrl =

                page.url();




        System.out.println(

                "SUCCESS LOGIN URL = "
                        + currentUrl
        );




        return

                !currentUrl

                        .contains("login");
    }
}