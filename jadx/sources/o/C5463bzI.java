package o;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.mediaclient.acquisition.api.sms.SMSRetriever;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.services.sms.SMSRetrieverManager;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballCallData;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import com.netflix.mediaclient.ui.collectphone.api.CollectPhone;
import com.netflix.mediaclient.ui.collectphone.impl.CollectPhoneAgentImpl$resendCode$2;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import o.C5463bzI;
import o.C8632dsu;
import o.aMU;
import o.aMX;
import o.dpR;
import org.json.JSONObject;

/* renamed from: o.bzI  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5463bzI implements CollectPhone.e {
    public static final a c = new a(null);
    private final SMSRetrieverManager a;
    private final cQL b;
    private MoneyballData d;
    private e e;
    private b h;

    private final void e(String str, String str2, JSONObject jSONObject) {
    }

    @Inject
    public C5463bzI(SMSRetrieverManager sMSRetrieverManager) {
        C8632dsu.c((Object) sMSRetrieverManager, "");
        this.a = sMSRetrieverManager;
        this.b = new cQL();
    }

    /* renamed from: o.bzI$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("CollectPhoneAgentImpl");
        }
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public CollectPhone.d d() {
        Object obj;
        StringField e2;
        Iterator<T> it = b().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String b2 = ((CollectPhone.d) next).b();
            e eVar = this.e;
            if (eVar != null && (e2 = eVar.e()) != null) {
                obj = e2.getValue();
            }
            if (C8632dsu.c(b2, obj)) {
                obj = next;
                break;
            }
        }
        return (CollectPhone.d) obj;
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public List<CollectPhone.d> b() {
        List<CollectPhone.d> i;
        List<CollectPhone.d> d;
        e eVar = this.e;
        if (eVar == null || (d = eVar.d()) == null) {
            i = C8569dql.i();
            return i;
        }
        return d;
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public boolean c() {
        StringField b2;
        e eVar = this.e;
        if (eVar == null || (b2 = eVar.b()) == null) {
            return false;
        }
        return b2.isValid();
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public String e() {
        Object obj;
        String e2;
        StringField e3;
        StringField a2;
        b bVar = this.h;
        Object value = (bVar == null || (a2 = bVar.a()) == null) ? null : a2.getValue();
        String str = value instanceof String ? (String) value : null;
        if (str == null) {
            return "";
        }
        Iterator<T> it = b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C8632dsu.c((Object) ((CollectPhone.d) obj).b(), (Object) str)) {
                break;
            }
        }
        CollectPhone.d dVar = (CollectPhone.d) obj;
        if (dVar == null || (e2 = dVar.e()) == null) {
            return "";
        }
        b bVar2 = this.h;
        Object value2 = (bVar2 == null || (e3 = bVar2.e()) == null) ? null : e3.getValue();
        String str2 = value2 instanceof String ? value2 : null;
        if (str2 == null) {
            return "";
        }
        return "+" + e2 + " " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.C5463bzI.e a(com.netflix.android.moneyball.FlowMode r21) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5463bzI.a(com.netflix.android.moneyball.FlowMode):o.bzI$e");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final b b(FlowMode flowMode) {
        StringField stringField;
        StringField stringField2;
        StringField stringField3;
        StringField stringField4;
        ActionField actionField;
        ActionField actionField2;
        c(flowMode);
        Field field = null;
        if (flowMode != null) {
            Field field2 = flowMode.getField(SignupConstants.Field.PHONE_NUMBER);
            if (field2 == null) {
                e(SignupConstants.Error.MISSING_FIELD_ERROR, SignupConstants.Field.PHONE_NUMBER, null);
            } else {
                if (!(field2 instanceof StringField)) {
                    e(SignupConstants.Error.DATA_MANIPULATION_ERROR, SignupConstants.Field.PHONE_NUMBER, null);
                }
                stringField = (StringField) field2;
            }
            field2 = null;
            stringField = (StringField) field2;
        } else {
            stringField = null;
        }
        if (flowMode != null) {
            Field field3 = flowMode.getField(SignupConstants.Field.COUNTRY_CODE);
            if (field3 == null) {
                e(SignupConstants.Error.MISSING_FIELD_ERROR, SignupConstants.Field.COUNTRY_CODE, null);
            } else {
                if (!(field3 instanceof StringField)) {
                    e(SignupConstants.Error.DATA_MANIPULATION_ERROR, SignupConstants.Field.COUNTRY_CODE, null);
                }
                stringField2 = (StringField) field3;
            }
            field3 = null;
            stringField2 = (StringField) field3;
        } else {
            stringField2 = null;
        }
        if (flowMode != null) {
            Field field4 = flowMode.getField(SignupConstants.Field.SMS_CODE);
            if (field4 == null) {
                e(SignupConstants.Error.MISSING_FIELD_ERROR, SignupConstants.Field.SMS_CODE, null);
            } else {
                if (!(field4 instanceof StringField)) {
                    e(SignupConstants.Error.DATA_MANIPULATION_ERROR, SignupConstants.Field.SMS_CODE, null);
                }
                stringField3 = (StringField) field4;
            }
            field4 = null;
            stringField3 = (StringField) field4;
        } else {
            stringField3 = null;
        }
        if (flowMode != null) {
            Field field5 = flowMode.getField(SignupConstants.Field.ANDROID_APP_HASH);
            if (field5 == null || !(field5 instanceof StringField)) {
                field5 = null;
            }
            stringField4 = (StringField) field5;
        } else {
            stringField4 = null;
        }
        if (flowMode != null) {
            Field field6 = flowMode.getField(SignupConstants.Action.RESEND_CODE_ACTION);
            if (field6 == null) {
                e(SignupConstants.Error.MISSING_FIELD_ERROR, SignupConstants.Action.RESEND_CODE_ACTION, null);
            } else {
                if (!(field6 instanceof ActionField)) {
                    e(SignupConstants.Error.DATA_MANIPULATION_ERROR, SignupConstants.Action.RESEND_CODE_ACTION, null);
                }
                actionField = (ActionField) field6;
            }
            field6 = null;
            actionField = (ActionField) field6;
        } else {
            actionField = null;
        }
        if (flowMode != null) {
            Field field7 = flowMode.getField(SignupConstants.Action.NEXT_ACTION);
            if (field7 == null) {
                e(SignupConstants.Error.MISSING_FIELD_ERROR, SignupConstants.Action.NEXT_ACTION, null);
            } else {
                if (!(field7 instanceof ActionField)) {
                    e(SignupConstants.Error.DATA_MANIPULATION_ERROR, SignupConstants.Action.NEXT_ACTION, null);
                }
                actionField2 = (ActionField) field7;
            }
            field7 = null;
            actionField2 = (ActionField) field7;
        } else {
            actionField2 = null;
        }
        if (flowMode != null) {
            Field field8 = flowMode.getField(SignupConstants.Action.BACK_ACTION);
            if (field8 == null) {
                e(SignupConstants.Error.MISSING_FIELD_ERROR, SignupConstants.Action.BACK_ACTION, null);
            } else if (field8 instanceof ActionField) {
                field = field8;
            } else {
                e(SignupConstants.Error.DATA_MANIPULATION_ERROR, SignupConstants.Action.BACK_ACTION, null);
            }
            field = (ActionField) field;
        }
        return new b(stringField, stringField2, stringField3, stringField4, actionField, actionField2, field);
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public Single<dpR> a() {
        Single e2 = cQL.e(this.b, false, new drX<aMU, aMX, dpR>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.CollectPhoneAgentImpl$initialize$1
            @Override // o.drX
            public /* synthetic */ dpR invoke(aMU amu, aMX amx) {
                b(amu, amx);
                return dpR.c;
            }

            public final void b(aMU amu, aMX amx) {
                C8632dsu.c((Object) amu, "");
                C8632dsu.c((Object) amx, "");
                amu.c(SignupConstants.Flow.ANDROID_MEMBER, "collectPhoneNumber", amx);
            }
        }, 1, null);
        final drM<MoneyballData, dpR> drm = new drM<MoneyballData, dpR>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.CollectPhoneAgentImpl$initialize$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(MoneyballData moneyballData) {
                d(moneyballData);
                return dpR.c;
            }

            public final void d(MoneyballData moneyballData) {
                C5463bzI.e a2;
                C8632dsu.c((Object) moneyballData, "");
                C5463bzI.this.d = moneyballData;
                C5463bzI c5463bzI = C5463bzI.this;
                a2 = c5463bzI.a(moneyballData.getFlowMode());
                c5463bzI.e = a2;
            }
        };
        Single<dpR> map = e2.map(new Function() { // from class: o.bzJ
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                dpR j;
                j = C5463bzI.j(drM.this, obj);
                return j;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dpR j(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (dpR) drm.invoke(obj);
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public void e(String str) {
        C8632dsu.c((Object) str, "");
        e eVar = this.e;
        StringField e2 = eVar != null ? eVar.e() : null;
        if (e2 == null) {
            return;
        }
        e2.setValue(str);
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public void d(String str) {
        C8632dsu.c((Object) str, "");
        e eVar = this.e;
        StringField b2 = eVar != null ? eVar.b() : null;
        if (b2 == null) {
            return;
        }
        b2.setValue(str);
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public Single<dpR> i() {
        StringField b2;
        ActionField c2;
        e eVar = this.e;
        if (eVar == null || (b2 = eVar.b()) == null) {
            Single<dpR> error = Single.error(new Throwable("No parsed data"));
            C8632dsu.a(error, "");
            return error;
        } else if (!b2.isValid()) {
            Single<dpR> error2 = Single.error(new Throwable("Invalid phone number"));
            C8632dsu.a(error2, "");
            return error2;
        } else {
            e eVar2 = this.e;
            if (eVar2 == null || (c2 = eVar2.c()) == null) {
                Single<dpR> error3 = Single.error(new Throwable("No parsed data"));
                C8632dsu.a(error3, "");
                return error3;
            }
            e eVar3 = this.e;
            Field a2 = eVar3 != null ? eVar3.a() : null;
            if (a2 != null) {
                a2.setValue(SMSRetriever.Companion.getAPP_HASH());
            }
            final MoneyballCallData moneyballCallData = new MoneyballCallData(c2.getFlowMode(), (String) null, c2);
            Single e2 = cQL.e(this.b, false, new drX<aMU, aMX, dpR>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.CollectPhoneAgentImpl$submitPhoneNumber$1
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(aMU amu, aMX amx) {
                    e(amu, amx);
                    return dpR.c;
                }

                public final void e(aMU amu, aMX amx) {
                    C8632dsu.c((Object) amu, "");
                    C8632dsu.c((Object) amx, "");
                    amu.c(MoneyballCallData.this, amx);
                }
            }, 1, null);
            final drM<MoneyballData, dpR> drm = new drM<MoneyballData, dpR>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.CollectPhoneAgentImpl$submitPhoneNumber$2
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(MoneyballData moneyballData) {
                    e(moneyballData);
                    return dpR.c;
                }

                public final void e(MoneyballData moneyballData) {
                    C5463bzI.b b3;
                    C8632dsu.c((Object) moneyballData, "");
                    C5463bzI.this.d = moneyballData;
                    C5463bzI c5463bzI = C5463bzI.this;
                    b3 = c5463bzI.b(moneyballData.getFlowMode());
                    c5463bzI.h = b3;
                }
            };
            Single<dpR> map = e2.map(new Function() { // from class: o.bzO
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    dpR i;
                    i = C5463bzI.i(drM.this, obj);
                    return i;
                }
            });
            C8632dsu.a(map, "");
            return map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dpR i(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (dpR) drm.invoke(obj);
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public Single<dpR> f() {
        ActionField c2;
        b bVar = this.h;
        if (bVar == null || (c2 = bVar.c()) == null) {
            Single<dpR> just = Single.just(dpR.c);
            C8632dsu.a(just, "");
            return just;
        }
        final MoneyballCallData moneyballCallData = new MoneyballCallData(c2.getFlowMode(), (String) null, c2);
        Single e2 = cQL.e(this.b, false, new drX<aMU, aMX, dpR>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.CollectPhoneAgentImpl$revertSubmitPhoneNumber$1
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(aMU amu, aMX amx) {
                d(amu, amx);
                return dpR.c;
            }

            public final void d(aMU amu, aMX amx) {
                C8632dsu.c((Object) amu, "");
                C8632dsu.c((Object) amx, "");
                amu.c(MoneyballCallData.this, amx);
            }
        }, 1, null);
        final drM<MoneyballData, dpR> drm = new drM<MoneyballData, dpR>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.CollectPhoneAgentImpl$revertSubmitPhoneNumber$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(MoneyballData moneyballData) {
                e(moneyballData);
                return dpR.c;
            }

            public final void e(MoneyballData moneyballData) {
                C5463bzI.e a2;
                C8632dsu.c((Object) moneyballData, "");
                C5463bzI.this.d = moneyballData;
                C5463bzI c5463bzI = C5463bzI.this;
                a2 = c5463bzI.a(moneyballData.getFlowMode());
                c5463bzI.e = a2;
            }
        };
        Single<dpR> map = e2.map(new Function() { // from class: o.bzM
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                dpR h;
                h = C5463bzI.h(drM.this, obj);
                return h;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dpR h(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (dpR) drm.invoke(obj);
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public void a(String str) {
        C8632dsu.c((Object) str, "");
        b bVar = this.h;
        StringField j = bVar != null ? bVar.j() : null;
        if (j == null) {
            return;
        }
        j.setValue(str);
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public Single<dpR> g() {
        ActionField h;
        b bVar = this.h;
        if (bVar == null || (h = bVar.h()) == null) {
            Single<dpR> just = Single.just(dpR.c);
            C8632dsu.a(just, "");
            return just;
        }
        final MoneyballCallData moneyballCallData = new MoneyballCallData(h.getFlowMode(), (String) null, h);
        Single e2 = cQL.e(this.b, false, new drX<aMU, aMX, dpR>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.CollectPhoneAgentImpl$resendCode$1
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(aMU amu, aMX amx) {
                c(amu, amx);
                return dpR.c;
            }

            public final void c(aMU amu, aMX amx) {
                C8632dsu.c((Object) amu, "");
                C8632dsu.c((Object) amx, "");
                amu.c(MoneyballCallData.this, amx);
            }
        }, 1, null);
        final CollectPhoneAgentImpl$resendCode$2 collectPhoneAgentImpl$resendCode$2 = new drM<MoneyballData, dpR>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.CollectPhoneAgentImpl$resendCode$2
            public final void c(MoneyballData moneyballData) {
                C8632dsu.c((Object) moneyballData, "");
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(MoneyballData moneyballData) {
                c(moneyballData);
                return dpR.c;
            }
        };
        Single<dpR> map = e2.map(new Function() { // from class: o.bzK
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                dpR f;
                f = C5463bzI.f(drM.this, obj);
                return f;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dpR f(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (dpR) drm.invoke(obj);
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public Single<String> h() {
        SMSRetrieverManager sMSRetrieverManager = this.a;
        b bVar = this.h;
        if (!sMSRetrieverManager.isEnabled(bVar != null ? bVar.b() : null)) {
            Single<String> never = Single.never();
            C8632dsu.a(never, "");
            return never;
        }
        Single<String> create = Single.create(new SingleOnSubscribe() { // from class: o.bzR
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                C5463bzI.a(C5463bzI.this, singleEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final C5463bzI c5463bzI, final SingleEmitter singleEmitter) {
        C8632dsu.c((Object) c5463bzI, "");
        C8632dsu.c((Object) singleEmitter, "");
        c5463bzI.a.listenForSMS(new drM<String, dpR>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.CollectPhoneAgentImpl$listenForSms$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(String str) {
                b(str);
                return dpR.c;
            }

            public final void b(String str) {
                SMSRetrieverManager sMSRetrieverManager;
                if (singleEmitter.isDisposed()) {
                    return;
                }
                SingleEmitter<String> singleEmitter2 = singleEmitter;
                sMSRetrieverManager = c5463bzI.a;
                if (str == null) {
                    str = "";
                }
                String extractOTPFromSMS = sMSRetrieverManager.extractOTPFromSMS(str);
                singleEmitter2.onSuccess(extractOTPFromSMS != null ? extractOTPFromSMS : "");
            }
        }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.CollectPhoneAgentImpl$listenForSms$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                d();
                return dpR.c;
            }

            public final void d() {
                if (singleEmitter.isDisposed()) {
                    return;
                }
                singleEmitter.onError(new Throwable());
            }
        }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.CollectPhoneAgentImpl$listenForSms$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                e();
                return dpR.c;
            }

            public final void e() {
                if (singleEmitter.isDisposed()) {
                    return;
                }
                singleEmitter.onError(new Throwable());
            }
        });
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public Single<dpR> j() {
        ActionField d;
        b bVar = this.h;
        if (bVar == null || (d = bVar.d()) == null) {
            Single<dpR> error = Single.error(new Throwable("No parsed data"));
            C8632dsu.a(error, "");
            return error;
        }
        b bVar2 = this.h;
        Field b2 = bVar2 != null ? bVar2.b() : null;
        if (b2 != null) {
            b2.setValue(SMSRetriever.Companion.getAPP_HASH());
        }
        final MoneyballCallData moneyballCallData = new MoneyballCallData(d.getFlowMode(), (String) null, d);
        Single e2 = cQL.e(this.b, false, new drX<aMU, aMX, dpR>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.CollectPhoneAgentImpl$submitSmsCode$1
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(aMU amu, aMX amx) {
                d(amu, amx);
                return dpR.c;
            }

            public final void d(aMU amu, aMX amx) {
                C8632dsu.c((Object) amu, "");
                C8632dsu.c((Object) amx, "");
                amu.c(MoneyballCallData.this, amx);
            }
        }, 1, null);
        final drM<MoneyballData, dpR> drm = new drM<MoneyballData, dpR>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.CollectPhoneAgentImpl$submitSmsCode$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(MoneyballData moneyballData) {
                b(moneyballData);
                return dpR.c;
            }

            public final void b(MoneyballData moneyballData) {
                C8632dsu.c((Object) moneyballData, "");
                C5463bzI.this.d = moneyballData;
                C5463bzI.this.c(moneyballData.getFlowMode());
            }
        };
        Single<dpR> map = e2.map(new Function() { // from class: o.bzQ
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                dpR g;
                g = C5463bzI.g(drM.this, obj);
                return g;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dpR g(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (dpR) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bzI$e */
    /* loaded from: classes4.dex */
    public static final class e {
        private final ActionField a;
        private final StringField b;
        private final Field c;
        private final StringField d;
        private final List<CollectPhone.d> e;

        public final Field a() {
            return this.c;
        }

        public final StringField b() {
            return this.d;
        }

        public final ActionField c() {
            return this.a;
        }

        public final List<CollectPhone.d> d() {
            return this.e;
        }

        public final StringField e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c(this.d, eVar.d) && C8632dsu.c(this.b, eVar.b) && C8632dsu.c(this.c, eVar.c) && C8632dsu.c(this.e, eVar.e) && C8632dsu.c(this.a, eVar.a);
            }
            return false;
        }

        public int hashCode() {
            StringField stringField = this.d;
            int hashCode = stringField == null ? 0 : stringField.hashCode();
            StringField stringField2 = this.b;
            int hashCode2 = stringField2 == null ? 0 : stringField2.hashCode();
            Field field = this.c;
            int hashCode3 = field == null ? 0 : field.hashCode();
            int hashCode4 = this.e.hashCode();
            ActionField actionField = this.a;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (actionField != null ? actionField.hashCode() : 0);
        }

        public String toString() {
            StringField stringField = this.d;
            StringField stringField2 = this.b;
            Field field = this.c;
            List<CollectPhone.d> list = this.e;
            ActionField actionField = this.a;
            return "CollectPhoneParsedData(phoneNumber=" + stringField + ", countryCode=" + stringField2 + ", androidAppHash=" + field + ", countries=" + list + ", nextAction=" + actionField + ")";
        }

        public e(StringField stringField, StringField stringField2, Field field, List<CollectPhone.d> list, ActionField actionField) {
            C8632dsu.c((Object) list, "");
            this.d = stringField;
            this.b = stringField2;
            this.c = field;
            this.e = list;
            this.a = actionField;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bzI$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private final StringField a;
        private final Field b;
        private final StringField c;
        private final ActionField d;
        private final ActionField e;
        private final ActionField f;
        private final StringField j;

        public final StringField a() {
            return this.a;
        }

        public final Field b() {
            return this.b;
        }

        public final ActionField c() {
            return this.d;
        }

        public final ActionField d() {
            return this.e;
        }

        public final StringField e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c(this.c, bVar.c) && C8632dsu.c(this.a, bVar.a) && C8632dsu.c(this.j, bVar.j) && C8632dsu.c(this.b, bVar.b) && C8632dsu.c(this.f, bVar.f) && C8632dsu.c(this.e, bVar.e) && C8632dsu.c(this.d, bVar.d);
            }
            return false;
        }

        public final ActionField h() {
            return this.f;
        }

        public int hashCode() {
            StringField stringField = this.c;
            int hashCode = stringField == null ? 0 : stringField.hashCode();
            StringField stringField2 = this.a;
            int hashCode2 = stringField2 == null ? 0 : stringField2.hashCode();
            StringField stringField3 = this.j;
            int hashCode3 = stringField3 == null ? 0 : stringField3.hashCode();
            Field field = this.b;
            int hashCode4 = field == null ? 0 : field.hashCode();
            ActionField actionField = this.f;
            int hashCode5 = actionField == null ? 0 : actionField.hashCode();
            ActionField actionField2 = this.e;
            int hashCode6 = actionField2 == null ? 0 : actionField2.hashCode();
            ActionField actionField3 = this.d;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (actionField3 != null ? actionField3.hashCode() : 0);
        }

        public final StringField j() {
            return this.j;
        }

        public String toString() {
            StringField stringField = this.c;
            StringField stringField2 = this.a;
            StringField stringField3 = this.j;
            Field field = this.b;
            ActionField actionField = this.f;
            ActionField actionField2 = this.e;
            ActionField actionField3 = this.d;
            return "VerifyPhoneParsedData(phoneNumber=" + stringField + ", countryCode=" + stringField2 + ", smsCode=" + stringField3 + ", androidAppHash=" + field + ", resendCodeAction=" + actionField + ", nextAction=" + actionField2 + ", backAction=" + actionField3 + ")";
        }

        public b(StringField stringField, StringField stringField2, StringField stringField3, Field field, ActionField actionField, ActionField actionField2, ActionField actionField3) {
            this.c = stringField;
            this.a = stringField2;
            this.j = stringField3;
            this.b = field;
            this.f = actionField;
            this.e = actionField2;
            this.d = actionField3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(FlowMode flowMode) {
        Object value;
        if (flowMode != null) {
            Field field = flowMode.getField("errorCode");
            StringField stringField = (StringField) ((field == null || !(field instanceof StringField)) ? null : null);
            if (stringField == null || (value = stringField.getValue()) == null) {
                return;
            }
            if (C8632dsu.c(value, (Object) "invalid_phone")) {
                throw CollectPhone.Error.InvalidPhoneNumber.b;
            }
            if (C8632dsu.c(value, (Object) "sms_code_expired")) {
                throw CollectPhone.Error.ExpiredSmsCode.c;
            }
            if (C8632dsu.c(value, (Object) "sms_code_invalid")) {
                throw CollectPhone.Error.InvalidSmsCode.c;
            }
            if (C8632dsu.c(value, (Object) "throttling_failure")) {
                throw CollectPhone.Error.ThrottlingFailure.b;
            }
            if (!C8632dsu.c(value, (Object) "generic_failure")) {
                throw CollectPhone.Error.GenericFailure.c;
            }
            throw CollectPhone.Error.GenericFailure.c;
        }
    }
}
