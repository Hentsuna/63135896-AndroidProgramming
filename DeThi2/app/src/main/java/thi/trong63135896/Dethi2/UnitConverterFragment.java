package thi.trong63135896.Dethi2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link UnitConverterFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UnitConverterFragment extends Fragment {
    EditText soMet;
    EditText soKm;
    RadioGroup nutGroup;
    RadioButton nutM, nutG, nutBit;
    Button nutChuyen;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public UnitConverterFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment UnitConverterFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static UnitConverterFragment newInstance(String param1, String param2) {
        UnitConverterFragment fragment = new UnitConverterFragment();
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
        View viewCau2 = inflater.inflate(R.layout.fragment_unit_converter, container, false);
        soMet = viewCau2.findViewById(R.id.edtsom);
        soKm = viewCau2.findViewById(R.id.edtsokm);
        nutM = viewCau2.findViewById(R.id.rbtn1);
        nutG = viewCau2.findViewById(R.id.rbtn2);
        nutBit = viewCau2.findViewById(R.id.rbtn3);
        nutGroup = viewCau2.findViewById(R.id.radioGroup);
        nutChuyen = viewCau2.findViewById(R.id.btndoi);
        nutChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double met = Double.parseDouble(soMet.getText().toString());
                Double kmet = Double.parseDouble(soKm.getText().toString());
                if(nutM.isChecked()){
                    if(!met.isNaN() ){
                        double tam = met / 1000;
                        soKm.setText(String.valueOf(tam));
                    }
                    else {
                        double tam = kmet * 1000;
                        soMet.setText(String.valueOf(tam));
                    }
                }
                if (nutG.isChecked()){
                    if(!met.isNaN() ){
                        double tam = met /1000;
                        soKm.setText(String.valueOf(tam));
                    }
                    else {
                        double tam = kmet * 1000;
                        soMet.setText(String.valueOf(tam));
                    }
                }
                if(nutBit.isChecked()){

                }
            }
        });
        return viewCau2;
    }
}