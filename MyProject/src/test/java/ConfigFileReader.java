import enums.DriverType;
import java.util.Properties;

public class ConfigFileReader {

    private Properties properties;

    public  String getDriverPath(){

        String driverPath = properties.getProperty("driverPath");
        if(driverPath!= null) {
            return driverPath;
        }
        else
        {
            throw new RuntimeException("Driver Path not specified ");
        }
    }

    public DriverType getBrowser(){
        String browser = properties.getProperty("browser");
        if(browser == null || browser.equals("chrome")) {
            return DriverType.CHROME;
        }
        else if (browser.equals("iexplorer")){
            return DriverType.INTERNETEXPLORER;
        }
        else
        {
            throw new RuntimeException("Browser not available" + browser);
        }
    }

    public Boolean getBrowserWindowSize(){
        String windowSize = properties.getProperty("windowMaximize");
        if(windowSize != null){
            return Boolean.valueOf(windowSize);
        }
        return true;
    }
}
