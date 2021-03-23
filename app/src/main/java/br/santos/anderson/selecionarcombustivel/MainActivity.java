package br.santos.anderson.selecionarcombustivel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import br.santos.anderson.core.CalculoCombustivel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickBotaoCalcular(View v){
        //pareamento com os campos do layout
        EditText alcool = (EditText)findViewById(R.id.alcool);
        EditText gasolina = (EditText)findViewById(R.id.gasolina);
        TextView resultado = (TextView)findViewById(R.id.resultado);
        //recuperacao dos valores fornecidos pelo usuario
        double alcoolValor = Double.parseDouble(alcool.getText().toString());
        double gasolinaValor = Double.parseDouble(gasolina.getText().toString());
        //tomada de decisao
        boolean escolhiAlcool = (new CalculoCombustivel(alcoolValor, gasolinaValor)).selectFuel();
        if(escolhiAlcool)
            resultado.setText("Usar ÁLCOOL!");
        else
            resultado.setText("Usar GASOLINA!");
    }
}