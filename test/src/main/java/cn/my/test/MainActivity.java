package cn.my.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textViewId);
    }

    public void test1(View view) {
        int a = 10;
        int b = 20;
        int result = cn.my.core.MathUtils.add(a, b);
        String text = "MathUtils.add call return:" + result;
        tv.setText(text);
    }

    public void test2(View view) {
        int a = 10;
        int b = 20;
        cn.my.core2.MathUtils mathUtils = new cn.my.core2.MathUtils();
        int result = mathUtils.mul_java(a, b);
        String text = "test 2 mul return:" + result;
        tv.setText(text);
    }

    public void test3(View view) {
        int a = 10;
        int b = 20;
        int result = cn.my.core3.MathUtils.add(a, b);
        String text = "test 2 mul return:" + result;
        tv.setText(text);
    }
}