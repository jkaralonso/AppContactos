package com.example.diamond.appcontactos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Diamond on 03/09/2017.
 */

public class Segunda_Actividad extends AppCompatActivity {

    EditText Nombre;
    EditText Numero;
    EditText Email;
    EditText Twitter;
    EditText FechaNac;
    Button btnRegistra;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_actividad);
        //declarar variables
        Nombre = (EditText) findViewById(R.id.txtNombre);
        Numero = (EditText) findViewById(R.id.txtNumero);
        Email = (EditText) findViewById(R.id.txtEmail);
        Twitter = (EditText) findViewById(R.id.txtTwitter);
        FechaNac = (EditText) findViewById(R.id.txtFechaNac);
        btnRegistra = (Button) findViewById(R.id.btnRegistrar);


        btnRegistra.setOnClickListener(new View.OnClickListener()
                                       {

                                           @Override
                                           public void onClick(View v)
                                           {
                                               Intent intent = new Intent();
                                               //guardar en variables el valor de cada caja de texto
                                               String nombree = Nombre.getText().toString();
                                               int numeroo = Integer.parseInt(Numero.getText().toString());
                                               String emaill = Email.getText().toString();
                                               String twitterr = Twitter.getText().toString();
                                               String fechanacc = FechaNac.getText().toString();
                                               //crear nuevo objeto contacto
                                               Contacto contactos = new Contacto(nombree,emaill, twitterr, fechanacc,numeroo);
                                               intent.putExtra("lista",contactos);
                                               setResult(RESULT_OK,intent);
                                               finish();


                                           }
                                       }


        );




    }
}