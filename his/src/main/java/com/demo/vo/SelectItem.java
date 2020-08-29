package com.demo.vo;

//创建模板类用来承接数据
public class SelectItem<V,T> {
    //下拉列表选项的value对应elementui 的value
    private V value;
    //下拉列表选项的文本对应elementui 的label,具体的内容
    private T text;

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public T getText() {
        return text;
    }

    public void setText(T text) {
        this.text = text;
    }
}
