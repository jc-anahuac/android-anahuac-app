package mx.anahuac.anahuac.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import mx.anahuac.anahuac.R;
import mx.anahuac.anahuac.activities.BachelorDetailActivity;
import mx.anahuac.anahuac.activities.BachelorListActivity;
import mx.anahuac.anahuac.activities.BachelorSubListActivity;
import mx.anahuac.anahuac.models.Escuela;
import mx.anahuac.anahuac.models.Licenciatura;

public class BachelorSublistAdapter extends RecyclerView.Adapter<BachelorSublistAdapter.ViewHolder> {

    private List<Licenciatura> data;

    public BachelorSublistAdapter(List<Licenciatura> data ){this.data = data; }

    @NonNull
    @Override
    public BachelorSublistAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_bachelor_item, parent, false);
        return new BachelorSublistAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BachelorSublistAdapter.ViewHolder holder, int position) {
        Licenciatura campus = data.get(position);
        holder.tvBachelorName.setText(campus.getName());
        holder.ivBachelor.setImageResource(campus.getImageList());
        holder.ivBachelor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), BachelorDetailActivity.class);
                intent.putExtra("code",campus.getCode());
                view.getContext().startActivity(intent);
            }
        });
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




