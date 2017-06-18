package com.rokhimin.profiltkj1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

//Create Rokhimin Whd for learn (19-01-2017)
public class Blog4 extends Activity {

	private static Context con;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.blog4);
		Blog4.con = this;

	}

	public void btnHome(View v) {

		Intent next = new Intent(con, ProfilActivity.class);
		next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(next);

	}

	public void btnBack(View v) {
		finish();

	}

	public void btnSend(View v) {
		new AlertDialog.Builder(this)
				.setMessage("Sorry, Server Busy")
				.setCancelable(false)
				.setNegativeButton("Ok", null)
				.show();
	}
}