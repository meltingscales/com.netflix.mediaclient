package o;

import android.graphics.Bitmap;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.android.imageloader.api.ImageDataSource;
import com.netflix.android.volley.VolleyError;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import io.reactivex.SingleEmitter;

/* renamed from: o.uO  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9647uO extends C8261dgz {
    private final SingleEmitter<GetImageRequest.a> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9647uO(String str, SingleEmitter<GetImageRequest.a> singleEmitter) {
        super(null, str, true);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) singleEmitter, "");
        this.d = singleEmitter;
    }

    @Override // o.C8261dgz, com.netflix.mediaclient.util.gfx.ImageLoader.b
    public void e(C8259dgx c8259dgx, ImageLoader.AssetLocationType assetLocationType, InterfaceC9640uH interfaceC9640uH) {
        ImageDataSource c;
        C8632dsu.c((Object) assetLocationType, "");
        super.e(c8259dgx, assetLocationType, interfaceC9640uH);
        Bitmap d = c8259dgx != null ? c8259dgx.d() : null;
        if (d != null) {
            SingleEmitter<GetImageRequest.a> singleEmitter = this.d;
            c = C9716ve.c(assetLocationType);
            singleEmitter.onSuccess(new GetImageRequest.a(d, c, interfaceC9640uH));
        }
    }

    @Override // o.C8261dgz, o.C9864xy.b
    public void b(VolleyError volleyError) {
        super.b(volleyError);
        SingleEmitter<GetImageRequest.a> singleEmitter = this.d;
        Throwable th = volleyError;
        if (volleyError == null) {
            th = new RuntimeException();
        }
        singleEmitter.tryOnError(th);
    }
}
