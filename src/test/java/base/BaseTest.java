package base;

import com.microsoft.playwright.*;

import org.testng.ITestResult;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.qameta.allure.Allure;

import utils.CsvUtil;
import utils.PdfUtil;
import utils.ReportUtil;

import java.lang.reflect.Method;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class BaseTest {

    protected Playwright playwright;

    protected Browser browser;

    protected BrowserContext context;

    protected Page page;

    private long startTime;

    private String testName;




    @BeforeMethod
    public void setup(

            Method method

    )

            throws Exception {




        // test name


        testName =

                method.getName();




        // timer


        startTime =

                System.currentTimeMillis();




        // folders


        Files.createDirectories(

                Path.of(
                        "videos"
                )
        );



        Files.createDirectories(

                Path.of(
                        "screenshots"
                )
        );



        Files.createDirectories(

                Path.of(
                        "traces"
                )
        );



        Files.createDirectories(

                Path.of(
                        "pdf"
                )
        );




        // playwright


        playwright =

                Playwright.create();




        // browser


        browser =

                playwright.chromium()

                        .launch(

                                new BrowserType
                                        .LaunchOptions()

                                        .setHeadless(
                                                true
                                        )
                        );




        // context + video


        context =

                browser.newContext(

                        new Browser
                                .NewContextOptions()

                                .setRecordVideoDir(

                                        Path.of(
                                                "videos"
                                        )
                                )
                );




        // trace


        context.tracing()

                .start();




        // page


        page =
                context.newPage();
    }




    protected void waitForPage()

            throws Exception {




        Thread.sleep(

                5000
        );
    }




    @AfterMethod(alwaysRun = true)
    public void tearDown(

            ITestResult result

    )

            throws Exception {




        String status =

                result.isSuccess()

                        ?

                        "PASSED"

                        :

                        "FAILED";




        long executionTime =

                System.currentTimeMillis()

                        -

                        startTime;




        String currentUrl =
                page.url();




        // keep video reference


        Video video =
                page.video();




        // screenshot


        Path screenshotPath =

                Path.of(

                        "screenshots/"
                                + testName
                                + ".png"
                );




        page.screenshot(

                new Page
                        .ScreenshotOptions()

                        .setPath(
                                screenshotPath
                        )
        );




        // trace


        Path tracePath =

                Path.of(

                        "traces/"
                                + testName
                                + ".zip"
                );




        context.tracing()

                .stop(

                        new Tracing
                                .StopOptions()

                                .setPath(
                                        tracePath
                                )
                );




        // close context
        // unlocks video


        context.close();




        // rename video


        Path originalVideo =
                video.path();




        Path renamedVideo =

                Path.of(

                        "videos/"
                                + testName
                                + ".webm"
                );




        Files.move(

                originalVideo,

                renamedVideo,

                StandardCopyOption
                        .REPLACE_EXISTING
        );




        // reports


        CsvUtil.create(

                "UI",

                testName,

                currentUrl,

                status,

                executionTime
        );




        PdfUtil.create(

                "UI",

                testName,

                currentUrl,

                status,

                executionTime
        );




        ReportUtil.create(

                "UI",

                testName,

                currentUrl,

                result.isSuccess(),

                executionTime
        );




        // pdf


        Path pdfPath =

                Path.of(

                        "pdf/"
                                + testName
                                + ".pdf"
                );




        // allure attachments


        Allure.addAttachment(

                "Screenshot",

                Files.newInputStream(
                        screenshotPath
                )
        );



        Allure.addAttachment(

                "Video",

                Files.newInputStream(
                        renamedVideo
                )
        );



        Allure.addAttachment(

                "Trace",

                Files.newInputStream(
                        tracePath
                )
        );



        Allure.addAttachment(

                "PDF",

                Files.newInputStream(
                        pdfPath
                )
        );




        // close browser


        browser.close();

        playwright.close();
    }
}