package com.example.list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.list.Board;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mPostRecyclerView;

    private BoardAdapter mAdpater;
    private List<Board> mDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPostRecyclerView = findViewById(R.id.recyclerView);
        mDatas = new ArrayList<>(); // 샘플 데이터 추가
        mDatas.add(new Board("qwe","asd","time","10"));
        mDatas.add(new Board("title","contents","time","10"));
        mDatas.add(new Board("title","contents","time","10"));
        mDatas.add(new Board("title","contents","time","10"));

        // Adapter, LayoutManager 연결
        mAdpater = new BoardAdapter(mDatas);
        mPostRecyclerView.setAdapter(mAdpater);
        mPostRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}