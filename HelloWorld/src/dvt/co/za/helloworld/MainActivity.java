package dvt.co.za.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {
	private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText)findViewById(R.id.editText1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void onClick(View view){
    	switch(view.getId()){
    	case R.id.button1:
    		float inputValue = Float.parseFloat(text.getText().toString());
    		
    		RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioGroup1);
    		if(radioGroup.getCheckedRadioButtonId() == R.id.radio0){
    			Toast.makeText(this, convertToCelsius(inputValue), Toast.LENGTH_SHORT).show();
    		}
    		else{
    			Toast.makeText(this, convertToFarenheight(inputValue), Toast.LENGTH_SHORT).show();
    		}
    		break;
    	default:
    		break;
    	}
    }
    
	private String convertToFarenheight(float inputValue){
		return (inputValue + 9)+"";
		
	}
	private String convertToCelsius(float inputValue){
		return (inputValue - 10)+"";
	}
    
}
