package com.example.rupik.veggarden.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rupik.veggarden.Data.Lands;
import com.example.rupik.veggarden.R;

import java.util.List;

public class LandDetailsAdapter extends RecyclerView.Adapter<LandDetailsAdapter.LandDetailsViewHolder> {

    Context mCtx;
    List<Lands> landsList;

    public LandDetailsAdapter(Context mCtx, List<Lands> landsList) {
        this.mCtx = mCtx;
        this.landsList = landsList;
    }

    @Override
    public LandDetailsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mCtx).inflate(R.layout.land_details_card, parent, false);
        LandDetailsViewHolder landDetailsViewHolder = new LandDetailsViewHolder(view);
        return landDetailsViewHolder;
    }

    @Override
    public void onBindViewHolder(LandDetailsViewHolder holder, int position) {

        Lands lands = landsList.get(position);

        holder.mLandName.setText(lands.getLandName());
        holder.mLandArea.setText(lands.getLandArea());
        holder.mLandLocation.setText(lands.getLandLocation());

    }

    @Override
    public int getItemCount() {
        return landsList.size();
    }

    class LandDetailsViewHolder extends RecyclerView.ViewHolder {

        TextView mLandName, mLandArea, mLandLocation;
        public LandDetailsViewHolder(View itemView) {
            super(itemView);

            mLandName = itemView.findViewById(R.id.farmerLandName);
            mLandArea = itemView.findViewById(R.id.farmerLandArea);
            mLandLocation = itemView.findViewById(R.id.farmerLandLocation);

        }
    }

}
