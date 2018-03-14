package lewisjamieson.com.armybuilder;

import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by clone9o on 26/02/2018.
 */

public class TabTroopFragment extends Fragment {
    private static final String TAG = "TabTroopFragment";

    // Declare all of the items from the layout
    private Button TroopCal;
    private EditText UnitName1; private EditText UnitName2;
    private EditText UnitWS1; private EditText UnitWS2;
    private EditText UnitBS1; private EditText UnitBS2;
    private EditText UnitS1; private EditText UnitS2;
    private EditText UnitT1; private EditText UnitT2;
    private EditText UnitW1; private EditText UnitW2;
    private EditText UnitI1; private EditText UnitI2;
    private EditText UnitA1; private EditText UnitA2;
    private EditText UnitLd1; private EditText UnitLd2;
    private EditText UnitSv1; private EditText UnitSv2;
    private EditText UnitNotes1; private EditText UnitNotes2;
    private EditText UnitPoint1; private EditText UnitPoint2;
    private EditText VehicleName1;
    private EditText VehicleF1;
    private EditText VehicleS1;
    private EditText VehicleR1;
    private EditText VehicleBS1;
    private EditText VehicleNotes1;
    private EditText VehiclePoint1;
    private EditText WeaponName1; private EditText WeaponName2; private EditText WeaponName3; private EditText WeaponName4;
    private EditText WeaponR1; private EditText WeaponR2; private EditText WeaponR3; private EditText WeaponR4;
    private EditText WeaponS1; private EditText WeaponS2; private EditText WeaponS3; private EditText WeaponS4;
    private EditText WeaponAP1; private EditText WeaponAP2; private EditText WeaponAP3; private EditText WeaponAP4;
    private EditText WeaponT1; private EditText WeaponT2; private EditText WeaponT3; private EditText WeaponT4;
    private EditText WeaponNote1; private EditText WeaponNote2; private EditText WeaponNote3; private EditText WeaponNote4;
    private EditText WeaponPoint1; private EditText WeaponPoint2; private EditText WeaponPoint3; private EditText WeaponPoint4;
    private TextView TotalPoint;

    private Button BtnSave;
    private Button BtnLoad;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.troop_fragment,container,false);

        TroopCal = (Button) view.findViewById(R.id.Troop_Cal);

        BtnSave = (Button) view.findViewById(R.id.TroopSave);
        BtnLoad = (Button) view.findViewById(R.id.TroopLoad);

        UnitName1 = (EditText) view.findViewById(R.id.UnitTroop_Name1); UnitName2 = (EditText) view.findViewById(R.id.UnitTroop_Name2);
        UnitWS1 = (EditText) view.findViewById(R.id.UnitTroop_WS1); UnitWS2 = (EditText) view.findViewById(R.id.UnitTroop_WS2);
        UnitBS1 = (EditText) view.findViewById(R.id.UnitTroop_BS1); UnitBS2 = (EditText) view.findViewById(R.id.UnitTroop_BS2);
        UnitS1 = (EditText) view.findViewById(R.id.UnitTroop_S1); UnitS2 = (EditText) view.findViewById(R.id.UnitTroop_S2);
        UnitT1 = (EditText) view.findViewById(R.id.UnitTroop_T1); UnitT2 = (EditText) view.findViewById(R.id.UnitTroop_T2);
        UnitW1 = (EditText) view.findViewById(R.id.UnitTroop_W1); UnitW2 = (EditText) view.findViewById(R.id.UnitTroop_W2);
        UnitI1 = (EditText) view.findViewById(R.id.UnitTroop_I1); UnitI2 = (EditText) view.findViewById(R.id.UnitTroop_I2);
        UnitA1 = (EditText) view.findViewById(R.id.UnitTroop_A1); UnitA2 = (EditText) view.findViewById(R.id.UnitTroop_A2);
        UnitLd1 = (EditText) view.findViewById(R.id.UnitTroop_Ld1); UnitLd2 = (EditText) view.findViewById(R.id.UnitTroop_Ld2);
        UnitSv1 = (EditText) view.findViewById(R.id.UnitTroop_Sv1); UnitSv2 = (EditText) view.findViewById(R.id.UnitTroop_Sv2);
        UnitNotes1 = (EditText) view.findViewById(R.id.UnitTroop_Note1); UnitNotes2 = (EditText) view.findViewById(R.id.UnitTroop_Note2);
        UnitPoint1 = (EditText) view.findViewById(R.id.UnitTroopPoints1); UnitPoint2 = (EditText) view.findViewById(R.id.UnitTroopPoints2);

        VehicleName1 = (EditText) view.findViewById(R.id.VehicleTroop_Name1);
        VehicleF1 = (EditText) view.findViewById(R.id.VehicleTroop_F1);
        VehicleS1 = (EditText) view.findViewById(R.id.VehicleTroop_S1);
        VehicleR1 = (EditText) view.findViewById(R.id.VehicleTroop_R1);
        VehicleBS1 = (EditText) view.findViewById(R.id.VehicleTroop_BS1);
        VehicleNotes1 = (EditText) view.findViewById(R.id.VehicleTroop_Note1);
        VehiclePoint1 = (EditText) view.findViewById(R.id.VehicleTroopPoints1);

        WeaponName1 = (EditText) view.findViewById(R.id.WeapTroop_Name1); WeaponName2 = (EditText) view.findViewById(R.id.WeapTroop_Name2);
        WeaponName3 = (EditText) view.findViewById(R.id.WeapTroop_Name3); WeaponName4 = (EditText) view.findViewById(R.id.WeapTroop_Name4);
        WeaponR1 = (EditText) view.findViewById(R.id.WeapTroop_R1); WeaponR2 = (EditText) view.findViewById(R.id.WeapTroop_R2);
        WeaponR3 = (EditText) view.findViewById(R.id.WeapTroop_R3); WeaponR4 = (EditText) view.findViewById(R.id.WeapTroop_R4);
        WeaponS1 = (EditText) view.findViewById(R.id.WeapTroop_S1); WeaponS2 = (EditText) view.findViewById(R.id.WeapTroop_S2);
        WeaponS3 = (EditText) view.findViewById(R.id.WeapTroop_S3); WeaponS4 = (EditText) view.findViewById(R.id.WeapTroop_S4);
        WeaponAP1 = (EditText) view.findViewById(R.id.WeapTroop_AP1); WeaponAP2 = (EditText) view.findViewById(R.id.WeapTroop_AP2);
        WeaponAP3 = (EditText) view.findViewById(R.id.WeapTroop_AP3); WeaponAP4 = (EditText) view.findViewById(R.id.WeapTroop_AP4);
        WeaponT1 = (EditText) view.findViewById(R.id.WeapTroop_T1); WeaponT2 = (EditText) view.findViewById(R.id.WeapTroop_T2);
        WeaponT3 = (EditText) view.findViewById(R.id.WeapTroop_T3); WeaponT4 = (EditText) view.findViewById(R.id.WeapTroop_T4);
        WeaponNote1 = (EditText) view.findViewById(R.id.WeapTroop_Note1); WeaponNote2 = (EditText) view.findViewById(R.id.WeapTroop_Note2);
        WeaponNote3 = (EditText) view.findViewById(R.id.WeapTroop_Note3); WeaponNote4 = (EditText) view.findViewById(R.id.WeapTroop_Note4);
        WeaponPoint1 = (EditText) view.findViewById(R.id.WeapTroopPoints1); WeaponPoint2 = (EditText) view.findViewById(R.id.WeapTroopPoints2);
        WeaponPoint3 = (EditText) view.findViewById(R.id.WeapTroopPoints3); WeaponPoint4 = (EditText) view.findViewById(R.id.WeapTroopPoints4);
        TotalPoint = (TextView) view.findViewById(R.id.total_Troop_points);

        BtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String data = UnitName1.getText().toString() + ',' + UnitName2.getText().toString() + ',' + UnitWS1.getText().toString() + ',' + UnitWS2.getText().toString() + ',' + UnitBS1.getText().toString() + ',' + UnitBS2.getText().toString() + ',' + UnitS1.getText().toString() + ',' + UnitS2.getText().toString() + ',' + UnitT1.getText().toString() + ',' + UnitT2.getText().toString() + ',' + UnitW1.getText().toString() + ',' + UnitW2.getText().toString() + ',' + UnitI1.getText().toString() + ',' + UnitI2.getText().toString() + ',' + UnitA1.getText().toString() + ',' + UnitA2.getText().toString() + ',' + UnitLd1.getText().toString() + ',' + UnitLd2.getText().toString() + ',' + UnitSv1.getText().toString() + ',' + UnitSv2.getText().toString() + ',' + UnitNotes1.getText().toString() + ',' + UnitNotes2.getText().toString() + ',' + UnitPoint1.getText().toString() + ',' + UnitPoint2.getText().toString() +
                        ',' + VehicleName1.getText().toString() + ',' + VehicleF1.getText().toString() + ',' + VehicleS1.getText().toString() + ',' + VehicleR1.getText().toString() + ',' + VehicleBS1.getText().toString() + ',' + VehicleNotes1.getText().toString() + ',' + VehiclePoint1.getText().toString() +
                        ',' + WeaponName1.getText().toString() + ',' + WeaponName2.getText().toString() + ',' + WeaponName3.getText().toString() + ',' + WeaponName4.getText().toString() + ',' + WeaponR1.getText().toString() + ',' + WeaponR2.getText().toString() + ',' + WeaponR3.getText().toString() + ',' + WeaponR4.getText().toString() + ',' + WeaponS1.getText().toString() + ',' + WeaponS2.getText().toString() + ',' + WeaponS3.getText().toString() + ',' + WeaponS4.getText().toString() + ',' + WeaponAP1.getText().toString() + ',' + WeaponAP2.getText().toString() + ',' + WeaponAP3.getText().toString() + ',' + WeaponAP4.getText().toString() + ',' + WeaponT1.getText().toString() + ',' + WeaponT2.getText().toString() + ',' + WeaponT3.getText().toString() + ',' + WeaponT4.getText().toString() + ',' + WeaponNote1.getText().toString() + ',' + WeaponNote2.getText().toString() + ',' + WeaponNote3.getText().toString() + ',' + WeaponNote4.getText().toString() + ',' + WeaponPoint1.getText().toString() + ',' + WeaponPoint2.getText().toString() + ',' + WeaponPoint3.getText().toString() + ',' + WeaponPoint4.getText().toString() + ',' + TotalPoint.getText().toString()+ ',' + "/n" ;

                if (data.matches(".*[a-z].*")) {
                    String state = Environment.getExternalStorageState();
                    if (Environment.MEDIA_MOUNTED.equals(state)) {
                        File file = new File(getActivity().getExternalFilesDir(null), "Troop_ArmyList.txt");

                        try {
                            OutputStream os = new FileOutputStream(file);
                            os.write(data.getBytes());
                            os.close();
                            Toast.makeText(getContext(), "Troop saved", Toast.LENGTH_SHORT).show();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                } else {
                    Toast.makeText(getContext(), "Error: empty did not save", Toast.LENGTH_SHORT).show();
                }
            }
        });

        BtnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String state = Environment.getExternalStorageState();
                if (Environment.MEDIA_MOUNTED.equals(state)) {

                    File file = new File(getContext().getExternalFilesDir(null), "Troop_ArmyList.txt");

                    StringBuffer inStr = new StringBuffer(" ");
                    int ch;
                    try {
                        InputStream is = new FileInputStream(file);
                        while ((ch = is.read()) != -1) {
                            inStr.append((char) ch);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    String data = new String(inStr);
                    String[] output= data.split(",");

                    if(file.exists()) {
                        UnitName1.setText(output[0]);
                        UnitName2.setText(output[1]);
                        UnitWS1.setText(output[2]);
                        UnitWS2.setText(output[3]);
                        UnitBS1.setText(output[4]);
                        UnitBS2.setText(output[5]);
                        UnitS1.setText(output[6]);
                        UnitS2.setText(output[7]);
                        UnitT1.setText(output[8]);
                        UnitT2.setText(output[9]);
                        UnitW1.setText(output[10]);
                        UnitW2.setText(output[11]);
                        UnitI1.setText(output[12]);
                        UnitI2.setText(output[13]);
                        UnitA1.setText(output[14]);
                        UnitA2.setText(output[15]);
                        UnitLd1.setText(output[16]);
                        UnitLd2.setText(output[17]);
                        UnitSv1.setText(output[18]);
                        UnitSv2.setText(output[19]);
                        UnitNotes1.setText(output[20]);
                        UnitNotes2.setText(output[21]);
                        UnitPoint1.setText(output[22]);
                        UnitPoint2.setText(output[23]);
                        VehicleName1.setText(output[24]);
                        VehicleF1.setText(output[25]);
                        VehicleS1.setText(output[26]);
                        VehicleR1.setText(output[27]);
                        VehicleBS1.setText(output[28]);
                        VehicleNotes1.setText(output[29]);
                        VehiclePoint1.setText(output[30]);
                        WeaponName1.setText(output[31]);
                        WeaponName2.setText(output[32]);
                        WeaponName3.setText(output[33]);
                        WeaponName4.setText(output[34]);
                        WeaponR1.setText(output[35]);
                        WeaponR2.setText(output[36]);
                        WeaponR3.setText(output[37]);
                        WeaponR4.setText(output[38]);
                        WeaponS1.setText(output[39]);
                        WeaponS2.setText(output[40]);
                        WeaponS3.setText(output[41]);
                        WeaponS4.setText(output[42]);
                        WeaponAP1.setText(output[43]);
                        WeaponAP2.setText(output[44]);
                        WeaponAP3.setText(output[45]);
                        WeaponAP4.setText(output[46]);
                        WeaponT1.setText(output[47]);
                        WeaponT2.setText(output[48]);
                        WeaponT3.setText(output[49]);
                        WeaponT4.setText(output[50]);
                        WeaponNote1.setText(output[51]);
                        WeaponNote2.setText(output[52]);
                        WeaponNote3.setText(output[53]);
                        WeaponNote4.setText(output[54]);
                        WeaponPoint1.setText(output[55]);
                        WeaponPoint2.setText(output[56]);
                        WeaponPoint3.setText(output[57]);
                        WeaponPoint4.setText(output[58]);
                        TotalPoint.setText(output[59]);
                    }
                    else
                    {
                        Toast.makeText(getContext(), "Troop does not exist", Toast.LENGTH_SHORT).show();
                    }



                }
            }
        });

        TroopCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int UnitTroop_P1;
                if(UnitPoint1.getText().toString().isEmpty())
                {
                    UnitTroop_P1 = 0;
                }
                else
                {
                    UnitTroop_P1 = Integer.parseInt(String.valueOf(UnitPoint1.getText()));
                }
                int UnitTroop_P2;
                if(UnitPoint2.getText().toString().isEmpty())
                {
                    UnitTroop_P2 = 0;
                }
                else
                {
                    UnitTroop_P2 = Integer.parseInt(String.valueOf(UnitPoint2.getText()));
                }
                int Vehicle_P1;
                if(VehiclePoint1.getText().toString().isEmpty())
                {
                    Vehicle_P1 = 0;
                }
                else
                {
                    Vehicle_P1 = Integer.parseInt(String.valueOf(VehiclePoint1.getText()));
                }
                int WeapTroop_P1;
                if(WeaponPoint1.getText().toString().isEmpty())
                {
                    WeapTroop_P1 = 0;
                }
                else
                {
                    WeapTroop_P1 = Integer.parseInt(String.valueOf(WeaponPoint1.getText()));
                }
                int WeapTroop_P2;
                if(WeaponPoint2.getText().toString().isEmpty())
                {
                    WeapTroop_P2 = 0;
                }
                else
                {
                    WeapTroop_P2 = Integer.parseInt(String.valueOf(WeaponPoint2.getText()));
                }
                int WeapTroop_P3;
                if(WeaponPoint3.getText().toString().isEmpty())
                {
                    WeapTroop_P3 = 0;
                }
                else
                {
                    WeapTroop_P3 = Integer.parseInt(String.valueOf(WeaponPoint3.getText()));
                }
                int WeapTroop_P4;
                if(WeaponPoint4.getText().toString().isEmpty())
                {
                    WeapTroop_P4 = 0;
                }
                else
                {
                    WeapTroop_P4 = Integer.parseInt(String.valueOf(WeaponPoint4.getText()));
                }

                int Total = UnitTroop_P1 + UnitTroop_P2 + Vehicle_P1 + WeapTroop_P1 + WeapTroop_P2 + WeapTroop_P3 + WeapTroop_P4;
                TotalPoint.setText("" + Total);
            }
        });

        return view;
    }
}
