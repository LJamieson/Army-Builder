package lewisjamieson.com.armybuilder;

import android.content.Intent;
import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by clone9o on 04/03/2018.
 */

public class TabHomeFragment extends Fragment {
    private static final String TAG = "TabHomeFragment";
    private Button BtnAbout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.home_fragment,container,false);

        // Create ad
        AdView adView = (AdView) view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);

        // Open other activity
        BtnAbout = (Button) view.findViewById(R.id.about);
        BtnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(getActivity(),AboutActivity.class);
                startActivity(about);
            }
        });


        return view;
    }
}
