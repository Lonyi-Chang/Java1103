package ocp16;

import com.ocp16.Power;
import org.junit.Assert;
import org.junit.Test;

public class test_Power {
    @Test
    public void test1() {
        Power power = new Power();
        int w = 1000; //1000瓦
        int a = 100; //100安培
        int exp = 10; //10 電壓
        int act = power.getV(w, a);
        Assert.assertEquals(exp, act);
    }
    @Test
    public void test2() {
        Power power = new Power();
        int w = 1000; //1000瓦
        int v = 10; //10電壓
        int exp = 100; //100 安培
        int act = power.getA(w, v);
        Assert.assertEquals(exp, act);
    }
}
