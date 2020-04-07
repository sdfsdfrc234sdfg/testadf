package com.heart.tower.ui.main_scr;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.heart.tower.App;
import com.heart.tower.R;
import com.heart.tower.databinding.FragmentMainBinding;
import com.heart.tower.ui.main_scr.adapters.ViewPagerAdapter;
import com.heart.tower.util.DbRequest;


public class MainFragment extends Fragment {

    private FragmentMainBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentMainBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.viewPager.setAdapter(new ViewPagerAdapter(this));
        binding.viewPager.setUserInputEnabled(false);
        binding.viewPager.setOffscreenPageLimit(3);

        binding.backForm.setOnClickListener(form -> {
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_settingsFragment);
        });

        binding.bottomNavigationView.setOnNavigationItemSelectedListener(
                item -> {
                    switch (item.getItemId()) {
                        case R.id.action_search:
                            binding.viewPager.setCurrentItem(0);
                            break;
                        case R.id.action_profile:
                            binding.viewPager.setCurrentItem(1);
                            break;
                        case R.id.action_articles:
                            binding.viewPager.setCurrentItem(2);
                            break;
                    }
                    return true;
                });

        binding.exitIcon.setOnClickListener(view4 -> {
            logOut();
        });
    }


    private void logOut() {
        App.getInstance().getDatabase().userDao().getUserData().observe(this.getViewLifecycleOwner(), userInfo -> {
            if (userInfo == null) return;
            userInfo.auth = false;
            DbRequest.update(userInfo);
            Navigation.findNavController(getView()).navigate(R.id.log_out);
        });
    }
}
