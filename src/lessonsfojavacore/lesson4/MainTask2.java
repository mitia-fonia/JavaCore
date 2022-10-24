package lessonsfojavacore.lesson4;



public class MainTask2 {
    public static void main(String[] args){
        PhoneTable phoneTable = new PhoneTable();
        phoneTable.add("11111","Петров");
        phoneTable.add("12345","Петров");
        phoneTable.add("56789","Петров");
        phoneTable.add("78987","Петрова");
        phoneTable.add("25801","Иванов");
        phoneTable.add("34720","Иванова");
        phoneTable.add("23409","Иванова");

        System.out.println(phoneTable.getPhoneByFIO("Петров"));
        System.out.println(phoneTable.getPhoneByFIO("Петров "));
        System.out.println(phoneTable.getPhoneByFIO("Соколов"));
        System.out.println(phoneTable.getPhoneByFIO("23409"));
    }
}
