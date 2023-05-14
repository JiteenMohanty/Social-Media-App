package com.example.socialmedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.socialmedia.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());

        binding.bottomNavigationView.setOnItemReselectedListener(item -> {

            if (item.getItemId()== R.id.home){
                replaceFragment(new HomeFragment());
            }
            else if (item.getItemId()== R.id.search) {
                replaceFragment(new SearchFragment());
            }
            else if (item.getItemId()== R.id.profile) {
                replaceFragment(new ProfileFragment());
            }
            else if (item.getItemId()== R.id.add) {
                replaceFragment(new AddFragment());
            }
            else if (item.getItemId()== R.id.notification) {
                replaceFragment(new NotificationFragment());
            }

        });
    }

    private void replaceFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();
    }
}