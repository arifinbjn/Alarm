package id.sch.smktelkom_mlg.latihanformulir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    //TextView isian;
    public static final String Pesan = "pesanku";
    private static final String TAG = "MainActivity";
    EditText editnama, editalamat, editpesan;
    RadioButton laki, perempuan;
    CheckBox basket, voly, renang;
    Button btnsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editnama = (EditText) findViewById(R.id.editnama);
        editalamat = (EditText) findViewById(R.id.editalamat);
        editpesan = (EditText) findViewById(R.id.editpesan);
        laki = (RadioButton) findViewById(R.id.laki);
        perempuan = (RadioButton) findViewById(R.id.perempuan);
        basket = (CheckBox) findViewById(R.id.basket);
        voly = (CheckBox) findViewById(R.id.voly);
        renang = (CheckBox) findViewById(R.id.renang);
        //isian = (TextView)findViewById(R.id.isian);
        btnsave = (Button) findViewById(R.id.btnsave);


        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //kirimdata();
                Intent intent = new Intent(MainActivity.this, ConfirmActivity.class);
                intent.putExtra(Pesan, "Saya Pasti Bisa");
                startActivity(intent);
            }

            /*private void kirimdata() {
            *//*    Toast.makeText(MainActivity.this, "data sudah tersimpan" +editnama.getText().toString()+""+
                        "Alamat anda adalah"+editalamat.getText().toString()+
                        "Jenis kelamin:"+laki.isChecked()+
                        "Hobi anda yaitu :" +basket.isChecked()+
                        "Pesan anda yaitu :"+editpesan.getText().toString(),Toast.LENGTH_LONG).show();
                Log.d(TAG, "Data terkirim : "+editnama.getText());
                isian.setText("data sudah tersimpan" +editnama.getText().toString()+""+
                        "Alamat anda adalah"+editalamat.getText().toString()+
                        "Jenis kelamin:"+laki.isChecked()+
                        "Hobi anda yaitu :" +basket.isChecked()+
                        "Pesan anda yaitu :"+editpesan.getText().toString());*/




         /*   }
        });*/


    /*public void kirimdata(View view) {
        //Toast.makeText(this, "data sudah tersimpan", Toast.LENGTH_LONG).show();
        //Log.i(TAG, "data telah terkirim");
        Toast.makeText(this, "data sudah tersimpan" +editnama.getText().toString()+""+
                "Alamat anda adalah"+editalamat.getText().toString()+
                "Jenis kelamin:"+laki.isChecked()+
                "Hobi anda yaitu :" +basket.isChecked()+
                "Pesan anda yaitu :"+editpesan.getText().toString(),Toast.LENGTH_LONG).show();
        Log.i(TAG, "Terimakasih");*/


        });
    }
}
