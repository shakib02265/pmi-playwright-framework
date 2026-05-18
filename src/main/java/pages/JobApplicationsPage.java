package pages;

import com.microsoft.playwright.Page;

public class JobApplicationsPage {

    private final Page page;

    public JobApplicationsPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/admin/job-applications"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("job-applications");
    }
}