package com.danny.reflect.method;

/**
 * @author huyuyang@lxfintech.com
 * @Title: TestClass
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-01-21 21:30:35
 */
public class TestClass {
    public static void main(String[] args) {
        MethodInvokeA methodInvokeA=new MethodInvokeA().setField1(1).setField2("B");
        MethodInvokeB methodInvokeB=new MethodInvokeB().setField1(1).setField2("B");

        System.out.print("MethodInvokeA耗时：");
        long totalTimeA=0;
        for (int j=0;j<10;j++){
            long startTimeA=System.currentTimeMillis();
            for (int i=0;i<10000000;i++){
                methodInvokeA.getValueByMethodName(methodInvokeA,"getField2");
            }
            long endTimeA=System.currentTimeMillis();
            System.out.print((endTimeA-startTimeA)+"毫秒 ");
            totalTimeA+=(endTimeA-startTimeA);
        }
        System.out.print("平均："+totalTimeA/10);
        System.out.println();

        System.out.print("MethodInvokeB耗时：");
        long totalTimeB=0;
        for (int j=0;j<10;j++){
            long startTimeB=System.currentTimeMillis();
            for (int i=0;i<10000000;i++){
                methodInvokeB.getValueByMethodName(methodInvokeB,"getField2");
            }
            long endTimeB=System.currentTimeMillis();
            System.out.print((endTimeB-startTimeB)+"毫秒 ");
            totalTimeB+=(endTimeB-startTimeB);
        }
        System.out.print("平均："+totalTimeB/10);
    }


}
