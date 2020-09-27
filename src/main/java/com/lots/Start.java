package com.lots;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.*;
import java.awt.*;

import static com.lots.LoginController.login;

/**
 * @name: start
 * @author: lots
 * @date: 2020/9/22 17:51
 */
public class Start {


    public static void main(String[] args) {
        /** 得到显示器屏幕的宽高 */
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        try
        {
            //设置本属性将改变窗口边框样式定义
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;
            BeautyEyeLNFHelper.launchBeautyEyeLNF();
            //隐藏设置按钮
            UIManager.put("RootPane.setupButtonVisible", false);
        }
        catch(Exception e)
        {
            //TODO exception
        }
        // 创建 JFrame 实例
        JFrame frame = new JFrame("lotswxxw");
        //设置图标
        frame.setIconImage(new ImageIcon("resource/img/iocn.jpg").getImage());
        /** 定义窗体的宽高 */
        int windowsWidth = 350;
        int windowsHeight = 200;
        frame.setSize(windowsWidth, windowsHeight);

         //
        frame.setBounds((width - windowsWidth) / 2,
                (height - windowsHeight) / 2, windowsWidth, windowsHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /* 创建面板，这个类似于 HTML 的 div 标签
         * 我们可以创建多个面板并在 JFrame 中指定位置
         * 面板中我们可以添加文本字段，按钮及其他组件。
         */
        JPanel panel = new JPanel();
        // 添加面板
        frame.add(panel);
        /*
         * 调用用户定义的方法并添加组件到面板
         */
        login(panel,frame);
        // 设置界面可见
        frame.setVisible(true);
    }

}
