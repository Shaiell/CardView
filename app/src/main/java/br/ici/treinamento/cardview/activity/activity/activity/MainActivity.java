package br.ici.treinamento.cardview.activity.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import br.ici.treinamento.cardview.R;
import br.ici.treinamento.cardview.activity.activity.Adapter.PostagemAdapter;
import br.ici.treinamento.cardview.activity.activity.model.Postagem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Definir layout

        //Layout para o lado
        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayout.HORIZONTAL);

        //Layout de Grid
        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);

        //Layout descendo
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        //Definir Adapter
        this.criarPostagems();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void criarPostagems(){

        Postagem postagem = new Postagem("Jean Christian","Boa Viagem!",R.drawable.imagem1);
        this.postagens.add(postagem);

        postagem = new Postagem("Rodrigo Ramos","Vai na Fé!",R.drawable.imagem2);
        this.postagens.add(postagem);

        postagem = new Postagem("Alexnadre Mikulim","Boa Sorte.com!",R.drawable.imagem3);
        this.postagens.add(postagem);

        postagem = new Postagem("Pedro Pinto","Vai e não volta!",R.drawable.imagem4);
        this.postagens.add(postagem);
    }
}
