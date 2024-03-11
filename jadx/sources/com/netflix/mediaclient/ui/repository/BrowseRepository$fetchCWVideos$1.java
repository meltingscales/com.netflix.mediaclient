package com.netflix.mediaclient.ui.repository;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.app.StatusException;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.repository.BrowseRepository$fetchCWVideos$1;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.AbstractC1761aNg;
import o.C8632dsu;
import o.InterfaceC1912aSw;
import o.InterfaceC5179btq;
import o.InterfaceC5222bug;
import o.InterfaceC5223buh;
import o.drM;

/* loaded from: classes4.dex */
public final class BrowseRepository$fetchCWVideos$1 extends Lambda implements drM<InterfaceC1912aSw, SingleSource<? extends List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>>>> {
    final /* synthetic */ int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ LoMo d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowseRepository$fetchCWVideos$1(LoMo loMo, int i, int i2, boolean z, String str) {
        super(1);
        this.d = loMo;
        this.e = i;
        this.a = i2;
        this.b = z;
        this.c = str;
    }

    @Override // o.drM
    /* renamed from: a */
    public final SingleSource<? extends List<InterfaceC5222bug<? extends InterfaceC5223buh>>> invoke(final InterfaceC1912aSw interfaceC1912aSw) {
        C8632dsu.c((Object) interfaceC1912aSw, "");
        final LoMo loMo = this.d;
        final int i = this.e;
        final int i2 = this.a;
        final boolean z = this.b;
        final String str = this.c;
        return Single.create(new SingleOnSubscribe() { // from class: o.cQA
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                BrowseRepository$fetchCWVideos$1.d(InterfaceC1912aSw.this, loMo, i, i2, z, str, singleEmitter);
            }
        });
    }

    /* loaded from: classes4.dex */
    public static final class a extends AbstractC1761aNg {
        final /* synthetic */ SingleEmitter<List<InterfaceC5222bug<? extends InterfaceC5223buh>>> e;

        a(SingleEmitter<List<InterfaceC5222bug<? extends InterfaceC5223buh>>> singleEmitter) {
            this.e = singleEmitter;
        }

        @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
        public void d(List<? extends InterfaceC5222bug<InterfaceC5179btq>> list, Status status) {
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) status, "");
            if (status.i()) {
                this.e.tryOnError(new StatusException(status));
            } else {
                this.e.onSuccess(list);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC1912aSw interfaceC1912aSw, LoMo loMo, int i, int i2, boolean z, String str, SingleEmitter singleEmitter) {
        C8632dsu.c((Object) interfaceC1912aSw, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) singleEmitter, "");
        interfaceC1912aSw.a(loMo, i, i2, z, new a(singleEmitter), str);
    }
}
