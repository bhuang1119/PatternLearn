package com.huangbin.prototype;

/**
 * @Author: huangbin
 * @Description:
 * @Date: Created in 
 * @Modified By:
 */
public class EnemyPlaneFactory {
    private static EnemyPlane enemyPlane = new EnemyPlane(1);
    public static EnemyPlane getInstance(int x) throws CloneNotSupportedException {
        EnemyPlane enemyPlaneClone = enemyPlane.clone();
        enemyPlaneClone.setX(x);
        return enemyPlaneClone;
    }
}
