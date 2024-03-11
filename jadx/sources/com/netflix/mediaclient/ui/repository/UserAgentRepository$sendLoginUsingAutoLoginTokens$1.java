package com.netflix.mediaclient.ui.repository;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.ui.repository.UserAgentRepository$sendLoginUsingAutoLoginTokens$1;
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
public final class UserAgentRepository$sendLoginUsingAutoLoginTokens$1 extends Lambda implements drM<UserAgent, SingleSource<? extends Status>> {
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAgentRepository$sendLoginUsingAutoLoginTokens$1(String str) {
        super(1);
        this.b = str;
    }

    @Override // o.drM
    /* renamed from: a */
    public final SingleSource<? extends Status> invoke(final UserAgent userAgent) {
        C8632dsu.c((Object) userAgent, "");
        final String str = this.b;
        return Single.create(new SingleOnSubscribe() { // from class: o.cRl
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                UserAgentRepository$sendLoginUsingAutoLoginTokens$1.c(UserAgent.this, str, singleEmitter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(UserAgent userAgent, String str, SingleEmitter singleEmitter) {
        C8632dsu.c((Object) userAgent, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) singleEmitter, "");
        userAgent.e(str, new d(new WeakReference(singleEmitter)));
    }

    /* loaded from: classes4.dex */
    public static final class d extends C5015bql {
        final /* synthetic */ WeakReference<SingleEmitter<Status>> d;

        d(WeakReference<SingleEmitter<Status>> weakReference) {
            this.d = weakReference;
        }

        @Override // o.C5015bql, o.InterfaceC5018bqo
        public void c(Status status) {
            C8632dsu.c((Object) status, "");
            SingleEmitter<Status> singleEmitter = this.d.get();
            if (singleEmitter != null) {
                singleEmitter.onSuccess(status);
            }
        }
    }
}
