package com.ayaya.myselfapp.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import com.ayaya.myselfapp.R;

public class profileFragment extends Fragment {

    RelativeLayout view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Profile");
        view = (RelativeLayout) inflater.inflate(R.layout.mm_fragment_profile, container, false);


        ImageButton btn_map = (ImageButton) view.findViewById(R.id.btn_map);
        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.google.com/maps/place/Jl.+Cikutra+Gg.+Sukarapih+V+No.1,+Cikutra,+Cibeunying+Kidul,+Kota+Bandung,+Jawa+Barat+40124/@-6.9013929,107.6416137,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e7be0ad7d9c3:0x1cd4b3de0f6f280b!8m2!3d-6.9013929!4d107.6438024"));
                startActivity(i);
            }
        });

        return view;
    }
}
