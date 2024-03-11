package com.netflix.mediaclient.ui.repository;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.user.SmartLockMonitor;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.ui.repository.UserAgentRepository$sendLoginRequest$1;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Lambda;
import o.C5007bqd;
import o.C5015bql;
import o.C8632dsu;
import o.drM;

/* loaded from: classes4.dex */
public final class UserAgentRepository$sendLoginRequest$1 extends Lambda implements drM<UserAgent, SingleSource<? extends Status>> {
    final /* synthetic */ C5007bqd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAgentRepository$sendLoginRequest$1(C5007bqd c5007bqd) {
        super(1);
        this.c = c5007bqd;
    }

    @Override // o.drM
    /* renamed from: b */
    public final SingleSource<? extends Status> invoke(final UserAgent userAgent) {
        C8632dsu.c((Object) userAgent, "");
        final C5007bqd c5007bqd = this.c;
        return Single.create(new SingleOnSubscribe() { // from class: o.cRj
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                UserAgentRepository$sendLoginRequest$1.b(UserAgent.this, c5007bqd, singleEmitter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(UserAgent userAgent, C5007bqd c5007bqd, SingleEmitter singleEmitter) {
        C8632dsu.c((Object) userAgent, "");
        C8632dsu.c((Object) c5007bqd, "");
        C8632dsu.c((Object) singleEmitter, "");
        userAgent.c(c5007bqd, new e(c5007bqd, new WeakReference(singleEmitter)));
    }

    /* loaded from: classes4.dex */
    public static final class e extends C5015bql {
        final /* synthetic */ WeakReference<SingleEmitter<Status>> d;
        final /* synthetic */ C5007bqd e;

        e(C5007bqd c5007bqd, WeakReference<SingleEmitter<Status>> weakReference) {
            this.e = c5007bqd;
            this.d = weakReference;
        }

        @Override // o.C5015bql, o.InterfaceC5018bqo
        public void c(Status status) {
            C8632dsu.c((Object) status, "");
            SmartLockMonitor.INSTANCE.d(status.j() && this.e.h());
            SingleEmitter<Status> singleEmitter = this.d.get();
            if (singleEmitter != null) {
                singleEmitter.onSuccess(status);
            }
        }
    }
}
