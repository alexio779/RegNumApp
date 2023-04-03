package com.example.regnum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class MainActivity extends AppCompatActivity {

    private Button main_btn;
    private TextView result, result2, result3, rusWord;
    private EditText user_field;
    private ImageView img, img2;
    private final static String FILE_NAME = "regnums.txt";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        result = findViewById(R.id.out_rez);
        main_btn = findViewById(R.id.ok_button);
        user_field = findViewById(R.id.enterNum);
        result2 = findViewById(R.id.NUM);
        result3 = findViewById(R.id.FedOkr);
        img2 = findViewById(R.id.FlagOfRussia);
        img = findViewById(R.id.regionFlag);
        rusWord = findViewById(R.id.RUS);

        main_btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                if (user_field.getText().toString().trim().equals(""))
                    Toast.makeText(MainActivity.this, R.string.Err1,
                            Toast.LENGTH_SHORT).show();
                else {
                    String str = user_field.getText().toString();
                    try {
                        InputStream is = getResources().getAssets().open("regnums.txt");
                        InputStreamReader isr = new InputStreamReader(is,"utf-8");

                        BufferedReader buffer = new BufferedReader(isr);
                        String lines;

                        int c = 0;
                        while ((lines = buffer.readLine()) != null) {
                            int j = 4;
                            String[] arr = new String[j];

                            String tmp = lines;
                            String[] parts = tmp.split(" ");
                            String FirstOne = parts[0];
                            arr[0] = FirstOne;

                            String[] parts2 = tmp.split(" ");
                            String MiddleOne = parts[1].replace('_', ' ');
                            arr[1] = MiddleOne;

                            String[] parts3 = tmp.split(" ");
                            String LastOne = parts[2].replace('_', ' ');
                            arr[2] = LastOne;

                            String[] parts4 = tmp.split(" ");
                            String FOne = parts[3].replace('_', ' ');
                            arr[3] = FOne;

                            if (str.equals(arr[0])) {
                                result.setText(arr[1]);
                                result2.setText(str);
                                result3.setText(arr[2]);
                                img2.setImageResource(R.drawable.russia2);
                                rusWord.setText("RUS");
                                    String dra = arr[3].toString();

                                    switch(dra){
                                        case "mos":
                                            img.setImageResource(R.drawable.moscow);
                                            break;
                                        case "ukrain-don":
                                            img.setImageResource(R.drawable.don);
                                            break;
                                        case "ukrain-zaporozh":
                                            img.setImageResource(R.drawable.zap);
                                            break;
                                        case "ukrain-lnr":
                                            img.setImageResource(R.drawable.lug);
                                            break;
                                        case "chuvash":
                                            img.setImageResource(R.drawable.chuvash);
                                            break;
                                        case "adigeya":
                                            img.setImageResource(R.drawable.adigeya);
                                            break;
                                        case "altaikrai":
                                            img.setImageResource(R.drawable.altaikrai);
                                            break;
                                        case "altairep":
                                            img.setImageResource(R.drawable.altairep);
                                            break;
                                        case "amur":
                                            img.setImageResource(R.drawable.amur);
                                            break;
                                        case "arhan":
                                            img.setImageResource(R.drawable.arhan);
                                            break;
                                        case "astra":
                                            img.setImageResource(R.drawable.astra);
                                            break;
                                        case "belgor":
                                            img.setImageResource(R.drawable.belgor);
                                            break;
                                        case "bash":
                                            img.setImageResource(R.drawable.bosh);
                                            break;
                                        case "bryansk":
                                            img.setImageResource(R.drawable.bryansk);
                                            break;
                                        case "buryatia":
                                            img.setImageResource(R.drawable.buryatia);
                                            break;
                                        case "komi":
                                            img.setImageResource(R.drawable.komi);
                                            break;
                                        case "chechen":
                                            img.setImageResource(R.drawable.chechen);
                                            break;
                                        case "chelya":
                                            img.setImageResource(R.drawable.chelya);
                                            break;
                                        case "chukot":
                                            img.setImageResource(R.drawable.chukot);
                                            break;
                                        case "dagestan":
                                            img.setImageResource(R.drawable.dagestan);
                                            break;
                                        case "habar":
                                            img.setImageResource(R.drawable.habar);
                                            break;
                                        case "hakasia":
                                            img.setImageResource(R.drawable.hakasia);
                                            break;
                                        case "hantiman":
                                            img.setImageResource(R.drawable.hantiman);
                                            break;
                                        case "ingush":
                                            img.setImageResource(R.drawable.ingush);
                                            break;
                                        case "irku":
                                            img.setImageResource(R.drawable.irku);
                                            break;
                                        case "ivan":
                                            img.setImageResource(R.drawable.ivan);
                                            break;
                                        case "jew":
                                            img.setImageResource(R.drawable.jew);
                                            break;
                                        case "kabar":
                                            img.setImageResource(R.drawable.kabar);
                                            break;
                                        case "kalin":
                                            img.setImageResource(R.drawable.kalin);
                                            break;
                                        case "kalmy":
                                            img.setImageResource(R.drawable.kalmy);
                                            break;
                                        case "kaluga":
                                            img.setImageResource(R.drawable.kaluga);
                                            break;
                                        case "kamcha":
                                            img.setImageResource(R.drawable.kamcha);
                                            break;
                                        case "karachi":
                                            img.setImageResource(R.drawable.karachi);
                                            break;
                                        case "karelia":
                                            img.setImageResource(R.drawable.karelia);
                                            break;
                                        case "kemer":
                                            img.setImageResource(R.drawable.kemer);
                                            break;
                                        case "kirov":
                                            img.setImageResource(R.drawable.kirov);
                                            break;
                                        case "kostrom":
                                            img.setImageResource(R.drawable.kostrom);
                                            break;
                                        case "krasnodar":
                                            img.setImageResource(R.drawable.krasnodar);
                                            break;
                                        case "krasnoyarsk":
                                            img.setImageResource(R.drawable.krasnoyarsk);
                                            break;
                                        case "krim":
                                            img.setImageResource(R.drawable.krim);
                                            break;
                                        case "kurga":
                                            img.setImageResource(R.drawable.kurga);
                                            break;
                                        case "kurskaya":
                                            img.setImageResource(R.drawable.kursk);
                                            break;
                                        case "lenin":
                                            img.setImageResource(R.drawable.lenin);
                                            break;
                                        case "lipet":
                                            img.setImageResource(R.drawable.lipet);
                                            break;
                                        case "magadan":
                                            img.setImageResource(R.drawable.magadan);
                                            break;
                                        case "mariel":
                                            img.setImageResource(R.drawable.mariel);
                                            break;
                                        case "mordo":
                                            img.setImageResource(R.drawable.mordo);
                                            break;
                                        case "mosobl":
                                            img.setImageResource(R.drawable.mosobl);
                                            break;
                                        case "mur":
                                            img.setImageResource(R.drawable.mur);
                                            break;
                                        case "nenet":
                                            img.setImageResource(R.drawable.nenet);
                                            break;
                                        case "nize":
                                            img.setImageResource(R.drawable.nize);
                                            break;
                                        case "novgor":
                                            img.setImageResource(R.drawable.novgor);
                                            break;
                                        case "novosib":
                                            img.setImageResource(R.drawable.novosib);
                                            break;
                                        case "omsk":
                                            img.setImageResource(R.drawable.omsk);
                                            break;
                                        case "orenb":
                                            img.setImageResource(R.drawable.orenb);
                                            break;
                                        case "orlov":
                                            img.setImageResource(R.drawable.orlov);
                                            break;
                                        case "penz":
                                            img.setImageResource(R.drawable.penz);
                                            break;
                                        case "perm":
                                            img.setImageResource(R.drawable.perm);
                                            break;
                                        case "pit":
                                            img.setImageResource(R.drawable.pit);
                                            break;
                                        case "primor":
                                            img.setImageResource(R.drawable.primor);
                                            break;
                                        case "pskov":
                                            img.setImageResource(R.drawable.pskov);
                                            break;
                                        case "rostov":
                                            img.setImageResource(R.drawable.rostov);
                                            break;
                                        case "ryazan":
                                            img.setImageResource(R.drawable.ryazan);
                                            break;
                                        case "sahalin":
                                            img.setImageResource(R.drawable.sahalin);
                                            break;
                                        case "sakha":
                                            img.setImageResource(R.drawable.sakha);
                                            break;
                                        case "samara":
                                            img.setImageResource(R.drawable.samara);
                                            break;
                                        case "saratov":
                                            img.setImageResource(R.drawable.saratov);
                                            break;
                                        case "seva":
                                            img.setImageResource(R.drawable.seva);
                                            break;
                                        case "sevosetia":
                                            img.setImageResource(R.drawable.sevosetia);
                                            break;
                                        case "smol":
                                            img.setImageResource(R.drawable.smol);
                                            break;
                                        case "stavropol":
                                            img.setImageResource(R.drawable.saratov);
                                            break;
                                        case "sverdl":
                                            img.setImageResource(R.drawable.sverdl);
                                            break;
                                        case "tambov":
                                            img.setImageResource(R.drawable.tambov);
                                            break;
                                        case "tatar":
                                            img.setImageResource(R.drawable.tatar);
                                            break;
                                        case "tiva":
                                            img.setImageResource(R.drawable.tiva);
                                            break;
                                        case "tom":
                                            img.setImageResource(R.drawable.tom);
                                            break;
                                        case "tul":
                                            img.setImageResource(R.drawable.tula);
                                            break;
                                        case "tumen":
                                            img.setImageResource(R.drawable.tumen);
                                            break;
                                        case "tver":
                                            img.setImageResource(R.drawable.tver);
                                            break;
                                        case "udmurt":
                                            img.setImageResource(R.drawable.udmurt);
                                            break;
                                        case "ukrain-herson":
                                            img.setImageResource(R.drawable.herson);
                                            break;
                                        case "ulya":
                                            img.setImageResource(R.drawable.ulya);
                                            break;
                                        case "vlad":
                                            img.setImageResource(R.drawable.vlad);
                                            break;
                                        case "volgograd":
                                            img.setImageResource(R.drawable.volgogradskaya);
                                            break;
                                        case "vologodskaya":
                                            img.setImageResource(R.drawable.vologodskaya);
                                            break;
                                        case "voron":
                                            img.setImageResource(R.drawable.voron);
                                            break;
                                        case "yamal":
                                            img.setImageResource(R.drawable.yamal);
                                            break;
                                        case "yaro":
                                            img.setImageResource(R.drawable.yaro);
                                            break;
                                        case "zabas":
                                            img.setImageResource(R.drawable.zabas);
                                            break;
                                        case "agin":
                                            img.setImageResource(R.drawable.zabas);
                                            break;
                                        case "komiperm":
                                            img.setImageResource(R.drawable.perm);
                                            break;
                                        case "taimir":
                                            img.setImageResource(R.drawable.krasnoyarsk);
                                            break;
                                        case "ustord":
                                            img.setImageResource(R.drawable.irku);
                                            break;
                                        case "even":
                                            img.setImageResource(R.drawable.krasnoyarsk);
                                            break;
                                        case "baikonur":
                                            img.setImageResource(R.drawable.baikonur);
                                            break;

                                        default:
                                            System.out.println("что-то сломалось");
                                    }

                                    c = 1;
                                    try {
                                        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                                        imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                                    } catch (Exception e) {
                                        // TODO: handle exception
                                    }

                            }
                        }
                        if (c!=1){
                            result.setText(R.string.Err4);
                            result2.setText(null);
                            img2.setImageDrawable(null);
                            rusWord.setText(null);
                            img.setImageDrawable(null);
                            result3.setText(null);
                        }

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                user_field.setText(null);
            }
        });



    }
}