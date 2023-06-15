/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.baobibo.mathutil.main;

import org.baobibo.mathutil.core.MathUtility;

/**
 *
 * @author bibo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test hàm getF() với các test case đã chuẩn bị
        //test case #1, check getF() with n = 0. chi tiết xem ở dưới
        int n = 0;          //check 0!
        long expected = 1;  //có bằng 1 ko?!!
        long actual;        // = mấy thì phải chạy hàm;
        //sau đó so sánh ổn ko, expected == actual không

//dùng sức dùng mắt người
        
        actual = MathUtility.getFactorial(n);
//     test case 1: 
        System.out.println(n + "! | expected: " + expected + " | actual: " + actual);

//     test case 2:
//        Test case #2, check getF() with n = 1
        System.out.println("1! | expected: 1" + " | actual: " + MathUtility.getFactorial(1));

//     test case 3:
//        Test case #3, check getF() with n = 2
        System.out.println("2! | expected: 2" + " | actual: " + MathUtility.getFactorial(2));

//     test case 4:
//        Test case #4, check getF() with n = 4
        System.out.println("4! | expected: 24" + " | actual: " + MathUtility.getFactorial(4));

//     test case 5:
//        Test case #5, check getF() with n = 5
        System.out.println("5! | expected: 120" + " | actual: " + MathUtility.getFactorial(5));

    }

}

//TEST CASE VÀ TEST DRIVEN DEVELOPMENT - TDD
//việc viết code và test code được tiến hành song song, đan xen luôn 
//1 hàm được viết ra thì ngay trong quá trình viết đã chuẩn bị luôn 
//bộ test cases, nhiều test cases để test hàm đúng hay sai luôn
//ta liên tục sửa code/thêm code và chạy test case, run test
//  => giống QC là làm test case, run test case
//  => khác QC: phải viết cả code cho app
//Test case là 1 bộ data đưa vào hàm/app để test hàm/app đúng sai
//chứa input, expected value, và cách thực thi test case luôn
//đưa data, nhấn cái gì, xem cái gì, kết luận cái gì
//Hàm getF() có bộ data sẽ là : 0! -> 1, 1! -> 1, 2! -> 2, 3! -> 6,
//4! ->24,...; âm giai thừa, 21! CHỬI...
//nhiều bộ data, mỗi bộ ứng với 1 tình huống xài app/hàm, gọi test cases
//CÁC TEST CASE ĐƯỢC VIẾT THEO QUY TẮC CƠ BẢN NHƯ SAU/FORMAT NHƯ SAU
//Test case #1: check getF() with n = 0;
//Steps/Procedures - cách để test hàm/run test case
//                          1. given n = 0
//                          2. call getF(with n =0)
//          Expected result - kì vọng gì, hy vọng gì khi thực thi cái steps ở trên
//                          expected value: 1
//cho n = 0 vào hàm getF() và hy vọng hàm trả về con số 1

//test case 2: tương tự, thay số vào thôi
