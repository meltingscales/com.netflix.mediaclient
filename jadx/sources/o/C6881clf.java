package o;

import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import javax.inject.Inject;

/* renamed from: o.clf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6881clf extends BaseViewModelInitializer {
    private final MoneyballDataSource a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public C6881clf(SignupErrorReporter signupErrorReporter, MoneyballDataSource moneyballDataSource) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) moneyballDataSource, "");
        this.a = moneyballDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.C6822ckZ c() {
        /*
            r9 = this;
            com.netflix.mediaclient.acquisition.lib.MoneyballDataSource r0 = r9.a
            com.netflix.android.moneyball.FlowMode r0 = r0.getFlowMode()
            if (r0 == 0) goto L6a
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r1 = com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r9)
            java.lang.String r2 = "autoLoginToken"
            com.netflix.android.moneyball.fields.Field r3 = r0.getField(r2)
            r4 = 0
            if (r3 == 0) goto L1a
            java.lang.Object r3 = r3.getValue()
            goto L1b
        L1a:
            r3 = r4
        L1b:
            java.lang.String r5 = "SignupNativeDataManipulationError"
            java.lang.String r6 = "SignupNativeFieldError"
            if (r3 != 0) goto L25
            r1.onDataError(r6, r2, r4)
            goto L2c
        L25:
            boolean r7 = r3 instanceof java.lang.String
            if (r7 != 0) goto L2d
            r1.onDataError(r5, r2, r4)
        L2c:
            r3 = r4
        L2d:
            java.lang.String r3 = (java.lang.String) r3
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r1 = com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r9)
            java.lang.String r2 = "signOutAction"
            com.netflix.android.moneyball.fields.Field r7 = r0.getField(r2)
            if (r7 != 0) goto L3f
            r1.onDataError(r6, r2, r4)
            goto L46
        L3f:
            boolean r8 = r7 instanceof com.netflix.android.moneyball.fields.ActionField
            if (r8 != 0) goto L47
            r1.onDataError(r5, r2, r4)
        L46:
            r7 = r4
        L47:
            com.netflix.android.moneyball.fields.ActionField r7 = (com.netflix.android.moneyball.fields.ActionField) r7
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r1 = com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r9)
            java.lang.String r2 = "backAction"
            com.netflix.android.moneyball.fields.Field r0 = r0.getField(r2)
            if (r0 != 0) goto L59
            r1.onDataError(r6, r2, r4)
            goto L62
        L59:
            boolean r6 = r0 instanceof com.netflix.android.moneyball.fields.ActionField
            if (r6 != 0) goto L61
            r1.onDataError(r5, r2, r4)
            goto L62
        L61:
            r4 = r0
        L62:
            com.netflix.android.moneyball.fields.ActionField r4 = (com.netflix.android.moneyball.fields.ActionField) r4
            o.ckZ r0 = new o.ckZ
            r0.<init>(r3, r7, r4)
            return r0
        L6a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C6881clf.c():o.ckZ");
    }
}
