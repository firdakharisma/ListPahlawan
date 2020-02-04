package id.ac.poliban.mi.firda.listpahlawan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Pahlawan> pahlawans = new ArrayList<>();
    private ListView lvPahlawan;
    private BaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvPahlawan = findViewById(R.id.listview);

        pahlawans.addAll(PahlawanData.getAllPahlawan());

        adapter = new PahlawanAdapter(pahlawans);

        lvPahlawan.setAdapter(adapter);

        lvPahlawan.setOnItemClickListener((parent, view, position, id) -> {
            new AlertDialog.Builder(this)
                    .setTitle("Pahlawan yang Anda Pilih")
                    .setMessage("anda memilih: " +
                            pahlawans.get(position).getPahlawanName())
                    .setPositiveButton("OK", null).show();
                }
                );
    }
}
