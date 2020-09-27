package com.lots;

import com.lots.config.Config;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static com.lots.MenuController.menu;


/**
 * @name: loginController
 * @author: lots
 * @date: 2020/9/24 14:27
 */
public class LoginController  extends JFrame{

    static void login(final JPanel panel,final JFrame frame) {

        /* 布局部分我们这边不多做介绍
         * 这边设置布局为 null
         */
        panel.setLayout(null);

        // 创建 JLabel
        JLabel userLabel = new JLabel("用户名：");
        /* 这个方法定义了组件的位置。
         * setBounds(x, y, width, height)
         * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
         */
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        /*
         * 创建文本域用于用户输入
         */
        final JTextField username = new JTextField(20);
        username.setBounds(100,20,165,25);
        panel.add(username);

        // 输入密码的文本域
        final JLabel passwordLabel = new JLabel("密码：");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        /*
         *这个类似用于输入的文本域
         * 但是输入的信息会以点号代替，用于包含密码的安全性
         */
        final JPasswordField password = new JPasswordField(20);
        password.setBounds(100,50,165,25);
        panel.add(password);

        // 创建登录按钮
        final JButton loginButton = new JButton("login");
        // 为登录按钮使用绿色皮肤
        loginButton.setUI(new BEButtonUI(). setNormalColor(BEButtonUI.NormalColor.green));
        //获取焦点,为login添加回车事件
        panel.getRootPane().setDefaultButton(loginButton);
        loginButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent event) {
                if (KeyEvent.getKeyText(event.getKeyCode()).compareToIgnoreCase(
                        "Enter") == 0) {
                    loginButton.doClick();
                }
            }
        });
        //login登录验证
        loginButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Config config = new Config();

                if(username.getText().trim().length()==0||new String(password.getPassword()).trim().length()==0){
                    JOptionPane.showMessageDialog(null, "用户名密码不允许为空");
                    return;
                }
                if(username.getText().trim().equals(config.getUSERNAME())&&new String(password.getPassword()).trim().equals(config.getPASSWORD())){
                    JOptionPane.showMessageDialog(null, "登录成功");
                    panel.isDisplayable();
                    menu(panel,  frame);
                }
                else{
                    JOptionPane.showMessageDialog(null, "用户名或密码错误");
                }
            }
        });
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

    }


}
