package org.HW1;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@ToString
public class Person {
    String firstName;
    String lastName;
    String middleName;
    String country;
    String address;
    String phone;
    Integer age;
    String gender;

    public Person(String firstName, String lastName, String middleName,
                  String country, String address, String phone, Integer age, String gender) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.country = country;
        this.address = address;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        super();
    }

    public boolean hassAllData(){
        return (firstName != null && !firstName.trim().isEmpty())
                && (lastName != null && !lastName.trim().isEmpty())
                && (middleName != null && !middleName.trim().isEmpty())
                && (lastName != null && !lastName.trim().isEmpty())
                && (middleName != null && !middleName.trim().isEmpty())
                && (country != null && !country.trim().isEmpty())
                && (address != null && !address.trim().isEmpty())
                && (phone != null && !phone.trim().isEmpty())
                && (age != null)
                && (gender != null && !gender.trim().isEmpty());
    }
}
