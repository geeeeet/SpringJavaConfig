package lrf.spring.handle;

import lrf.spring.duty.DutyInter;

/**
 * 实现Handleinter接口
 *
 * @author lirufeng
 * @date 2019/2/15 10:24
 */
public class Handleclass implements Handleinter {

    private DutyInter inter;

    public Handleclass(DutyInter inter) {
        this.inter = inter;
    }

    @Override
    public void handleduty() {
        inter.say();
    }
}
