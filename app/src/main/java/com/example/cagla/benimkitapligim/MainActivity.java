package com.example.cagla.benimkitapligim;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.ListView;
        import android.widget.Toast;

        import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView anaListeObje;
    private String[] listeElemanlari;
    private String pozisyonAnahtari = "pozisyonAnahtari";
    //private int  imageIlk;
    private ImageView kapakresim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        anaListeObje = (ListView) findViewById(R.id.anaListe);
        listeElemanlari = new String[]{"Kuyucaklı Yusuf", "Kürk Mantolu Madonna", "Kırmızı Pazartesi", "O ve Ben", " Martı", "Bir Kavganın Tasviri",};
        ArrayAdapter<String> basitAdaptor = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id
                .text1, listeElemanlari);
        anaListeObje.setAdapter(basitAdaptor);
        anaListeObje.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, yeniaktivite.class);
                intent.putExtra(pozisyonAnahtari, position);
                startActivity(intent);
                Toast.makeText(MainActivity.this, listeElemanlari[position], Toast.LENGTH_SHORT).show();
            }
        });


        kapakresim = (ImageView) findViewById(R.id.imageIlk);

        kapakresim.setImageResource(R.drawable.kapak);




        /*


        anaListeObje.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, listeElemanlari[position], Toast.LENGTH_SHORT).show();
            }
        });

        */


    }
}