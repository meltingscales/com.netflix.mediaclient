package com.netflix.mediaclient.ui.repository;

import com.netflix.mediaclient.ui.repository.ConfigurationRepository$refreshCustomerConfigData$2;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import java.lang.ref.WeakReference;
import kotlin.Triple;
import kotlin.jvm.internal.Lambda;
import o.C1831aPw;
import o.C8632dsu;
import o.InterfaceC5093bsJ;
import o.aOV;
import o.aOX;
import o.drM;

/* loaded from: classes4.dex */
public final class ConfigurationRepository$refreshCustomerConfigData$2 extends Lambda implements drM<Triple<? extends Boolean, ? extends InterfaceC5093bsJ, ? extends aOV>, SingleSource<? extends Boolean>> {
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigurationRepository$refreshCustomerConfigData$2(boolean z) {
        super(1);
        this.e = z;
    }

    @Override // o.drM
    /* renamed from: b */
    public final SingleSource<? extends Boolean> invoke(Triple<Boolean, ? extends InterfaceC5093bsJ, ? extends aOV> triple) {
        C8632dsu.c((Object) triple, "");
        final Boolean e = triple.e();
        final InterfaceC5093bsJ d = triple.d();
        final aOV a2 = triple.a();
        final boolean z = this.e;
        return Single.create(new SingleOnSubscribe() { // from class: o.cQG
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                ConfigurationRepository$refreshCustomerConfigData$2.c(InterfaceC5093bsJ.this, e, z, a2, singleEmitter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC5093bsJ interfaceC5093bsJ, Boolean bool, boolean z, aOV aov, SingleEmitter singleEmitter) {
        C8632dsu.c((Object) interfaceC5093bsJ, "");
        C8632dsu.c((Object) bool, "");
        C8632dsu.c((Object) aov, "");
        C8632dsu.c((Object) singleEmitter, "");
        aov.b(new aOX(interfaceC5093bsJ, bool.booleanValue(), z), new a(new WeakReference(singleEmitter)));
    }

    /* loaded from: classes4.dex */
    public static final class a extends C1831aPw {
        final /* synthetic */ WeakReference<SingleEmitter<Boolean>> b;

        a(WeakReference<SingleEmitter<Boolean>> weakReference) {
            this.b = weakReference;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
            if (r3.j() == true) goto L6;
         */
        @Override // o.C1831aPw, o.InterfaceC1813aPe
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void d(com.netflix.mediaclient.service.webclient.model.leafs.ConfigData r2, com.netflix.mediaclient.android.app.Status r3) {
            /*
                r1 = this;
                java.lang.ref.WeakReference<io.reactivex.SingleEmitter<java.lang.Boolean>> r2 = r1.b
                java.lang.Object r2 = r2.get()
                io.reactivex.SingleEmitter r2 = (io.reactivex.SingleEmitter) r2
                if (r2 == 0) goto L1c
                if (r3 == 0) goto L14
                boolean r3 = r3.j()
                r0 = 1
                if (r3 != r0) goto L14
                goto L15
            L14:
                r0 = 0
            L15:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
                r2.onSuccess(r3)
            L1c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.repository.ConfigurationRepository$refreshCustomerConfigData$2.a.d(com.netflix.mediaclient.service.webclient.model.leafs.ConfigData, com.netflix.mediaclient.android.app.Status):void");
        }
    }
}
