import com.hpe.jc.JC;
import com.hpe.jc.plugins.JCPValidateFlowBy;
import com.hpe.jc.JCPlugin;
import org.junit.AfterClass;
import org.junit.Test;

/**
 * Created by koreny on 3/20/2017.
 */


public class ExampleTestUsingJC {

    //TODO: support annotations for plugins and feature description
    //TODO: add init method to plugin + init with progress + remove progress signature from all plugins
    //TODO: add plugin dependency so that Octane plugin can demand syntax validator plugin and extract info from it.
    public static JC jc = new JC(
            ExampleTestUsingJC.class,
            new JCPlugin[]{new JCPValidateFlowBy("c:\\gherkin.feature")},
            "hello world");


    @Test
    public void myTest() {
        jc.scenario("This is the first scenario", ()->{

            jc.given( "I have a scenario");

            jc.when("I run my junit test");

            jc.then("I can do this");
        });
    }

    @Test
    public void myTest2() {
        jc.scenario("this is the second scenario", ()-> {

            jc.given("another try");

            jc.when("I do something");
            //Assert.assertEquals(1,2);

            jc.then("it happens");

        });

    }

    @AfterClass
    public static void closeLog() {
        jc.finished();
    }

}
