package ro.pub.cs.systems.eim.lab03.phonedialer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class PhoneDialerActivity extends AppCompatActivity {

    // variables
    private EditText phoneNumber;
    private Button genericButton;
    int[] array = {R.id.button0, R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5,
            R.id.button6, R.id.button7, R.id.button8, R.id.button9, R.id.buttons, R.id.buttond,
    };
    private ImageButton delete;
    private ImageButton call;
    private ImageButton endCall;

    // listeners
    private GenericButtonListener genericButtonL = new GenericButtonListener();
    private class GenericButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            phoneNumber.setText(phoneNumber.getText().toString() + ((Button)view).getText().toString());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);

        // associate button with layout id
        phoneNumber = (EditText)findViewById(R.id.editText);
        for (int i = 0; i < 12; i++){
            int name = array[i];
            genericButton = (Button)findViewById(name);
            genericButton.setOnClickListener(new GenericButtonListener());

        }
        delete = (ImageButton)findViewById(R.id.delete);
        call = (ImageButton)findViewById(R.id.call);
        endCall = (ImageButton)findViewById(R.id.end);
    }



}
