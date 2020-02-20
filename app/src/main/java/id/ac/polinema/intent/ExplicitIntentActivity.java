package id.ac.polinema.intent;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExplicitIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
    }

    public void clickSubmit(View view) {
        EditText teksedit = (EditText) findViewById(R.id.input_name);
        TextView teks = (TextView) findViewById(R.id.text_output);
        teks.setText("Hello " + teksedit.getText() + ", Congratulations!");
    }
}
