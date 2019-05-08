package br.com.digitalhouse.tarefa20190508;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView saberCuriosidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saberCuriosidade = (TextView) findViewById(R.id.textViewSaberCuriosidade);

        saberCuriosidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mensagem = "A cor azul representa 45% das preferências no mundo todo. ";
                mensagem = mensagem + "Essa cor nos remete a fidelidade, harmonia, simpatia e calma. ";
                mensagem = mensagem + "É só olhar a amplitude do mar e do céu que você realmente observa que isso é verdade";

                Toast.makeText(MainActivity.this, mensagem, Toast.LENGTH_LONG).show();

            }
        });


    }
}
