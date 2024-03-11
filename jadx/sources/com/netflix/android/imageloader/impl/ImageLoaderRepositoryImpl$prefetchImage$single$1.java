package com.netflix.android.imageloader.impl;

import android.graphics.Bitmap;
import com.netflix.android.imageloader.impl.ImageLoaderRepositoryImpl$prefetchImage$single$1;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import kotlin.jvm.internal.Lambda;
import o.C8632dsu;
import o.C9644uL;
import o.C9646uN;
import o.C9718vg;
import o.InterfaceC9636uD;
import o.drM;

/* loaded from: classes2.dex */
public final class ImageLoaderRepositoryImpl$prefetchImage$single$1 extends Lambda implements drM<InterfaceC9636uD, SingleSource<? extends C9646uN.e>> {
    final /* synthetic */ boolean b;
    final /* synthetic */ C9646uN.b c;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderRepositoryImpl$prefetchImage$single$1(C9646uN.b bVar, boolean z, int i) {
        super(1);
        this.c = bVar;
        this.b = z;
        this.e = i;
    }

    @Override // o.drM
    /* renamed from: d */
    public final SingleSource<? extends C9646uN.e> invoke(final InterfaceC9636uD interfaceC9636uD) {
        C8632dsu.c((Object) interfaceC9636uD, "");
        final C9646uN.b bVar = this.c;
        final boolean z = this.b;
        final int i = this.e;
        return Single.create(new SingleOnSubscribe() { // from class: o.vb
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                ImageLoaderRepositoryImpl$prefetchImage$single$1.a(InterfaceC9636uD.this, bVar, z, i, singleEmitter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC9636uD interfaceC9636uD, C9646uN.b bVar, boolean z, int i, SingleEmitter singleEmitter) {
        C8632dsu.c((Object) interfaceC9636uD, "");
        C8632dsu.c((Object) bVar, "");
        C8632dsu.c((Object) singleEmitter, "");
        interfaceC9636uD.e(new C9644uL(bVar.d(), bVar.c()), bVar.h(), bVar.e(), bVar.a(), new C9718vg(singleEmitter), z, i, Bitmap.Config.RGB_565, false);
    }
}
