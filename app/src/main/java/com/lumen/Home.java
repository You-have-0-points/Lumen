package com.lumen;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.lumen.databinding.ActivityHomeBinding;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        replaceFragment(new FragmentHome());

        ActivityHomeBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_home);

        ColorStateList iconColorStates = new ColorStateList(
                new int[][]{
                        new int[]{-android.R.attr.state_checked},
                        new int[]{android.R.attr.state_checked}
                },
                new int[]{
                        Color.parseColor("#FFFFFFFF"),
                        Color.parseColor("#FFFFFFFF")
                });

        binding.bottomNavigationView.setItemIconTintList(iconColorStates);
        binding.bottomNavigationView.setItemTextColor(iconColorStates);

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            if(item.getItemId() == R.id.nav_home){
                replaceFragment(new FragmentHome());
            } else if (item.getItemId() == R.id.nav_chats) {
                replaceFragment(new FragmentChats());
            } else if (item.getItemId() == R.id.nav_favourites) {
                replaceFragment(new FragmentFavourites());
            } else if (item.getItemId() == R.id.nav_profile) {
                replaceFragment(new FragmentProfile());
            }
            return true;
        });
    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.place_holder, fragment);
        fragmentTransaction.commit();
    }
}