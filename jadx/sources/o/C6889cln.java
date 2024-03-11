package o;

import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import javax.inject.Inject;

/* renamed from: o.cln  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6889cln extends BaseViewModelInitializer {
    private final MoneyballDataSource e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public C6889cln(SignupErrorReporter signupErrorReporter, MoneyballDataSource moneyballDataSource) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) moneyballDataSource, "");
        this.e = moneyballDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.C6886clk a() {
        /*
            r9 = this;
            com.netflix.mediaclient.acquisition.lib.MoneyballDataSource r0 = r9.e
            com.netflix.android.moneyball.FlowMode r0 = r0.getFlowMode()
            if (r0 == 0) goto L87
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r1 = com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r9)
            java.lang.String r2 = "nextAction"
            com.netflix.android.moneyball.fields.Field r3 = r0.getField(r2)
            java.lang.String r4 = "SignupNativeDataManipulationError"
            java.lang.String r5 = "SignupNativeFieldError"
            r6 = 0
            if (r3 != 0) goto L1d
            r1.onDataError(r5, r2, r6)
            goto L24
        L1d:
            boolean r7 = r3 instanceof com.netflix.android.moneyball.fields.ActionField
            if (r7 != 0) goto L25
            r1.onDataError(r4, r2, r6)
        L24:
            r3 = r6
        L25:
            com.netflix.android.moneyball.fields.ActionField r3 = (com.netflix.android.moneyball.fields.ActionField) r3
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r1 = com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r9)
            java.lang.String r2 = "backAction"
            com.netflix.android.moneyball.fields.Field r7 = r0.getField(r2)
            if (r7 != 0) goto L37
            r1.onDataError(r5, r2, r6)
            goto L3e
        L37:
            boolean r8 = r7 instanceof com.netflix.android.moneyball.fields.ActionField
            if (r8 != 0) goto L3f
            r1.onDataError(r4, r2, r6)
        L3e:
            r7 = r6
        L3f:
            com.netflix.android.moneyball.fields.ActionField r7 = (com.netflix.android.moneyball.fields.ActionField) r7
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r1 = com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r9)
            java.lang.String r2 = "mhuVerifyTravelAction"
            com.netflix.android.moneyball.fields.Field r8 = r0.getField(r2)
            if (r8 != 0) goto L51
            r1.onDataError(r5, r2, r6)
            goto L58
        L51:
            boolean r5 = r8 instanceof com.netflix.android.moneyball.fields.ActionField
            if (r5 != 0) goto L59
            r1.onDataError(r4, r2, r6)
        L58:
            r8 = r6
        L59:
            com.netflix.android.moneyball.fields.ActionField r8 = (com.netflix.android.moneyball.fields.ActionField) r8
            com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r9)
            java.lang.String r1 = "travelDaysOfAccess"
            com.netflix.android.moneyball.fields.Field r0 = r0.getField(r1)
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r0.getValue()
            goto L6c
        L6b:
            r0 = r6
        L6c:
            if (r0 != 0) goto L6f
            goto L73
        L6f:
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 != 0) goto L74
        L73:
            r0 = r6
        L74:
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L81
            long r0 = r0.longValue()
            int r0 = (int) r0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L81:
            o.clk r0 = new o.clk
            r0.<init>(r7, r8, r3, r6)
            return r0
        L87:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C6889cln.a():o.clk");
    }
}
