package com.netflix.mediaclient.ui.repository;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.ui.repository.UserAgentRepository$sendAgeVerifyRequest$1;
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
public final class UserAgentRepository$sendAgeVerifyRequest$1 extends Lambda implements drM<UserAgent, SingleSource<? extends cQQ.b>> {
    public static final UserAgentRepository$sendAgeVerifyRequest$1 a = new UserAgentRepository$sendAgeVerifyRequest$1();

    UserAgentRepository$sendAgeVerifyRequest$1() {
        super(1);
    }

    @Override // o.drM
    /* renamed from: d */
    public final SingleSource<? extends cQQ.b> invoke(final UserAgent userAgent) {
        C8632dsu.c((Object) userAgent, "");
        return Single.create(new SingleOnSubscribe() { // from class: o.cRm
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                UserAgentRepository$sendAgeVerifyRequest$1.a(UserAgent.this, singleEmitter);
            }
        });
    }

    /* loaded from: classes4.dex */
    public static final class a extends C5015bql {
        final /* synthetic */ WeakReference<SingleEmitter<cQQ.b>> b;

        a(WeakReference<SingleEmitter<cQQ.b>> weakReference) {
            this.b = weakReference;
        }

        @Override // o.C5015bql, o.InterfaceC5018bqo
        public void a(boolean z, Status status) {
            C8632dsu.c((Object) status, "");
            SingleEmitter<cQQ.b> singleEmitter = this.b.get();
            if (singleEmitter != null) {
                singleEmitter.onSuccess(new cQQ.b(z, status));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(UserAgent userAgent, SingleEmitter singleEmitter) {
        C8632dsu.c((Object) userAgent, "");
        C8632dsu.c((Object) singleEmitter, "");
        userAgent.j(new a(new WeakReference(singleEmitter)));
    }
}
