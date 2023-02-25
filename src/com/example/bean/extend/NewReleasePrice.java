package com.example.bean.extend;

import com.example.bean.Price;

public class NewReleasePrice extends Price {
    @Override
    public double getCharge(int days) {
        return days*3;
    }

    @Override
    public int getFrequentRenterPoints(int days) {
        if (days>1){
            return 2;
        }
        return 1;
    }
}
