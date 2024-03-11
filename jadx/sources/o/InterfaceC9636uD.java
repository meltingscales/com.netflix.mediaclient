package o;

import android.graphics.Bitmap;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import java.util.List;
import o.C9684uz;

/* renamed from: o.uD  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC9636uD {
    void b();

    void b(C9644uL c9644uL, String str, int i, int i2, InterfaceC1741aMn interfaceC1741aMn, boolean z, int i3, Bitmap.Config config, boolean z2);

    Single<C9684uz.d> c(String str, int i, int i2, int i3);

    void c(C9644uL c9644uL, ImageLoader.a aVar, String str, ImageLoader.c cVar, boolean z, int i, Bitmap.Config config, boolean z2, SingleObserver<ShowImageRequest.a> singleObserver, boolean z3, List<? extends InterfaceC9642uJ> list);

    void d(C9644uL c9644uL, String str, int i, int i2, C8261dgz c8261dgz, boolean z, int i3, Bitmap.Config config, boolean z2);

    void e(ImageLoader.a aVar);

    void e(C9644uL c9644uL, String str, int i, int i2, InterfaceC1741aMn interfaceC1741aMn, boolean z, int i3, Bitmap.Config config, boolean z2);
}
