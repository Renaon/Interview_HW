package org.HW1;

public class BioLab {
    private  CloneBuilder builder;

    public BioLab(CloneBuilder builder) {
        super();
        this.builder = builder;
        if (builder == null){
            throw new IllegalArgumentException("No material");
        }
    }

    public Person releaseClone(String firstName,
                               String lastName,
                                String middleName,
                                String country,
                                String address,
                                String phone,
                                Integer age,
                                String gender
    ){
        return builder.fixName(firstName, lastName, middleName)
                .fixLive(country, address, phone)
                .fixBio(age, gender)
                .build();
    }
}
