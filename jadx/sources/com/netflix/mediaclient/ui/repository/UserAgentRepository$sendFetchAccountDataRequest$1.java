package com.netflix.mediaclient.ui.repository;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.ui.repository.UserAgentRepository$sendFetchAccountDataRequest$1;
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
public final class UserAgentRepository$sendFetchAccountDataRequest$1 extends Lambda implements drM<UserAgent, SingleSource<? extends cQQ.e>> {
    public static final UserAgentRepository$sendFetchAccountDataRequest$1 e = new UserAgentRepository$sendFetchAccountDataRequest$1();

    UserAgentRepository$sendFetchAccountDataRequest$1() {
        super(1);
    }

    @Override // o.drM
    /* renamed from: a */
    public final SingleSource<? extends cQQ.e> invoke(final UserAgent userAgent) {
        C8632dsu.c((Object) userAgent, "");
        return Single.create(new SingleOnSubscribe() { // from class: o.cRk
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                UserAgentRepository$sendFetchAccountDataRequest$1.b(UserAgent.this, singleEmitter);
            }
        });
    }

    /* loaded from: classes4.dex */
    public static final class e extends C5015bql {
        final /* synthetic */ WeakReference<SingleEmitter<cQQ.e>> b;

        e(WeakReference<SingleEmitter<cQQ.e>> weakReference) {
            this.b = weakReference;
        }

        @Override // o.C5015bql, o.InterfaceC5018bqo
        public void e(AccountData accountData, Status status) {
            C8632dsu.c((Object) status, "");
            SingleEmitter<cQQ.e> singleEmitter = this.b.get();
            if (singleEmitter != null) {
                singleEmitter.onSuccess(new cQQ.e(accountData, status));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(UserAgent userAgent, SingleEmitter singleEmitter) {
        C8632dsu.c((Object) userAgent, "");
        C8632dsu.c((Object) singleEmitter, "");
        userAgent.b(new e(new WeakReference(singleEmitter)));
    }
}
