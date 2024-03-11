package o;

import android.graphics.Bitmap;
import com.netflix.android.imageloader.api.ImageDataSource;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import io.reactivex.SingleEmitter;
import o.C9646uN;

/* renamed from: o.vg  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9718vg implements InterfaceC1741aMn {
    private final SingleEmitter<C9646uN.e> a;

    public C9718vg(SingleEmitter<C9646uN.e> singleEmitter) {
        C8632dsu.c((Object) singleEmitter, "");
        this.a = singleEmitter;
    }

    @Override // o.InterfaceC1741aMn
    public void c(Bitmap bitmap, String str, ImageLoader.AssetLocationType assetLocationType, InterfaceC9640uH interfaceC9640uH) {
        ImageDataSource c;
        C8632dsu.c((Object) assetLocationType, "");
        if (bitmap != null) {
            SingleEmitter<C9646uN.e> singleEmitter = this.a;
            c = C9716ve.c(assetLocationType);
            singleEmitter.onSuccess(new C9646uN.e(c));
            if (interfaceC9640uH != null) {
                interfaceC9640uH.e();
            }
        }
    }

    @Override // o.InterfaceC1741aMn
    public void e(String str) {
        this.a.tryOnError(new RuntimeException(str));
    }
}
