package com.android.ninja;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PluginButterKnifeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PluginButterKnifeFragment extends Fragment {


    public PluginButterKnifeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment ButterKnifeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PluginButterKnifeFragment newInstance() {
        PluginButterKnifeFragment fragment = new PluginButterKnifeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_butter_knife, container, false);
    }

    private int mFindMe;

}
