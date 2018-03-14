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

public class TabHQFragment extends Fragment {
    private static final String TAG = "TabHQFragment";

    // Declare all of the items from the layout
    private Button HQCal;
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
    private EditText ArmyName;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hq_fragment,container,false);

        HQCal = (Button) view.findViewById(R.id.HQ_Cal);
        BtnSave = (Button) view.findViewById(R.id.HQSave);
        BtnLoad = (Button) view.findViewById(R.id.HQLoad);
        ArmyName = (EditText) view.findViewById(R.id.V_army_name);

        UnitName1 = (EditText) view.findViewById(R.id.UnitHQ_Name1); UnitName2 = (EditText) view.findViewById(R.id.UnitHQ_Name2);
        UnitWS1 = (EditText) view.findViewById(R.id.UnitHQ_WS1); UnitWS2 = (EditText) view.findViewById(R.id.UnitHQ_WS2);
        UnitBS1 = (EditText) view.findViewById(R.id.UnitHQ_BS1); UnitBS2 = (EditText) view.findViewById(R.id.UnitHQ_BS2);
        UnitS1 = (EditText) view.findViewById(R.id.UnitHQ_S1); UnitS2 = (EditText) view.findViewById(R.id.UnitHQ_S2);
        UnitT1 = (EditText) view.findViewById(R.id.UnitHQ_T1); UnitT2 = (EditText) view.findViewById(R.id.UnitHQ_T2);
        UnitW1 = (EditText) view.findViewById(R.id.UnitHQ_W1); UnitW2 = (EditText) view.findViewById(R.id.UnitHQ_W2);
        UnitI1 = (EditText) view.findViewById(R.id.UnitHQ_I1); UnitI2 = (EditText) view.findViewById(R.id.UnitHQ_I2);
        UnitA1 = (EditText) view.findViewById(R.id.UnitHQ_A1); UnitA2 = (EditText) view.findViewById(R.id.UnitHQ_A2);
        UnitLd1 = (EditText) view.findViewById(R.id.UnitHQ_Ld1); UnitLd2 = (EditText) view.findViewById(R.id.UnitHQ_Ld2);
        UnitSv1 = (EditText) view.findViewById(R.id.UnitHQ_Sv1); UnitSv2 = (EditText) view.findViewById(R.id.UnitHQ_Sv2);
        UnitNotes1 = (EditText) view.findViewById(R.id.UnitHQ_Note1); UnitNotes2 = (EditText) view.findViewById(R.id.UnitHQ_Note2);
        UnitPoint1 = (EditText) view.findViewById(R.id.UnitHQPoints1); UnitPoint2 = (EditText) view.findViewById(R.id.UnitHQPoints2);

        VehicleName1 = (EditText) view.findViewById(R.id.VehicleHQ_Name1);
        VehicleF1 = (EditText) view.findViewById(R.id.VehicleHQ_F1);
        VehicleS1 = (EditText) view.findViewById(R.id.VehicleHQ_S1);
        VehicleR1 = (EditText) view.findViewById(R.id.VehicleHQ_R1);
        VehicleBS1 = (EditText) view.findViewById(R.id.VehicleHQ_BS1);
        VehicleNotes1 = (EditText) view.findViewById(R.id.VehicleHQ_Note1);
        VehiclePoint1 = (EditText) view.findViewById(R.id.VehicleHQPoints1);

        WeaponName1 = (EditText) view.findViewById(R.id.WeapHQ_Name1); WeaponName2 = (EditText) view.findViewById(R.id.WeapHQ_Name2);
        WeaponName3 = (EditText) view.findViewById(R.id.WeapHQ_Name3); WeaponName4 = (EditText) view.findViewById(R.id.WeapHQ_Name4);
        WeaponR1 = (EditText) view.findViewById(R.id.WeapHQ_R1); WeaponR2 = (EditText) view.findViewById(R.id.WeapHQ_R2);
        WeaponR3 = (EditText) view.findViewById(R.id.WeapHQ_R3); WeaponR4 = (EditText) view.findViewById(R.id.WeapHQ_R4);
        WeaponS1 = (EditText) view.findViewById(R.id.WeapHQ_S1); WeaponS2 = (EditText) view.findViewById(R.id.WeapHQ_S2);
        WeaponS3 = (EditText) view.findViewById(R.id.WeapHQ_S3); WeaponS4 = (EditText) view.findViewById(R.id.WeapHQ_S4);
        WeaponAP1 = (EditText) view.findViewById(R.id.WeapHQ_AP1); WeaponAP2 = (EditText) view.findViewById(R.id.WeapHQ_AP2);
        WeaponAP3 = (EditText) view.findViewById(R.id.WeapHQ_AP3); WeaponAP4 = (EditText) view.findViewById(R.id.WeapHQ_AP4);
        WeaponT1 = (EditText) view.findViewById(R.id.WeapHQ_T1); WeaponT2 = (EditText) view.findViewById(R.id.WeapHQ_T2);
        WeaponT3 = (EditText) view.findViewById(R.id.WeapHQ_T3); WeaponT4 = (EditText) view.findViewById(R.id.WeapHQ_T4);
        WeaponNote1 = (EditText) view.findViewById(R.id.WeapHQ_Note1); WeaponNote2 = (EditText) view.findViewById(R.id.WeapHQ_Note2);
        WeaponNote3 = (EditText) view.findViewById(R.id.WeapHQ_Note3); WeaponNote4 = (EditText) view.findViewById(R.id.WeapHQ_Note4);
        WeaponPoint1 = (EditText) view.findViewById(R.id.WeapHQPoints1); WeaponPoint2 = (EditText) view.findViewById(R.id.WeapHQPoints2);
        WeaponPoint3 = (EditText) view.findViewById(R.id.WeapHQPoints3); WeaponPoint4 = (EditText) view.findViewById(R.id.WeapHQPoints4);
        TotalPoint = (TextView) view.findViewById(R.id.total_HQ_points);

        BtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String data = ArmyName.getText().toString() + ',' + UnitName1.getText().toString() + ',' + UnitName2.getText().toString() + ',' + UnitWS1.getText().toString() + ',' + UnitWS2.getText().toString() + ',' + UnitBS1.getText().toString() + ',' + UnitBS2.getText().toString() + ',' + UnitS1.getText().toString() + ',' + UnitS2.getText().toString() + ',' + UnitT1.getText().toString() + ',' + UnitT2.getText().toString() + ',' + UnitW1.getText().toString() + ',' + UnitW2.getText().toString() + ',' + UnitI1.getText().toString() + ',' + UnitI2.getText().toString() + ',' + UnitA1.getText().toString() + ',' + UnitA2.getText().toString() + ',' + UnitLd1.getText().toString() + ',' + UnitLd2.getText().toString() + ',' + UnitSv1.getText().toString() + ',' + UnitSv2.getText().toString() + ',' + UnitNotes1.getText().toString() + ',' + UnitNotes2.getText().toString() + ',' + UnitPoint1.getText().toString() + ',' + UnitPoint2.getText().toString() +
                        ',' + VehicleName1.getText().toString() + ',' + VehicleF1.getText().toString() + ',' + VehicleS1.getText().toString() + ',' + VehicleR1.getText().toString() + ',' + VehicleBS1.getText().toString() + ',' + VehicleNotes1.getText().toString() + ',' + VehiclePoint1.getText().toString() +
                        ',' + WeaponName1.getText().toString() + ',' + WeaponName2.getText().toString() + ',' + WeaponName3.getText().toString() + ',' + WeaponName4.getText().toString() + ',' + WeaponR1.getText().toString() + ',' + WeaponR2.getText().toString() + ',' + WeaponR3.getText().toString() + ',' + WeaponR4.getText().toString() + ',' + WeaponS1.getText().toString() + ',' + WeaponS2.getText().toString() + ',' + WeaponS3.getText().toString() + ',' + WeaponS4.getText().toString() + ',' + WeaponAP1.getText().toString() + ',' + WeaponAP2.getText().toString() + ',' + WeaponAP3.getText().toString() + ',' + WeaponAP4.getText().toString() + ',' + WeaponT1.getText().toString() + ',' + WeaponT2.getText().toString() + ',' + WeaponT3.getText().toString() + ',' + WeaponT4.getText().toString() + ',' + WeaponNote1.getText().toString() + ',' + WeaponNote2.getText().toString()+ ',' + WeaponNote3.getText().toString()+ ',' + WeaponNote4.getText().toString()+ ',' + WeaponPoint1.getText().toString() + ',' + WeaponPoint2.getText().toString() + ',' + WeaponPoint3.getText().toString() + ',' + WeaponPoint4.getText().toString() + ',' + TotalPoint.getText().toString()+ ',' + "/n" ;

                if (data.matches(".*[a-z].*")) {
                    String state = Environment.getExternalStorageState();
                    if (Environment.MEDIA_MOUNTED.equals(state)) {
                        File file = new File(getActivity().getExternalFilesDir(null), "HQ_ArmyList.txt");

                        try {
                            OutputStream os = new FileOutputStream(file);
                            os.write(data.getBytes());
                            os.close();
                            Toast.makeText(getContext(), "HQ saved", Toast.LENGTH_SHORT).show();
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
                    File file = new File(getContext().getExternalFilesDir(null), "HQ_ArmyList.txt");


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
                        ArmyName.setText(output[0]);

                        UnitName1.setText(output[1]);
                        UnitName2.setText(output[2]);
                        UnitWS1.setText(output[3]);
                        UnitWS2.setText(output[4]);
                        UnitBS1.setText(output[5]);
                        UnitBS2.setText(output[6]);
                        UnitS1.setText(output[7]);
                        UnitS2.setText(output[8]);
                        UnitT1.setText(output[9]);
                        UnitT2.setText(output[10]);
                        UnitW1.setText(output[11]);
                        UnitW2.setText(output[12]);
                        UnitI1.setText(output[13]);
                        UnitI2.setText(output[14]);
                        UnitA1.setText(output[15]);
                        UnitA2.setText(output[16]);
                        UnitLd1.setText(output[17]);
                        UnitLd2.setText(output[18]);
                        UnitSv1.setText(output[19]);
                        UnitSv2.setText(output[20]);
                        UnitNotes1.setText(output[21]);
                        UnitNotes2.setText(output[22]);
                        UnitPoint1.setText(output[23]);
                        UnitPoint2.setText(output[24]);
                        VehicleName1.setText(output[25]);
                        VehicleF1.setText(output[26]);
                        VehicleS1.setText(output[27]);
                        VehicleR1.setText(output[28]);
                        VehicleBS1.setText(output[29]);
                        VehicleNotes1.setText(output[30]);
                        VehiclePoint1.setText(output[31]);
                        WeaponName1.setText(output[32]);
                        WeaponName2.setText(output[33]);
                        WeaponName3.setText(output[34]);
                        WeaponName4.setText(output[35]);
                        WeaponR1.setText(output[36]);
                        WeaponR2.setText(output[37]);
                        WeaponR3.setText(output[38]);
                        WeaponR4.setText(output[39]);
                        WeaponS1.setText(output[40]);
                        WeaponS2.setText(output[41]);
                        WeaponS3.setText(output[42]);
                        WeaponS4.setText(output[43]);
                        WeaponAP1.setText(output[44]);
                        WeaponAP2.setText(output[45]);
                        WeaponAP3.setText(output[46]);
                        WeaponAP4.setText(output[47]);
                        WeaponT1.setText(output[48]);
                        WeaponT2.setText(output[49]);
                        WeaponT3.setText(output[50]);
                        WeaponT4.setText(output[51]);
                        WeaponNote1.setText(output[52]);
                        WeaponNote2.setText(output[53]);
                        WeaponNote3.setText(output[54]);
                        WeaponNote4.setText(output[55]);
                        WeaponPoint1.setText(output[56]);
                        WeaponPoint2.setText(output[57]);
                        WeaponPoint3.setText(output[58]);
                        WeaponPoint4.setText(output[59]);
                        TotalPoint.setText(output[60]);
                    }
                    else
                    {
                        Toast.makeText(getContext(), "HQ does not exist", Toast.LENGTH_SHORT).show();
                    }



                }
            }
        });

        HQCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int UnitHQ_P1;
                if(UnitPoint1.getText().toString().isEmpty())
                {
                    UnitHQ_P1 = 0;
                }
                else
                {
                    UnitHQ_P1 = Integer.parseInt(String.valueOf(UnitPoint1.getText()));
                }
                int UnitHQ_P2;
                if(UnitPoint2.getText().toString().isEmpty())
                {
                    UnitHQ_P2 = 0;
                }
                else
                {
                    UnitHQ_P2 = Integer.parseInt(String.valueOf(UnitPoint2.getText()));
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
                int WeapHQ_P1;
                if(WeaponPoint1.getText().toString().isEmpty())
                {
                    WeapHQ_P1 = 0;
                }
                else
                {
                    WeapHQ_P1 = Integer.parseInt(String.valueOf(WeaponPoint1.getText()));
                }
                int WeapHQ_P2;
                if(WeaponPoint2.getText().toString().isEmpty())
                {
                    WeapHQ_P2 = 0;
                }
                else
                {
                    WeapHQ_P2 = Integer.parseInt(String.valueOf(WeaponPoint2.getText()));
                }
                int WeapHQ_P3;
                if(WeaponPoint3.getText().toString().isEmpty())
                {
                    WeapHQ_P3 = 0;
                }
                else
                {
                    WeapHQ_P3 = Integer.parseInt(String.valueOf(WeaponPoint3.getText()));
                }
                int WeapHQ_P4;
                if(WeaponPoint4.getText().toString().isEmpty())
                {
                    WeapHQ_P4 = 0;
                }
                else
                {
                    WeapHQ_P4 = Integer.parseInt(String.valueOf(WeaponPoint4.getText()));
                }

                int Total = UnitHQ_P1 + UnitHQ_P2 + Vehicle_P1 + WeapHQ_P1 + WeapHQ_P2 + WeapHQ_P3 + WeapHQ_P4;
                TotalPoint.setText("" + Total);
            }
        });



        return view;
    }
}
