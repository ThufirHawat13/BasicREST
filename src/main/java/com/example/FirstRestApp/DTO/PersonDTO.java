package com.example.FirstRestApp.DTO;



import javax.validation.constraints.*;

public class PersonDTO {

    @NotEmpty(message = "Name souldn't be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 an 30 characters")
    private String name;

    @Min(value = 0, message = "Age should be greater than 0")
    @Max(value = 100, message = "Age shouldn't be greater than 100")
    private int age;

    @Email(message = "Input correct email")
    @NotEmpty(message = "Email shouldn't be empty")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
