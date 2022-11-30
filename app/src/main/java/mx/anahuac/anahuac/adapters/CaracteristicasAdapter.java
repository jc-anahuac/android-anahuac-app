package mx.anahuac.anahuac.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import mx.anahuac.anahuac.R;
import mx.anahuac.anahuac.models.Caracteristica;

public class CaracteristicasAdapter extends RecyclerView.Adapter<CaracteristicasAdapter.ViewHolder> {

    private List<Caracteristica> data;

    public CaracteristicasAdapter(List<Caracteristica> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_porque, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Caracteristica item = data.get(position);
        holder.imageView.setImageResource(item.getImage());
        holder.textView.setText(item.getDescription());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.iv_porque);
            textView = itemView.findViewById(R.id.tv_porque);
        }
    }

}
