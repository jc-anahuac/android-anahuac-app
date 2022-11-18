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

public class ConferencistasAdapter extends RecyclerView.Adapter<ConferencistasAdapter.ViewHolder> {

    private ArrayList<Conferencistas> data;

    public ConferencistasAdapter(ArrayList<Conferencistas> data ){this.data = data; }

    @NonNull
    @Override
    public ConferencistasAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_conferencistas, parent, false);
        return new ConferencistasAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ConferencistasAdapter.ViewHolder holder, int position) {
        Conferencistas conferencistas = data.get(position);
        holder.tvname.setText(conferencistas.getName());
        holder.ivimage.setImageResource(conferencistas.getImage());
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

            ivimage = itemView.findViewById(R.id.iv_name_con);
            tvname = itemView.findViewById(R.id.tv_name_con);
        }
    }
}
