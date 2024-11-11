package br.edu.fateczl.timejogador.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.time.LocalDate;
import br.edu.fateczl.timejogador.R;
import br.edu.fateczl.timejogador.model.Jogador;
import br.edu.fateczl.timejogador.model.Time;

public class ListFragment extends Fragment {

    private TextView textViewList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        textViewList = view.findViewById(R.id.textViewList);
        // Chamar o método listar e exibir os resultados
        listarObjetos();

        return view;
    }

    private void listarObjetos() {
        // Simulação de listagem
        StringBuilder sb = new StringBuilder();
        sb.append("Exemplo de Listagem de Times e Jogadores:\n");

        // Exemplo de instância para exibição
        Time time = new Time(1, "Time A", "Cidade A");
        Jogador jogador = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            jogador = new Jogador(1, "Jogador A", LocalDate.now(), 1.75f, 70.0f, time);
        }

        sb.append(time.toString()).append("\n");
        sb.append(jogador.toString()).append("\n");

        textViewList.setText(sb.toString());
    }
}

