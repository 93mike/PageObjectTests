package common;

public class Config {
    public static final String BROWSER = "chrome";
    /**
     * clear browser cookies after each iteration
     * if true -> clear all
     */
    public static final Boolean CLEAR_COOKIES_AND_STORAGE = true;
    /**
     * To keep browser open after suite
     * if true-> browser close
     */
    public static final Boolean HOLD_BROWSER_OPEN = true;
}