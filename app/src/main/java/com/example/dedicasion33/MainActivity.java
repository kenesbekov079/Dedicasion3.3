package com.example.dedicasion33;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Country> list;
    BigEmpieresAdapter bigEmpieresAdapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<>();
        list.add(new Country("Japon Empiere","1868 - 1945", "675 000 км²",R.drawable.japon_empiere));
        list.add(new Country("France Empiere","1804 - 1816", "860 000 км²", R.drawable.nopoleon));
        list.add(new Country("Rurrsian Empiere","1721- 1917", "21 797 725 км² ", R.drawable.russian_empiere));
        list.add(new Country("Spain Empiere","1492 - 1976", "990 000km", R.drawable.spanish));
        list.add(new Country("Mongol Empiere","1206 - 1368 ", "24 000 000 км² ", R.drawable.mongol));
        list.add(new Country("Germeny Empiere","1933 - 1945", "633 786 км²", R.drawable.reih));
        list.add(new Country("Great Britain","1700-1997", "31 878 965 км²", R.drawable.great_britian));
        list.add(new Country("Ottoman Empiere","1900 -1924", "1400km", R.drawable.ic_launcher_background));
        list.add(new Country("Ottoman Empiere","1708-1924", "1400km", R.drawable.ic_launcher_background));
        list.add(new Country("Portugal Empiere","1700-1997", "31 878 965 км²", R.drawable.ic_launcher_foreground));
        list.add(new Country("Portugal Empiere","1700-1997", "31 878 965 км²", R.drawable.ic_launcher_foreground));
        list.add(new Country("Portugal Empiere","1700-1997", "31 878 965 км²", R.drawable.ic_launcher_foreground));
recyclerView = findViewById(R.id.recycler_BigEmpires);
        bigEmpieresAdapter = new BigEmpieresAdapter( list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(bigEmpieresAdapter);
    }




}