package com.voyah.string1;
//多行字符串一起输出
public class string1 {
        public static void main(String[] args) {
            String s = """
                   SELECT * FROM
                     users
                   WHERE id > 100
                   ORDER BY name DESC
                   """;
            System.out.println(s);
        }
}

