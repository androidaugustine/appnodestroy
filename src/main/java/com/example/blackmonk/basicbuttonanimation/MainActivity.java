package com.example.blackmonk.basicbuttonanimation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.animatebtn);
        Animator aim = AnimatorInflater.loadAnimator(this, R.animator.fade_out);
        aim.setTarget(btn);
        aim.start();
    }
}
