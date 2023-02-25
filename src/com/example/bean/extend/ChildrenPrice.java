package com.example.bean.extend;

import com.example.bean.Price;

public class ChildrenPrice extends Price {
    @Override
    public double getCharge(int days) {
        double price = 1.5;
        if (days>3){
            price+=(days-3)*1.5;
        }
        return price;
    }
}
