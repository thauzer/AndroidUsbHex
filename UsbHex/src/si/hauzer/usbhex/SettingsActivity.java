package si.hauzer.usbhex;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SettingsActivity extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
	}
	
	public void startMainActivity(View view) {
		Intent intent = new Intent(view.getContext(), MainActivity.class);
		startActivity(intent);
	}
}
