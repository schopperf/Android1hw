package at.fh.swengb.android1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView resultView;



    //git test

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText)findViewById(R.id.editText);
        resultView = (TextView)findViewById(R.id.resultView);

    }

    public void doJump(View view) {
        String num1String = editText.getText().toString();
        double height=0;

        try {
            height=Double.parseDouble(num1String);
            double result = Math.sqrt((2*height/9.81));
            resultView.setText(" Jumping from "+num1String+" meter takes "+result+" sec ");
        } catch (NumberFormatException e) {
            resultView.setText("Wrong Input");
            e.printStackTrace();
        }



    }
}
