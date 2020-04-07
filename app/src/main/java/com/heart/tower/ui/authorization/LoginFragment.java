package com.heart.tower.ui.authorization;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.heart.tower.App;
import com.heart.tower.R;
import com.heart.tower.databinding.FragmentLoginBinding;
import com.heart.tower.entities.dbData.UserInfo;
import com.heart.tower.util.DbRequest;


public class LoginFragment extends Fragment {


    private FragmentLoginBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLoginBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        App.getInstance().getDatabase().userDao().getUserData().observe(this.getViewLifecycleOwner(), userInfo -> {

            if (userInfo == null) return;
            binding.loginButton.setOnClickListener(view1 -> {
                String loginText = binding.loginEditText.getText().toString();
                String passText = binding.regPass.getText().toString();
                logIn(loginText, passText, userInfo);
            });
        });


        binding.regTextView.setOnClickListener(view12 ->
                Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_registerFragment));
        binding.recoveryText.setOnClickListener(view13 ->
                Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_passwordRecoveryFragment));
    }


    private void logIn(String login, String pass, UserInfo userInfo) {

        if (userInfo.pass.equals(pass) && userInfo.login.equals(login)) {
            userInfo.auth = true;
            DbRequest.update(userInfo);
            Navigation.findNavController(getView()).navigate(R.id.action_loginFragment_to_mainFragment);
        } else {
            message();
        }
    }

    private void message() {
        Toast.makeText(this.getContext(), "user does not exist", Toast.LENGTH_LONG).show();
    }
}
