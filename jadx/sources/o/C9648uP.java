package o;

import android.graphics.Bitmap;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.android.imageloader.api.ImageDataSource;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import io.reactivex.SingleEmitter;

/* renamed from: o.uP  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9648uP implements InterfaceC1741aMn {
    private final SingleEmitter<GetImageRequest.a> e;

    public C9648uP(SingleEmitter<GetImageRequest.a> singleEmitter) {
        C8632dsu.c((Object) singleEmitter, "");
        this.e = singleEmitter;
    }

    @Override // o.InterfaceC1741aMn
    public void c(Bitmap bitmap, String str, ImageLoader.AssetLocationType assetLocationType, InterfaceC9640uH interfaceC9640uH) {
        ImageDataSource c;
        C8632dsu.c((Object) assetLocationType, "");
        if (bitmap != null) {
            SingleEmitter<GetImageRequest.a> singleEmitter = this.e;
            c = C9716ve.c(assetLocationType);
            singleEmitter.onSuccess(new GetImageRequest.a(bitmap, c, interfaceC9640uH));
        }
    }

    @Override // o.InterfaceC1741aMn
    public void e(String str) {
        this.e.tryOnError(new RuntimeException(str));
    }
}
