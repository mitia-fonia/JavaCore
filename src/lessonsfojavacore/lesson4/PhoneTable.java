package lessonsfojavacore.lesson4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;


public class PhoneTable {
   private HashMap<String, String> phoneTableHashMap = new HashMap<>();

   public void add(String phone, String fio){
       phoneTableHashMap.put(phone, fio);
   }

   public String getPhoneByFIO(String fio){
        if(phoneTableHashMap.containsValue(fio)){
            String result = "Phone numbers: ";
            for(String key: phoneTableHashMap.keySet()){
                if(phoneTableHashMap.get(key).equals(fio)) result += key + "; ";
            }
            return result;
        } else return "Can't find";

   }
}

