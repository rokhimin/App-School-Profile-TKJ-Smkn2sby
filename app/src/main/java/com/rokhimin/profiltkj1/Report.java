package com.rokhimin.profiltkj1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

//Create Rokhimin Whd for learn (19-01-2017)
public class Report extends Activity {
	Button buttonsend;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.report);

		buttonsend = (Button)findViewById(R.id.buttonsend);
		buttonsend.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Intent.ACTION_SEND);
				i.setType("message/rfc822");
				i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"rokhim.whd@gmail.com"});
				i.putExtra(Intent.EXTRA_SUBJECT, "Judul");
				i.putExtra(Intent.EXTRA_TEXT   , "Isi pesan");
				try {
					startActivity(Intent.createChooser(i, "Silahkan pilih aplikasi email defaultmu..."));
				} catch (android.content.ActivityNotFoundException ex) {
					Toast.makeText(Report.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
				}
			}
		});

	}


	public void btnBack(View v) {
		finish();

	}

}