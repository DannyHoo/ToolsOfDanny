package com.danny.tools.string;

/**
 * @Author��chaoqiang.zhou
 * @date: 2016/10/13.
 */
public class StringUtils {


    public static void main(String[] args) {
       String a="122";
        String b="13322";
        System.out.println(validateParam(a,b));

    }




    public static boolean validateParam(String str1,String str2){
        if(str1==null||str2==null){
            throw  new IllegalArgumentException("the param is not allowed null");
        }
        byte[] b1 = str1.getBytes();
        byte[] b2 = str2.getBytes();

        int[] bCount = new int[256];
        int[] bCount2 = new int[256];

        int[] tmpArray=new int[256];
        int[] tmp2=new int[256];

        for(int i=0;i<b1.length;i++)
            bCount[b1[i]-'0']++;

        int index1=0;
        for(int i=0;i<bCount.length;i++){
            if(bCount[i]>=2){
                tmpArray[i]=i;
            }
        }


        int index2=0;
        for(int i=0;i<str2.length();i++){
            bCount2[b2[i]-'0']++;
        }
        for(int i=0;i<bCount2.length;i++){
            if(bCount2[i]>=2){
                tmp2[i]=i;
            }
        }

        for(int i=0; i<256;i++){
                if(tmp2[i]>=2&&tmpArray[i]>=2){
                    return true;
                }

        }

        return false;
    }
}
