package lessonsfojavacore.lesson2;

public class Main {
    static String[][] matrixWithNoError = {{"1","10","2","9"},{"3","8","4","7"},{"5","6","6","5"},{"7","4","8","3"}};
    static String[][] matrixSizeException = {{"1","10","2"},{"3","8","4","7"},{"5","6","6","5"},{"7","4","8","3"}};
    static String[][] matrixDataException = {{"ошибка","10","2","9"},{"3","8","4","7"},{"5","6","6","5"},{"7","4","8","3"}};
    static int line = 4;
    static int column = 4;
    public static void main(String[] args){
        try {
            System.out.println("Сумма массива: " + getSumm(matrixWithNoError));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println("Сумма массива: " + getSumm(matrixDataException));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println("Сумма массива: " + getSumm(matrixSizeException));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }

    }
    public static class MyArraySizeException extends Exception{
        public MyArraySizeException(){super("Ошибка в размере");}
    }
    public static class MyArrayDataException extends Exception{
        public MyArrayDataException(String message){super(message);}
    }
    static void checkValue(String[][] matrix) throws MyArraySizeException{
        if (matrix.length!=line|| matrix[0].length!=column) throw new MyArraySizeException();
    }
    static Integer getSumm(String[][] matrix) throws MyArraySizeException, MyArrayDataException{
        checkValue(matrix);
        Integer result = 0;
        int i =0;
        int j =0;
        try {
            for(;i< matrix.length;i++){
                j=0;
                for (;j< matrix.length;j++){
                    result = result + Integer.parseInt(matrix[i][j]);
                }
            }
        }catch (NumberFormatException ex){
            throw new MyArrayDataException("Не верное содержане ячейки. Срока "+ i+1 + ". Столбец "+ j+1);
        }
        return result;
    }
}
