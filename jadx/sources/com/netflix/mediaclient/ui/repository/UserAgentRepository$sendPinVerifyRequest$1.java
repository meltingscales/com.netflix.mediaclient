package com.netflix.mediaclient.ui.repository;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.ui.repository.UserAgentRepository$sendPinVerifyRequest$1;
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
public final class UserAgentRepository$sendPinVerifyRequest$1 extends Lambda implements drM<UserAgent, SingleSource<? extends cQQ.b>> {
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ UserAgent.PinType d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAgentRepository$sendPinVerifyRequest$1(String str, UserAgent.PinType pinType, String str2) {
        super(1);
        this.c = str;
        this.d = pinType;
        this.b = str2;
    }

    @Override // o.drM
    /* renamed from: a */
    public final SingleSource<? extends cQQ.b> invoke(final UserAgent userAgent) {
        C8632dsu.c((Object) userAgent, "");
        final String str = this.c;
        final UserAgent.PinType pinType = this.d;
        final String str2 = this.b;
        return Single.create(new SingleOnSubscribe() { // from class: o.cRn
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                UserAgentRepository$sendPinVerifyRequest$1.a(UserAgent.this, str, pinType, str2, singleEmitter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(UserAgent userAgent, String str, UserAgent.PinType pinType, String str2, SingleEmitter singleEmitter) {
        C8632dsu.c((Object) userAgent, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) pinType, "");
        C8632dsu.c((Object) singleEmitter, "");
        userAgent.b(str, pinType, str2, new e(new WeakReference(singleEmitter)));
    }

    /* loaded from: classes4.dex */
    public static final class e extends C5015bql {
        final /* synthetic */ WeakReference<SingleEmitter<cQQ.b>> d;

        e(WeakReference<SingleEmitter<cQQ.b>> weakReference) {
            this.d = weakReference;
        }

        @Override // o.C5015bql, o.InterfaceC5018bqo
        public void a(boolean z, Status status) {
            C8632dsu.c((Object) status, "");
            SingleEmitter<cQQ.b> singleEmitter = this.d.get();
            if (singleEmitter != null) {
                singleEmitter.onSuccess(new cQQ.b(z, status));
            }
        }
    }
}
