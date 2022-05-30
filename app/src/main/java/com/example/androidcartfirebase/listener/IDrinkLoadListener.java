package com.example.androidcartfirebase.listener;

import com.example.androidcartfirebase.model.DrinkModel;

import java.util.List;

public interface IDrinkLoadListener {
    void onDrinkLoadSuccess(List<DrinkModel> drinkModelList);
    void onDrinkLoadFailed(String message);
}
