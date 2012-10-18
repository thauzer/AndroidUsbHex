package si.hauzer.usbhex;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

import android.os.Bundle;
import android.app.Activity;
import android.text.InputFilter;
import android.text.InputType;
import android.view.Menu;
import android.widget.EditText;

public class MainActivity extends Activity {

	private static String TAG = "UsbHex"; 
	private EditText hexInput;
	private Socket socket;
	private PrintWriter out;
	private BufferedReader in;
	
	HexFilter hexFilter = new HexFilter();
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hexInput = (EditText) findViewById(R.id.hex_input);
        hexInput.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        hexInput.setFilters(new InputFilter[] {hexFilter});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
