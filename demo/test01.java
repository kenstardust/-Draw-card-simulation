package demo;

public class test01 {
    static double p = 0.006;
    static int times = 0;

    static int up = 0;
    static int gold = 0;
    static int others = 0;

    static int all=0;
    /**
     * 抽卡概率计算 x
     */
    public int getUp() {
        return up;
    }

    public int getGold() {
        return gold;
    }

    public int getOthers() {
        return others;
    }

    public int getTimes() {
        return times;
    }

    public int get_all() {
        return all;
    }

    public void Chou(int x) {
        for (int i = 1; i <= x; i++) {
            all++;
            if (times > 74) {
                p += 0.06;
                double jin = Math.random();
                if (jin < p) {
                    times=0;
                    double wanted = Math.random();
                    if (wanted > 0.5) {
                        up++;
                        p = 0.006;
                    } else {
                        gold++;
                        p = 0.006;
                    }
                } else {
                    others++;
                    times++;
                }
            } else if (times == 90) {
                double wanted = Math.random();
                times=0;
                if (wanted > 0.5) {
                    up++;
                    p = 0.006;
                } else {
                    gold++;
                    p = 0.006;
                }
            } else {
                double jin = Math.random();
                if (jin < p) {
                    times=0;
                    double wanted = Math.random();
                    if (wanted > 0.5) {
                        up++;
                        p = 0.006;
                    } else {
                        gold++;
                        p = 0.006;
                    }
                } else {
                    others++;
                    times++;
                }
            }
        }
    }

    public void Reset() {
        times = 0;
        up = 0;
        gold = 0;
        others = 0;
        p = 0;
    }
}
