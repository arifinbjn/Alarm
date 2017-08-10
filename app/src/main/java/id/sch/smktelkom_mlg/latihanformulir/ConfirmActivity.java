package id.sch.smktelkom_mlg.latihanformulir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class ConfirmActivity extends AppCompatActivity {
    private TextView isi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        isi = (TextView) findViewById(R.id.isi);


        Intent intent = getIntent();
        String Pesanku = intent.getStringExtra(MainActivity.Pesan);
        isi.setText(Pesanku);
        Toast.makeText(this, Pesanku, Toast.LENGTH_LONG).show();

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, Pesanku);
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
        // startActivity(sendIntent);
        //startActivity(Intent.createChooser(sendIntent.putExtra(p)));

    }
}
