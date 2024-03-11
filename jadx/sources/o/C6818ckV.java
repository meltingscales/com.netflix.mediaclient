package o;

import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import javax.inject.Inject;

/* renamed from: o.ckV  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6818ckV extends BaseViewModelInitializer {
    private final MoneyballDataSource b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public C6818ckV(SignupErrorReporter signupErrorReporter, MoneyballDataSource moneyballDataSource) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) moneyballDataSource, "");
        this.b = moneyballDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.C6811ckO a() {
        /*
            r9 = this;
            com.netflix.mediaclient.acquisition.lib.MoneyballDataSource r0 = r9.b
            com.netflix.android.moneyball.FlowMode r0 = r0.getFlowMode()
            if (r0 == 0) goto L76
            com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r9)
            java.lang.String r1 = "nextAction"
            com.netflix.android.moneyball.fields.Field r1 = r0.getField(r1)
            r2 = 0
            if (r1 != 0) goto L15
            goto L19
        L15:
            boolean r3 = r1 instanceof com.netflix.android.moneyball.fields.ActionField
            if (r3 != 0) goto L1a
        L19:
            r1 = r2
        L1a:
            com.netflix.android.moneyball.fields.ActionField r1 = (com.netflix.android.moneyball.fields.ActionField) r1
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r3 = com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r9)
            java.lang.String r4 = "backAction"
            com.netflix.android.moneyball.fields.Field r5 = r0.getField(r4)
            java.lang.String r6 = "SignupNativeDataManipulationError"
            java.lang.String r7 = "SignupNativeFieldError"
            if (r5 != 0) goto L30
            r3.onDataError(r7, r4, r2)
            goto L37
        L30:
            boolean r8 = r5 instanceof com.netflix.android.moneyball.fields.ActionField
            if (r8 != 0) goto L38
            r3.onDataError(r6, r4, r2)
        L37:
            r5 = r2
        L38:
            com.netflix.android.moneyball.fields.ActionField r5 = (com.netflix.android.moneyball.fields.ActionField) r5
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r3 = com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r9)
            java.lang.String r4 = "mhuTroubleshootMobileAction"
            com.netflix.android.moneyball.fields.Field r8 = r0.getField(r4)
            if (r8 != 0) goto L4a
            r3.onDataError(r7, r4, r2)
            goto L51
        L4a:
            boolean r7 = r8 instanceof com.netflix.android.moneyball.fields.ActionField
            if (r7 != 0) goto L52
            r3.onDataError(r6, r4, r2)
        L51:
            r8 = r2
        L52:
            com.netflix.android.moneyball.fields.ActionField r8 = (com.netflix.android.moneyball.fields.ActionField) r8
            com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r9)
            java.lang.String r3 = "errorCode"
            com.netflix.android.moneyball.fields.Field r0 = r0.getField(r3)
            if (r0 == 0) goto L64
            java.lang.Object r0 = r0.getValue()
            goto L65
        L64:
            r0 = r2
        L65:
            if (r0 != 0) goto L68
            goto L6e
        L68:
            boolean r3 = r0 instanceof java.lang.String
            if (r3 != 0) goto L6d
            goto L6e
        L6d:
            r2 = r0
        L6e:
            java.lang.String r2 = (java.lang.String) r2
            o.ckO r0 = new o.ckO
            r0.<init>(r1, r5, r8, r2)
            return r0
        L76:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C6818ckV.a():o.ckO");
    }
}
