package br.edu.fateczl.timejogador;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import br.edu.fateczl.timejogador.model.AddJogadorFragment;
import br.edu.fateczl.timejogador.model.AddTimeFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Exibir o fragmento de listagem inicialmente
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new ListFragment())
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Fragment selectedFragment = null;

        // Manipular a seleção dos itens do menu
        switch (item.getItemId()) {
            case R.id.action_list:
                selectedFragment = new ListFragment();
                break;
            case R.id.action_add_jogador:
                selectedFragment = new AddJogadorFragment();
                break;
            case R.id.action_add_time:
                selectedFragment = new AddTimeFragment();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        // Substituir o fragmento atual pelo selecionado
        if (selectedFragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, selectedFragment)
                    .addToBackStack(null)
                    .commit();
        }

        return true;
    }
}


