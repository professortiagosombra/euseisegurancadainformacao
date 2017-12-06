package br.edu.unichristus.euseisegurancadainformacao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClickEntrar(View v)
    {
        Intent intent = new Intent(getApplicationContext(), Questions.class);
        startActivity(intent);
    }

    public void buttonClickOpcoes(View v)
    {
        Intent intent = new Intent(getApplicationContext(), Options.class);
        startActivity(intent);
    }

    public void buttonClickSobre(View v)
    {
        Intent intent = new Intent(getApplicationContext(), About.class);
        startActivity(intent);
    }
}
