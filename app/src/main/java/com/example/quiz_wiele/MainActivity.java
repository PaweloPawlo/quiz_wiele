package com.example.quiz_wiele;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView pytanieTextView;
    private CheckBox[] checkBoxy = new CheckBox[3];
    private int ktorePytanie = 0;
    private WszystkiePytania WszPytania = new WszystkiePytania();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pytanieTextView = (TextView) findViewById(R.id.pytanie);
        checkBoxy = new CheckBox[]{
                (CheckBox) findViewById(R.id.checkBox),
                (CheckBox) findViewById(R.id.checkBox2),
                (CheckBox) findViewById(R.id.checkBox3),
        };
        pokazPytanie(0);
    }

    private void pokazPytanie(int i)
    {
        pytanieTextView.setText(WszPytania.wszystkiePytania[i].getTekstPytania());
        int k=0;
        for(CheckBox check:checkBoxy)
        {
            check.setText(WszPytania.wszystkiePytania[i].getOdpowiedzi(k));
            k++;
            check.setChecked(false);
        }
    }

    private boolean czyDobrze(int i)
    {
        int k=0;
        for(CheckBox check:checkBoxy)
        {
            if(check.isChecked() != WszPytania.wszystkiePytania[i].getPoprawnosc(k))
            {
                return false;
            }
            k++;
        }
        return true;

    }

    public void nastepne(View view) {
        if(czyDobrze(ktorePytanie))
        {
            Toast.makeText(this,"Dobra odpowiedź",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"Zła odpowiedź",Toast.LENGTH_SHORT).show();
        }
        ktorePytanie++;
        if(ktorePytanie==WszPytania.wszystkiePytania.length)
        {
            Toast.makeText(this, "To jest już koniec", Toast.LENGTH_SHORT).show();
            return;
        }
        pokazPytanie(ktorePytanie);
    }
}