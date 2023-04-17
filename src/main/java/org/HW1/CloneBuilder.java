package org.HW1;

public interface CloneBuilder {

    public CloneBuilder fixBio(Integer age, String gender);
    public  CloneBuilder fixName(String firstName, String lastName, String middleName);
    public CloneBuilder fixLive(String country, String address, String phone);

    public Person build();
}
