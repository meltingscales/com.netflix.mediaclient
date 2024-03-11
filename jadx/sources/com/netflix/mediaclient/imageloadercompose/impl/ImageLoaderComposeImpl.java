package com.netflix.mediaclient.imageloadercompose.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.fragment.app.FragmentActivity;
import com.netflix.android.imageloader.api.GetImageRequest;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import io.reactivex.rxkotlin.SubscribersKt;
import javax.inject.Inject;
import kotlin.Result;
import o.C8556dpz;
import o.C8586drb;
import o.C8587drc;
import o.C8590drf;
import o.C8592drh;
import o.C8632dsu;
import o.C9737vz;
import o.InterfaceC1570aGe;
import o.InterfaceC1571aGf;
import o.InterfaceC8585dra;
import o.InterfaceC9638uF;
import o.dpR;
import o.drM;

/* loaded from: classes3.dex */
public final class ImageLoaderComposeImpl implements InterfaceC1570aGe {
    private final FragmentActivity a;

    @Module
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes6.dex */
    public interface ImageLoaderComposeModule {
        @ActivityScoped
        @Binds
        InterfaceC1570aGe a(ImageLoaderComposeImpl imageLoaderComposeImpl);
    }

    @Inject
    public ImageLoaderComposeImpl(Activity activity) {
        C8632dsu.c((Object) activity, "");
        this.a = (FragmentActivity) C9737vz.e(activity, FragmentActivity.class);
    }

    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC1571aGf {
        b() {
        }

        @Override // o.InterfaceC1571aGf
        public Object c(String str, InterfaceC8585dra<? super ImageBitmap> interfaceC8585dra) {
            InterfaceC8585dra b;
            Object e;
            ImageLoaderComposeImpl imageLoaderComposeImpl = ImageLoaderComposeImpl.this;
            b = C8590drf.b(interfaceC8585dra);
            final C8587drc c8587drc = new C8587drc(b);
            SubscribersKt.subscribeBy(InterfaceC9638uF.a.d(imageLoaderComposeImpl.a).b(GetImageRequest.c.a(imageLoaderComposeImpl.a).a(str).a()), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.imageloadercompose.impl.ImageLoaderComposeImpl$create$1$fetchImage$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    c(th);
                    return dpR.c;
                }

                public final void c(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    InterfaceC8585dra<ImageBitmap> interfaceC8585dra2 = c8587drc;
                    Result.c cVar = Result.e;
                    interfaceC8585dra2.resumeWith(Result.e(C8556dpz.a(th)));
                }
            }, new drM<GetImageRequest.a, dpR>() { // from class: com.netflix.mediaclient.imageloadercompose.impl.ImageLoaderComposeImpl$create$1$fetchImage$2$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(GetImageRequest.a aVar) {
                    b(aVar);
                    return dpR.c;
                }

                public final void b(GetImageRequest.a aVar) {
                    C8632dsu.c((Object) aVar, "");
                    InterfaceC8585dra<ImageBitmap> interfaceC8585dra2 = c8587drc;
                    Result.c cVar = Result.e;
                    interfaceC8585dra2.resumeWith(Result.e(AndroidImageBitmap_androidKt.asImageBitmap(aVar.b())));
                }
            });
            Object b2 = c8587drc.b();
            e = C8586drb.e();
            if (b2 == e) {
                C8592drh.c(interfaceC8585dra);
            }
            return b2;
        }
    }

    @Override // o.InterfaceC1570aGe
    @SuppressLint({"CheckResult"})
    public InterfaceC1571aGf a() {
        return new b();
    }
}
