package com.tensorware.toaster;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Raghu N Sharman on 30-04-2022 at 16:03.
 */
public class ToastMe {
    public static void simpleToast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
