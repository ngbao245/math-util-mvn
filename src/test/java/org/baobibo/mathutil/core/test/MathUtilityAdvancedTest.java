/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.baobibo.mathutil.core.test;

import org.baobibo.mathutil.core.MathUtility;
import static org.baobibo.mathutil.core.MathUtility.getFactorial; //cu phap danh cho static
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; //*: tat ca cac ham static deu khong can cham
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author bibo
 */
public class MathUtilityAdvancedTest {

    //hàm chuẩn bị bộ datatest để sau đó fill vàoo hàm assertEqual() ở dưới 
    public static Object[][] initTestData() {
        Object testData[][] = {{0, 1},
        {1, 1},
        {2, 2},
        {4, 24},
        {6, 720}};

        return testData;
    }

    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentRunsWell(int n, long expected) {
        int a = 1;
        int b;
        assertEquals(expected, getFactorial(n));
    }

//    Executable gF = new Executable() {
//        @Override
//        public void execute() throws Throwable {
//            MathUtility.getFactorial(-5);
//        }
//    };
    Executable gF = () -> MathUtility.getFactorial(-5);

    @Test
    public void testFactorialGivenWrongArgumentThrowsException() {
        assertThrows(IllegalArgumentException.class, gF); //hàm thuộc interface Executable
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(-5)); //hàm thuộc interface Executable

        //xài lambda cho nhanh
    }

}
