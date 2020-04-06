package tictactoe.admonk.com.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText etName;
    EditText etName2;
    Button bDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        etName = (EditText) findViewById(R.id.etname);
        etName2= (EditText) findViewById(R.id.etname2);
        bDone = (Button) findViewById(R.id.bDone);

        bDone.setOnClickListener(new View.OnClickListener() {
                                     public void onClick(View view) {
                                         String name = etName.getText().toString();
                                            String nam=etName2.getText().toString();
                                         Intent i = new Intent(Main2Activity.this, MainActivity.class);
                                         i.putExtra("NAME", name);
                                         i.putExtra("NAME2",nam);
                                         startActivity(i);
                                     }
                                 }
        );
    }
}
