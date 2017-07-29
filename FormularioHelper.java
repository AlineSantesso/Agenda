package br.com.alura.agenda;

import android.widget.EditText;
import android.widget.RatingBar;

import br.com.alura.agenda.model.Aluno;

/**
 * Created by Augusto on 04/07/2017.
 */

public class FormularioHelper {

    private EditText campoNome;
    private EditText campoEndereco;
    private EditText campoTelefone;
    private EditText campoSite;
    private RatingBar campoNota;

    public FormularioHelper(FormularioActivity activity){
        campoNome = (EditText) activity.findViewById(R.id.nome);
        campoEndereco = (EditText) activity.findViewById(R.id.endereco);
        campoTelefone = (EditText) activity.findViewById(R.id.telefone);
        campoSite = (EditText) activity.findViewById(R.id.site);
        campoNota= (RatingBar) activity.findViewById(R.id.nota);
        campoNome = (EditText) activity.findViewById(R.id.nome);
    }

    public Aluno obterAluno() {
        Aluno aluno = new Aluno();

        aluno.setNome(String.valueOf(campoNome.getText()));
        aluno.setEndereco(String.valueOf(campoEndereco.getText()));
        aluno.setTelefone(String.valueOf(campoTelefone.getText()));
        aluno.setSite(String.valueOf(campoSite.getText()));
        aluno.setNota(campoNota.getRating());

        return aluno;
    }
}
