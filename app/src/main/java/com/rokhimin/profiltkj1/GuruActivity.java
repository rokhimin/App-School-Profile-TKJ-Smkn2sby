package com.rokhimin.profiltkj1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

//Create Rokhimin Whd for learn (19-01-2017)
public class GuruActivity extends Activity {

	private ListView lvItem;
	private String[] guruku = new String[]{
			"Drs. Mochamad Jarwanto, S.ST","Deki Harbiyanto, S.Kom","Muh. Arifin, S.Pd, S.ST" ,"Wulandari Desiningtyas S.Pd"};


	private static Context con;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.guru);

		lvItem = (ListView) findViewById(R.id.listView2);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(GuruActivity.this, android.R.layout.simple_list_item_2, android.R.id.text2, guruku);

		lvItem.setAdapter(adapter);

		lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Toast.makeText(GuruActivity.this, "Informasi Tentang "+guruku[position]+" : Tidak Ada", Toast.LENGTH_LONG).show();

			}
		});
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
