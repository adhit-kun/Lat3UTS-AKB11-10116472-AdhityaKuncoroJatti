package com.ayaya.myselfapp.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.ayaya.myselfapp.Adapter.DailyAdapter;
import com.ayaya.myselfapp.Adapter.FriendAdapter;
import com.ayaya.myselfapp.Model.DailyModel;
import com.ayaya.myselfapp.Model.FriendModel;
import com.ayaya.myselfapp.R;

import java.util.ArrayList;

public class dailyFragment extends Fragment {

    private RecyclerView mRecycleView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private RecyclerView mRecycleView2;
    private RecyclerView.Adapter mAdapter2;
    private RecyclerView.LayoutManager mLayoutManager2;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        getActivity().setTitle("Daily Activity");
        //return inflater.inflate(R.layout.mm_fragment_daily, container,false);

        final View myFragmentView = inflater.inflate(R.layout.mm_fragment_daily, container, false);

        ArrayList<DailyModel> dailyModels = new ArrayList<>();
        dailyModels.add(new DailyModel(R.drawable.calender,"Pukul 04:00 - 04:30 bangun tidur + persiapan"));
        dailyModels.add(new DailyModel(R.drawable.calender,"Pukul 04:30 - 05:15 Sholat Shubuh + Ngaji"));
        dailyModels.add(new DailyModel(R.drawable.calender,"Pukul 05:15 - 06:00 Santai Pagi"));
        dailyModels.add(new DailyModel(R.drawable.calender,"Pukul 06:00 - 07:00 Sarapan Pagi"));
        dailyModels.add(new DailyModel(R.drawable.calender,"Pukul 07:00 - 11:45 Aktivitas Produktif"));
        dailyModels.add(new DailyModel(R.drawable.calender,"Pukul 11:45 - 12:15 Sholat Dzuhur"));
        dailyModels.add(new DailyModel(R.drawable.calender,"Pukul 12:15 - 15:00 Aktivitas Produktif / Istirahat"));
        dailyModels.add(new DailyModel(R.drawable.calender,"Pukul 15:00 - 15:30 Sholat Ashar"));
        dailyModels.add(new DailyModel(R.drawable.calender,"Pukul 15:30 - 17:45 Aktivitas Produktif / Santai Sore"));
        dailyModels.add(new DailyModel(R.drawable.calender,"Pukul 17:45 - 18:30 Sholat Maghrib + Ngaji"));
        dailyModels.add(new DailyModel(R.drawable.calender,"Pukul 18:30 - 19:00 Review Pembelajaran"));
        dailyModels.add(new DailyModel(R.drawable.calender,"Pukul 19:00 - 19:30 Sholat Isya + Ngaji"));
        dailyModels.add(new DailyModel(R.drawable.calender,"Pukul 19:30 - 22:00 Aktivitas Produktif / Santai Malam"));
        dailyModels.add(new DailyModel(R.drawable.calender,"Pukul 22:00 - 04:00 Istirahat"));

        mRecycleView = myFragmentView.findViewById(R.id.da_dailyActivity);
        mRecycleView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new DailyAdapter(dailyModels);

        mRecycleView.setLayoutManager(mLayoutManager);
        mRecycleView.setAdapter(mAdapter);

        ArrayList<FriendModel> friendsModels = new ArrayList<>();
        friendsModels.add(new FriendModel(R.drawable.calender,"M Fajar M"));
        friendsModels.add(new FriendModel(R.drawable.calender,"M Fajar I"));

        mRecycleView2 = myFragmentView.findViewById(R.id.da_friend);
        mRecycleView2.setHasFixedSize(true);
        mLayoutManager2 = new LinearLayoutManager(getActivity());
        mAdapter2 = new FriendAdapter(friendsModels);

        mRecycleView2.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayout.HORIZONTAL,false));
        mRecycleView2.setAdapter(mAdapter2);

        return myFragmentView;

    }
}
