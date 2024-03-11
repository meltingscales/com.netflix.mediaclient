package com.netflix.mediaclient.ui.repository;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.ui.repository.UserAgentRepository$createAutoLoginToken$1;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Lambda;
import o.C5015bql;
import o.C8632dsu;
import o.cQQ;
import o.drM;

/* loaded from: classes4.dex */
public final class UserAgentRepository$createAutoLoginToken$1 extends Lambda implements drM<UserAgent, SingleSource<? extends cQQ.d>> {
    final /* synthetic */ long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAgentRepository$createAutoLoginToken$1(long j) {
        super(1);
        this.a = j;
    }

    @Override // o.drM
    /* renamed from: b */
    public final SingleSource<? extends cQQ.d> invoke(final UserAgent userAgent) {
        C8632dsu.c((Object) userAgent, "");
        final long j = this.a;
        return Single.create(new SingleOnSubscribe() { // from class: o.cRf
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                UserAgentRepository$createAutoLoginToken$1.b(UserAgent.this, j, singleEmitter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(UserAgent userAgent, long j, SingleEmitter singleEmitter) {
        C8632dsu.c((Object) userAgent, "");
        C8632dsu.c((Object) singleEmitter, "");
        userAgent.c(j, new c(new WeakReference(singleEmitter)));
    }

    /* loaded from: classes4.dex */
    public static final class c extends C5015bql {
        final /* synthetic */ WeakReference<SingleEmitter<cQQ.d>> d;

        c(WeakReference<SingleEmitter<cQQ.d>> weakReference) {
            this.d = weakReference;
        }

        @Override // o.C5015bql, o.InterfaceC5018bqo
        public void b(String str, Status status) {
            C8632dsu.c((Object) status, "");
            SingleEmitter<cQQ.d> singleEmitter = this.d.get();
            if (singleEmitter != null) {
                singleEmitter.onSuccess(new cQQ.d(str, status));
            }
        }
    }
}
