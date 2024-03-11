package com.netflix.mediaclient.util.gfx;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.netflix.android.imageloader.api.ImageDataSource;
import com.netflix.mediaclient.api.res.AssetType;
import com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface;
import o.C8259dgx;
import o.C9864xy;
import o.InterfaceC9640uH;
import o.RJ;

/* loaded from: classes.dex */
public interface ImageLoader {

    /* loaded from: classes5.dex */
    public interface a {
        CharSequence getContentDescription();

        Context getContext();

        RJ getImageLoaderInfo();

        ImageView getImageView();

        void setAssetFetchLatency(int i);

        void setContentDescription(CharSequence charSequence);

        void setImageBitmap(Bitmap bitmap);

        void setImageDataSource(ImageDataSource imageDataSource);

        void setImageDrawable(Drawable drawable);

        void setImageLoaderInfo(RJ rj);

        void setImageResource(int i);
    }

    /* loaded from: classes5.dex */
    public interface b extends C9864xy.b {
        void e(C8259dgx c8259dgx, AssetLocationType assetLocationType, InterfaceC9640uH interfaceC9640uH);
    }

    /* loaded from: classes5.dex */
    public interface c {
        int b();

        int d();

        boolean e();
    }

    InteractiveTrackerInterface a(String str);

    void b(InteractiveTrackerInterface interactiveTrackerInterface);

    void d(int i);

    void d(a aVar, AssetType assetType);

    void e(InteractiveTrackerInterface interactiveTrackerInterface);

    @Keep
    /* loaded from: classes5.dex */
    public enum AssetLocationType {
        DISKCACHE,
        NETWORK,
        MEMCACHE,
        PLACEHOLDER;

        public boolean isImmediate() {
            return this != NETWORK;
        }

        public ImageDataSource toImageDataSource() {
            if (this == NETWORK) {
                return ImageDataSource.e;
            }
            if (this == DISKCACHE) {
                return ImageDataSource.a;
            }
            if (this == MEMCACHE) {
                return ImageDataSource.b;
            }
            throw new IllegalArgumentException("unexpected placeholder image");
        }
    }
}
