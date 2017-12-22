package elka.pw.edu.pl.eititeraz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by luksmi on 12/22/17.
 */

public class FullListActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.current_classes);

        Intent activityThatCalled = getIntent();
        String callingActivity = activityThatCalled.getExtras().getString("callingActivity");

        TextView callingActivityMessage = (TextView) findViewById(R.id.who_called_current_classes_text_view);
        callingActivityMessage.append(" "+callingActivity);
    }

    public void onBackToMap(View view) {
        EditText dumbMessageET = (EditText) findViewById(R.id.dumb_message_ET);
        String message = String.valueOf(dumbMessageET.getText());

        Intent goingBackToMainActivity = new Intent();
        goingBackToMainActivity.putExtra("DumbMessage", message);
        setResult(RESULT_OK, goingBackToMainActivity);
        finish();
    }
}
