package com.example.cagla.benimkitapligim;

        import android.content.Intent;
        import android.net.Uri;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;

public class yeniaktivite extends AppCompatActivity {

    private  String[] url;
    private Button ratebutton;
    private TextView detayText;
    private String[] detayListe;
    private String pozisyonAnahtari = "pozisyonAnahtari";
    private int detayPozisyon;

    private int[] resim;
    private ImageView gorsel;

    private TextView baslikText;
    private String[] baslikliste;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeniaktivite);




        url=new String[]{
                "http://www.dr.com.tr/Kitap/Kuyucakli-Yusuf/Sabahattin-Ali/Edebiyat/Roman/Turkiye-Roman/urunno=0000000052460?gclid=Cj0KEQiAvNrBBRDe3IOwzLn6_O4BEiQAmbK-DtP4dV05GZAbR6-DjFKH5nYmi9wyUw83SEr-LgREozcaAmP58P8HAQ",
                "http://www.dr.com.tr/Kitap/Kurk-Mantolu-Madonna/Sabahattin-Ali/Edebiyat/Roman/Turkiye-Roman/urunno=0000000058245?gclid=Cj0KEQiAvNrBBRDe3IOwzLn6_O4BEiQAmbK-DvK1OzPxe89As1Abbge_y9cJvm8q4G5yLZyh7xVDt7IaAiZy8P8HAQ",
                "http://www.dr.com.tr/Kitap/Kirmizi-Pazartesi/Gabriel-Garcia-Marquez/Edebiyat/Roman/Dunya-Roman/urunno=0000000064101",
                "http://www.kitapyurdu.com/kitap/o-ve-ben-kod6/1075.html",
                "http://www.dr.com.tr/Kitap/Marti-Jonathan-Livingston/Richard-Bach/Edebiyat/Roman/Dunya-Roman/urunno=0000000056587",
                "http://www.dr.com.tr/ekitap/bir-kavgann-tasviri",

        };
        ratebutton = (Button) findViewById(R.id.ratebutton);
        ratebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (detayPozisyon == -1) {
                    Toast.makeText(yeniaktivite.this, "Hata", Toast.LENGTH_LONG).show();
                } else {
                    detayText.setText(url[detayPozisyon]);
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url[detayPozisyon]));
                    startActivity(i);

                }
            }});




        gorsel = (ImageView) findViewById(R.id.resim);
        resim = new int[]{
                R.drawable.kuyucakliyusuf,
                R.drawable.kurkmantolumadonna,
                R.drawable.kirmizipazartesi,
                R.drawable.oveben,
                R.drawable.marti,
                R.drawable.kafka,
        };
        detayPozisyon = getIntent().getIntExtra(pozisyonAnahtari, -1);
        if (detayPozisyon == -1) {
            Toast.makeText(yeniaktivite.this, "Hata Var", Toast.LENGTH_LONG).show();
        } else {
            gorsel.setImageResource(resim[detayPozisyon]);


            baslikText = (TextView) findViewById(R.id.textViewbaslik);
            baslikliste = new String[]{"Kuyucaklı Yusuf" + "\n " + "(Sabahattin Ali)", "Kürk Mantolu Madonna"+"\n"+"(Sabahattin Ali)", "Kırmızı Pazartesi"+"\n"+"(Gabriel García Márquez)", "O ve Ben"+"\n"+"Necip Fazıl Kısakürek\n", "Martı"+"\n"+"Richard Bach ","Bir Kavganın Tasviri"+"\n"+" Franz Kafka",};
            detayPozisyon = getIntent().getIntExtra(pozisyonAnahtari, -1);
            if (detayPozisyon == -1) {
                Toast.makeText(yeniaktivite.this, "Hata Var", Toast.LENGTH_LONG).show();
            } else {
                baslikText.setText(baslikliste[detayPozisyon]);
            }


            detayText = (TextView) findViewById(R.id.detayTextView);
            detayListe = new String[]{"1937'de yayınlanan Sabahattin Ali'nin bu romanı, Türk edebiyatında öncü bir role sahiptir. Roman, Türkiye'nin o döneme kadar ifade edilmemiş problemlerini dile getirmektedir. Kuyucaklı Yusuf'a kadar Türk romanının ana konusu Batılılışma problemidir. Kuyucaklı Yusuf'la ezilen köylü ve toplumsal yapının aksayan yönleri ilk defa içerden bir gözle ele alınmıştır.", "\"Her gün, daima öğleden sonra oraya gidiyor, koridorlardaki resimlere bakıyormuş gibi ağır ağır, fakat büyük bir sabırsızlıkla asıl hedefine varmak isteyen adımlarımı zorla zapt ederek geziniyor; rastgele gözüme çarpmış gibi önünde durduğum 'Kürk Mantolu Madonna'yı seyre dalıyor, ta kapılar kapanıncaya kadar orada bekliyordum.\"\n" +
                    "\n" +
                    "Kimi tutkular rehberimiz olur yaşam boyunca. Kollarıyla bizi sarar. Sorgulanmadan peşlerinden gideriz ve hiç pişman olmayacağımızı biliriz.\n" +
                    "\n" +
                    "Yapıtlarında insanların görünmeyen yüzlerini ortaya çıkaran Sabahattin Ali, bu kitabında güçlü bir tutkunun resmini çiziyor. Düzenin sildiği kişiliklere, yaşamın uçuculuğuna ve aşkın olanaksızlığına dair, yanıtlaması zor sorular soruyor.", "Kolombiyalı büyük yazar Gabriel García Márquez'in 1981'de yayımlanan yedinci romanı Kırmızı Pazartesi, işleneceğini herkesin bildiği, engel olmak için kimsenin bir şey yapmadığı bir namus cinayetinin öyküsü. Hem Kolombiya'da, hem de yayımlandığı dünyanın dört bir yanındaki pek çok ülkede sarsıcı etkileri olmuş bir roman. Usta yazar, çocukluğunu geçirdiği kasabada yıllar önce yaşanmış bir cinayet olayını aktarıyor. Romanın kahramanı Santiago Nasar'ın öldürüleceği daha ilk satırlardan belli. Kırmızı Pazartesi, yalnızca bir cinayetin arka planını değil, bir halkın ortak davranış biçimlerinin potresini de çiziyor. Böylece, sonuna dek ilgiyle okuyacağınız bu kısa ve ölümsüz roman, bir toplumsal ruhçözümü niteliği de kazanmış oluyor.", "Hayatını, Abdülhakîm Arvasî Hazretleri’ni «Tanıyıncaya Kadar» ve «Tanıdıktan Sonra» diye iki ana bölüme ayıran Necip Fazıl, Efendisine doğru kendisini cezbeden hâdiseleri de mânâlandırdığı otobiyografik eseri «O Ve Ben»i 1975’de şöyle takdim etmiştir: \n" +
                    "«Bu eser, dünyaya gelişimden bugüne kadar en hususî renkleri, çizgileri ve sesleriyle hayatımın hikâyesi ve asıl O’nu tanıdıktan sonra mânasını anlamaya başladığım vücut hikmetinin bende tecelli eden yakıcı ifadesidir. Bu bakımdan, kendilerini görünceye kadar malik olabildiğim birbuçuk esere nisbetle bugün 60 cildi aşan ve hepsini birden o nura borçlu bildiğim eserler arasında, şimdikini, baş köşeye oturtulması lâzım ve en mahrem iç ve dış iklimlere doğru bir belirtiş olarak takdim ederim.»\n" +
                    "Kitap, 1965 senesinde «Büyük Kapı» ismiyle yayınlanmıştır.", "Martı Jonathan Livingston, ABD'li yazar Richard Bach tarafından yazılmış, bir martının hayatını ve bize kendi sınırlarımızı aşabileceğimizi söyleyen, bir ders vermek amacıyla yazılmış masal türünde bir kitaptır. Bu kitapta Jonathan'ın hayatı, uçuş denemeleri vb. olaylar anlatılıyor. Bütün martıların amacı uçmak değil yemek bulmaktır; ama Jonathan'ın amacı uçmak ve yeni şeyler öğrenmektir. Bu nedenle martılar tarafından dışlanmıştır. 2. bölümde Jonathan iki martıyla beraber cennet sandığı yere gider.Orada Sullivan ile tanışır. Beraber uçuş çalışmaları yaparlar. Sullivan dostluğa çok önem verir. Jonathan'ın kardeşi olur. Daha sonra Chiang adlı yaşlı bir bilge martıyla tanışır. Oranın cennet olmadığını cennetin bir mekan ya da zaman dilimi olmadığını ve ancak cennete mükemmelikle ulaşabileceğini öğrenir. Chiang'ten hız dersleri alır. Chiang bir gün parlaklaşarak yok olur.","Franz Kafka’nın daha önce kitaplarda yer almamış bazı anlatılarını da içeren Ceza Kolonisinde, Can Yayınları’ndan çıkmıştı. Bu kitabın devamı niteliğindeki Bir Kavganın Tasviri, yazarın ölümünden sonra ardında bıraktığı anlatılardan oluşuyor. Böylece Kafka’nın bütün anlatıları iki kitap halinde toplanmış oluyor.\n" +
                    "\n" +
                    "Bu kitapta yer alan 34 anlatı, özünde yalnız olan bireyin, “kafkaesk” dünyanın çıkmaz sokaklarında var olma çabasını gözler önüne seriyor. Kafka, varoluşun karanlık boyutlarını, kendisinden ne önce ne de sonra hiçbir yazarın ulaşamadığı bir yoğunlukta tasvir ediyor.\n" +
                    "Kahramanları kadar yalnız olan Kafka, 20. yüzyıl edebiyatı\u00ADnı derinden etkilemiştir. Onun eserinde bireyin korkuları, umutsuzlukları, açmazları tematik bir çokkatmanlılık içinde duru bir dille işlenmiştir."};
            detayPozisyon = getIntent().getIntExtra(pozisyonAnahtari, -1);
            if (detayPozisyon == -1) {
                Toast.makeText(yeniaktivite.this, "Hata Var!", Toast.LENGTH_LONG).show();
            } else {
                detayText.setText(detayListe[detayPozisyon]);
            }

        }
    }
}


