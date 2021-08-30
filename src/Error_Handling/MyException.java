package Error_Handling;

public class MyException extends Exception {

  public MyException(String ErrorMessage) {
    super(ErrorMessage); // 调用父类抛出异常信息的方法
  }
}
