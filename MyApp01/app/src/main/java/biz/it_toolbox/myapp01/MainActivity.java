package biz.it_toolbox.myapp01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeLabel(View view) {
        TextView tv = findViewById(R.id.txtHello);
        Button bt = findViewById(R.id.btnPush);
        if(bt.getText()==getString(R.string.button_text1)) {
            tv.setText(getString(R.string.textview_text2));
            bt.setText(getString(R.string.button_text2));
        }else{
            tv.setText(getString(R.string.textview_text3));
            bt.setText(getString(R.string.button_text1));
        }
    }

}
