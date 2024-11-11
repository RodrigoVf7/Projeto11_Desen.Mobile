package br.edu.fateczl.timejogador.model;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import br.edu.fateczl.timejogador.R;
/*@author: RODRIGO VINICIUS FERRAZ DA SILVA
 *@RA: 1110482313043*/
public class AddJogadorFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_add_jogador, container, false);
    }
}
