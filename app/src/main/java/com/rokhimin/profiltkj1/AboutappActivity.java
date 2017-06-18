package com.rokhimin.profiltkj1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

//Create Rokhimin Whd for learn (19-01-2017)
public class AboutappActivity extends Activity {

	private static Context con;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.aboutapp);
		AboutappActivity.con = this;

	}


	public void btnDev(View v) {

		Intent next = new Intent(con, DeveloperActivity.class);
		next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(next);
	}

	public void btnLicense(View v) {

		Intent next = new Intent(con, LicenseActivity.class);
		next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(next);
	}

	public void btnReport(View v) {

		Intent next = new Intent(con, Report.class);
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