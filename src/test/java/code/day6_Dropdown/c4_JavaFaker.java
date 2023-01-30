package code.day6_Dropdown;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class c4_JavaFaker {
    @Test
    public void JavaFaker(){
        // inorder to use JavaFaker library you need to an instance of javaFaker
        Faker faker = new Faker();
        System.out.println("name= "+faker.name().fullName());
        System.out.println("first name=" + faker.name().firstName());
        System.out.println(faker.address().cityName());
        System.out.println(faker.address().zipCode());
        System.out.println(faker.gameOfThrones().dragon());


    }
}
