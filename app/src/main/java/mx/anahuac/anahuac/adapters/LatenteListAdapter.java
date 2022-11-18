package mx.anahuac.anahuac.adapters;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import mx.anahuac.anahuac.activities.LatenteHomeActivity;
import mx.anahuac.anahuac.models.Conferencistas;

public class LatenteListAdapter extends AppCompatActivity {

    private ArrayList<Conferencistas> data;

    public LatenteListAdapter(ArrayList<Conferencistas> data){this.data = data; }

}
