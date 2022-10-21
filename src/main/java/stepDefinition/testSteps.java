package stepDefinition;

import PageObjectModel.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;



public class testSteps {


    private WebDriver driver;

    HomePage homePage = new HomePage();

    @Given("navigate to url")
    public void navigate_to_url() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://open.spotify.com/");
    }

    @Given("click log in")
    public void click_log_in() {
        homePage.logIn();
    }

    @Given("continue with facebook")
    public void continue_with_facebook() {
        homePage.facebook();
    }

    @Given("type username or phone number")
    public void type_username_or_phone_number() {
        homePage.username();
    }

    @Given("type password")
    public void type_password() {
        homePage.password();
    }

    @Given("sign in")
    public void sign_in() {
        homePage.signIn();
    }

    @Given("close cookie")
    public void close_cookie() {
        homePage.closeCookie();
    }

    @Given("click search")
    public void click_search() {
        homePage.search();
    }

    @Given("type any song")
    public void type_any_song() {
        homePage.searchField();
    }

    @Given("click songs")
    public void click_songs() throws InterruptedException {
        homePage.songs();
    }

    @Given("play a song")
    public void play_a_song() {
        homePage.playMusic();
    }

    @Given("add to library")
    public void add_to_library() throws InterruptedException {
        homePage.like();
    }

    @When("click library")
    public void click_library() {
        homePage.library();
    }

    @Then("click liked songs")
    public void click_liked_songs() {
        homePage.likedSongs();
    }



}
