package org.propertyFileDI;


import org.XmlApplicationContext.XmlJdbcConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component public class propertyFile_DI {


    @Value("${password}")private String user;

    //THe value annotation will pass the desired/required value to the defined variable in this
    //as it pass the values according to its specific keys that mentioned here in annotation
    //It mandatory to follow the above syntax so that the container passes the required value for the
    //specified value in the annotaion with dollar and with in the flower brackets\
    //the IOC container will read the property file as we mention the @propertySource annotation
    //at that time it load the values and passes it to the other classes by recognizing it by the
    // the @value annotation
    @Value("${password}") private String psswd;

    @Value("${driver}") private String driver;
    @Value("${url}") private String url;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPsswd() {
        return psswd;
    }

    public void setPsswd(String psswd) {
        this.psswd = psswd;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void getConnection(){
        System.out.println("Connected"+user +"with the following "+driver +" amd the url"+url);
    }
}
