package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Context;

public class Hooks {

    private Context contex;

    public Hooks(Context context) {
        this.contex = context;
    }

    @Before
    public void initTest(){
        System.out.println("init test");
    }

    @After
    public void endTest(){
        contex.getDriver().quit();
    }
}
