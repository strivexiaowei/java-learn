package com.ithuangxianwei.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    int[][] dataImage = new int[4][4];
    int[][] winData = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    // x y 当前0位置图片的位置
    int x;
    int y;
    int step = 0;
    String path = "puzzlegame\\image\\animal\\animal3\\";
    // 功能
    JMenuItem replayMenuItem = new JMenuItem("重新游戏");
    JMenuItem reLoginMenuItem = new JMenuItem("重新登录");
    JMenuItem closeMenuItem = new JMenuItem("关闭游戏");
    // 公众号
    JMenuItem accountMenuItem = new JMenuItem("公众号");
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
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            dataImage[i / 4][i % 4] = tempArr[i];
        }
    }

    // 初始化图片
    private void initImages() {
        this.getContentPane().removeAll();
        if (isWin()) {
            JLabel winJlb = new JLabel(new ImageIcon("puzzlegame\\image\\win.png"));
            winJlb.setBounds(203, 283, 197, 197);
            this.getContentPane().add(winJlb);
        }
        JLabel stepLb = new JLabel(new StringBuilder("步数: ").append(step).toString());
        stepLb.setBounds(50, 50, 200, 20);
        this.getContentPane().add(stepLb);
        // 添加背景图片
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = dataImage[i][j];
                JLabel jLabel = new JLabel(new ImageIcon(new StringBuilder(path).append(num).append(".jpg").toString()));
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                jLabel.setBorder(new BevelBorder(1));
                this.getContentPane().add(jLabel);
            }
        }

        JLabel bg = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
        bg.setBounds(40, 40, 508, 560);
        this.getContentPane().add(bg);
        this.getContentPane().repaint();
    }


    private void initMenu() {
        JMenuBar jMenuBar = new JMenuBar();
        JMenu funMenu = new JMenu("功能");
        JMenu aboutMenu = new JMenu("关于我们");


        replayMenuItem.addActionListener(this);
        reLoginMenuItem.addActionListener(this);
        closeMenuItem.addActionListener(this);
        accountMenuItem.addActionListener(this);
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
        this.addKeyListener(this);
    }

    private Boolean isWin () {
        for (int i = 0; i < dataImage.length; i++) {
            for (int j = 0; j < dataImage[i].length; j++) {
                if (dataImage[i][j] != winData[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            this.getContentPane().removeAll();
            JLabel allPng = new JLabel(new ImageIcon(new StringBuilder(path).append("all.jpg").toString()));
            allPng.setBounds(83, 134, 420, 420);
            this.getContentPane().add(allPng);
            JLabel bg = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
            bg.setBounds(40, 40, 508, 560);
            this.getContentPane().add(bg);
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (isWin()) {
            return;
        }
        int code = e.getKeyCode();
        if (code == 37) {
            if (y == 3) {
                return;
            }
            dataImage[x][y] = dataImage[x][y + 1];
            dataImage[x][y + 1] = 0;
            y++;
            step++;
            initImages();
        } else if (code == 38) {
            if (x == 3) {
                return;
            }
            dataImage[x][y] = dataImage[x + 1][y];
            dataImage[x + 1][y] = 0;
            x++;
            step++;
            initImages();
        } else if (code == 39) {
            if (y == 0) {
                return;
            }
            dataImage[x][y] = dataImage[x][y - 1];
            dataImage[x][y - 1] = 0;
            y--;
            step++;
            initImages();
        } else if (code == 40) {
            if (x == 0) {
                return;
            }
            dataImage[x][y] = dataImage[x - 1][y];
            dataImage[x - 1][y] = 0;
            step++;
            x--;
            initImages();
        } else if (code == 65) {
            initImages();
        } else if (code == 87) {
            dataImage = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            initImages();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == replayMenuItem) {
           step = 0;
           initData();
           initImages();
        } else if (obj == reLoginMenuItem) {
            this.setVisible(false);
            new LoginJFrame();
        } else if (obj == closeMenuItem) {
             System.exit(0);
        } else if (obj == accountMenuItem) {
            JDialog jdl = new JDialog();
            JLabel jlb = new JLabel(new ImageIcon("puzzlegame\\image\\about.png"));
            jlb.setBounds(0, 0, 258, 258);
            jdl.getContentPane().add(jlb);
            jdl.setSize(344, 344);
            jdl.setAlwaysOnTop(true);
            jdl.setLocationRelativeTo(null);
            jdl.setModal(true);
            jdl.setVisible(true);
        }
    }
}
