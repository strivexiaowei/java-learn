package com.ithuangxianwei.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.util.Random;

public class GameJFrame extends JFrame {
    int[][] dataImage = new int[4][4];

    public GameJFrame() {
        // 初始化界面
        initJFrame();
        // 初始化菜单
        initMenu();
        // 初始化数据
        initData();
        // 初始化图片
        initImages();

        this.setVisible(true);
    }

    private void initData() {
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < tempArr.length; i++) {
            Random rd = new Random();
            int rdIndex = rd.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[rdIndex];
            tempArr[rdIndex] = temp;
        }

        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + " ");
            dataImage[i / 4][i % 4] = tempArr[i];
        }
    }

    // 初始化图片
    private void initImages() {
        // 添加背景图片
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = dataImage[j][i];
                System.out.println(num);
                JLabel jLabel = new JLabel(new ImageIcon("puzzlegame\\image\\animal\\animal3\\" + num + ".jpg"));

                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                jLabel.setBorder(new BevelBorder(1));
                this.getContentPane().add(jLabel);

            }
        }
        JLabel bg = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
        bg.setBounds(40, 40, 508, 560);
        this.getContentPane().add(bg);
    }


    private void initMenu() {
        JMenuBar jMenuBar = new JMenuBar();
        JMenu funMenu = new JMenu("功能");
        JMenu aboutMenu = new JMenu("关于我们");
        // 功能
        JMenuItem replayMenuItem = new JMenuItem("重新游戏");
        JMenuItem reLoginMenuItem = new JMenuItem("重新登录");
        JMenuItem closeMenuItem = new JMenuItem("关闭游戏");
        // 公众号
        JMenuItem accountMenuItem = new JMenuItem("公众号");
        funMenu.add(replayMenuItem);
        funMenu.add(reLoginMenuItem);
        funMenu.add(closeMenuItem);
        aboutMenu.add(accountMenuItem);
        jMenuBar.add(funMenu);
        jMenuBar.add(aboutMenu);
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        this.setSize(603, 680);
        this.setTitle("拼图Java版 v1.0");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        // 取消默认布局
        this.setLayout(null);
    }
}
