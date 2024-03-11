package o;

import android.graphics.Bitmap;

/* renamed from: o.dgA  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8210dgA extends C1080Ny<String, Bitmap> {
    public C8210dgA(int i) {
        super("BitmapLruCache", i);
        C1044Mm.b("BitmapLruCache", "Max size: " + i);
    }

    public Bitmap d(String str) {
        return (Bitmap) super.get(str);
    }

    public void c(String str, Bitmap bitmap) {
        put(str, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C1080Ny, android.util.LruCache
    /* renamed from: c */
    public void entryRemoved(boolean z, String str, Bitmap bitmap, Bitmap bitmap2) {
        super.entryRemoved(z, str, bitmap, bitmap2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.util.LruCache
    /* renamed from: b */
    public int sizeOf(String str, Bitmap bitmap) {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }
}
