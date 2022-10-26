package lessonsfojavacore.lesson5;


import java.io.*;
import java.util.*;


public class Main {
    public static ArrayList<FileObject> fileObjectArrayList = new ArrayList<>();

    public static final String pathToFile = "src/lessonsfojavacore/lesson5/demo.csv";

    public static final String title = "value1"+ ";" + "value2"
            + ";" + "value3" + ";"+ System.getProperty("line.separator");

    public static void main(String[] args) throws IOException {
        createFileObjects();
        writer();
        AppData appData = readToObject();
    }

    public static void createFileObjects(){
        Random random = new Random();

        for(int i=1;i<21;i++){
            fileObjectArrayList.add( new FileObject(i, random.nextInt(100), random.nextInt(100)));
        }
    }
    public static void writer() throws IOException {
        try (FileWriter writer = new FileWriter(pathToFile);){
            writer.write(title);
            for(FileObject fIleObject : fileObjectArrayList) {
                writer.write(fIleObject.getValue() + ";" + fIleObject.getValueFrom()
                        + ";" + fIleObject.getValueFrom() + ";"+ System.getProperty("line.separator"));
            }
        }
    }
    public static AppData readToObject() throws IOException {
        AppData appData = new AppData();
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            String line = br.readLine();
            appData.setHeader( line.split(";"));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                records.add(Arrays.asList(values));
            }
        };

        int[][] resultData = new int[records.size()][3];

        for(int i=0;i<records.size();i++){
            for(int j=0;j<records.get(i).size();j++){
                resultData[i][j] = Integer.valueOf(records.get(i).get(j));
            }
        }
        appData.setData(resultData);
        return appData;

    }
}
