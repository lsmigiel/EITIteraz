package elka.pw.edu.pl.eititeraz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onSeeFullListClick(View view) {

        Intent seeFullListIntent = new Intent(this, FullListActivity.class);

        final int result = 1; //sygnal jakis

        seeFullListIntent.putExtra("callingActivity", "MainActivity");
        startActivityForResult(seeFullListIntent, result);
        Log.w("MainActivity", "HEHEHEHEEHHE");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView dumbMessage = (TextView) findViewById(R.id.dumb_message_TV);

        String responseBack = data.getStringExtra("DumbMessage");
        dumbMessage.append(responseBack);
    }
}
