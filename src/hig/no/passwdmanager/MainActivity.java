package hig.no.passwdmanager;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private ImageView pic;
	private TextView id;
	private TextView web1;
	private TextView web2;
	private TextView web3;
	private TextView web4;
	private TextView com;

	private TextView bac;
	private TextView eac;
	private TextView aa;
	private TextView pa;
	
	private void initial() {
		
		pic = (ImageView) findViewById(R.id.pic);

		id = (TextView) findViewById(R.id.id);
		web1 = (TextView) findViewById(R.id.web1);
		web2 = (TextView) findViewById(R.id.web2);
		web3 = (TextView) findViewById(R.id.web3);
		web4 = (TextView) findViewById(R.id.web4);
		com = (TextView) findViewById(R.id.com);

		bac = (TextView) findViewById(R.id.BAC);
		eac = (TextView) findViewById(R.id.EAC);
		aa = (TextView) findViewById(R.id.AA);
		pa = (TextView) findViewById(R.id.PA);

		bac.setTextColor(Color.GREEN);
		eac.setTextColor(Color.RED);
		aa.setTextColor(Color.RED);
		pa.setTextColor(Color.RED);

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initial();
		
		pic.setImageResource(R.drawable.ic_launcher);
		
		// Get the message from the intent  
        Intent intent = getIntent();  
        String ID = intent.getStringExtra("id"); 
        String WEB1 = intent.getStringExtra("web1");  
        String WEB2 = intent.getStringExtra("web2");  
        String WEB3 = intent.getStringExtra("web3");  
        String WEB4 = intent.getStringExtra("web4"); 
        
        id.setText(ID);
        web1.setText(WEB1);
        web2.setText(WEB2);
        web3.setText(WEB3);
        web4.setText(WEB4);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.about) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}


}
