package o;

import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.android.moneyball.fields.OptionField;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.InputKind;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.koreaLegal.KoreaCheckBoxesViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.paymentInfo.PaymentInfoViewModel;
import com.netflix.mediaclient.acquisition.components.paymentInfo.PaymentInfoViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.tou.TouViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.acquisition.lib.util.kotlinx.KeyPathEvaluationKt;
import com.netflix.mediaclient.acquisition.screens.creditDebit.EmvcoDataService;
import com.netflix.mediaclient.acquisition.screens.creditDebit.EmvcoEventLogger;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import o.C6670chg;
import o.C8632dsu;
import o.drO;

/* renamed from: o.chj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6673chj extends BaseViewModelInitializer {
    public static final d b = new d(null);
    private final EmvcoDataService a;
    private final ErrorMessageViewModelInitializer c;
    private final EmvcoEventLogger d;
    private final KoreaCheckBoxesViewModelInitializer e;
    private final SignupNetworkManager f;
    private final TouViewModelInitializer g;
    private MoneyballDataSource h;
    private final PaymentInfoViewModelInitializer i;
    private final StringProvider j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public C6673chj(MoneyballDataSource moneyballDataSource, SignupErrorReporter signupErrorReporter, SignupNetworkManager signupNetworkManager, StringProvider stringProvider, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, EmvcoDataService emvcoDataService, EmvcoEventLogger emvcoEventLogger, TouViewModelInitializer touViewModelInitializer, KoreaCheckBoxesViewModelInitializer koreaCheckBoxesViewModelInitializer, PaymentInfoViewModelInitializer paymentInfoViewModelInitializer) {
        super(signupErrorReporter);
        C8632dsu.c((Object) moneyballDataSource, "");
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) errorMessageViewModelInitializer, "");
        C8632dsu.c((Object) emvcoDataService, "");
        C8632dsu.c((Object) emvcoEventLogger, "");
        C8632dsu.c((Object) touViewModelInitializer, "");
        C8632dsu.c((Object) koreaCheckBoxesViewModelInitializer, "");
        C8632dsu.c((Object) paymentInfoViewModelInitializer, "");
        this.h = moneyballDataSource;
        this.f = signupNetworkManager;
        this.j = stringProvider;
        this.c = errorMessageViewModelInitializer;
        this.a = emvcoDataService;
        this.d = emvcoEventLogger;
        this.g = touViewModelInitializer;
        this.e = koreaCheckBoxesViewModelInitializer;
        this.i = paymentInfoViewModelInitializer;
    }

    /* renamed from: o.chj$d */
    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    private final FlowMode d() {
        return this.h.getFlowMode();
    }

    public final C6674chk c() {
        String str;
        String str2;
        StringField stringField;
        ActionField actionField;
        StringField stringField2;
        StringField stringField3;
        Map<String, Object> data;
        List j;
        FlowMode d2 = d();
        boolean z = false;
        Object obj = null;
        C6670chg a = a(d2 != null ? BaseViewModelInitializer.getSelectedPlan$default(this, d2, false, 1, null) : null);
        FlowMode d3 = d();
        if (d3 != null) {
            BaseViewModelInitializer.access$getSignupErrorReporter(this);
            Field field = d3.getField(SignupConstants.Field.FIRST_NAME);
            String value = field != null ? field.getValue() : null;
            if (value == null || !(value instanceof String)) {
                value = null;
            }
            str = value;
        } else {
            str = null;
        }
        FlowMode d4 = d();
        if (d4 != null) {
            BaseViewModelInitializer.access$getSignupErrorReporter(this);
            Field field2 = d4.getField(SignupConstants.Field.LAST_NAME);
            String value2 = field2 != null ? field2.getValue() : null;
            if (value2 == null || !(value2 instanceof String)) {
                value2 = null;
            }
            str2 = value2;
        } else {
            str2 = null;
        }
        FlowMode d5 = d();
        if (d5 != null) {
            BaseViewModelInitializer.access$getSignupErrorReporter(this);
            Field field3 = d5.getField(SignupConstants.Field.SECURITY_CODE);
            if (field3 == null || !(field3 instanceof StringField)) {
                field3 = null;
            }
            stringField = (StringField) field3;
        } else {
            stringField = null;
        }
        PaymentInfoViewModel createEditPaymentViewModel = this.i.createEditPaymentViewModel();
        FlowMode d6 = d();
        if (d6 != null) {
            BaseViewModelInitializer.access$getSignupErrorReporter(this);
            Field field4 = d6.getField(SignupConstants.Action.START_MEMBERSHIP);
            if (field4 == null || !(field4 instanceof ActionField)) {
                field4 = null;
            }
            actionField = (ActionField) field4;
        } else {
            actionField = null;
        }
        FlowMode d7 = d();
        if (d7 != null) {
            BaseViewModelInitializer.access$getSignupErrorReporter(this);
            Field field5 = d7.getField(SignupConstants.Field.EMVCO_3DS_AUTHENTICATION_WINDOW_SIZE);
            if (field5 == null || !(field5 instanceof StringField)) {
                field5 = null;
            }
            stringField2 = (StringField) field5;
        } else {
            stringField2 = null;
        }
        FlowMode d8 = d();
        if (d8 != null) {
            BaseViewModelInitializer.access$getSignupErrorReporter(this);
            Field field6 = d8.getField(SignupConstants.Field.EMVCO_3DS_DEVICE_DATA_RESPONSE_FALLBACK);
            if (field6 == null || !(field6 instanceof StringField)) {
                field6 = null;
            }
            stringField3 = (StringField) field6;
        } else {
            stringField3 = null;
        }
        FlowMode d9 = d();
        if (d9 != null && (data = d9.getData()) != null) {
            j = C8569dql.j(SignupConstants.Field.ADAPTIVE_FIELDS, SignupConstants.Field.CVV_TRUST_MESSAGE, SignupConstants.Field.SHOW_MESSAGE);
            BaseViewModelInitializer.access$getSignupErrorReporter(this);
            Object pathValue = KeyPathEvaluationKt.getPathValue((Object) data, (List<String>) j);
            C8576dqs.d(j, ",", null, null, 0, null, null, 62, null);
            if (pathValue != null && (pathValue instanceof Boolean)) {
                obj = pathValue;
            }
            z = C8632dsu.c(obj, Boolean.TRUE);
        }
        return new C6674chk(str, str2, stringField, a, createEditPaymentViewModel, actionField, stringField2, stringField3, z);
    }

    public final C6672chi d(final AppCompatActivity appCompatActivity, String str) {
        C8632dsu.c((Object) appCompatActivity, "");
        C8632dsu.c((Object) str, "");
        return new C6672chi(this.j, c(), b(new ViewModelLazy(dsA.a(C6671chh.class), new drO<ViewModelStore>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.planSelectionAndConfirm.PlanSelectionAndConfirmViewModelInitializer$createPlanSelectionAndConfirmViewModel$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = ComponentActivity.this.getViewModelStore();
                C8632dsu.a(viewModelStore, "");
                return viewModelStore;
            }
        }, new drO<ViewModelProvider.Factory>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.planSelectionAndConfirm.PlanSelectionAndConfirmViewModelInitializer$createPlanSelectionAndConfirmViewModel$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
                C8632dsu.a(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new drO<CreationExtras>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.planSelectionAndConfirm.PlanSelectionAndConfirmViewModelInitializer$createPlanSelectionAndConfirmViewModel$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                drO dro = drO.this;
                if (dro == null || (creationExtras = (CreationExtras) dro.invoke()) == null) {
                    CreationExtras defaultViewModelCreationExtras = appCompatActivity.getDefaultViewModelCreationExtras();
                    C8632dsu.a(defaultViewModelCreationExtras, "");
                    return defaultViewModelCreationExtras;
                }
                return creationExtras;
            }
        })), this.f, this.c.createErrorMessageViewModel(), this.a, this.d, FormViewEditTextViewModelInitializer.extractFormViewEditTextViewModel$default(new FormViewEditTextViewModelInitializer(d(), null, getSignupErrorReporter()), "confirm", SignupConstants.Field.SECURITY_CODE, AppView.cardSecurityCodeInput, InputKind.cardSecurityCode, false, false, null, 64, null), this.g.createTermsOfUsePaymentViewModel(d(), str), this.e.createKoreaCheckBoxesViewModel(d(), "planSelectionAndConfirm", null));
    }

    private static final C6671chh b(InterfaceC8554dpx<C6671chh> interfaceC8554dpx) {
        return interfaceC8554dpx.getValue();
    }

    public final C6670chg a(OptionField optionField) {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (optionField != null) {
            BaseViewModelInitializer.access$getSignupErrorReporter(this);
            Field field = optionField.getField(SignupConstants.Field.LOCALIZED_PLAN_NAME);
            String value = field != null ? field.getValue() : null;
            if (value == null || !(value instanceof String)) {
                value = null;
            }
            str = value;
        } else {
            str = null;
        }
        if (optionField != null) {
            BaseViewModelInitializer.access$getSignupErrorReporter(this);
            Field field2 = optionField.getField(SignupConstants.Field.PLAN_PRICE);
            String value2 = field2 != null ? field2.getValue() : null;
            if (value2 == null || !(value2 instanceof String)) {
                value2 = null;
            }
            str2 = value2;
        } else {
            str2 = null;
        }
        if (optionField != null) {
            BaseViewModelInitializer.access$getSignupErrorReporter(this);
            Field field3 = optionField.getField(SignupConstants.Field.PLAN_DESCRIPTION);
            String value3 = field3 != null ? field3.getValue() : null;
            if (value3 == null || !(value3 instanceof String)) {
                value3 = null;
            }
            str3 = value3;
        } else {
            str3 = null;
        }
        if (optionField != null) {
            BaseViewModelInitializer.access$getSignupErrorReporter(this);
            Field field4 = optionField.getField(SignupConstants.Field.PLAN_ID);
            Object value4 = field4 != null ? field4.getValue() : null;
            if (value4 != null && (value4 instanceof String)) {
                str4 = value4;
            }
            str4 = str4;
        }
        return (C6670chg) C9726vo.c(str, str2, str3, str4, new InterfaceC8613dsb<String, String, String, String, C6670chg>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.planSelectionAndConfirm.PlanSelectionAndConfirmViewModelInitializer$extractPlanData$1
            @Override // o.InterfaceC8613dsb
            /* renamed from: a */
            public final C6670chg invoke(String str5, String str6, String str7, String str8) {
                C8632dsu.c((Object) str5, "");
                C8632dsu.c((Object) str6, "");
                C8632dsu.c((Object) str7, "");
                C8632dsu.c((Object) str8, "");
                return new C6670chg(str5, str6, str7, str8);
            }
        });
    }
}
