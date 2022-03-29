package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view) {
        this.opcaoSelecionada("pedra");
    }

    public void selecionadoPapel(View view) {
        this.opcaoSelecionada("papel");
    }

    public void selecionadoTesoura(View view) {
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String opcaoUsuario) {

        ImageView imagemResultado = findViewById(R.id.imageResultado);
        TextView textResultado = findViewById(R.id.textoResultado);

        int numero = new Random().nextInt(3); //0,1,2
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String opcaoApp = opcoes[numero];

        switch (opcaoApp) {
            case "pedra":
                imagemResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imagemResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imagemResultado.setImageResource(R.drawable.tesoura);
                break;
        }
        if(
                (opcaoApp == "pedra" && opcaoUsuario == "tesoura") ||
                (opcaoApp == "papel" && opcaoUsuario == "pedra") ||
                (opcaoApp == "tesoura" && opcaoUsuario == "papel")

        ){
            textResultado.setText("Você perdeu! :(");
            //app ganhador

        }else if(
                (opcaoUsuario == "pedra" && opcaoApp == "tesoura") ||
                (opcaoUsuario == "papel" && opcaoApp == "pedra") ||
                (opcaoUsuario == "tesoura" && opcaoApp == "papel")
        ){
            textResultado.setText("Você ganhou! :D");
            //usuário ganhador

        }else{

            textResultado.setText("Empatamos! ;)");
            //empate

    }
       /* pedra ganha de tesoura,
        papel ganha de pedra
        tesoura ganha de papel*/


        System.out.println("item clicado:"+ opcaoApp);

    }

    }

