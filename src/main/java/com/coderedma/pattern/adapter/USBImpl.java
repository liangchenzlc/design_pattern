package com.coderedma.pattern.adapter;

/**
 * @Author coderedma
 * @Desc usb接口的线
 * @createTime 2024/7/25 10:12
 * @since 1.0.0
 */
public class USBImpl implements USB {

    @Override
    public String provideUsbData() {
        System.out.println("经过usb传输数据");
        return "usb的数据";
    }
}
