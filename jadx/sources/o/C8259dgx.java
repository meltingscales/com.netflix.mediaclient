package o;

import android.graphics.Bitmap;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import java.util.HashMap;

/* renamed from: o.dgx  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8259dgx {
    public final ImageLoader.b a;
    private final HashMap<String, C8255dgt> b;
    private final String c;
    private final HashMap<String, C8255dgt> d;
    public Bitmap e;
    private final String j;

    public Bitmap d() {
        return this.e;
    }

    public String e() {
        return this.j;
    }

    public C8259dgx(Bitmap bitmap, String str, String str2, ImageLoader.b bVar, HashMap<String, C8255dgt> hashMap, HashMap<String, C8255dgt> hashMap2) {
        this.e = bitmap;
        this.j = str;
        this.c = str2;
        this.a = bVar;
        this.d = hashMap;
        this.b = hashMap2;
    }

    public String toString() {
        Bitmap bitmap = this.e;
        int width = bitmap == null ? -1 : bitmap.getWidth();
        Bitmap bitmap2 = this.e;
        int height = bitmap2 == null ? -1 : bitmap2.getHeight();
        Bitmap bitmap3 = this.e;
        int allocationByteCount = bitmap3 != null ? bitmap3.getAllocationByteCount() : -1;
        return "ImageContainer [mBitmap=" + this.e + ", x=" + width + ", y=" + height + ", byteCount=" + allocationByteCount + ", mCacheKey=" + this.c + ", mRequestUrl=" + this.j + "]";
    }
}
