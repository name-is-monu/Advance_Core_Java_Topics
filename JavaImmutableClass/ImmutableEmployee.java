package JavaImmutableClass;

import java.util.Date;

//Immutable class
public final class ImmutableEmployee  // Rule 1:- final class
{
    private final int id;
    private final String name;    // Rule 2 :- private and final all fields
    private final Date birthDate;

    public ImmutableEmployee(int id , String name , Date birthDate)  //Rule 3:- set fields values using Constructor
    {
        this.id=id;
        this.name=name;

        // Rule 5:-  Defensive Copy: ओरिजिनल Date की बजाय उसकी नई कॉपी स्टोर कर रहे हैं
        this.birthDate=new Date(birthDate.getTime());
    }

    //Rule 4:- Provide only Getter Methods Don't setter
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }
}
