package science.aperture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText val1, val2;
    private TextView result;
    private RadioButton rsuma, rresta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val1 = (EditText) findViewById(R.id.val1);
        val2 = (EditText) findViewById(R.id.val2);
        result = (TextView) findViewById(R.id.result);
        rsuma = (RadioButton) findViewById(R.id.rsuma);
        rresta = (RadioButton) findViewById(R.id.rresta);

    }


    public void calculare(){
        String x = val1.getText().toString();
        String y = val2.getText().toString();
        if (rsuma.isChecked()){

            int z = Integer.parseInt(x) + Integer.parseInt(y);
            result.setText(z);

        }
        if(rresta.isChecked()){

            int z = Integer.parseInt(x) - Integer.parseInt(y);
            result.setText(z);
        }
    }

}




