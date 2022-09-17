package ru.mirea.kvbo01.senkov;

public class Author
{
    private String name="Denis";
    private String email="defendercryak@gmail.com";
    private char gender='м';

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
