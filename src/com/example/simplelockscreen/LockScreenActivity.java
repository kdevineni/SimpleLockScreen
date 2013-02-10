package com.example.simplelockscreen;

import com.example.simplelockscreen.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class LockScreenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); // Ÿ��Ʋȭ�鵵 ���� ��üȭ������ ����
		getWindow().addFlags( WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED |
							  WindowManager.LayoutParams.FLAG_FULLSCREEN |
							  WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON |
							  WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON |
							  WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD);
		setContentView(R.layout.activity_lock_screen);

		Button buttonUnlock = (Button) findViewById(R.id.button_unlock);
		buttonUnlock.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "����ũ�� ����", Toast.LENGTH_SHORT).show();
				finish();
			}
		});
	}

	@Override
	public void onBackPressed() {
		return; // BackŰ ����ȭ
	}
}