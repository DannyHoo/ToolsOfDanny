package com.danny.structure;

import com.danny.reflect.method.lxjr.CreditAccountResultStatusEnum;

/**
 * @author huyuyang@lxfintech.com
 * @Title: SwitchCase
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-02-22 17:20:45
 */
public class SwitchCase {

    public static void main(String[] args) {
        String product="Danny1";
        switch (product) {
            case "Danny":
                System.out.println(product);
                break;
            default:
                break;
        }
    }
}
