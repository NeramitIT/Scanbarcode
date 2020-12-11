package com.example.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;


import java.util.ArrayList;



public class AreaAdapter extends RecyclerView.Adapter<AreaAdapter.ViewHolder> {

    private  static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> noArea = new ArrayList<>();
    private ArrayList<String> areaProductCode = new ArrayList<>();
    private ArrayList<String> areaProductName = new ArrayList<>();
    private ArrayList<String> areaReceive = new ArrayList<>();
    private ArrayList<String> areaIssue = new ArrayList<>();
    private ArrayList<String> areaBalance = new ArrayList<>();
    private String uId ;
    private Context mContext;

    public AreaAdapter(ArrayList<String>noArea,ArrayList<String>areaProductCode,ArrayList<String>areaProductName,ArrayList<String>areaReceive,ArrayList<String>areaIssue,ArrayList<String>areaBalance,String uId,Context mContext){
        this.noArea = noArea;
        this.areaProductCode = areaProductCode;
        this.areaProductName = areaProductName;
        this.areaReceive = areaReceive;
        this.areaIssue = areaIssue;
        this.areaBalance = areaBalance;
        this.uId = uId;
        this.mContext = mContext;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.area_detail_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");
    }



    @Override
    public int getItemCount() {
        return noArea.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tv_areaNo,tv_area_product_code,tv_area_product_name,tv_area_receive,tv_area_issue,tv_area_balance;
        RelativeLayout  parentLayout;

        public ViewHolder( View itemView) {
            super(itemView);
            tv_areaNo = itemView.findViewById(R.id.tv_area_number);
            tv_area_product_code = itemView.findViewById(R.id.tv_area_product_code);
            tv_area_product_name = itemView.findViewById(R.id.tv_area_product_name);
            tv_area_receive = itemView.findViewById(R.id.tv_area_receive);
            tv_area_issue = itemView.findViewById(R.id.tv_area_issue);
            tv_area_balance = itemView.findViewById(R.id.tv_area_balance);
            parentLayout = itemView.findViewById(R.id.parent_area_detail_item_layout);

        }
    }
}
