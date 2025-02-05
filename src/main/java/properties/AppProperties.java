package properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
@EnableConfigurationProperties
@ConfigurationProperties("app1")
@Configuration
public class AppProperties {
    private Map<String , String> message  = new HashMap<>();
    public AppProperties(Map<String, String> message){
        super();
        this.message = message;
    }
    public AppProperties(){
        super();
    }
    public Map<String, String> getMesssage() {
        return message;
    }
    public void setMessage(Map<String, String> message){
        this.message = message;
    }

}
