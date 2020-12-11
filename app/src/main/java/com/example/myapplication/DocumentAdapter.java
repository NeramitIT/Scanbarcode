package com.example.myapplication;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class DocumentAdapter extends RecyclerView.Adapter<DocumentAdapter.ViewHolder> {
    private static  final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> docNo = new ArrayList<>();
    private ArrayList<String> docProduct_code = new ArrayList<>();
    private ArrayList<String> docQty = new ArrayList<>();
    private ArrayList<String> docPick = new ArrayList<>();
    private ArrayList<String> docUom = new ArrayList<>();
    private ArrayList<String> docLocation = new ArrayList<>();
    private String uId;
    private Context mContext;



    public DocumentAdapter(ArrayList<String>docNo,ArrayList<String>docProduct_code,ArrayList<String>docQty,ArrayList<String>docPick,ArrayList<String>docUom,ArrayList<String>docLocation
    ,String uId,Context mContext ){
        this.docNo = docNo;
        this.docProduct_code = docProduct_code;
        this.docQty = docQty;
        this.docPick = docPick;
        this.docUom = docUom;
        this.docLocation = docLocation;
        this.uId = uId;
        this.mContext = mContext;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.document_list_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder,final int position) {
        Log.d(TAG,"onBindViewHolder: called");


    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public  class  ViewHolder extends  RecyclerView.ViewHolder{

        public ViewHolder(View itemView){
            super(itemView);

        }
    }
}
