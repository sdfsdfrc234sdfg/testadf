package com.heart.tower.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.heart.tower.App;
import com.heart.tower.R;
import com.heart.tower.databinding.FragmentOwnProfileBinding;
import com.heart.tower.databinding.FragmentProfileBinding;
import com.heart.tower.entities.SearchItem;

import java.util.List;


public class ProfileFragment extends Fragment {

    private FragmentProfileBinding binding;
    List<SearchItem> list = App.getInstance().getAppData().searchList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentProfileBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        int itemId = getArguments().getInt("id");
        SearchItem item = list.get(itemId);

        binding.iconImg.setClipToOutline(true);

        binding.iconImg.setImageResource(item.getImg());
        binding.name.setText(item.getName() +" "+ item.getAge());
        binding.place.setText(item.getCity());
        binding.searchText.setText(item.getSearch());
        binding.getToKnowText.setText(item.getGetToKnow());
        binding.purposeOfDatingText.setText(item.getPurposeOfDating());
        binding.myDetailsText.setText(
                view.getResources().getString(R.string.height)+ " "+item.getHeight()+"\n"+
                        view.getResources().getString(R.string.weight)+ " "+item.getWeight()
        );
        binding.bodyTypeText.setText(item.getBodyType());
        binding.appearanceText.setText(item.getAppearance());
        binding.educationText.setText(item.getEducation());
        binding.knowledgeOfLanguagesText.setText(item.getKnowledgeOfLanguages());
        binding.orientationText.setText(item.getOrientation());
        binding.attitudeTowardsSmokingText.setText(item.getAttitudeTowardsSmoking());
        binding.attitudeToAlcoholText.setText(item.getAttitudeToAlcohol());
        binding.liveStateText.setText(item.getLiveState());
        binding.shildrenText.setText(item.getChildren());
        binding.moneyStateText.setText(item.getMoneyState());
    }
}