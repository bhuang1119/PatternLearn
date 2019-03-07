package com.huangbin.prototype;

/**
 * @Author: huangbin
 * @Description:  原型模式
 * @Date: Created in 2019/03/06
 * @Modified By:
 */
public class EnemyPlane implements Cloneable {
    private int x;
    private int y=0;

    private Bullet bullet = new Bullet();

    public  EnemyPlane (int x){
        this.x=x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void fly(){
        y++;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    @Override
    public EnemyPlane clone() throws CloneNotSupportedException {
        EnemyPlane enemyPlaneClone = (EnemyPlane) super.clone();
        enemyPlaneClone.setBullet((Bullet) this.bullet.clone());
        return enemyPlaneClone;
    }
}
