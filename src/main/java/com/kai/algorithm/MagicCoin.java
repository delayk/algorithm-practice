package com.kai.algorithm;

import java.util.ArrayList;
import java.util.List;

public class MagicCoin {

//    小易准备去魔法王国采购魔法神器,购买魔法神器需要使用魔法币,但是小易现在一枚魔法币都没有,但是小易有两台魔法机器可以通过投入x(x可以为0)个魔法币产生更多的魔法币。
//    魔法机器1:如果投入x个魔法币,魔法机器会将其变为2x+1个魔法币
//    魔法机器2:如果投入x个魔法币,魔法机器会将其变为2x+2个魔法币
//    小易采购魔法神器总共需要n个魔法币,所以小易只能通过两台魔法机器产生恰好n个魔法币,小易需要你帮他设计一个投入方案使他最后恰好拥有n个魔法币。
//    输入描述: 输入包括一行,包括一个正整数n(1 ≤ n ≤ 10^9),表示小易需要的魔法币数量。
//    输出描述: 输出一个字符串,每个字符表示该次小易选取投入的魔法机器。其中只包含字符’1’和’2’。
//    示例1:
//    输入
//    10
//    输出
//    122

//    public long magicMachine1(long x) {
//        return 2 * x + 1;
//    }
//
//    public long magicMachine2(long x) {
//        return 2 * x + 2;
//    }

    public static String calculate(long target) {
        List<String> reversedOrder = new ArrayList<>();
        long i = target;
        while (i > 0) {
            if (i % 2 == 0) {
                i = (i- 2) / 2 ;
                reversedOrder.add("2");
            } else {
                i = (i- 1) / 2 ;
                reversedOrder.add("1");
            }
        }
        StringBuilder out = new StringBuilder();
        if (reversedOrder.size() > 0) {
            for (int j = reversedOrder.size() - 1; j >= 0; j--) {
                out.append(reversedOrder.get(j));
            }
        }
        return out.toString();

    }

}
