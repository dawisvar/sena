package co.edu.sena;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void login(View view) {
        CharSequence text = "";

        CharSequence usuario = "dawis";
        CharSequence pass = "123456";

        EditText usu = (EditText) findViewById(R.id.editTextUsuario);
        EditText contra = (EditText) findViewById(R.id.editTextPass);

        if (usu.getText().toString().equals(usuario) && contra.getText().toString().equals(pass)) {
            text = "listo entro";

            Intent sopo = new Intent(this, home.class);
            startActivity(sopo);
        } else {
            text = "usuario o contraseña incorrectos";

        }
        int duration = 5;
        Toast toast = Toast.makeText(this, text, duration);
        toast.show();

    }

    public void Registrarse(View view) {
        Intent registro = new Intent(this, Registro.class);
        Intent Registro;
        startActivity(registro);
    }

    public void Recuperarcontrasena(View view) {
        Intent registro = new Intent(this, recuperar.class);
        Intent Registro;
        startActivity(registro);
    }
}