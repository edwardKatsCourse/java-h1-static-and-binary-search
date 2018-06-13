package com.company.statics.stat_import;

import static com.company.statics.stat_import.RandomInt.*;

public class Main {
    public static void main(String[] args) {
        //with static import
        getRandom();
        rate = "S";
        //vs
        //without static import
        RandomInt.getRandom();
    }
}
