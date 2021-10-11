package com.zaizai.demo.leetcode;

/**
 * @description
 * @author luojiyuan
 * @date 2021-08-31 11:32
 */
//编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
//
// 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
//
// 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
//
// 示例 1：
//
// 输入：["h","e","l","l","o"]
//输出：["o","l","l","e","h"]
//
// 示例 2：
//
// 输入：["H","a","n","n","a","h"]
//输出：["h","a","n","n","a","H"]
// Related Topics 递归 双指针 字符串 👍 443 👎 0


public class RelatedString {

    public static void reverseString(char[] s) {
        int n = s.length;
        for (int start = 0, end = n - 1; start < end; ++start, --end) {
            char tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;
        }
        System.out.print(s);
    }

    public static void main(String[] args) {
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(s);
    }

}
