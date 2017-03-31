package com.rokhimin.profiltkj1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import java.util.Timer;
import java.util.TimerTask;
import android.app.AlertDialog;
import android.content.DialogInterface;

//Create Rokhimin Whd for learn (19-01-2017)
public class ProfilActivity extends Activity {
	/** Called when the activity is first created. */
	public int currentimageindex = 0;
	Timer timer;
	TimerTask task;
	ImageView slidingimage;
	private static Context con;
	
	//Add or Delete your slideshow images from here 
	
	private int[] IMAGE_IDS = { R.drawable.slide1, R.drawable.slide2,
			R.drawable.slide3, R.drawable.slide4 };

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.home);
		final Handler mHandler = new Handler();
		ProfilActivity.con = this;
		// Create runnable for posting
		final Runnable mUpdateResults = new Runnable() {
			public void run() {

				AnimateandSlideShow();

			}
		};

		int delay = 1000; // delay for 1 sec.

		int period = 8000; // repeat every 4 sec.

		Timer timer = new Timer();

		timer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				mHandler.post(mUpdateResults);

			}

		}, delay, period);

	}

	public void onClick(View v) {

		finish();
		android.os.Process.killProcess(android.os.Process.myPid());
	}

	/**
	 * Helper method to start the animation on the splash screen
	 */
	private void AnimateandSlideShow() {

		slidingimage = (ImageView) findViewById(R.id.slideShow);
		try {
			slidingimage.setImageResource(IMAGE_IDS[currentimageindex
					% IMAGE_IDS.length]);
		} catch (Exception e) {
			// TODO: handle exception
		}
		currentimageindex++;

		Animation rotateimage = AnimationUtils.loadAnimation(this,
				R.anim.custom_anim);

		slidingimage.startAnimation(rotateimage);

	}

	public void btnContact(View v) {

		Intent next = new Intent(con, ContactUsActivity.class);
		next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(next);

	}

	public void btnBlog(View v) {

		Intent next = new Intent(con, BlogActivity.class);
		next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(next);

	}

	public void btnHistory(View v) {

		Intent next = new Intent(con, HistoryActivity.class);
		next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(next);

	}

	public void btnStudent(View v) {

		Intent next = new Intent(con, StudentActivity.class);
		next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(next);
	}

	public void btnGuru(View v) {

		Intent next = new Intent(con, GuruActivity.class);
		next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(next);
	}

	public void btnGallery(View v) {

		Intent next = new Intent(con, GalleryActivity.class);
		next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(next);
	}

	public void btnDiscus(View v) {

		Intent next = new Intent(con, DiscussionActivity.class);
		next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(next);
	}

	public void btnAboutapp(View v) {

		Intent next = new Intent(con, AboutappActivity.class);
		next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(next);
	}

	public void btnFacebook(View v) {

		Intent next = new Intent(con, FacebookActivity.class);
		next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(next);
	}

	public void btnTwitter(View v) {

		Intent next = new Intent(con, TwitterActivity.class);
		next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(next);
	}

	public void btnIG(View v) {

		Intent next = new Intent(con, InstagramActivity.class);
		next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(next);
	}

	public void btnExt(View v) {
		new AlertDialog.Builder(this)
				.setMessage("Are you sure for exit?")
				.setCancelable(false)
				.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						ProfilActivity.this.finish();
					}
				})
				.setNegativeButton("No", null)
				.show();
	}


	}