package home.android1.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView result;
    private EditText temperature;
    private Button button;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result_text_view);
        temperature = findViewById(R.id.temperature_edittext_view);
        button = findViewById(R.id.button);
        radioGroup = findViewById(R.id.user_choice_radioGroup);

    }
}