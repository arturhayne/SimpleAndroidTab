package br.gov.ba.prodeb.myapplication;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ViewPagerMainAdapter adapterTabs;
    private AppBarLayout home_appBar;
    private TabLayout home_tabs;
    private ViewPager viewpager_tabs_content;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home_appBar =  findViewById(R.id.home_appBar);
        viewpager_tabs_content = findViewById(R.id.home_tabs_content);

        home_tabs = findViewById(R.id.home_tabs);
        home_tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        adapterTabs = new ViewPagerMainAdapter(getSupportFragmentManager());


        adapterTabs.addFragment(new ServicosFragment(), "Serviços");
        adapterTabs.addFragment(new CategoriasFragment(), "Categorias");
        viewpager_tabs_content.setAdapter(adapterTabs);
        home_tabs.setupWithViewPager(viewpager_tabs_content);


    }
}
