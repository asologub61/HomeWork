package FinalProjectWork.tests;

import FinalProjectWork.CastMoney;
import FinalProjectWork.CurrencyWithForms;
import FinalProjectWork.Spliter;
import FinalProjectWork.Values;

import java.util.ArrayList;

public class TestProject {
    public static void main(String[] args) {

        DummyForTest dummyForTest = new DummyForTest();
        CastMoney castMoney = new CastMoney();
        Values values = new Values();
        Spliter spliter = new Spliter();
        CurrencyWithForms currencyWithForms = new CurrencyWithForms();

        testAddFormsAndCurrency(currencyWithForms, dummyForTest);
        System.out.println();

        testSplitNumberToSegments(spliter, dummyForTest);
        System.out.println();

        testSplitASegmentToDigits(spliter, dummyForTest);
        System.out.println();

        testNumberToString(values, spliter, dummyForTest);
        System.out.println();

//        ������������ �� ������ ������� �����
        try {
            castMoney.doCastMoney(dummyForTest.numberDummyForPositiveTest);
            System.out.println("���� �������");
            System.out.println();
        } catch (Exception e) {
            System.err.println(e);
            System.out.println("���� �� ������ - ����� doCastMoney");
            System.out.println();
        }
        try {
            castMoney.doCastMoney(dummyForTest.numberDummyForLowValueTest);
            System.out.println("���� �������");
            System.out.println();
        } catch (Exception e) {
            System.err.println(e);
            System.out.println("���� �� ������ - ����� doCastMoney");
            System.out.println();
        }
        try {
            castMoney.doCastMoney(dummyForTest.numberDummyForHighValueTest);
            System.out.println("���� �������");
            System.out.println();
        } catch (Exception e) {
            System.err.println(e);
            System.out.println("���� �� ������ - ����� doCastMoney");
        }
        try {
            castMoney.doCastMoney(dummyForTest.numberDummyForNegativeValueTest);
            System.out.println("���� �� ������ - ����� doCastMoney");
            System.out.println();
        } catch (Exception e) {
            System.err.println(e);
            System.out.println("���� �������");
        }
        try {
            castMoney.doCastMoney(dummyForTest.numberDummyForNotNullTest);
        } catch (Exception e) {
//            System.err.println(e);
            System.out.println("���� ������� ");
        }

    }

    //    ������������ �� ������ ������ �����
//    ������������ ������� ������ Spliter
    public static void testSplitNumberToSegments(Spliter spliter, DummyForTest dummyForTest) {
        ArrayList list = spliter.splitNumberToSegments(dummyForTest.numberDummyForPositiveTest);
        if (list.size() == 3) {
            System.out.println("testSplitNumberToSegments ������� ");
        } else {
            System.out.println("testSplitNumberToSegments  �� ������");
        }
    }

    public static void testSplitASegmentToDigits(Spliter spliter, DummyForTest dummyForTest) {
        int[] arr = spliter.splitASegmentToDigits(dummyForTest.numberDummyForSplitASegmentToDigits);
        if (arr[0] == 1 && arr[1] == 2) {
            System.out.println("testSplitASegmentToDigits �������");
        } else {
            System.out.println("testSplitASegmentToDigits �� ������");
        }
    }

    public static void testNumberToString(Values values, Spliter spliter, DummyForTest dummyForTest) {
        ArrayList list = spliter.numberToString(values, dummyForTest.segmentsFromANumber, dummyForTest.numberDummyForPositiveTest);
        if (list.contains(" ������ �������� ����")) {
            System.out.println("testNumberToString �������");
        } else {
            System.out.println("testNumberToString �� ������");
        }
    }

//    ������������ ������ ������ CurrencyWithForms
    public static void testAddFormsAndCurrency(CurrencyWithForms currencyWithForms, DummyForTest dummyForTest) {
        String str = currencyWithForms.addFormsAndCurrency(dummyForTest.stringFromNumbersSegments, dummyForTest.segmentsFromANumber);
        if (str.equals(" ������ �������� ���� ������� �������� ��������� ������ ������ ��������� ����������� ���� ������")) {
            System.out.println("testAddFormsAndCurrency �������");
        } else {
            System.out.println("testAddFormsAndCurrency �� ������");
        }
    }
}
