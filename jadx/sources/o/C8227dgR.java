package o;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import org.aomedia.avif.android.AvifDecoder;

/* renamed from: o.dgR  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8227dgR implements InterfaceC8229dgT {
    public static final b e = new b(null);
    private final InterfaceC8230dgU d;

    public C8227dgR(InterfaceC8230dgU interfaceC8230dgU) {
        C8632dsu.c((Object) interfaceC8230dgU, "");
        this.d = interfaceC8230dgU;
    }

    @Override // o.InterfaceC8229dgT
    public Bitmap b(byte[] bArr, int i, int i2, Bitmap.Config config) {
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) config, "");
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        C8632dsu.a(wrap, "");
        ByteBuffer b2 = b(wrap);
        AvifDecoder.Info info = new AvifDecoder.Info();
        try {
            if (AvifDecoder.getInfo(b2, bArr.length, info)) {
                Bitmap createBitmap = Bitmap.createBitmap(info.width, info.height, config);
                C8632dsu.a(createBitmap, "");
                AvifDecoder.decode(b2, bArr.length, createBitmap, 1);
                if (i == 0 || i2 == 0) {
                    return createBitmap;
                }
                int i3 = info.width;
                int i4 = info.height;
                C8231dgV c8231dgV = C8231dgV.e;
                int e2 = c8231dgV.e(i, i2, i3, i4);
                int e3 = c8231dgV.e(i2, i, i4, i3);
                if (createBitmap.getWidth() > e2 || createBitmap.getHeight() > e3) {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, e2, e3, true);
                    C8632dsu.a(createScaledBitmap, "");
                    createBitmap.recycle();
                    return createScaledBitmap;
                }
                return createBitmap;
            }
            return null;
        } catch (UnsatisfiedLinkError unused) {
            this.d.a();
            return null;
        }
    }

    private final ByteBuffer b(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            return byteBuffer;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
        allocateDirect.put(byteBuffer);
        allocateDirect.flip();
        C8632dsu.d(allocateDirect);
        return allocateDirect;
    }

    /* renamed from: o.dgR$b */
    /* loaded from: classes5.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("avifImageDecoder");
        }
    }
}
