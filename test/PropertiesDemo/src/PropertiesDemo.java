import java.util.Properties;

/**
 *
 * @author rockst
 */
public class PropertiesDemo {
    
    public static void main(String[] args) {
        
        System.out.println("Hello! Raspberry Pi!\n");
        
        final String[] pnames = {
            "java.runtime.name",
            "java.vm.name",
            "user.dir",
            "user.name",
            "java.home",
            "java.version"
        };
        
        Properties p = System.getProperties();
        
        for(String name : pnames) {
            System.out.println(name + " : " + p.getProperty(name));
            
        }
    }
    
}
