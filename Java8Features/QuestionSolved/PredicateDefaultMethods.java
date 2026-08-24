package Java8Features.QuestionSolved;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;
import java.util.function.Predicate;

class Person
{
    private String name;
    private int age;

    public Person(String name , int age )
    {
        this.name=name;
        this.age=age;
    }

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
}

public class PredicateDefaultMethods
{
    static void main()
    {
        //Age 18 se badi ho and name Monu ho
        Predicate<Person> isAdult=(p)->p.getAge() >18;
        Predicate<Person> isMonu=(p)->p.getName().equalsIgnoreCase("Monu");

        //and() method
        Predicate<Person> isvalidMonu=isAdult.and(isMonu); //true because both condition are true.
        Person person1=new Person("Monu" , 20);
        System.out.println(isvalidMonu.test(person1));

        //or() method

        Predicate<Person> isElisible=isAdult.or(isMonu);
        Person p1=new Person("Rahul" ,12); //false because dono condition false hai.
        System.out.println(isElisible.test(p1));

        //negate() method (true ko false and false ko true) kar deti hai.
        Predicate<Integer> even=(x)->x%2==0;
//       boolean b= even.test(100); //even hai but espar negate() lagane par
        Predicate<Integer> odd =even.negate();
       boolean b=odd.test(200); //even hote false dega because of negate() meyhod
        System.out.println(b);

        //isEqual() method :

        Predicate<String> str=Predicate.isEqual("Admin");
        System.out.println(str.test("Admin")); //true
        System.out.println(str.test("User")); //false

        //not()

        String msg="Hello Java";
        Predicate<String> isEmpty=Predicate.not(String::isEmpty); //true ko false and false ko true
        System.out.println(isEmpty.test(msg));

    }

}

/*
1. Predicate ke Default Methods:
  -> Default Methods: and(), or(), negate()
   ->static Methods : isEqual() , not()
   -> Working of Every Method :-
      1.and()
          -यह क्या करती है: यह दो Predicate को जोड़ती है। यह रिजल्ट true तभी देगी जब दोनों शर्तें सही
          (True) हों (यानी पहली शर्त AND दूसरी शर्त)।
          -सिंटैक्स: predicate1.and(predicate2)

     2. or() मेथड (दो शर्तों में से कोई एक 'या' सही हो)
          -यह क्या करती है: यह दो Predicate में से किसी एक के भी सही होने पर true रिटर्न करती है (यानी
          पहली शर्त OR दूसरी शर्त)। अगर दोनों गलत होंगी, तभी यह false देगी।
          -सिंटैक्स: predicate1.or(predicate2)

    3. negate() मेथड (उल्टा करना - NOT ऑपरेटर)
        -यह क्या करती है: यह किसी Predicate के रिजल्ट को बिल्कुल उल्टा (Reverse) कर देती है। अगर शर्त
        सही हो रही होगी, तो यह false कर देगी; और अगर गलत हो रही होगी, तो true कर देगी।
        -सिंटैक्स: predicate.negate()

  4. isEqual() मेथड (Static Method - तुलना करने के लिए)
       -यह क्या करती है: यह Predicate इंटरफेस की एक Static मेथड है (बाकी ऊपर वाली डिफ़ॉल्ट मेथड्स
       थीं)। इसका उपयोग किसी ऑब्जेक्ट की वैल्यू को दूसरी वैल्यू के साथ बराबर (Equals) है या नहीं, यह चेक
       करने के लिए किया जाता है। यह अंदर ही अंदर Objects.equals() का इस्तेमाल करती है, जिससे
       null का भी सेफ हैंडलिंग हो जाता है।
  -सिंटैक्स: Predicate.isEqual(targetValue)

  5. not() मेथड (Java 11 में जोड़ी गई - पठनीयता बढ़ाने के लिए)
       -यह क्या करती है: यह भी एक Static मेथड है (जिसे Java 11 में लाया गया)। यह काम बिल्कुल
        negate() की तरह ही करती है (यानी उल्टा करना), लेकिन इसे लिखने का तरीका ज्यादा नेचुरल और आसान (Readable) होता है।
        -सिंटैक्स: Predicate.not(predicate)


   -Kyu banaye gaye: Multiple conditions ko aapas me milane
    ya ulta karne ke liye bina if-else ka jaal banaye.

    -Kab use karein: Jab aapko filtering ya validation karni ho
    (jaise: age 18 se zyada ho aur active ho).
*/