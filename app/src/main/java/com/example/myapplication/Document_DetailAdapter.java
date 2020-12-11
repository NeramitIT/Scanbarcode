package com.example.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Document_DetailAdapter extends RecyclerView.Adapter<Document_DetailAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";
    private ArrayList<String> doc_detailNo = new ArrayList<>();
    private ArrayList<String> doc_detail_SerialNo = new ArrayList<>();
    private ArrayList<String> doc_detail_Amount = new ArrayList<>();
    private ArrayList<String> doc_detail_UnitCount = new ArrayList<>();
    private Context mContext;

    private onRecyclerViewItemClickListener mItemClickListener;

    void setOnItemClickListener(onRecyclerViewItemClickListener listener){
        mItemClickListener = listener;
    }
    public  interface onRecyclerViewItemClickListener{
        void onDeleteClick(int position);
    }

    public  Document_DetailAdapter(ArrayList<String>doc_detailNo,ArrayList<String>doc_detail_SerialNo,ArrayList<String>doc_detail_Amount,ArrayList<String>doc_detail_UnitCount,Context mContext){
        this.doc_detailNo = doc_detailNo;
        this.doc_detail_SerialNo = doc_detail_SerialNo;
        this.doc_detail_Amount = doc_detail_Amount;
        this.doc_detail_UnitCount = doc_detail_UnitCount;
        this.mContext = mContext;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.document_detail_list_item,parent,false);
        ViewHolder holder = new ViewHolder(view,mItemClickListener);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Log.d(TAG,"onBindViewHolder: called.");


    }

    public long getItemId(int i){
        return 0;
    }

    @Override
    public int getItemCount() {
        return doc_detailNo.size();
    }



    public static  class ViewHolder extends RecyclerView.ViewHolder{

        TextView tv_No,tv_SerailNo,tv_Amount,tv_Unitcount;
        ImageView img_delete;
        RelativeLayout parent;


        public ViewHolder(View itemView,final onRecyclerViewItemClickListener listener) {
            super(itemView);
            tv_No = itemView.findViewById(R.id.tv_doc_layout_detail_number);
            tv_SerailNo = itemView.findViewById(R.id.tv_doc_layout_detail_serial_number);
            tv_Amount = itemView.findViewById(R.id.tv_doc_layout_detail_amount);
            tv_Unitcount = itemView.findViewById(R.id.tv_doc_layout_detail_unit_count);
            img_delete = itemView.findViewById(R.id.img_doc_layout_detail_delete);

            img_delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener !=null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            listener.onDeleteClick(position);
                        }
                    }
                }
            });

        }
    }
}
