package com.example.gogo.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.gogo.MainActivity;
import com.example.gogo.R;
import com.example.gogo.databinding.FragmentHomeBinding;
import com.example.gogo.databinding.FragmentNotificationsBinding;
import com.example.gogo.ui.List.CustomArrayAdapter;
import com.example.gogo.ui.List.CustomWord;
import com.example.gogo.ui.notifications.NotificationsViewModel;

import java.util.ArrayList;

public class HomeFragment extends Fragment {


    TextView text1;
    ListView listView;
    //listview 구성할 data
    String [] list = {"data1","data2","data3","data4","data5"};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_home, container, false);

        /* list에 1개만 넣을때 사용방법
        connect to subFragment xml id.
        text1 = view.findViewById(R.id.textView);
        listView = view.findViewById(R.id.listview_item);
        리스트뷰 설정- array define (context, layout, what data )
        MainActivity activity = (MainActivity)getActivity();    //적용할 context 추출
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(activity,R.layout.listview_item,list );
        listView.setAdapter(adapter);
        */

        MainActivity activity = (MainActivity)getActivity();
        ArrayList<CustomWord> customWords = new ArrayList<CustomWord>();
        customWords.add(new CustomWord("one","1", R.drawable.ic_home_black_24dp));
        customWords.add(new CustomWord("two","2", R.drawable.ic_home_black_24dp));
        customWords.add(new CustomWord("three","3",R.drawable.ic_home_black_24dp));
        customWords.add(new CustomWord("four","4", R.drawable.ic_home_black_24dp));
        customWords.add(new CustomWord("five","5", R.drawable.ic_home_black_24dp));


        CustomArrayAdapter itemsAdapter = new CustomArrayAdapter( activity, R.layout.listview_item, customWords);
        //아까 만든 xml파일에 있는 listView를 불러온다.
        listView = view.findViewById(R.id.listview_item);
        //SetAdapter를 이용해 ListView와 ArrayAdapter를 연결한다.
        listView.setAdapter(itemsAdapter);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}