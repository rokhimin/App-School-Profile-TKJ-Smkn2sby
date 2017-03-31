package com.rokhimin.profiltkj1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

//Create Rokhimin Whd for learn (19-01-2017)
public class BlogActivity extends Activity {

	private static Context con;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.blog);
		BlogActivity.con = this;

	}

	public void btnBlog1(View v) {

		Intent next = new Intent(con, Blog1.class);
		next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(next);

	}

	public void btnBlog2(View v) {

		Intent next = new Intent(con, Blog2.class);
		next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(next);

	}
	
	public void btnBlog3(View v) {

		Intent next = new Intent(con, Blog3.class);
		next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(next);

	}
	
	public void btnBlog4(View v) {

		Intent next = new Intent(con, Blog4.class);
		next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(next);

	}
	
	public void btnBlog5(View v) {

		Intent next = new Intent(con, Blog5.class);
		next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(next);

	}
	
	public void btnBlog6(View v) {

		Intent next = new Intent(con, Blog6.class);
		next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(next);

	}
	
	public void btnBlog7(View v) {

		Intent next = new Intent(con, Blog7.class);
		next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(next);

	}

	public void btnHome(View v) {

		Intent next = new Intent(con, ProfilActivity.class);
		next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(next);

	}

	public void btnBack(View v) {
		finish();

	}
}