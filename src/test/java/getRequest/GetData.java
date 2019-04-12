package getRequest;

import static  io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.config.SSLConfig;

public class GetData {

    @Test (priority = 0)
    public void testResponsecode()
    {
        //RestAssured.config=RestAssured.config().sslConfig(SSLConfig.sslConfig().allowAllHostnames());
        int code = get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22").getStatusCode();
        System.out.println("Status code is :" + code);
        Assert.assertEquals(code, 200);
    }

    @Test (priority = 1)
    public void testBody()
    {
        //RestAssured.config=RestAssured.config().sslConfig(SSLConfig.sslConfig().allowAllHostnames());
        String data = get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22").asString();
        long time = get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22").getTime();
        System.out.println("Data is :" + data);
        System.out.println("Response time :" + time);
    }
}
