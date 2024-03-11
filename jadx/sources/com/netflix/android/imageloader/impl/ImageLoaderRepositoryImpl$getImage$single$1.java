package com.netflix.android.imageloader.impl;

import android.graphics.Bitmap;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.android.imageloader.impl.ImageLoaderRepositoryImpl$getImage$single$1;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import kotlin.jvm.internal.Lambda;
import o.C8632dsu;
import o.C9644uL;
import o.C9647uO;
import o.C9648uP;
import o.InterfaceC9636uD;
import o.drM;

/* loaded from: classes2.dex */
public final class ImageLoaderRepositoryImpl$getImage$single$1 extends Lambda implements drM<InterfaceC9636uD, SingleSource<? extends GetImageRequest.a>> {
    final /* synthetic */ Bitmap.Config b;
    final /* synthetic */ int c;
    final /* synthetic */ boolean d;
    final /* synthetic */ GetImageRequest.e e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderRepositoryImpl$getImage$single$1(GetImageRequest.e eVar, boolean z, int i, Bitmap.Config config) {
        super(1);
        this.e = eVar;
        this.d = z;
        this.c = i;
        this.b = config;
    }

    @Override // o.drM
    /* renamed from: c */
    public final SingleSource<? extends GetImageRequest.a> invoke(final InterfaceC9636uD interfaceC9636uD) {
        C8632dsu.c((Object) interfaceC9636uD, "");
        final GetImageRequest.e eVar = this.e;
        final boolean z = this.d;
        final int i = this.c;
        final Bitmap.Config config = this.b;
        return Single.create(new SingleOnSubscribe() { // from class: o.vc
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                ImageLoaderRepositoryImpl$getImage$single$1.a(GetImageRequest.e.this, interfaceC9636uD, z, i, config, singleEmitter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(GetImageRequest.e eVar, InterfaceC9636uD interfaceC9636uD, boolean z, int i, Bitmap.Config config, SingleEmitter singleEmitter) {
        C8632dsu.c((Object) eVar, "");
        C8632dsu.c((Object) interfaceC9636uD, "");
        C8632dsu.c((Object) config, "");
        C8632dsu.c((Object) singleEmitter, "");
        if (eVar.i()) {
            interfaceC9636uD.d(new C9644uL(eVar.c(), eVar.f()), eVar.m(), eVar.j(), eVar.g(), new C9647uO(eVar.m(), singleEmitter), z, i, config, eVar.a());
        } else {
            interfaceC9636uD.b(new C9644uL(eVar.c(), eVar.f()), eVar.m(), eVar.j(), eVar.g(), new C9648uP(singleEmitter), z, i, config, eVar.a());
        }
    }
}
