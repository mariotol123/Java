package maven;


import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class MavenTest {
    public static void main(String[] args) {
        System.out.println("Eccoti l'html di google!!!!");


        try {
            System.out.println(Unirest.get("https://www.google.it").asString().getBody());
        } catch (UnirestException e) {
            throw new RuntimeException(e);
        }
    }
}
