package insider.step_definitions;

import insider.pages.CareerPage;
import insider.pages.HomePage;
import insider.pages.PositionPage;
import insider.utilities.BrowserUtils;
import insider.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class UIStepDefinitions {
    WebDriver driver = Driver.get();
    String clickedJobTitle;
    String clickedJobLocation;
    String clickedJobDepartment;


    @Given("Go to {string} and check Insider home page is opened or not")
    public void go_to_and_check_Insider_home_page_is_opened_or_not(String url) {
        driver.get(url);
        String expectedTitle = "Insider personalization engine for seamless customer experiences";
        Assert.assertEquals(expectedTitle,driver.getTitle());
    }

    @Then("Select {string} menu in navigation bar")
    public void select_menu_in_navigation_bar(String menuItem) {
        HomePage homePage = new HomePage();
        for (WebElement oneItem : homePage.topMenuItemsList) {
            if (oneItem.getText().equalsIgnoreCase(menuItem)){
                oneItem.click();
                break;
            }
        }
    }

    @Then("Check Career Page has the following blocks")
    public void check_Career_Page_has_the_following_blocks(List<String> blocksList) {
        CareerPage careerPage = new CareerPage();
        for (int i = 0; i < blocksList.size(); i++) {
             Assert.assertEquals(blocksList.get(i).toLowerCase(),careerPage.blockList.get(i).getText().toLowerCase());
        }
    }

    @When("Scroll to {string}")
    public void scroll_to(String text) {
        WebElement elementByText = BrowserUtils.elementByText(text.toUpperCase());
        BrowserUtils.scrollToElement(elementByText);
    }

    @Then("Apply filter jobs by Location {string} and department {string}")
    public void apply_filter_jobs_by_Location_and_department(String location, String department) {
        CareerPage careerPage = new CareerPage();
        BrowserUtils.selectByText(careerPage.locationsSelect,location);
        BrowserUtils.waitFor(1);
        BrowserUtils.selectByText(careerPage.departmentsSelect,department);
    }

    @Then("Check presence of jobs list")
    public void check_presence_of_jobs_list() {
        BrowserUtils.waitFor(1);
        Assert.assertNotEquals(0,new CareerPage().jobList.size());
    }

    @Then("Check all jobs positions contains {string}")
    public void check_all_jobs_positions_contains(String expectedPosition) {
        for (WebElement onePosition : new CareerPage().positionList) {
            Assert.assertTrue(onePosition.getText().toLowerCase().contains(expectedPosition.toLowerCase()));
        }
    }

    @Then("Check all departments contains {string}")
    public void check_all_departments_contains(String expectedDepartment) {
        for (WebElement oneDepartment : new CareerPage().departmentList) {
            Assert.assertTrue(oneDepartment.getText().toLowerCase().contains(expectedDepartment.toLowerCase()));
        }
    }

    @Then("Check all locations contains {string}")
    public void check_all_locations_contains(String expectedLocation) {
        for (WebElement oneLocation : new CareerPage().locationList) {
            Assert.assertTrue(oneLocation.getText().toLowerCase().contains(expectedLocation.toLowerCase()));
        }
    }

    @When("Click one of the positions listed")
    public void click_one_of_the_positions_listed() {
        CareerPage careerPage = new CareerPage();
        Random random = new Random();
        int randomNumber = random.nextInt(careerPage.jobList.size());
        clickedJobTitle = careerPage.positionList.get(randomNumber).getText();
        clickedJobLocation = careerPage.locationList.get(randomNumber).getText();
        clickedJobDepartment = careerPage.departmentList.get(randomNumber).getText();
        careerPage.jobList.get(randomNumber).click();
    }

    @Then("Check correct position page is opened, presence of job description, requirements and {string} button")
    public void checkCorrectPositionPageIsOpenedPresenceOfJobDescriptionRequirementsAndButton(String buttonCaption) {
        PositionPage positionPage = new PositionPage();
        Assert.assertEquals(clickedJobTitle.toLowerCase(),positionPage.jobTitle.getText().toLowerCase());
        Assert.assertTrue(positionPage.jobLocation.getText().toLowerCase().contains(clickedJobLocation.toLowerCase()));
        Assert.assertTrue(positionPage.jobDepartment.getText().toLowerCase().contains(clickedJobDepartment.toLowerCase()));

        //it will check if job description field has some text and fails only if it is an empty text
        Assert.assertNotEquals("",positionPage.jobDescription.getText());

        //it will check if job requirements field has some text and fails only if it is an empty text
        Assert.assertNotEquals("",positionPage.jobRequirements.getText());

        for (WebElement oneButton : positionPage.applyButtonsList) {
            Assert.assertEquals(buttonCaption.toLowerCase(),oneButton.getText().toLowerCase());
        }
    }

    @Then("Click Apply for this job button")
    public void clickApplyForThisJobButton() {
        new PositionPage().applyButtonsList.get(0).click();
    }


    @Then("Check Application form page appears")
    public void check_Application_form_page_appears() {
        Assert.assertTrue(new PositionPage().formCaption.getText().toLowerCase().contains("application"));
    }



}
