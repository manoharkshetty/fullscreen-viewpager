package com.manohar.fullscreenviewpager;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class FullScreenAdapter extends PagerAdapter {
	
	Activity activity;
	static int[] images={R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5,R.drawable.image6};
	private ArrayList<String> _imagePaths;
    private LayoutInflater inflater;
    
	 public FullScreenAdapter(Activity activity) {
	        this.activity = activity;
	       
	    }
	 
	    @Override
	    public int getCount() {
	        return this.images.length;
	    }
	 
	    @Override
	    public boolean isViewFromObject(View view, Object object) {
	        return view == ((RelativeLayout) object);
	    }
	     
	    @Override
	    public Object instantiateItem(ViewGroup container, int position) {
	        ImageView imgDisplay;
	       
	  
	        inflater = (LayoutInflater)activity
	                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	        View viewLayout = inflater.inflate(R.layout.full_screen_layout, container,
	                false);
	  
	        imgDisplay = (ImageView) viewLayout.findViewById(R.id.img);
	       imgDisplay.setBackgroundResource(images[position]);
	        ((ViewPager) container).addView(viewLayout);
	  
	        return viewLayout;
	    }
	     
	    @Override
	    public void destroyItem(ViewGroup container, int position, Object object) {
	        ((ViewPager) container).removeView((RelativeLayout) object);
	  
	    }
	}


