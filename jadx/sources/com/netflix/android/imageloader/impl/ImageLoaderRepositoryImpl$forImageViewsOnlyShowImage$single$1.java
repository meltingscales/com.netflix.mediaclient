package com.netflix.android.imageloader.impl;

import android.graphics.Bitmap;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.android.imageloader.impl.ImageLoaderRepositoryImpl$forImageViewsOnlyShowImage$single$1;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import kotlin.jvm.internal.Lambda;
import o.C8632dsu;
import o.C9644uL;
import o.C9719vh;
import o.C9722vk;
import o.InterfaceC9636uD;
import o.drM;

/* loaded from: classes2.dex */
public final class ImageLoaderRepositoryImpl$forImageViewsOnlyShowImage$single$1 extends Lambda implements drM<InterfaceC9636uD, SingleSource<? extends ShowImageRequest.a>> {
    final /* synthetic */ ImageLoader.a a;
    final /* synthetic */ C9722vk b;
    final /* synthetic */ int c;
    final /* synthetic */ Bitmap.Config d;
    final /* synthetic */ ShowImageRequest.d e;
    final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderRepositoryImpl$forImageViewsOnlyShowImage$single$1(ShowImageRequest.d dVar, ImageLoader.a aVar, String str, C9722vk c9722vk, int i, Bitmap.Config config) {
        super(1);
        this.e = dVar;
        this.a = aVar;
        this.f = str;
        this.b = c9722vk;
        this.c = i;
        this.d = config;
    }

    @Override // o.drM
    /* renamed from: e */
    public final SingleSource<? extends ShowImageRequest.a> invoke(final InterfaceC9636uD interfaceC9636uD) {
        C8632dsu.c((Object) interfaceC9636uD, "");
        final ShowImageRequest.d dVar = this.e;
        final ImageLoader.a aVar = this.a;
        final String str = this.f;
        final C9722vk c9722vk = this.b;
        final int i = this.c;
        final Bitmap.Config config = this.d;
        return Single.create(new SingleOnSubscribe() { // from class: o.vf
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                ImageLoaderRepositoryImpl$forImageViewsOnlyShowImage$single$1.a(InterfaceC9636uD.this, dVar, aVar, str, c9722vk, i, config, singleEmitter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC9636uD interfaceC9636uD, ShowImageRequest.d dVar, ImageLoader.a aVar, String str, C9722vk c9722vk, int i, Bitmap.Config config, SingleEmitter singleEmitter) {
        C8632dsu.c((Object) interfaceC9636uD, "");
        C8632dsu.c((Object) dVar, "");
        C8632dsu.c((Object) aVar, "");
        C8632dsu.c((Object) c9722vk, "");
        C8632dsu.c((Object) config, "");
        C8632dsu.c((Object) singleEmitter, "");
        interfaceC9636uD.c(new C9644uL(dVar.c(), dVar.b()), aVar, str, c9722vk, !dVar.a().b() && c9722vk.a(), i, config, dVar.a().a(), new C9719vh(singleEmitter), dVar.a().h(), dVar.a().g());
    }
}
