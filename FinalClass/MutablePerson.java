package FinalClass;

public final class MutablePerson
{
    String name ;

    public MutablePerson(String name)
    {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/*Yah Class final hai matalab esko koe bhi class extends nhi kar skti but
Eske Object me change kiye ja skte hai .
Immutable class ke 5 rule hote hai
 1.make class fina
 2.make filese private final
 3.set fields values using constructor
 4.provide only Getter don't Setter
 5.if any muttable object present in our class use its deep copy

 -> Ye sare Rules jis class par lage ho vo 100% immutable class ho ajye ho
    bilkul String class ki tarah na to vo inheric hogi na to uski object me change hoga
     jab bhi object me change karne ki kosi hogi new object create ho jayega .

     -To ye hota hai final class and Immutable class me .
*/