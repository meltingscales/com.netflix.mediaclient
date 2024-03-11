package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* renamed from: o.dgS  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8228dgS implements InterfaceC8229dgT {
    private static final d a = new d(null);

    @Override // o.InterfaceC8229dgT
    public Bitmap b(byte[] bArr, int i, int i2, Bitmap.Config config) {
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) config, "");
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (i == 0 && i2 == 0) {
            options.inPreferredConfig = config;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        C8231dgV c8231dgV = C8231dgV.e;
        int e = c8231dgV.e(i, i2, i3, i4);
        int e2 = c8231dgV.e(i2, i, i4, i3);
        options.inJustDecodeBounds = false;
        options.inSampleSize = c8231dgV.d(i3, i4, e, e2);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (decodeByteArray != null) {
            if (decodeByteArray.getWidth() > e || decodeByteArray.getHeight() > e2) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, e, e2, true);
                decodeByteArray.recycle();
                return createScaledBitmap;
            }
            return decodeByteArray;
        }
        return decodeByteArray;
    }

    /* renamed from: o.dgS$d */
    /* loaded from: classes5.dex */
    static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("androidImageDecoder");
        }
    }
}
