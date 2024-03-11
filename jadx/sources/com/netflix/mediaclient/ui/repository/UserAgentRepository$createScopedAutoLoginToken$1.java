package com.netflix.mediaclient.ui.repository;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.ui.repository.UserAgentRepository$createScopedAutoLoginToken$1;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.C5015bql;
import o.C8632dsu;
import o.cQQ;
import o.drM;

/* loaded from: classes4.dex */
public final class UserAgentRepository$createScopedAutoLoginToken$1 extends Lambda implements drM<UserAgent, SingleSource<? extends cQQ.d>> {
    final /* synthetic */ List<String> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAgentRepository$createScopedAutoLoginToken$1(List<String> list) {
        super(1);
        this.b = list;
    }

    @Override // o.drM
    /* renamed from: d */
    public final SingleSource<? extends cQQ.d> invoke(final UserAgent userAgent) {
        C8632dsu.c((Object) userAgent, "");
        final List<String> list = this.b;
        return Single.create(new SingleOnSubscribe() { // from class: o.cRd
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                UserAgentRepository$createScopedAutoLoginToken$1.d(UserAgent.this, list, singleEmitter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(UserAgent userAgent, List list, SingleEmitter singleEmitter) {
        C8632dsu.c((Object) userAgent, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) singleEmitter, "");
        userAgent.c(list, new d(new WeakReference(singleEmitter)));
    }

    /* loaded from: classes4.dex */
    public static final class d extends C5015bql {
        final /* synthetic */ WeakReference<SingleEmitter<cQQ.d>> e;

        d(WeakReference<SingleEmitter<cQQ.d>> weakReference) {
            this.e = weakReference;
        }

        @Override // o.C5015bql, o.InterfaceC5018bqo
        public void b(String str, Status status) {
            C8632dsu.c((Object) status, "");
            SingleEmitter<cQQ.d> singleEmitter = this.e.get();
            if (singleEmitter != null) {
                singleEmitter.onSuccess(new cQQ.d(str, status));
            }
        }
    }
}
