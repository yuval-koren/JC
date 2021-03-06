package testExamples;

import com.hpe.jc.JC;
import com.hpe.jc.JCPlugin;
import com.hpe.jc.plugins.Feature;
import com.hpe.jc.plugins.FeatureFileAt;
import com.hpe.jc.plugins.JCPValidateFlowBy;
import com.hpe.jc.plugins.JCTimePlugin;
import com.hpe.jc.plugins.OctaneFormatter.JCOctaneCucumberFormatter;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import static com.hpe.jc.JC.*;

/**
 * Created by koreny on 3/20/2017.
 */

@Feature("hello world")
@FeatureFileAt("/gherkin.feature")
public class SimpleScenarios {

    @Test
    public void myTest() {
        scenario("This is the first scenario", ()->{
            given( "I have a scenario");

            when("I run my junit test");

            then("I can do this");
        });
    }

    @Test
    public void myTest2() {
        scenario("this is the second scenario", ()-> {

            given("another try");

            when("I do something");
            //Assert.assertEquals(1,2);

            then("it happens");

        });

    }

    @AfterClass
    public static void closeLog() {
        finished();
    }

}

