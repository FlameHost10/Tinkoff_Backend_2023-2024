package edu.hw2;

public class Task4 {
    public record CallingInfo(String className, String methodName) {}

    public static void whoCalledMethod() {
        StackTraceElement[] methods = Thread.currentThread().getStackTrace();
        CallingInfo info = new CallingInfo(methods[2].getClassName(), methods[2].getMethodName());
        System.out.println("Class name: " + info.className + ";\t\t Method name: " + info.methodName);

    }

}
