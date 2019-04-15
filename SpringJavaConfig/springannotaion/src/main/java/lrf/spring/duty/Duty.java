package lrf.spring.duty;

/**
 * 实现DutyInter接口
 *
 * @author lirufeng
 * @date 2019/2/15 10:21
 */
public class Duty implements DutyInter {

    @Override
    public void say() {
        System.out.println("I am Interface1");
    }
}
