package com.dxctraining.ui;

import com.dxctraining.config.JavaConfig;

public class ItemMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(JavaConfig.class);
        context.refresh();

    }
}
