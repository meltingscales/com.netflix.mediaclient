package com.netflix.mediaclient.acquisition.screens.onRamp;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.mediaclient.acquisition.components.steps.StepsViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.acquisition.lib.util.kotlinx.KeyPathEvaluationKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import o.C8150deu;
import o.C8569dql;
import o.C8572dqo;
import o.C8576dqs;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class OnRampViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final ErrorMessageViewModelInitializer errorMessageViewModelInitializer;
    private final FlowMode flowMode;
    private final SignupNetworkManager signupNetworkManager;
    private final StepsViewModelInitializer stepsViewModelInitializer;
    private final StringProvider stringProvider;
    private final ViewModelProvider.Factory viewModelProviderFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public OnRampViewModelInitializer(FlowMode flowMode, SignupErrorReporter signupErrorReporter, StringProvider stringProvider, SignupNetworkManager signupNetworkManager, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, StepsViewModelInitializer stepsViewModelInitializer, ViewModelProvider.Factory factory) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModelInitializer, "");
        C8632dsu.c((Object) stepsViewModelInitializer, "");
        C8632dsu.c((Object) factory, "");
        this.flowMode = flowMode;
        this.stringProvider = stringProvider;
        this.signupNetworkManager = signupNetworkManager;
        this.errorMessageViewModelInitializer = errorMessageViewModelInitializer;
        this.stepsViewModelInitializer = stepsViewModelInitializer;
        this.viewModelProviderFactory = factory;
    }

    public final OnRampParsedData extractOnRampParsedData() {
        Object obj;
        Set entrySet;
        int d;
        List<Map> c;
        List list;
        String str;
        ActionField actionField;
        StringField stringField;
        String str2;
        int d2;
        Map<String, Object> data;
        List j;
        FlowMode flowMode = this.flowMode;
        if (flowMode == null || (data = flowMode.getData()) == null) {
            obj = null;
        } else {
            j = C8569dql.j("fields", SignupConstants.Field.VIDEOS);
            obj = KeyPathEvaluationKt.getPathValue((Object) data, (List<String>) j);
        }
        boolean z = obj instanceof List;
        if (z) {
            if (z) {
                c = (List) obj;
            }
            c = null;
        } else {
            boolean z2 = obj instanceof Map;
            if (z2) {
                Map map = z2 ? (Map) obj : null;
                if (map != null && (entrySet = map.entrySet()) != null) {
                    Set<Map.Entry> set = entrySet;
                    d = C8572dqo.d(set, 10);
                    ArrayList arrayList = new ArrayList(d);
                    for (Map.Entry entry : set) {
                        arrayList.add((Map) entry.getValue());
                    }
                    c = C8576dqs.c((Iterable) arrayList, new Comparator() { // from class: com.netflix.mediaclient.acquisition.screens.onRamp.OnRampViewModelInitializer$extractOnRampParsedData$$inlined$sortedBy$1
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            int compareValues;
                            compareValues = ComparisonsKt__ComparisonsKt.compareValues((Long) ((Map) t).get("displayIndex"), (Long) ((Map) t2).get("displayIndex"));
                            return compareValues;
                        }
                    });
                }
            }
            c = null;
        }
        if (c == null || c.isEmpty()) {
            SignupErrorReporter.onDataError$default(getSignupErrorReporter(), SignupConstants.Error.MISSING_FIELD_ERROR, SignupConstants.Field.VIDEOS, null, 4, null);
        }
        if (c != null) {
            d2 = C8572dqo.d(c, 10);
            list = new ArrayList(d2);
            for (Map map2 : c) {
                Object obj2 = map2.get(SignupConstants.Field.URL);
                C8632dsu.d(obj2);
                String str3 = (String) obj2;
                Object obj3 = map2.get(SignupConstants.Field.VIDEO_ID);
                C8632dsu.d(obj3);
                int intValue = ((Number) obj3).intValue();
                Object obj4 = map2.get(SignupConstants.Field.VIDEO_TITLE);
                String str4 = obj4 instanceof String ? (String) obj4 : null;
                if (str4 == null) {
                    str4 = "";
                }
                list.add(new VideoParsedData(str3, String.valueOf(intValue), str4));
            }
        } else {
            list = null;
        }
        FlowMode flowMode2 = this.flowMode;
        if (flowMode2 != null) {
            SignupErrorReporter unused = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field = flowMode2.getField(SignupConstants.Field.PROFILE_NAME);
            String value = field != null ? field.getValue() : null;
            str = (value == null || !(value instanceof String)) ? null : null;
        } else {
            str = null;
        }
        FlowMode flowMode3 = this.flowMode;
        if (flowMode3 != null) {
            SignupErrorReporter signupErrorReporter = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field2 = flowMode3.getField(SignupConstants.Action.NEXT_ACTION);
            if (field2 == null) {
                str2 = SignupConstants.Error.MISSING_FIELD_ERROR;
            } else {
                if (!(field2 instanceof ActionField)) {
                    str2 = SignupConstants.Error.DATA_MANIPULATION_ERROR;
                }
                actionField = (ActionField) field2;
            }
            signupErrorReporter.onDataError(str2, SignupConstants.Action.NEXT_ACTION, null);
            field2 = null;
            actionField = (ActionField) field2;
        } else {
            actionField = null;
        }
        FlowMode flowMode4 = this.flowMode;
        if (flowMode4 != null) {
            SignupErrorReporter unused2 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field3 = flowMode4.getField(SignupConstants.Field.SELECTIONS);
            stringField = (StringField) ((field3 == null || !(field3 instanceof StringField)) ? null : null);
        } else {
            stringField = null;
        }
        if (list == null) {
            list = C8569dql.i();
        }
        List list2 = list;
        FlowMode flowMode5 = this.flowMode;
        return new OnRampParsedData(str, actionField, stringField, list2, flowMode5 != null ? getMessagesField(flowMode5, SignupConstants.Key.HEADER_SUBTITLE_MESSAGE, false) : null, this.stepsViewModelInitializer.createStepsViewModelWithFallback(1, 2));
    }

    public final OnRampViewModel createOnRampViewModel(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        OnRampParsedData extractOnRampParsedData = extractOnRampParsedData();
        return new OnRampViewModel(this.stringProvider, (OnRampLifecycleData) new ViewModelProvider(fragment, this.viewModelProviderFactory).get(OnRampLifecycleData.class), extractOnRampParsedData, C8150deu.h(), this.signupNetworkManager, this.errorMessageViewModelInitializer.createErrorMessageViewModel());
    }
}
