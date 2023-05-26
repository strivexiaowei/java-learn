package com.ithxw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    static ArrayList<Integer> list = new ArrayList<>();
    static HashMap<Integer, String> hm = new HashMap<>();
    static {
        // "♦", "♣", "♥", "♠"
        // "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "A", "2"
        String[] color = { "♦", "♣", "♥", "♠" };
        String[] number = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "A", "2" };
        int count = 1;
        for (String s : number) {
            for (String n : color) {
                hm.put(count, n + s);
                list.add(count);
                count++;
            }
        }
       hm.put(53, "小王");
       hm.put(54, "大王");
       list.add(53);
       list.add(54);

    }

    public PokerGame() {
        // 洗牌
        Collections.shuffle(list);
        System.out.println(list);
        // 发牌
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> poker1 = new TreeSet<>();
        TreeSet<Integer> poker2 = new TreeSet<>();
        TreeSet<Integer> poker3 = new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (i <= 2) {
                lord.add(list.get(i));
            }
            if (i % 3 == 1) {
                poker1.add(list.get(i));
            } else if (i % 3 == 2) {
                poker2.add(list.get(i));
            } else {
                poker3.add(list.get(i));
            }
        }
        // 看牌
        lookPoker("底牌", lord);
        lookPoker("钢脑壳", poker1);
        lookPoker("大帅逼", poker2);
        lookPoker("蛋筒", poker3);
    }

    public void lookPoker (String name, TreeSet<Integer> list) {
        System.out.print(name + ":");
        for (Integer poker : list) {
            String hmPoker = hm.get(poker);
            System.out.print(hmPoker + " ");
        }
        System.out.println();
    }
    public String toString() {
        return "PokerGame{}";
    }
}
