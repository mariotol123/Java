package JavaOOP.exercises1._3;

import JavaOOP.exercises1._2.Student;

public class Students {
    private String name;
    private String surname;
    private Integer age;
    private Double lunchPrice;
    private String favoriteColour;

    private Integer checkAge = 0;

    Students(String name, String surname, Integer age, Double lunchPrice, String favoriteColour){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.lunchPrice = lunchPrice;
        this.favoriteColour = favoriteColour;

    }

    String getName(){
        return  name;
    }
    String getSurname(){
        return surname;
    }
    Integer getAge(){
        checkAge++;
        return age;
    }
    Double getLunchPrice(){
        return lunchPrice;
    }
    String getFavoriteColour(){
        return favoriteColour;
    }

    Integer getCheckAge() {
        return checkAge;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        if (surname.contains("a")){
            System.out.println("The student go in the first class");
        } else {
            System.out.println("Further checks will need to be made");
        }
        this.surname = surname;
    }

    public void setAge(Integer age) {

        if (age < 0){
            System.out.println("The students cant go at school");
        } else {
            System.out.println("This student can go to school");
        }
        this.age = age;
    }

    public void setLunchPrice(Double lunchPrice) {
        if (lunchPrice < 6.99){
            System.out.println("The students can use the lunch card");
        } else {
            System.out.println("The student cant use the lunch card");
        }
        this.lunchPrice = lunchPrice;
    }

    public void setFavoriteColour(String favoriteColour) {
        this.favoriteColour = favoriteColour;
    }

    public void setCheckAge(Integer checkAge){
        this.checkAge = checkAge;
    }
}
