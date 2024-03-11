package com.netflix.mediaclient.ui.repository;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.ui.repository.UserAgentRepository$sendLoginUsingExistingTokens$1;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Lambda;
import o.C5015bql;
import o.C8632dsu;
import o.drM;

/* loaded from: classes4.dex */
public final class UserAgentRepository$sendLoginUsingExistingTokens$1 extends Lambda implements drM<UserAgent, SingleSource<? extends Status>> {
    public static final UserAgentRepository$sendLoginUsingExistingTokens$1 d = new UserAgentRepository$sendLoginUsingExistingTokens$1();

    UserAgentRepository$sendLoginUsingExistingTokens$1() {
        super(1);
    }

    @Override // o.drM
    /* renamed from: d */
    public final SingleSource<? extends Status> invoke(final UserAgent userAgent) {
        C8632dsu.c((Object) userAgent, "");
        return Single.create(new SingleOnSubscribe() { // from class: o.cRp
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                UserAgentRepository$sendLoginUsingExistingTokens$1.e(UserAgent.this, singleEmitter);
            }
        });
    }

    /* loaded from: classes4.dex */
    public static final class c extends C5015bql {
        final /* synthetic */ WeakReference<SingleEmitter<Status>> c;

        c(WeakReference<SingleEmitter<Status>> weakReference) {
            this.c = weakReference;
        }

        @Override // o.C5015bql, o.InterfaceC5018bqo
        public void c(Status status) {
            C8632dsu.c((Object) status, "");
            SingleEmitter<Status> singleEmitter = this.c.get();
            if (singleEmitter != null) {
                singleEmitter.onSuccess(status);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(UserAgent userAgent, SingleEmitter singleEmitter) {
        C8632dsu.c((Object) userAgent, "");
        C8632dsu.c((Object) singleEmitter, "");
        userAgent.c(new c(new WeakReference(singleEmitter)));
    }
}
