package com.example.gogo.ui.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.gogo.R;
import com.example.gogo.ui.home.HomeFragment;

import java.util.ArrayList;

public class CustomArrayAdapter extends ArrayAdapter<CustomWord> {

    //private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    private  ArrayList<CustomWord> CustomWords;

    public CustomArrayAdapter(Context context, int textViewResourceId, ArrayList<CustomWord> CustomWords){
        //컨스트럭터는 ArrayAdapter것을 갖다 썼다.
        //두 번쨰 인수는 하나의 TextView를 사용할 떄만 들어가는 값이므로 여기서는 그냥 0을 넣었다.
        super(context,textViewResourceId,CustomWords);
        this.CustomWords = CustomWords;
    }

    //아래와 같이 getView를 override하자.
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // listItemView 에 convertView를 설정한다. convertView는 스크롤이 넘어가서 안 보이게 될 때
        // 재활용되는 view다. 그래서 빈 값일 떄는 새로 만들어야 한다.
        View listItemView = convertView;
        if (listItemView ==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.listview_item,parent,false);
        }

        // 아까 만든 클래스의 인스턴스를 만들고 getItem method를 이용 위치에 따른 내용물을 넣어준다.
        CustomWord currentWord = getItem(position);

        // 이후 각 TextView값을 get 메소드를 이용해 설정한다.
        TextView textView1 = (TextView) listItemView.findViewById(R.id.textView1);
        textView1.setText(currentWord.getS1());


        TextView textView2 = (TextView) listItemView.findViewById(R.id.textView2);
        textView2.setText(currentWord.getS2());

        ImageView imageView1 = (ImageView) listItemView.findViewById(R.id.imageView1);
        imageView1.setImageResource(currentWord.getPhoto());

        return listItemView;
    }
}