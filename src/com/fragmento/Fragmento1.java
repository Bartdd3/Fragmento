package com.fragmento;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragmento1 extends Fragment {

public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle SavedInstanceState  ){
		
	View view = inflater.inflate(R.layout.layout_frag_1, null);
	
		TextView tv = (TextView) view.findViewById(R.id.textView1);
		tv.setText("fragmento 1 funcionando ");
		return (view);
	}
	
	public void alteratexto(String texto){
		
		TextView tv = (TextView) getView().findViewById(R.id.textView1);
		tv.setText(texto);
		
	}

}
