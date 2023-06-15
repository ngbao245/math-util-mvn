/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.baobibo.mathutil.core;

/**
 *
 * @author bibo
 */
//class này clone lại 100% cái class java.util.Math của JDK
//Math.sqrt() Math.sin() Math.random()
public class MathUtility {

    public static final double PI = 3.1415;

    //tính n! = 1.2.3.4...n
    //thiết kế/quy ước cho hàm/method này
    //0! = 1! = 1
    //ko áp dụng giai thừa cho số âm. Nếu n <0: chửi; NÉM RA EXCEPTION
    //ko áp dụng giao thừa cho số >20. Vì 20! vừa đủ khít kiểu long
    //                                          18 con số 0
    //=> 21!: Chửi, ném ra ngoại lệ
    public static long getFactorial(int n) {     //static: chỉ xài 1 lần rồi thôi(tool, đồ chơi công cụ chơi xong ko cần nhớ)
        if (n == 0 || n == 1)
            return 1;
        
        if (n < 0 || n >20) 
            throw new IllegalArgumentException("Invalid n. n must be between 0=>20");

        long product = 1; //tích khởi đầu là 1, sau đó nhân dồn vào
        for (int i = 2; i <= n; i++)
            product *= i;

        return product;
    }
}
