package com.example.peterho.materialdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class DemoFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<Country> countries;
    private CountryAdapter countryAdapter;
    private Button addButton;

    public static final String TAG = "DemoFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_demo, container, false);

        createAndPopulateCountriesArray();
        countryAdapter = new CountryAdapter(this.getActivity(), countries);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setAdapter(countryAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        addButton = (Button) view.findViewById(R.id.add_button);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countries.add(1, new Country("Germany", R.drawable.germany));
                countryAdapter.notifyItemInserted(1);
            }
        });

        return view;
    }

    private void createAndPopulateCountriesArray() {
        countries = new ArrayList<Country>();
        countries.add(new Country("Argentina", R.drawable.argentina));
        countries.add(new Country("Australia", R.drawable.australia));
        countries.add(new Country("Brazil", R.drawable.brazil));
        countries.add(new Country("Canada", R.drawable.canada));
        countries.add(new Country("Chile", R.drawable.chile));
        countries.add(new Country("China", R.drawable.china));
        countries.add(new Country("Egypt", R.drawable.egypt));
        countries.add(new Country("France", R.drawable.france));
        countries.add(new Country("Germany", R.drawable.germany));
        countries.add(new Country("Greece", R.drawable.greece));
        countries.add(new Country("Mexico", R.drawable.mexico));
        countries.add(new Country("Paraguay", R.drawable.paraguay));
        countries.add(new Country("United Kingdom", R.drawable.united_kingdom));
        countries.add(new Country("United States", R.drawable.united_states));
        countries.add(new Country("Uruguay", R.drawable.uruguay));
    }
}
