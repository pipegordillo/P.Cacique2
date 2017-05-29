package col.t.pipegordillo.com.pcacique;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static col.t.pipegordillo.com.pcacique.R.layout.activity_main;

public class index extends AppCompatActivity {

    Button registrate;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        registrate = (Button) findViewById(R.id.button2);


        registrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent
                Intent intent =
                        new Intent(index.this, MainActivity.class);
                //start
                startActivity(intent);



            }
        });


    }
}
