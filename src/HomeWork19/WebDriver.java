package HomeWork19;

public interface WebDriver {
    /*Create a WebDriver Interface that will have the following unimplemented behaviour:
     openBrowser(), closeBrowser(), maximizeWindow(), findElement(). Create 2 classes that
      implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opens Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Chrome");

    }

    @Override
    public void maximizeWindow() {

        System.out.println("maximize Chrome Window");
    }

    @Override
    public void findElement() {

        System.out.println("finds Element in the page of Chrome");
    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opens Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Firefox");

    }

    @Override
    public void maximizeWindow() {

        System.out.println("maximize Firefox Window");
    }

    @Override
    public void findElement() {

        System.out.println("finds Element in the page of Firefox");
    }
}

