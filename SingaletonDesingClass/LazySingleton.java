package SingaletonDesingClass;

public class LazySingleton
{
    private static LazySingleton instance;

    private LazySingleton()
    {
    }

    public LazySingleton getInstance()
    {
       if(instance==null)
       {
          synchronized (LazySingleton.class)
          {
              if(instance==null)
              {
                  instance = new LazySingleton();
                  instance = new LazySingleton();
              }
          }
       }
        return instance;
    }
}

/*
 तरीका 2: Lazy Initialization with Thread Safety (जरूरत पड़ने पर बनाना - Best Approach)
  - इसमें ऑब्जेक्ट तब तक नहीं बनता जब तक कोई getInstance() को कॉल न करे (Lazy Loading)। साथ
    ही, मल्टी-थ्रेडेड एनवायरनमेंट में सुरक्षा के लिए synchronized या Double-Checked Locking का उपयोग
    किया जाता है।

*/