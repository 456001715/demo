package com.lots;

import javax.swing.*;

/**
 * @name: MenuController
 * @author: lots
 * @date: 2020/9/25 17:44
 */
public class MenuController   extends JFrame{
    static void menu(final JPanel panel,final JFrame frame){
        frame.dispose();
        final  JFrame jf;
        jf=new JFrame("lots");
        jf.setVisible(true);
        jf.setLocation(10, 10);
        jf.setBounds(10, 10, 100, 100);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
