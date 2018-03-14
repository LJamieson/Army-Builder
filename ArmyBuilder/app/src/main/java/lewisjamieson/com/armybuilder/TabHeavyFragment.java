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

public class TabHeavyFragment extends Fragment {
    private static final String TAG = "TabHeavyFragment";

    // Declare all of the items from the layout
    private Button HeavyCal;
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
    private EditText WeaponName1; private EditText WeaponName2; private EditText WeaponName3;
    private EditText WeaponR1; private EditText WeaponR2; private EditText WeaponR3;
    private EditText WeaponS1; private EditText WeaponS2; private EditText WeaponS3;
    private EditText WeaponAP1; private EditText WeaponAP2; private EditText WeaponAP3;
    private EditText WeaponT1; private EditText WeaponT2; private EditText WeaponT3;
    private EditText WeaponNote1; private EditText WeaponNote2; private EditText WeaponNote3;
    private EditText WeaponPoint1; private EditText WeaponPoint2; private EditText WeaponPoint3;

    private EditText WalkerName1;
    private EditText WalkerWS1;
    private EditText WalkerBS1;
    private EditText WalkerS1;
    private EditText WalkerF1;
    private EditText WalkerSide;
    private EditText WalkerR1;
    private EditText WalkerI1;
    private EditText WalkerA1;
    private EditText WalkerNote1;
    private EditText WalkerPoint1;

    private TextView TotalPoint;

    private Button BtnSave;
    private Button BtnLoad;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.heavy_fragment,container,false);

        HeavyCal = (Button) view.findViewById(R.id.Heavy_Cal);

        BtnSave = (Button) view.findViewById(R.id.HeavySave);
        BtnLoad = (Button) view.findViewById(R.id.HeavyLoad);

        UnitName1 = (EditText) view.findViewById(R.id.UnitHeavy_Name1); UnitName2 = (EditText) view.findViewById(R.id.UnitHeavy_Name2);
        UnitWS1 = (EditText) view.findViewById(R.id.UnitHeavy_WS1); UnitWS2 = (EditText) view.findViewById(R.id.UnitHeavy_WS2);
        UnitBS1 = (EditText) view.findViewById(R.id.UnitHeavy_BS1); UnitBS2 = (EditText) view.findViewById(R.id.UnitHeavy_BS2);
        UnitS1 = (EditText) view.findViewById(R.id.UnitHeavy_S1); UnitS2 = (EditText) view.findViewById(R.id.UnitHeavy_S2);
        UnitT1 = (EditText) view.findViewById(R.id.UnitHeavy_T1); UnitT2 = (EditText) view.findViewById(R.id.UnitHeavy_T2);
        UnitW1 = (EditText) view.findViewById(R.id.UnitHeavy_W1); UnitW2 = (EditText) view.findViewById(R.id.UnitHeavy_W2);
        UnitI1 = (EditText) view.findViewById(R.id.UnitHeavy_I1); UnitI2 = (EditText) view.findViewById(R.id.UnitHeavy_I2);
        UnitA1 = (EditText) view.findViewById(R.id.UnitHeavy_A1); UnitA2 = (EditText) view.findViewById(R.id.UnitHeavy_A2);
        UnitLd1 = (EditText) view.findViewById(R.id.UnitHeavy_Ld1); UnitLd2 = (EditText) view.findViewById(R.id.UnitHeavy_Ld2);
        UnitSv1 = (EditText) view.findViewById(R.id.UnitHeavy_Sv1); UnitSv2 = (EditText) view.findViewById(R.id.UnitHeavy_Sv2);
        UnitNotes1 = (EditText) view.findViewById(R.id.UnitHeavy_Note1); UnitNotes2 = (EditText) view.findViewById(R.id.UnitHeavy_Note2);
        UnitPoint1 = (EditText) view.findViewById(R.id.UnitHeavyPoints1); UnitPoint2 = (EditText) view.findViewById(R.id.UnitHeavyPoints2);

        VehicleName1 = (EditText) view.findViewById(R.id.VehicleHeavy_Name1);
        VehicleF1 = (EditText) view.findViewById(R.id.VehicleHeavy_F1);
        VehicleS1 = (EditText) view.findViewById(R.id.VehicleHeavy_S1);
        VehicleR1 = (EditText) view.findViewById(R.id.VehicleHeavy_R1);
        VehicleBS1 = (EditText) view.findViewById(R.id.VehicleHeavy_BS1);
        VehicleNotes1 = (EditText) view.findViewById(R.id.VehicleHeavy_Note1);
        VehiclePoint1 = (EditText) view.findViewById(R.id.VehicleHeavyPoints1);

        WeaponName1 = (EditText) view.findViewById(R.id.WeapHeavy_Name1); WeaponName2 = (EditText) view.findViewById(R.id.WeapHeavy_Name2);
        WeaponName3 = (EditText) view.findViewById(R.id.WeapHeavy_Name3);
        WeaponR1 = (EditText) view.findViewById(R.id.WeapHeavy_R1); WeaponR2 = (EditText) view.findViewById(R.id.WeapHeavy_R2);
        WeaponR3 = (EditText) view.findViewById(R.id.WeapHeavy_R3);
        WeaponS1 = (EditText) view.findViewById(R.id.WeapHeavy_S1); WeaponS2 = (EditText) view.findViewById(R.id.WeapHeavy_S2);
        WeaponS3 = (EditText) view.findViewById(R.id.WeapHeavy_S3);
        WeaponAP1 = (EditText) view.findViewById(R.id.WeapHeavy_AP1); WeaponAP2 = (EditText) view.findViewById(R.id.WeapHeavy_AP2);
        WeaponAP3 = (EditText) view.findViewById(R.id.WeapHeavy_AP3);
        WeaponT1 = (EditText) view.findViewById(R.id.WeapHeavy_T1); WeaponT2 = (EditText) view.findViewById(R.id.WeapHeavy_T2);
        WeaponT3 = (EditText) view.findViewById(R.id.WeapHeavy_T3);
        WeaponNote1 = (EditText) view.findViewById(R.id.WeapHeavy_Note1); WeaponNote2 = (EditText) view.findViewById(R.id.WeapHeavy_Note2);
        WeaponNote3 = (EditText) view.findViewById(R.id.WeapHeavy_Note3);
        WeaponPoint1 = (EditText) view.findViewById(R.id.WeapHeavyPoints1); WeaponPoint2 = (EditText) view.findViewById(R.id.WeapHeavyPoints2);
        WeaponPoint3 = (EditText) view.findViewById(R.id.WeapHeavyPoints3);
        TotalPoint = (TextView) view.findViewById(R.id.total_Heavy_points);

        WalkerName1= (EditText) view.findViewById(R.id.WalkHeavy_Name1);
        WalkerWS1= (EditText) view.findViewById(R.id.WalkHeavy_WS1);
        WalkerBS1= (EditText) view.findViewById(R.id.WalkHeavy_BS1);
        WalkerS1= (EditText) view.findViewById(R.id.WalkHeavy_S1);
        WalkerF1= (EditText) view.findViewById(R.id.WalkHeavy_F1);
        WalkerSide= (EditText) view.findViewById(R.id.WalkHeavy_Side1);
        WalkerR1= (EditText) view.findViewById(R.id.WalkHeavy_R1);
        WalkerI1= (EditText) view.findViewById(R.id.WalkHeavy_I1);
        WalkerA1= (EditText) view.findViewById(R.id.WalkHeavy_A1);
        WalkerNote1= (EditText) view.findViewById(R.id.WalkHeavy_Note1);
        WalkerPoint1= (EditText) view.findViewById(R.id.WalkHeavyPoints1);

        BtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String data = UnitName1.getText().toString() + ',' + UnitName2.getText().toString() + ',' + UnitWS1.getText().toString() + ',' + UnitWS2.getText().toString() + ',' + UnitBS1.getText().toString() + ',' + UnitBS2.getText().toString() + ',' + UnitS1.getText().toString() + ',' + UnitS2.getText().toString() + ',' + UnitT1.getText().toString() + ',' + UnitT2.getText().toString() + ',' + UnitW1.getText().toString() + ',' + UnitW2.getText().toString() + ',' + UnitI1.getText().toString() + ',' + UnitI2.getText().toString() + ',' + UnitA1.getText().toString() + ',' + UnitA2.getText().toString() + ',' + UnitLd1.getText().toString() + ',' + UnitLd2.getText().toString() + ',' + UnitSv1.getText().toString() + ',' + UnitSv2.getText().toString() + ',' + UnitNotes1.getText().toString() + ',' + UnitNotes2.getText().toString() + ',' + UnitPoint1.getText().toString() + ',' + UnitPoint2.getText().toString() +
                        ',' + VehicleName1.getText().toString() + ',' + VehicleF1.getText().toString() + ',' + VehicleS1.getText().toString() + ',' + VehicleR1.getText().toString() + ',' + VehicleBS1.getText().toString() + ',' + VehicleNotes1.getText().toString() + ',' + VehiclePoint1.getText().toString() +
                        ',' + WeaponName1.getText().toString() + ',' + WeaponName2.getText().toString() + ',' + WeaponName3.getText().toString() + ',' + WeaponR1.getText().toString() + ',' + WeaponR2.getText().toString() + ',' + WeaponR3.getText().toString() + ',' + WeaponS1.getText().toString() + ',' + WeaponS2.getText().toString() + ',' + WeaponS3.getText().toString() + ',' + WeaponAP1.getText().toString() + ',' + WeaponAP2.getText().toString() + ',' + WeaponAP3.getText().toString() + ',' + WeaponT1.getText().toString() + ',' + WeaponT2.getText().toString() + ',' + WeaponT3.getText().toString() + ',' + WeaponNote1.getText().toString() + ',' + WeaponNote2.getText().toString()+ ',' + WeaponNote3.getText().toString()+ ',' + WeaponPoint1.getText().toString() + ',' + WeaponPoint2.getText().toString() + ',' + WeaponPoint3.getText().toString() +
                        ',' + WalkerName1.getText().toString() + ',' + WalkerWS1.getText().toString() + ',' + WalkerBS1.getText().toString() + ',' + WalkerS1.getText().toString() + ',' + WalkerF1.getText().toString() + ',' + WalkerSide.getText().toString() + ',' +  WalkerR1.getText().toString() + ',' + WalkerI1.getText().toString() + ',' + WalkerA1.getText().toString() + ',' + WalkerNote1.getText().toString() + ',' + WalkerPoint1.getText().toString()+ ',' + TotalPoint.getText().toString() + ',' + "/n" ;

                if (data.matches(".*[a-z].*")) {
                String state = Environment.getExternalStorageState();
                if (Environment.MEDIA_MOUNTED.equals(state))
                {
                    File file = new File(getActivity().getExternalFilesDir(null), "Heavy_ArmyList.txt");

                    try {
                        OutputStream os = new FileOutputStream(file);
                        os.write(data.getBytes());
                        os.close();
                        Toast.makeText(getContext(),"Heavy saved",Toast.LENGTH_SHORT).show();
                    } catch (Exception e) {e.printStackTrace();}
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

                    File file = new File(getContext().getExternalFilesDir(null), "Heavy_ArmyList.txt");

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
                        WeaponR1.setText(output[34]);
                        WeaponR2.setText(output[35]);
                        WeaponR3.setText(output[36]);
                        WeaponS1.setText(output[37]);
                        WeaponS2.setText(output[38]);
                        WeaponS3.setText(output[39]);
                        WeaponAP1.setText(output[40]);
                        WeaponAP2.setText(output[41]);
                        WeaponAP3.setText(output[42]);
                        WeaponT1.setText(output[43]);
                        WeaponT2.setText(output[44]);
                        WeaponT3.setText(output[45]);
                        WeaponNote1.setText(output[46]);
                        WeaponNote2.setText(output[47]);
                        WeaponNote3.setText(output[48]);
                        WeaponPoint1.setText(output[49]);
                        WeaponPoint2.setText(output[50]);
                        WeaponPoint3.setText(output[51]);
                        WalkerName1.setText(output[52]);
                        WalkerWS1.setText(output[53]);
                        WalkerBS1.setText(output[54]);
                        WalkerS1.setText(output[55]);
                        WalkerF1.setText(output[56]);
                        WalkerSide.setText(output[57]);
                        WalkerR1.setText(output[58]);
                        WalkerI1.setText(output[59]);
                        WalkerA1.setText(output[60]);
                        WalkerNote1.setText(output[61]);
                        WalkerPoint1.setText(output[62]);
                        TotalPoint.setText(output[63]);

                    }
                    else
                    {
                        Toast.makeText(getContext(), "Heavy does not exist", Toast.LENGTH_SHORT).show();
                    }



                }
            }
        });
        HeavyCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int UnitHeavy_P1;
                if(UnitPoint1.getText().toString().isEmpty())
                {
                    UnitHeavy_P1 = 0;
                }
                else
                {
                    UnitHeavy_P1 = Integer.parseInt(String.valueOf(UnitPoint1.getText()));
                }
                int UnitHeavy_P2;
                if(UnitPoint2.getText().toString().isEmpty())
                {
                    UnitHeavy_P2 = 0;
                }
                else
                {
                    UnitHeavy_P2 = Integer.parseInt(String.valueOf(UnitPoint2.getText()));
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
                int WeapHeavy_P1;
                if(WeaponPoint1.getText().toString().isEmpty())
                {
                    WeapHeavy_P1 = 0;
                }
                else
                {
                    WeapHeavy_P1 = Integer.parseInt(String.valueOf(WeaponPoint1.getText()));
                }
                int WeapHeavy_P2;
                if(WeaponPoint2.getText().toString().isEmpty())
                {
                    WeapHeavy_P2 = 0;
                }
                else
                {
                    WeapHeavy_P2 = Integer.parseInt(String.valueOf(WeaponPoint2.getText()));
                }
                int WeapHeavy_P3;
                if(WeaponPoint3.getText().toString().isEmpty())
                {
                    WeapHeavy_P3 = 0;
                }
                else
                {
                    WeapHeavy_P3 = Integer.parseInt(String.valueOf(WeaponPoint3.getText()));
                }
                int WalkHeavy_P1;
                if(WalkerPoint1.getText().toString().isEmpty())
                {
                    WalkHeavy_P1 = 0;
                }
                else
                {
                    WalkHeavy_P1 = Integer.parseInt(String.valueOf(WalkerPoint1.getText()));
                }

                int Total = UnitHeavy_P1 + UnitHeavy_P2 + Vehicle_P1 + WeapHeavy_P1 + WeapHeavy_P2 + WeapHeavy_P3 + WalkHeavy_P1;
                TotalPoint.setText("" + Total);

            }
        });

        return view;
    }
}
