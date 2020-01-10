package unittest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import unittest.database.Kategori1841720007BintangTest;
import unittest.database.Anggota1841720007BintangTest;

public class TestRunner1841720007Bintang {

    public static void main(String[] args) {
        Result mResult = new JUnitCore().runClasses(MessageProcessorTest1841720007Bintang.class);
        showMessageResultBintang(mResult, MessageProcessorTest1841720007Bintang.class.getSimpleName());

        mResult = new JUnitCore().runClasses(Kategori1841720007BintangTest.class);
        showMessageResultBintang(mResult, Kategori1841720007BintangTest.class.getSimpleName());

        mResult = new JUnitCore().runClasses(Anggota1841720007BintangTest.class);
        showMessageResultBintang(mResult, Anggota1841720007BintangTest.class.getSimpleName());
    }

    private static void showMessageResultBintang(Result mResult, String mClassName) {
        if (mResult.wasSuccessful()) {
            System.out.format("The Result Test from %s : %s\n", mClassName, mResult.wasSuccessful());
        } else {
            for (Failure failure : mResult.getFailures()) {
                System.out.println(failure);
            }
        }
    }
}
