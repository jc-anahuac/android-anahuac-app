package mx.anahuac.anahuac.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import mx.anahuac.anahuac.R;
import mx.anahuac.anahuac.models.Licenciatura;

public class LicenciaturasAdapter extends RecyclerView.Adapter<LicenciaturasAdapter.ViewHolder> {

    private List<Licenciatura> list;
    private LicenciaturaListener licenciaturaListener;

    public LicenciaturasAdapter(List<Licenciatura> list, LicenciaturaListener licenciaturaListener){
        this.list = list;
        this.licenciaturaListener = licenciaturaListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_licenciatura, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Licenciatura item = list.get(position);
        holder.ivLic.setImageResource(item.getImageHome());
        holder.tvName.setText(item.getName());
        holder.licContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(licenciaturaListener != null) licenciaturaListener.onClickLicenciatura(item);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivLic;
        private TextView tvName;
        private LinearLayout licContainer;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivLic = itemView.findViewById(R.id.iv_licenciatura);
            tvName = itemView.findViewById(R.id.tv_name);
            licContainer = itemView.findViewById(R.id.lic_container);
        }
    }

    public interface LicenciaturaListener{
        void onClickLicenciatura(Licenciatura licenciatura);
    }
}
