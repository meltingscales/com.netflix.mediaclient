package o;

import android.net.Uri;
import com.netflix.android.imageloader.api.ImageDataSource;
import com.netflix.mediaclient.util.gfx.ImageLoader;

/* renamed from: o.ve  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9716ve {

    /* renamed from: o.ve$c */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[ImageLoader.AssetLocationType.values().length];
            try {
                iArr[ImageLoader.AssetLocationType.PLACEHOLDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageLoader.AssetLocationType.NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageLoader.AssetLocationType.DISKCACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageLoader.AssetLocationType.MEMCACHE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            d = iArr;
        }
    }

    public static final boolean d(String str) {
        boolean g;
        if (str != null) {
            g = C8691duz.g(str);
            if (!g) {
                try {
                    Uri parse = Uri.parse(str);
                    if (parse != null && parse.getHost() != null) {
                        if (parse.getScheme() != null) {
                            return true;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageDataSource c(ImageLoader.AssetLocationType assetLocationType) {
        int i = c.d[assetLocationType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return ImageDataSource.b;
                    }
                    throw new IllegalStateException(("unknown assetLocationType: " + assetLocationType).toString());
                }
                return ImageDataSource.a;
            }
            return ImageDataSource.e;
        }
        throw new IllegalStateException("unexpected placeholder image".toString());
    }
}
