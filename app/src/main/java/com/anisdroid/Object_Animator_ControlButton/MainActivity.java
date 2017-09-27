package com.anisdroid.Object_Animator_ControlButton;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.animation.*;
import android.view.*;

public class MainActivity extends Activity 
{
	ImageView iii;
	ObjectAnimator anim;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		iii = (ImageView) findViewById(R.id.img);
		
		anim = ObjectAnimator.ofFloat(iii,View.ROTATION,0,360);
		anim.setDuration(2000);
		anim.setRepeatCount(5);
		anim.setRepeatMode(ObjectAnimator.RESTART);
		
    }
	
	public void start_button(View v){
		anim.start();
	}
	
	public void end_button(View v){
		anim.end();
	}
	
	public void cancel_button(View v){
		anim.cancel();
	}
	
	public void pause_button(View v){
		anim.pause();
	}
	
	public void resume_button(View v){
		anim.resume();
	}
}
