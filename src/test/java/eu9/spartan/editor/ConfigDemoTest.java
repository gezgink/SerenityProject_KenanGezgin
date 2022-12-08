package eu9.spartan.editor;

import eu9.spartan.utilities.ConfigReader;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public class ConfigDemoTest {

    @Test
    public void test1(){
        System.out.println(ConfigReader.getProperty("serenity.project.name"));
        System.out.println(ConfigReader.getProperty("spartan.editor.username"));

    }
}
