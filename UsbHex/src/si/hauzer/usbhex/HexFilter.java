package si.hauzer.usbhex;

import android.text.InputFilter;
import android.text.Spanned;

public class HexFilter implements InputFilter {

	@Override
	public CharSequence filter(CharSequence source, int start, int end,
			Spanned dest, int dstart, int dend) {
		if (source.length() > 44) return "";
		
		String hexa = "0123456789ABCDEFabcdef";
		if (source.length() == 1)
			if (!hexa.contains(source)) return "";
		
		String tmp = dest.toString().replace(" ","");
		if (tmp.length() != 0 && tmp.length() % 2 == 0) 
			return " " + source.toString();
		
		return null;
	}

}
