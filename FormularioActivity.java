package br.com.alura.agenda;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import java.text.Normalizer;

import br.com.alura.agenda.dao.AlunoDAO;

public class FormularioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        EditText campoNome = (EditText) findViewById(R.id.nome);
        String nome = String.valueOf(campoNome.getText());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_formulario, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_formulario_ok:
                FormularioHelper helper = new FormularioHelper(FormularioActivity.this);
                AlunoDAO dao = new AlunoDAO(FormularioActivity.this);

                dao.insereAluno(helper.obterAluno());
                dao.close();
                Toast.makeText(FormularioActivity.this, "Aluno cadastrado com sucesso!", Toast.LENGTH_SHORT).show();

                finish();
                break;
        }


        return super.onOptionsItemSelected(item);
    }
}
