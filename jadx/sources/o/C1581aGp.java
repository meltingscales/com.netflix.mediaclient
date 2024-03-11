package o;

import com.netflix.mediaclient.util.gfx.ImageLoader;
import java.util.List;
import org.json.JSONObject;

/* renamed from: o.aGp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1581aGp {

    /* renamed from: o.aGp$c */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ImageLoader.AssetLocationType.values().length];
            try {
                iArr[ImageLoader.AssetLocationType.MEMCACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageLoader.AssetLocationType.DISKCACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageLoader.AssetLocationType.NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    private static final float d(int i, int i2) {
        if (i2 == 0) {
            return 0.0f;
        }
        return i / i2;
    }

    public static final void d(JSONObject jSONObject, String str, List<C5165btc> list) {
        C8632dsu.c((Object) jSONObject, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) list, "");
        int size = list.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (C5165btc c5165btc : list) {
            if (c5165btc.c() != null) {
                i3++;
            } else if (c5165btc.e() != null) {
                i2++;
            } else {
                i4++;
            }
            ImageLoader.AssetLocationType e = c5165btc.e();
            int i8 = e == null ? -1 : c.a[e.ordinal()];
            if (i8 == 1) {
                i5++;
            } else if (i8 == 2) {
                i6++;
            } else if (i8 == 3) {
                i7++;
            }
            i += c5165btc.a();
        }
        jSONObject.put(str + "_totalImageCount", size);
        jSONObject.put(str + "_totalImageBytes", i);
        jSONObject.put(str + "_successImageCount", i2);
        jSONObject.put(str + "_errorImageCount", i3);
        jSONObject.put(str + "_pendingImageCount", i4);
        jSONObject.put(str + "_memoryCacheHitRate", Float.valueOf(d(i5, i2)));
        jSONObject.put(str + "_diskCacheHitRate", Float.valueOf(d(i6, i2)));
        jSONObject.put(str + "_networkHitRate", Float.valueOf(d(i7, i2)));
    }
}
