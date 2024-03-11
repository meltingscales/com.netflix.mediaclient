package o;

import android.graphics.Bitmap;
import androidx.core.content.ContextCompat;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import io.reactivex.SingleObserver;

/* renamed from: o.dhb  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8290dhb extends C8292dhd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8290dhb(ImageLoader.a aVar, String str, ImageLoader.c cVar, SingleObserver<ShowImageRequest.a> singleObserver) {
        super(aVar, str, cVar, singleObserver);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) cVar, "");
    }

    @Override // o.C8292dhd
    protected void c(ImageLoader.a aVar, Bitmap bitmap) {
        C8632dsu.c((Object) aVar, "");
        if (bitmap == null) {
            if (d().d() != 0) {
                aVar.setImageResource(d().d());
            }
        } else if (d().d() != 0) {
            aMH.c().c(aVar.getImageView(), ContextCompat.getDrawable(aVar.getContext(), d().d()), bitmap);
        }
    }
}
