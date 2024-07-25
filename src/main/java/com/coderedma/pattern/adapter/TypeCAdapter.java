package com.coderedma.pattern.adapter;

/**
 * @Author coderedma
 * @Desc typeC的适配器
 * @createTime 2024/7/25 10:14
 * @since 1.0.0
 * 适配器模式
 */
public class TypeCAdapter implements TypeC{

    private USB usb; // 作为属性进行适配，因为用继承的话只能适配一个接口

    public TypeCAdapter(USB usb) {
        this.usb = usb;
    }

    @Override
    public String provideTypeCData() {
        String usbData = usb.provideUsbData();
        // 这里经过复杂的转换。将usb接口传输的数据转化为typeC的数据
        String typeCData = "typeC 可以识别到的数据";
        return typeCData;
    }
}
