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
public class StudentActivity extends Activity {

	private ListView lvItem;
	private String[] anak_anak = new String[]{
			"Achmad Nizar Al Firdhaus","Achmad Yusuf Effendi","Adi Irwan" ,"Ahmad Asyrofi", "Atna Nindya Sari",
			"Bagas Eka Prasetyo", "Bayu Pangeling","Bisma Fajar Nur Asidiq","Difa Silviani",
			"Fandi Krismantoro" ,"Galang Pradana Aris Putranto","Irfan Abdul Hafiz Al-Rasyid","Krystianta Oktakusuma" ,"Kurniawan Deaprilianto Pratama", "Lazuardi Julian Akbar",
			"Muhammad Saiful Arief", "Maelan Bayu Kristianto","Maulana Malik Attamami","Maulana Santaka Yasin",
			"Mochammad Joko Setiawan", "Mochammad Abdurrochman Wahyu" ,"Muhammad Ghofur Bahtiar","Muhammad Andika fatchurahman","Muhammad Chasan Virmansyah" ,"Muhammad Rokhimin Wahid", "Muhammad Yusuf Bachtiar",
			"Nova Dewangga Rusmaningsasi", "Novaldo Lamba Hendiansyah","Nur Hidayat","Ody Rusdianto",
			"Renas Madya Pradana", "Riki Ardianto", "Slamet Aditia","Sondi Vio Giasmudi","Sultan Jazirah Arasy Prila",
			"Yanuar Romadhon"};


	private static Context con;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.student);

		lvItem = (ListView) findViewById(R.id.listView);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(StudentActivity.this, android.R.layout.simple_list_item_2, android.R.id.text2, anak_anak);

		lvItem.setAdapter(adapter);

		lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Toast.makeText(StudentActivity.this, "Informasi Tentang "+anak_anak[position]+" : Tidak Ada", Toast.LENGTH_LONG).show();

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
