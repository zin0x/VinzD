package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Friend {
    private String name;
    private int age;
    private String city;

    //constructor
    public Friend(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public void writeToFile() throws IOException{
        FileWriter fw = new FileWriter("friends.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(name +",\r");
        bw.write(Integer.toString(age) + "?\r");
        bw.write(city +"\r");
        bw.write(";\r");
        bw.close();
    }
}
