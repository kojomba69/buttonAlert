package com.sunny.www.buttonalert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClickWidget(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                Toast.makeText(view.getContext(), "Alert", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                Toast.makeText(view.getContext(), "hello", Toast.LENGTH_SHORT).show();
                break;
        }


    }
}
