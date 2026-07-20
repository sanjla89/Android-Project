package com.my.company;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public class ViewPagerAdapter extends FragmentStateAdapter{
   public ViewPagerAdapter(FragmentActivity activity){
       super(activity);
   }
   @Override
   public Fragment createFragment(int position){
       switch (position){
           case 0:
               return new HomeFragment();
           case 1:
               return new ContactFragment();
           case 2:
               return new CalllogFragment();
           default:
               return new HomeFragment();            
       }
   }
    @Override
    public int getItemCount(){
        return 3;
    }
}
