package mx.anahuac.anahuac.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import mx.anahuac.anahuac.R;
import mx.anahuac.anahuac.activities.BachelorListActivity;
import mx.anahuac.anahuac.models.Escuela;

public class BachelorListAdapter extends RecyclerView.Adapter<BachelorListAdapter.ViewHolder> {

    private ArrayList<Escuela> data;

    public BachelorListAdapter(ArrayList<Escuela> data ){this.data = data; }

    @NonNull
    @Override
    public BachelorListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_bachelor_item, parent, false);
        return new BachelorListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BachelorListAdapter.ViewHolder holder, int position) {
        Escuela campus = data.get(position);
        holder.tvBachelorName.setText(campus.getName());
        holder.ivBachelor.setImageResource(campus.getImage());


    }

    @Override
    public int getItemCount() {

        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView tvBachelorName;
        private ImageView ivBachelor;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvBachelorName = itemView.findViewById(R.id.tv_campus_name);
            ivBachelor = itemView.findViewById(R.id.iv_lic);
        }
    }

}
