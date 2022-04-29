package com.saii.viewpager2_guide;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

class ViewPagerAdapter extends FragmentStateAdapter {

   public int mCount;
   public ViewPagerAdapter(FragmentActivity fa, int count) {
      super(fa);
      mCount = count;
   }

   public Fragment createFragment(int position) {
      int index = getRealPosition(position);
      if(index==0) return new GuideFragment1();
      else if(index==1) return new GuideFragment2();
      else return new AdFragment1();
   }
   @Override
   public int getItemCount() {
      return 3;
   }
   public int getRealPosition(int position) { return position % mCount; }

}
