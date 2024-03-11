package o;

import android.graphics.Bitmap;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.android.volley.VolleyError;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import io.reactivex.SingleObserver;
import o.C8298dhj;

/* renamed from: o.dhd  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8292dhd extends C8261dgz {
    private final ImageLoader.c c;
    private final SingleObserver<ShowImageRequest.a> d;

    /* JADX INFO: Access modifiers changed from: protected */
    public final ImageLoader.c d() {
        return this.c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8292dhd(ImageLoader.a aVar, String str, ImageLoader.c cVar, SingleObserver<ShowImageRequest.a> singleObserver) {
        super(aVar, str, false);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) cVar, "");
        this.c = cVar;
        this.d = singleObserver;
    }

    @Override // o.C8261dgz, o.C9864xy.b
    public void b(VolleyError volleyError) {
        C8632dsu.c((Object) volleyError, "");
        super.b(volleyError);
        SingleObserver<ShowImageRequest.a> singleObserver = this.d;
        if (singleObserver != null) {
            singleObserver.onError(volleyError);
        }
        if (a()) {
            return;
        }
        C8298dhj.b bVar = C8298dhj.b;
        if (this.b == null || this.c.b() == 0) {
            return;
        }
        this.b.setImageResource(this.c.b());
    }

    @Override // o.C8261dgz, com.netflix.mediaclient.util.gfx.ImageLoader.b
    public void e(C8259dgx c8259dgx, ImageLoader.AssetLocationType assetLocationType, InterfaceC9640uH interfaceC9640uH) {
        C8632dsu.c((Object) c8259dgx, "");
        C8632dsu.c((Object) assetLocationType, "");
        super.e(c8259dgx, assetLocationType, interfaceC9640uH);
        if (a()) {
            SingleObserver<ShowImageRequest.a> singleObserver = this.d;
            if (singleObserver != null) {
                singleObserver.onSuccess(new ShowImageRequest.a(true, null));
                return;
            }
            return;
        }
        Bitmap d = c8259dgx.d();
        if (d == null) {
            ImageLoader.a aVar = this.b;
            if (aVar != null) {
                c(aVar, null);
                return;
            }
            return;
        }
        ImageLoader.a aVar2 = this.b;
        if (aVar2 != null) {
            RJ imageLoaderInfo = aVar2.getImageLoaderInfo();
            if (imageLoaderInfo != null) {
                imageLoaderInfo.a(true);
            }
            if (assetLocationType.isImmediate()) {
                aVar2.setImageBitmap(d);
            } else {
                c(aVar2, d);
            }
        }
        SingleObserver<ShowImageRequest.a> singleObserver2 = this.d;
        if (singleObserver2 != null) {
            singleObserver2.onSuccess(new ShowImageRequest.a(false, assetLocationType.toImageDataSource()));
        }
    }

    protected void c(ImageLoader.a aVar, Bitmap bitmap) {
        C8632dsu.c((Object) aVar, "");
        if (bitmap == null) {
            aVar.setImageDrawable(null);
        } else {
            aVar.setImageBitmap(bitmap);
        }
    }

    private final boolean a() {
        ImageLoader.a aVar = this.b;
        RJ imageLoaderInfo = aVar != null ? aVar.getImageLoaderInfo() : null;
        return !C8168dfL.d(imageLoaderInfo != null ? imageLoaderInfo.e : null, this.e);
    }
}
