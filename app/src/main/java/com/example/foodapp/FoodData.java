package com.example.foodapp;
import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class FoodData {
    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Batagor", "Makananan batagor merupakan makanan khas jawa barat yang paling banyak ditemui hampir di semua daerah ", 5000,  context.getDrawable(R.drawable.batagor)));
        list.add(new Food("Black Salad ", "Black Salad merupakan makanan sehat yang terbuat dari buah buahan yang digemari oleh hampir seluruh masyarakat Indonesia", 10000, context.getDrawable(R.drawable.black_salad)));
        list.add(new Food("Cireng", "Makanan Cireng merupakan makanan ringan yang berasal dari sunda. Cireng merupakan singkatan dari aci digoreng", 2000, context.getDrawable(R.drawable.cireng)));
        list.add(new Food("Kopi Hitam", "Kopi Hitam ternyata memiliki segudang manfaat untuk tubuh jika dikonsumsi sebagaimana mestinya.", 5000, context.getDrawable(R.drawable.kopi_hitam)));
        list.add(new Food("Mie Goreng", "Mie Goreng adalah makanan yang berasal dari Indonesia yang populer dan juga digemari di Malaysia, dan Singapura ", 5000, context.getDrawable(R.drawable.mie_goreng)));
        list.add(new Food("Sparkling Tea", "Sparkling Tea Minuman yang cocok banget dinikmati saat siang hari", 7000, context.getDrawable(R.drawable.sparkling_tea)));
        return list;
    }
}
