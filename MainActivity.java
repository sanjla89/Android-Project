package com.my.company;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import android.widget.EditText;
import android.widget.Button;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DatabaseError;
import android.widget.Toast;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
  ViewPager2 viewPager2;
  TabLayout tabLayout;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    viewPager2 = findViewById(R.id.viewPager2);
    tabLayout = findViewById(R.id.tabLayout);
    // ViewPager swipe -> Tab selected
    ViewPagerAdapter adapter = new ViewPagerAdapter(this);
    viewPager2.setAdapter(adapter);
    viewPager2.registerOnPageChangeCallback(

        new ViewPager2.OnPageChangeCallback() {

          @Override
          public void onPageSelected(int position) {

            TabLayout.Tab tab = tabLayout.getTabAt(position);

            if (tab != null) {
              tab.select();
            }
          }
        });

    tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
      @Override
      public void onTabSelected(TabLayout.Tab tab) {
        viewPager2.setCurrentItem(tab.getPosition());
      }

      @Override
      public void onTabUnselected(TabLayout.Tab tab) {

      }

      @Override
      public void onTabReselected(TabLayout.Tab tab) {

      }
    });
  }

}
