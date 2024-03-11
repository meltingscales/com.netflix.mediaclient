package com.netflix.mediaclient.ui.repository;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.ui.repository.UserAgentRepository$sendLoginUserByTokens$1;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Lambda;
import o.C1569aGd;
import o.C5015bql;
import o.C8632dsu;
import o.drM;

/* loaded from: classes4.dex */
public final class UserAgentRepository$sendLoginUserByTokens$1 extends Lambda implements drM<UserAgent, SingleSource<? extends Status>> {
    final /* synthetic */ C1569aGd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAgentRepository$sendLoginUserByTokens$1(C1569aGd c1569aGd) {
        super(1);
        this.d = c1569aGd;
    }

    @Override // o.drM
    /* renamed from: a */
    public final SingleSource<? extends Status> invoke(final UserAgent userAgent) {
        C8632dsu.c((Object) userAgent, "");
        final C1569aGd c1569aGd = this.d;
        return Single.create(new SingleOnSubscribe() { // from class: o.cRi
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                UserAgentRepository$sendLoginUserByTokens$1.c(UserAgent.this, c1569aGd, singleEmitter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(UserAgent userAgent, C1569aGd c1569aGd, SingleEmitter singleEmitter) {
        C8632dsu.c((Object) userAgent, "");
        C8632dsu.c((Object) c1569aGd, "");
        C8632dsu.c((Object) singleEmitter, "");
        userAgent.d(c1569aGd, new a(new WeakReference(singleEmitter)));
    }

    /* loaded from: classes4.dex */
    public static final class a extends C5015bql {
        final /* synthetic */ WeakReference<SingleEmitter<Status>> e;

        a(WeakReference<SingleEmitter<Status>> weakReference) {
            this.e = weakReference;
        }

        @Override // o.C5015bql, o.InterfaceC5018bqo
        public void c(Status status) {
            C8632dsu.c((Object) status, "");
            SingleEmitter<Status> singleEmitter = this.e.get();
            if (singleEmitter != null) {
                singleEmitter.onSuccess(status);
            }
        }
    }
}
