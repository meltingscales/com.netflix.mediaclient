package o;

import android.widget.ImageView;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.android.imageloader.api.ShowImageRequest;
import io.reactivex.Single;
import o.C9646uN;
import o.C9684uz;

/* renamed from: o.uC  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC9635uC {
    Single<ShowImageRequest.a> b(ImageView imageView, ShowImageRequest.d dVar, Single<ShowImageRequest.a> single);

    Single<GetImageRequest.a> b(GetImageRequest.e eVar, Single<GetImageRequest.a> single);

    Single<C9646uN.e> b(C9646uN.b bVar, Single<C9646uN.e> single);

    Single<C9684uz.d> c(C9684uz.a aVar, Single<C9684uz.d> single);

    void c();
}
