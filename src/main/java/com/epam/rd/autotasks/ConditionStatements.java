package com.epam.rd.autotasks;
class ConditionStatements {
    public static int task2(int n) {
            int a = n/100;
            int b = (n/10)%10;
            int c = n%10;
            String digits1 = a+""+b+""+c;
            String digits2 = a+""+c+""+b;
            String digits3 = b+""+a+""+c;
            String digits4 = b+""+c+""+a;
            String digits5 = c+""+a+""+b;
            String digits6 = c+""+b+""+a;

            int x1 = Integer.parseInt(digits1);
            int x2 = Integer.parseInt(digits2);
            int x3 = Integer.parseInt(digits3);
            int x4 = Integer.parseInt(digits4);
            int x5 = Integer.parseInt(digits5);
            int x6 = Integer.parseInt(digits6);

            return Math.max((Math.max((Math.max(Math.max(Math.max(x1,x2),x3),x4)),x5)),x6);
    }
}
