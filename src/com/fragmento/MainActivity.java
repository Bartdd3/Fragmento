package com.fragmento;

import android.support.v7.app.ActionBarActivity;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {
	FragmentManager fm =  getSupportFragmentManager();
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        if(savedInstanceState == null){
        	
        	Fragmento1 frag1 = new Fragmento1();
        	Fragmento2 frag2 = new Fragmento2();
        	Fragmento3 frag3 = new Fragmento3();
        	
        	FragmentTransaction ft = fm.beginTransaction();
        	ft.add(R.id.layout_direito, frag1,"frag1");
        	
        }
        
        
        
        String[] lista = new String[]{"Fragmento1","anteratera texto fragemento","Fragemento 2","Fragemento 3"};
        
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        
        ListView lv = (ListView) findViewById(R.id.listView1);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> lv, View view, int position,
					long id) {
				// TODO Auto-generated method stub
				if(position == 0){					
					
					Fragmento1 frag1 =  new Fragmento1();
					FragmentTransaction ft = fm.beginTransaction();
		        	ft.replace(R.id.layout_direito, frag1, "frag1");
		        	ft.addToBackStack("pilha");
		        	ft.commit();
		        	//Fragmento1 frag1 = (Fragmento1 ) fm.findFragmentById(R.id.layout__frag_1)
					//frag1.alteratexto("texto alterado com sucesso");
					
				}
				else if(position == 1){
					
					Fragmento1 frag1 =  (Fragmento1)fm.findFragmentByTag("frag1");
					FragmentTransaction ft = fm.beginTransaction();
		        	ft.replace(R.id.layout_direito, frag1,"frag1");
		        	ft.addToBackStack("pilha");
		        	ft.commit();
		        	
					
				}
				else if(position == 2){					
					
					Fragmento2 frag2 =  new Fragmento2();
					FragmentTransaction ft = fm.beginTransaction();
		        	ft.replace(R.id.layout_direito, frag2, "frag2");
		        	ft.addToBackStack("pilha");
		        	ft.commit();
		        	//Fragmento1 frag1 = (Fragmento1 ) fm.findFragmentById(R.id.layout__frag_1)
					//frag1.alteratexto("texto alterado com sucesso");
					
				}
				else if(position == 3){					
					
					Fragmento3 frag3 =  new Fragmento3();
					FragmentTransaction ft = fm.beginTransaction();
		        	ft.replace(R.id.layout_direito, frag3, "frag3");
		        	ft.addToBackStack("pilha");
		        	ft.commit();
		        	//Fragmento1 frag1 = (Fragmento1 ) fm.findFragmentById(R.id.layout__frag_1)
					//frag1.alteratexto("texto alterado com sucesso");
					
				}
				
			}
        	
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
