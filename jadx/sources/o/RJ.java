package o;

import android.graphics.Bitmap;
import com.netflix.mediaclient.api.res.AssetType;
import com.netflix.mediaclient.util.gfx.ImageLoader;

/* loaded from: classes3.dex */
public final class RJ {
    public boolean a = false;
    public final AssetType b;
    public final Bitmap.Config c;
    public final ImageLoader.c d;
    public final String e;

    public void a(boolean z) {
        this.a = z;
    }

    public ImageLoader.c c() {
        return this.d;
    }

    public RJ(String str, ImageLoader.c cVar, Bitmap.Config config, AssetType assetType) {
        this.e = str;
        this.d = cVar;
        this.c = config;
        this.b = assetType;
    }
}
