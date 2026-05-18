package pages;

import com.microsoft.playwright.Page;

public class JobPostingsPage {

    private final Page page;

    public JobPostingsPage(Page page){
        this.page = page;
    }

    public boolean open(){

        page.navigate(
                "https://demo.pmibdchapter.org/admin/job-postings"
        );

        page.waitForLoadState();

        page.waitForTimeout(5000);

        return page.url().contains("job-postings");
    }
}