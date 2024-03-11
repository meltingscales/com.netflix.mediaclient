package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.android.moneyball.fields.NumberField;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballCallData;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.rxkotlin.DisposableKt;
import kotlin.jvm.internal.Ref;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drO;

/* renamed from: o.cjQ */
/* loaded from: classes4.dex */
public final class C6760cjQ extends ViewModel {
    public static final b b = new b(null);
    private C6762cjS a;
    private final CompositeDisposable e = new CompositeDisposable();

    /* renamed from: o.cjQ$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("MultihouseholdNudgeViewModel");
        }
    }

    public static /* synthetic */ void e(C6760cjQ c6760cjQ, C6755cjL c6755cjL, String str, boolean z, ActionField actionField, drM drm, drO dro, int i, Object obj) {
        c6760cjQ.a(c6755cjL, str, z, (i & 8) != 0 ? null : actionField, (i & 16) != 0 ? null : drm, (i & 32) != 0 ? null : dro);
    }

    public final void a(final C6755cjL c6755cjL, final String str, final boolean z, ActionField actionField, final drM<? super LifecycleOwner, dpR> drm, final drO<dpR> dro) {
        C8632dsu.c((Object) c6755cjL, "");
        MoneyballCallData b2 = b(str, actionField);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (b2 != null) {
            CompositeDisposable compositeDisposable = this.e;
            InterfaceC6748cjE d = c6755cjL.d();
            C8632dsu.d(d);
            DisposableKt.plusAssign(compositeDisposable, ((C6753cjJ) d).a().a(b2, new drM<MoneyballData, dpR>() { // from class: com.netflix.mediaclient.ui.multihousehold.impl.MultihouseholdNudgeViewModel$getMoneyballData$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(MoneyballData moneyballData) {
                    c(moneyballData);
                    return dpR.c;
                }

                /* JADX WARN: Type inference failed for: r6v1, types: [T, androidx.lifecycle.LifecycleOwner] */
                public final void c(MoneyballData moneyballData) {
                    ?? b3;
                    C8632dsu.c((Object) moneyballData, "");
                    Ref.ObjectRef<LifecycleOwner> objectRef2 = objectRef;
                    b3 = this.b(moneyballData, str, z, c6755cjL);
                    objectRef2.d = b3;
                    drM<LifecycleOwner, dpR> drm2 = drm;
                    if (drm2 != null) {
                        drm2.invoke(objectRef.d);
                    }
                }
            }, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.multihousehold.impl.MultihouseholdNudgeViewModel$getMoneyballData$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    c(th);
                    return dpR.c;
                }

                public final void c(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    drO<dpR> dro2 = dro;
                    if (dro2 != null) {
                        dro2.invoke();
                    }
                    c6755cjL.a();
                }
            }));
        }
    }

    public final LifecycleOwner b(MoneyballData moneyballData, String str, boolean z, C6755cjL c6755cjL) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1794985207:
                    if (str.equals(SignupConstants.Action.NEXT_ACTION)) {
                        return c6755cjL.b(z, b(moneyballData));
                    }
                    break;
                case 247975198:
                    if (str.equals(SignupConstants.Action.RESEND_CODE_ACTION)) {
                        return c6755cjL.e(z, b(moneyballData));
                    }
                    break;
                case 1004001131:
                    if (str.equals(SignupConstants.Action.SMS_OTP_ACTION)) {
                        return c6755cjL.a(z, b(moneyballData));
                    }
                    break;
                case 1861150205:
                    if (str.equals(SignupConstants.Action.BACK_ACTION)) {
                        c6755cjL.h();
                        return null;
                    }
                    break;
                case 2082533870:
                    if (str.equals(SignupConstants.Action.EMAIL_OTP_ACTION)) {
                        return c6755cjL.c(z, b(moneyballData));
                    }
                    break;
            }
        }
        return null;
    }

    private final MoneyballCallData b(String str, ActionField actionField) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1794985207:
                    if (str.equals(SignupConstants.Action.NEXT_ACTION)) {
                        return new MoneyballCallData(actionField != null ? actionField.getFlowMode() : null, (String) null, actionField);
                    }
                    return null;
                case 247975198:
                    if (str.equals(SignupConstants.Action.RESEND_CODE_ACTION)) {
                        return new MoneyballCallData(SignupConstants.Flow.ANDROID_MEMBER, "mhuVerifyFactor", str);
                    }
                    return null;
                case 1004001131:
                    if (str.equals(SignupConstants.Action.SMS_OTP_ACTION)) {
                        return new MoneyballCallData(SignupConstants.Flow.ANDROID_MEMBER, "mhuNudgeLanding", str);
                    }
                    return null;
                case 1861150205:
                    if (str.equals(SignupConstants.Action.BACK_ACTION)) {
                        return new MoneyballCallData(SignupConstants.Flow.ANDROID_MEMBER, "mhuVerifyFactor", str);
                    }
                    return null;
                case 2082533870:
                    if (str.equals(SignupConstants.Action.EMAIL_OTP_ACTION)) {
                        return new MoneyballCallData(SignupConstants.Flow.ANDROID_MEMBER, "mhuNudgeLanding", str);
                    }
                    return null;
                default:
                    return null;
            }
        }
        return null;
    }

    public final C6762cjS b(MoneyballData moneyballData) {
        String str;
        String str2;
        String str3;
        NumberField numberField;
        StringField stringField;
        ActionField actionField;
        ActionField actionField2;
        ActionField actionField3;
        String str4 = null;
        FlowMode flowMode = moneyballData != null ? moneyballData.getFlowMode() : null;
        if (flowMode != null) {
            Field field = flowMode.getField(SignupConstants.Field.MFA_DELIVERY_TYPE);
            String value = field != null ? field.getValue() : null;
            if (value == null || !(value instanceof String)) {
                value = null;
            }
            str = value;
        } else {
            str = null;
        }
        if (flowMode != null) {
            Field field2 = flowMode.getField(SignupConstants.Field.CURRENT_EMAIL);
            String value2 = field2 != null ? field2.getValue() : null;
            if (value2 == null || !(value2 instanceof String)) {
                value2 = null;
            }
            str2 = value2;
        } else {
            str2 = null;
        }
        if (flowMode != null) {
            Field field3 = flowMode.getField(SignupConstants.Field.FORMATTED_PHONE_NUMBER);
            String value3 = field3 != null ? field3.getValue() : null;
            if (value3 == null || !(value3 instanceof String)) {
                value3 = null;
            }
            str3 = value3;
        } else {
            str3 = null;
        }
        if (flowMode != null) {
            Field field4 = flowMode.getField(SignupConstants.Field.EXPIRY_IN_MINUTES);
            if (field4 == null || !(field4 instanceof NumberField)) {
                field4 = null;
            }
            numberField = (NumberField) field4;
        } else {
            numberField = null;
        }
        if (flowMode != null) {
            Field field5 = flowMode.getField(SignupConstants.Field.CHALLENGE_OTP);
            if (field5 == null || !(field5 instanceof StringField)) {
                field5 = null;
            }
            stringField = (StringField) field5;
        } else {
            stringField = null;
        }
        if (flowMode != null) {
            Field field6 = flowMode.getField(SignupConstants.Action.RESEND_CODE_ACTION);
            if (field6 == null || !(field6 instanceof ActionField)) {
                field6 = null;
            }
            actionField = (ActionField) field6;
        } else {
            actionField = null;
        }
        if (flowMode != null) {
            Field field7 = flowMode.getField(SignupConstants.Action.BACK_ACTION);
            if (field7 == null || !(field7 instanceof ActionField)) {
                field7 = null;
            }
            actionField2 = (ActionField) field7;
        } else {
            actionField2 = null;
        }
        if (flowMode != null) {
            Field field8 = flowMode.getField(SignupConstants.Action.NEXT_ACTION);
            if (field8 == null || !(field8 instanceof ActionField)) {
                field8 = null;
            }
            actionField3 = (ActionField) field8;
        } else {
            actionField3 = null;
        }
        if (flowMode != null) {
            Field field9 = flowMode.getField("errorCode");
            Object value4 = field9 != null ? field9.getValue() : null;
            if (value4 != null && (value4 instanceof String)) {
                str4 = value4;
            }
            str4 = str4;
        }
        C6762cjS c6762cjS = new C6762cjS(str, str2, str3, numberField, stringField, actionField, actionField2, actionField3, str4);
        this.a = c6762cjS;
        return c6762cjS;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.e.clear();
    }

    public final void a(String str, boolean z, C6755cjL c6755cjL) {
        StringField c;
        ActionField j;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c6755cjL, "");
        C6762cjS c6762cjS = this.a;
        StringField c2 = c6762cjS != null ? c6762cjS.c() : null;
        if (c2 != null) {
            c2.setValue(str);
        }
        C6762cjS c6762cjS2 = this.a;
        if (c6762cjS2 == null || (c = c6762cjS2.c()) == null || str.length() != c.getMaxLength()) {
            return;
        }
        C6762cjS c6762cjS3 = this.a;
        String id = (c6762cjS3 == null || (j = c6762cjS3.j()) == null) ? null : j.getId();
        C6762cjS c6762cjS4 = this.a;
        e(this, c6755cjL, id, z, c6762cjS4 != null ? c6762cjS4.j() : null, null, null, 48, null);
    }
}
