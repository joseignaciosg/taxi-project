package cab.app.activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;

public class OriginActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Parse.initialize(this, "B8GkDeXnCf2bTQTI6UAaUnGYjmLDeRdXL7riIL0d", "ZFxMvUbjqSTkhP5F9IGcZjfYKu8FYAP4vYMozqfk");
		
		ParseObject testObject = new ParseObject("Country");
		testObject.put("name", "Argentina");
		testObject.saveInBackground(new SaveCallback() {
			
			@Override
			public void done(ParseException e) {
				if (e == null) {
					Log.d("WORKS", "OH YEAH");
				} else {
					Log.d("PARSE", e.toString());
				}
				
			}
		});
	}
}
