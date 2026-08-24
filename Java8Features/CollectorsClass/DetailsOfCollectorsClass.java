package Java8Features.CollectorsClass;

public class DetailsOfCollectorsClass
{
}
/*Collectors Class:-
        -Collectors जावा 8 (java.util.stream.Collectors) में दी गई एक बहुत ही पावरफुल Utility Class है।


    जब आप जावा स्ट्रीम (Stream API) पर डेटा को प्रोसेस करते हैं (जैसे फिल्टर करना, डेटा बदलना),
     तो आखिर में आपको उस डेटा को किसी न किसी रूप में संभाल कर रखना (Collect करना) होता ह
     ै—जैसे कि List, Set, Map में बदलना, या डेटा पर कोई गणितीय गणना (जैसे Sum, Average) करना।

यह सारा काम Collectors क्लास करती है।
इसे आप स्ट्रीम की दुनिया का "फिनिशिंग लाइन कोच" कह सकते हैं,
जो बिखरे हुए डेटा को समेटकर एक सही स्ट्रक्चर में ढाल देता है।

=> Definition
Collectors is a final utility class in the java.util.stream
package that provides a set of pre-built reduction operations.
It is used as a terminal operation in Stream API to accumulate, process,
 or transform stream elements into different data structures like Lists, Sets, Maps, or
 to perform aggregate calculations like grouping, partitioning, and counting."

=> Utility Class banane ke Rules :
 -> 1 : Class ko final karo:
           -Utility class extends nhi honi chahiye

 -> 2 : sare variables and methods ko static banao .
       -> Kyu ki Utility class ka Object nahi banaya jata hai.
 -> 3: constructors ko private kardo .
    -> Kyu ki koe es class ka object na bana de and sare methods jab
    static hai to hame class name se class karna hoga na ki object se ..
 ->
*/