package home.android1.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView result;
    private EditText temperature;
    private Button button;
    private RadioGroup radioGroup;
    private RadioButton celsius;
    private RadioButton fahrenheit;


    private double convertTemperature(double user_temperature, int radio_button_id) {
        if (radio_button_id == R.id.celsius_radio_button)
            return (user_temperature * 1.8 + 32);
        return (user_temperature - 32) / 1.8;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result_text_view);
        temperature = findViewById(R.id.temperature_edittext);
        button = findViewById(R.id.button);
        radioGroup = findViewById(R.id.user_choice_radio_group);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checked_button_id = radioGroup.getCheckedRadioButtonId();
                String user_input = temperature.getText().toString();
                if (!user_input.isEmpty()) {
                    double user_temperature = Double.parseDouble(temperature.getText().toString());
                    result.setText(String.format("%.1f", convertTemperature(user_temperature, checked_button_id)));
                }
            }
        });
    }
}