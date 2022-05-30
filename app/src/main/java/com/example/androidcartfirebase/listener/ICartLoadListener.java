package com.example.androidcartfirebase.listener;

import com.example.androidcartfirebase.model.CartModel;
import com.example.androidcartfirebase.model.DrinkModel;

import java.util.List;

public interface ICartLoadListener {
    void onCartLoadSuccess(List<CartModel> cartModelList);
    void onCartLoadFailed(String message);
}
