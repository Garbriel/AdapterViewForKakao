package com.ironlove.adapterviewforkakao.Activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;

import com.ironlove.adapterviewforkakao.Item.GettyImage;

import java.util.ArrayList;

public class BaseActivity extends AppCompatActivity {
    public final ArrayList<GettyImage> mListData = new ArrayList<>();
    public ArrayAdapter<GettyImage> mArrayAdapter;
    AbsListView mAbsListView;
    BaseActivity mActivity;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = this;
        mContext = this;

    }


}
