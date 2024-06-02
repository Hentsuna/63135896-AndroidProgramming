package vt.dam.testthi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Cau1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cau1Fragment extends Fragment {
    EditText editText_met;
    EditText editText_kmet;
    Button btnChuyen;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Cau1Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Cau1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Cau1Fragment newInstance(String param1, String param2) {
        Cau1Fragment fragment = new Cau1Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau1 = inflater.inflate(R.layout.fragment_cau1, container, false);
        editText_met = viewCau1.findViewById(R.id.edtsom);
        editText_kmet = viewCau1.findViewById(R.id.edtsokm);
        btnChuyen = viewCau1.findViewById(R.id.btndoi);
        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String met = editText_met.getText().toString();
                String kmet = editText_kmet.getText().toString();
                if(!met.isEmpty()){
                    Toast.makeText(viewCau1.getContext(), "m->km", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(viewCau1.getContext(), "km->m", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return viewCau1;
    }
}