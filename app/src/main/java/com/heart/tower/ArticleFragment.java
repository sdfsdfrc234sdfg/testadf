package com.heart.tower;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.heart.tower.databinding.FragmentArticleBinding;
import com.heart.tower.entities.ArticlesItem;

import java.util.List;


public class ArticleFragment extends Fragment {

    private FragmentArticleBinding binding;
    private List<ArticlesItem> items = App.getInstance().getAppData().articleList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentArticleBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        int itemId = getArguments().getInt("id");
        ArticlesItem item = items.get(itemId);

        binding.articleImg.setImageResource(item.getImage());
        binding.articleImg.setClipToOutline(true);
        binding.titleText.setText(item.getTitle());
        binding.text.setText(item.getText());
    }
}
