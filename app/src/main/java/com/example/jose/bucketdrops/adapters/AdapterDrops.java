package com.example.jose.bucketdrops.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jose.bucketdrops.R;
import com.example.jose.bucketdrops.beans.Drop;

import java.util.ArrayList;

import io.realm.RealmResults;

/**
 * Created by jose on 9/2/2016.
 */
public class AdapterDrops extends RecyclerView.Adapter<AdapterDrops.Dropholder> {
	private LayoutInflater mInflater;
	private RealmResults<Drop> mResults;
	public static final String TAG="VIVZ";

	public AdapterDrops(Context context, RealmResults<Drop> results){
		mInflater=LayoutInflater.from(context);
		update(results);

	}

	public void update(RealmResults<Drop> results){
		mResults = results;
		notifyDataSetChanged();
	}

	public static ArrayList<String> generateValues(){
		ArrayList<String> dummyValues = new ArrayList<>();
		for (int i = 1; i <101; i++){
			dummyValues.add("Item" + i);

		}
		return dummyValues;
	}
	@Override
	public Dropholder onCreateViewHolder(ViewGroup parent, int viewType) {
		View view=mInflater.inflate(R.layout.row_drop,parent, false);
		Dropholder holder = new Dropholder(view);
		Log.d(TAG, "onCreateViewHolder: ");
		return holder;
	}

	@Override
	public void onBindViewHolder(Dropholder holder, int position) {
		Drop drop=mResults.get(position);
		holder.mTextWhat.setText(drop.getWhat());
		Log.d(TAG, "onBindViewHolder: "+position);

	}

	@Override
	public int getItemCount() {
		return mResults.size();
	}

	public static class Dropholder extends RecyclerView.ViewHolder{

		TextView mTextWhat;
		public  Dropholder(View itemView){
			super(itemView);
			mTextWhat = (TextView) itemView.findViewById(R.id.tv_what);
		}
	}
}
