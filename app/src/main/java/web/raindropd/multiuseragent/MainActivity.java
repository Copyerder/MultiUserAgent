package web.raindropd.multiuseragent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
		btn.setOnClickListener(new View.OnClickListener(){
        @Override
            public void onClick(View arg0){
                Intent in = new Intent();
                in.setClassName("com.android.settings", "com.android.settings.Settings$UserSettingsActivity");
                startActivity(in);
             }
        });
    }
}