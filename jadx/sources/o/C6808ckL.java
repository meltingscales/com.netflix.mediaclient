package o;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import javax.inject.Inject;

/* renamed from: o.ckL  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6808ckL extends BaseViewModelInitializer {
    private final MoneyballDataSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public C6808ckL(SignupErrorReporter signupErrorReporter, MoneyballDataSource moneyballDataSource) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) moneyballDataSource, "");
        this.c = moneyballDataSource;
    }

    public final C6802ckF b() {
        String str;
        FlowMode flowMode = this.c.getFlowMode();
        if (flowMode != null) {
            SignupErrorReporter signupErrorReporter = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field = flowMode.getField(SignupConstants.Action.BACK_ACTION);
            if (field != null) {
                if (!(field instanceof ActionField)) {
                    str = SignupConstants.Error.DATA_MANIPULATION_ERROR;
                }
                return new C6802ckF((ActionField) field);
            }
            str = SignupConstants.Error.MISSING_FIELD_ERROR;
            signupErrorReporter.onDataError(str, SignupConstants.Action.BACK_ACTION, null);
            field = null;
            return new C6802ckF((ActionField) field);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
