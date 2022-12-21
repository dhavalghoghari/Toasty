package com.pro.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class BaseToast {

    public static void toast(Context context, String value){
        Toast.makeText(context, value, Toast.LENGTH_SHORT).show();
    }

}
