package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class PMILoginPage {

    private final Page page;

    public PMILoginPage(Page page){

        this.page = page;
    }




    public void open(){



        page.navigate(

                "https://demo.pmibdchapter.org/login"
        );



        page.waitForLoadState();




        // so video shows page


        page.waitForTimeout(

                5000
        );
    }




    public void enterLogin(

            String email,

            String password){




        Locator inputs =

                page.locator(

                        "input:visible"
                );




        Locator emailBox =
                inputs.nth(0);




        Locator passwordBox =
                inputs.nth(1);




        // email slowly


        emailBox.click();




        emailBox.pressSequentially(

                email
        );




        page.waitForTimeout(

                2000
        );




        // password slowly


        passwordBox.click();




        passwordBox.pressSequentially(

                password
        );




        page.waitForTimeout(

                3000
        );
    }




    public void clickLogin(){



        page.locator(

                "button:visible"

        )

        .last()

        .click();




        // show response


        page.waitForTimeout(

                8000
        );
    }




    public void login(

            String email,

            String password){




        open();




        enterLogin(

                email,

                password
        );




        clickLogin();
    }




    public boolean loginSuccess(){



        String currentUrl =

                page.url();




        System.out.println(

                "CURRENT URL = "

                        +

                        currentUrl
        );




        return

                currentUrl.contains(

                        "dashboard"
                );
    }
}