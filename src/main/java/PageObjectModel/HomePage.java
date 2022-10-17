package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;



public class HomePage extends BaseFunctions{



    WebDriver driver;


    public HomePage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "button[data-testid='login-button']")
    private WebElement logInButton;

    public void logIn(){
        click(logInButton);
    }

    @FindBy(css = "button[data-testid='facebook-login']")
    private WebElement facebookButton;

    public void facebook(){
        click(facebookButton);
    }

    @FindBy(css = "input[id='email']")
    private WebElement usernameBox;

    public void username(){
//        type(usernameBox,"+FAKER");
    }

    @FindBy(css = "input[type='password']")
    private WebElement passwordBox;

    public void password(){
//    type(passwordBox,"FAKER");

    }

    @FindBy(css = "button[id='loginbutton']")
    private WebElement signInButton;

    public void signIn(){
        click(signInButton);
    }

    @FindBy(css = "button[class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")
    private WebElement cookieButton;

    public void closeCookie(){
        click(cookieButton);
    }

    @FindBy(xpath = "(//li[@class='eNs6P3JYpf2LScgTDHc6 InvalidDropTarget'])[2]")
    private WebElement searchButton;

    public void search(){
        click(searchButton);
    }

    @FindBy(css = "input[class='Type__TypeElement-goli3j-0 cPwEdQ QO9loc33XC50mMRUCIvf']")
    private WebElement searchBox;

    public void searchField(){
        type(searchBox,"Billie Eilish");
    }

    @FindBy(xpath = "(//span[@class='ChipInner__ChipInnerComponent-sc-1ly6j4j-0 eQrChW'])[1]")
    private WebElement songsButton;

    public void songs() throws InterruptedException {
        click(songsButton);
        waitFor(1500);
    }

    @FindBy(xpath = "(//div[@class='h4HgbO_Uu1JYg5UGANeQ wTUruPetkKdWAR1dd6w4'])[1]")
    private WebElement playSong;

    public void playMusic()  {
        Actions actions = new Actions(driver);
        actions.doubleClick(playSong).perform();

    }

    @FindBy(xpath = "(//button[@data-testid='add-button'])[1]")
    private WebElement likeButton;

    public void like() throws InterruptedException {
        waitFor(10000);
        click(likeButton);
    }

    @FindBy(xpath = "(//span[@class='Type__TypeElement-goli3j-0 hWmToD ellipsis-one-line'])[3]")
    private WebElement libraryButton;

    public void library(){
        click(libraryButton);
    }

    @FindBy(css = "div[class='_gB1lxCfXeR8_Wze5Cx9']")
    private WebElement likedSongsButton;

    public void likedSongs(){click(likedSongsButton);}

    @FindBy(xpath = "(//div[@class='Type__TypeElement-goli3j-0 gwYBEX t_yrXoUO3qGsJS4Y6iXX standalone-ellipsis-one-line'])[1]")
    private WebElement likedSongElement;

    public void likedSong(){
        Assertion(likedSongElement,"BILLIE EILISH.");
    }


}
