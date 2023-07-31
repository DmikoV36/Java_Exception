package Java_Exception_HomeWork;

public class DataException extends Exception {
    public DataException() {
    }

    public void dataException(String i) {
        System.out.println("Exception: DataNotCorrectFormat");
        System.out.printf("It`s not correct date format: %s", i);
        System.out.println();
    }
}
