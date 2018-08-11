/**
* DATE: 11/08/2018
* DESC: Load an image to an image view using Glide library
**/

package app.sqweeks.smellslikebakin;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageLoader {
    private Context mContext;

    public ImageLoader(Context context) {
        mContext = context;
    }

    public <T> void load(ImageView imageView, T url) {
        Glide.with(mContext).load(url).into(imageView);
    }
}
