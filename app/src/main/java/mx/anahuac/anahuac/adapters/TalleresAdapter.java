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
import mx.anahuac.anahuac.models.Conferencistas;
import mx.anahuac.anahuac.models.Escuela;
import mx.anahuac.anahuac.models.Talleres;

public class TalleresAdapter extends RecyclerView.Adapter<TalleresAdapter.ViewHolder> {

    private ArrayList<Talleres> data;

    public TalleresAdapter(ArrayList<Talleres> data ){this.data = data; }

    @NonNull
    @Override
    public TalleresAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_talleres, parent, false);
        return new TalleresAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TalleresAdapter.ViewHolder holder, int position) {
        Talleres talleres = data.get(position);
        holder.tvname.setText(talleres.getName());
        holder.ivimage.setImageResource(talleres.getImage());
    }

    @Override
    public int getItemCount() {

        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView tvname;
        private ImageView ivimage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivimage = itemView.findViewById(R.id.iv_name_tal);
            tvname = itemView.findViewById(R.id.tv_name_tal);
        }
    }
}
