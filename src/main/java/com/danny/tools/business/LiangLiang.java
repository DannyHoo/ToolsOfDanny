package com.danny.tools.business;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

/**
 * @author huyuyang@lxfintech.com
 * @Title: LiangLiang
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-06-13 11:06:40
 */
public class LiangLiang {
    public static void main(String[] args) {
        getNums();
    }

    public static double[] getNums() {
        Random random = new Random();
        double[] doubles = new double[20];
        for (double d : doubles) {
            double temp = random.nextDouble() * 10;
            DecimalFormat dformat = new DecimalFormat("0.0");
            d = Double.valueOf(dformat.format(temp));
            System.out.println(d);
        }
        return doubles;
    }

}
