package cl.Ignacio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button boton;
    EditText etnombre, etmatricula;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnombre=(EditText) findViewById(R.id.txtNombre);
        etmatricula=(EditText) findViewById(R.id.txtMatricula);
        boton = (Button)findViewById(R.id.btnAceptar);
        boton = (Button)findViewById(R.id.btnEliminar);
        boton = (Button)findViewById(R.id.btnLimpiar);
        intent = new Intent(this, MainActivity2.class);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}