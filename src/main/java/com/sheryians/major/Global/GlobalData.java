package com.sheryians.major.Global;

import com.sheryians.major.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {

    public static List<Product> cart;

    static {
        cart =new ArrayList<Product>();
    }
}
