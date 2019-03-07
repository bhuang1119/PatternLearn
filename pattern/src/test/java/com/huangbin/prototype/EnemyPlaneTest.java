package com.huangbin.prototype;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * @Author: huangbin
 * @Description:
 * @Date: Created in 
 * @Modified By:
 */
public class EnemyPlaneTest {

    @Test
    public void test() throws CloneNotSupportedException {
        for(int i=0;i<50;i++){
            EnemyPlaneFactory.getInstance(new Random().nextInt(200));
        }
    }

}