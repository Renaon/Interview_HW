package org.HW1;

public class CoolCloneBuilder implements CloneBuilder{
    String firstName;
    String lastName;
    String middleName;
    String country;
    String address;
    String phone;
    Integer age;
    String gender;

    public CoolCloneBuilder(){
        super();
    }

    @Override
    public CloneBuilder fixBio(Integer age, String gender) {
        this.age = age;
        this.gender = gender;
        return this;
    }

    @Override
    public CloneBuilder fixName(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        return this;
    }

    @Override
    public CloneBuilder fixLive(String country, String address, String phone) {
        this.country = country;
        this.address = address;
        this.phone = phone;
        return this;
    }

    @Override
    public Person build() {
        Person person = new Person(firstName,lastName,middleName,country,address,phone,age,gender);
        if(person.hassAllData()){
            return person;
        }else {
            System.out.println("Клон не готов. Попробуйте с другим материалом");
            return null;

        }
    }
}
