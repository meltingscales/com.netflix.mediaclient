package com.netflix.mediaclient.acquisition.lib.services.networking;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.GetField;
import com.netflix.android.moneyball.fields.ChoiceField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.android.moneyball.fields.OptionField;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.util.kotlinx.KeyPathEvaluationKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import o.C8569dql;
import o.C8576dqs;
import o.C8632dsu;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class BaseViewModelInitializer {
    private final SignupErrorReporter signupErrorReporter;

    public final SignupErrorReporter getSignupErrorReporter() {
        return this.signupErrorReporter;
    }

    public BaseViewModelInitializer(SignupErrorReporter signupErrorReporter) {
        C8632dsu.c((Object) signupErrorReporter, "");
        this.signupErrorReporter = signupErrorReporter;
    }

    public static final /* synthetic */ SignupErrorReporter access$getSignupErrorReporter(BaseViewModelInitializer baseViewModelInitializer) {
        return baseViewModelInitializer.signupErrorReporter;
    }

    public static /* synthetic */ Object getTypedPathValue$default(BaseViewModelInitializer baseViewModelInitializer, Map map, List list, boolean z, int i, Object obj) {
        String d;
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            C8632dsu.c((Object) map, "");
            C8632dsu.c((Object) list, "");
            SignupErrorReporter signupErrorReporter = baseViewModelInitializer.signupErrorReporter;
            Object pathValue = KeyPathEvaluationKt.getPathValue((Object) map, (List<String>) list);
            d = C8576dqs.d(list, ",", null, null, 0, null, null, 62, null);
            if (pathValue == null) {
                pathValue = null;
                if (z) {
                    signupErrorReporter.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, d, null);
                }
            } else {
                C8632dsu.a(3, "T?");
            }
            return pathValue;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTypedPathValue");
    }

    protected final /* synthetic */ <T> T getTypedPathValue(Map<String, ? extends Object> map, List<String> list, boolean z) {
        String d;
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) list, "");
        SignupErrorReporter signupErrorReporter = this.signupErrorReporter;
        T t = (T) KeyPathEvaluationKt.getPathValue((Object) map, list);
        d = C8576dqs.d(list, ",", null, null, 0, null, null, 62, null);
        if (t == null) {
            t = null;
            if (z) {
                signupErrorReporter.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, d, null);
            }
        } else {
            C8632dsu.a(3, "T?");
        }
        return t;
    }

    public static /* synthetic */ Object getTypedFieldValue$default(BaseViewModelInitializer baseViewModelInitializer, GetField getField, String str, boolean z, JSONObject jSONObject, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                jSONObject = null;
            }
            C8632dsu.c((Object) getField, "");
            C8632dsu.c((Object) str, "");
            SignupErrorReporter signupErrorReporter = baseViewModelInitializer.signupErrorReporter;
            Field field = getField.getField(str);
            Object value = field != null ? field.getValue() : null;
            if (value != null) {
                C8632dsu.a(3, "T?");
                return value;
            } else if (z) {
                signupErrorReporter.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, str, jSONObject);
                return null;
            } else {
                return null;
            }
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTypedFieldValue");
    }

    protected final /* synthetic */ <T> T getTypedFieldValue(GetField getField, String str, boolean z, JSONObject jSONObject) {
        C8632dsu.c((Object) getField, "");
        C8632dsu.c((Object) str, "");
        SignupErrorReporter signupErrorReporter = this.signupErrorReporter;
        Field field = getField.getField(str);
        Object value = field != null ? field.getValue() : null;
        if (value != null) {
            C8632dsu.a(3, "T?");
            return (T) value;
        } else if (z) {
            signupErrorReporter.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, str, jSONObject);
            return null;
        } else {
            return null;
        }
    }

    public static /* synthetic */ Field getTypedField$default(BaseViewModelInitializer baseViewModelInitializer, GetField getField, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            C8632dsu.c((Object) getField, "");
            C8632dsu.c((Object) str, "");
            SignupErrorReporter signupErrorReporter = baseViewModelInitializer.signupErrorReporter;
            Field field = getField.getField(str);
            if (field == null) {
                field = null;
                if (z) {
                    signupErrorReporter.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, str, null);
                }
            } else {
                C8632dsu.a(3, "T?");
            }
            return field;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTypedField");
    }

    protected final /* synthetic */ <T extends Field> T getTypedField(GetField getField, String str, boolean z) {
        C8632dsu.c((Object) getField, "");
        C8632dsu.c((Object) str, "");
        SignupErrorReporter signupErrorReporter = this.signupErrorReporter;
        T t = (T) getField.getField(str);
        if (t == null) {
            t = null;
            if (z) {
                signupErrorReporter.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, str, null);
            }
        } else {
            C8632dsu.a(3, "T?");
        }
        return t;
    }

    public static /* synthetic */ String getMessagesField$default(BaseViewModelInitializer baseViewModelInitializer, FlowMode flowMode, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return baseViewModelInitializer.getMessagesField(flowMode, str, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMessagesField");
    }

    public final String getMessagesField(FlowMode flowMode, String str, boolean z) {
        List j;
        List j2;
        String d;
        String str2;
        C8632dsu.c((Object) flowMode, "");
        C8632dsu.c((Object) str, "");
        j = C8569dql.j("fields", SignupConstants.Field.MESSAGES, str, "string");
        Map<String, Object> data = flowMode.getData();
        SignupErrorReporter unused = this.signupErrorReporter;
        Object pathValue = KeyPathEvaluationKt.getPathValue((Object) data, (List<String>) j);
        C8576dqs.d(j, ",", null, null, 0, null, null, 62, null);
        Object obj = null;
        if (pathValue == null || !(pathValue instanceof String)) {
            pathValue = null;
        }
        String str3 = (String) pathValue;
        if (str3 == null) {
            Map<String, Object> data2 = flowMode.getData();
            j2 = C8569dql.j("fields", SignupConstants.Field.MESSAGES_FROM_DYNECOM, str, "string");
            SignupErrorReporter signupErrorReporter = this.signupErrorReporter;
            Object pathValue2 = KeyPathEvaluationKt.getPathValue((Object) data2, (List<String>) j2);
            d = C8576dqs.d(j2, ",", null, null, 0, null, null, 62, null);
            if (pathValue2 == null) {
                if (z) {
                    str2 = SignupConstants.Error.MISSING_FIELD_ERROR;
                    signupErrorReporter.onDataError(str2, d, null);
                }
                return (String) obj;
            }
            if (pathValue2 instanceof String) {
                obj = pathValue2;
            } else if (z) {
                str2 = SignupConstants.Error.DATA_MANIPULATION_ERROR;
                signupErrorReporter.onDataError(str2, d, null);
            }
            return (String) obj;
        }
        return str3;
    }

    public static /* synthetic */ OptionField getPaymentChoice$default(BaseViewModelInitializer baseViewModelInitializer, GetField getField, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return baseViewModelInitializer.getPaymentChoice(getField, str, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPaymentChoice");
    }

    public final OptionField getPaymentChoice(GetField getField, String str, boolean z) {
        C8632dsu.c((Object) getField, "");
        C8632dsu.c((Object) str, "");
        Field field = getField.getField(SignupConstants.Field.PAYMENT_CHOICE);
        ChoiceField choiceField = field instanceof ChoiceField ? (ChoiceField) field : null;
        OptionField option = choiceField != null ? choiceField.getOption(str) : null;
        if (option == null && z) {
            SignupErrorReporter.onDataError$default(this.signupErrorReporter, SignupConstants.Error.MISSING_FIELD_ERROR, str, null, 4, null);
        }
        return option;
    }

    public static /* synthetic */ OptionField getSelectedPlan$default(BaseViewModelInitializer baseViewModelInitializer, FlowMode flowMode, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            return baseViewModelInitializer.getSelectedPlan(flowMode, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSelectedPlan");
    }

    public final String getPlanPriceString(FlowMode flowMode) {
        String str;
        C8632dsu.c((Object) flowMode, "");
        Object obj = null;
        OptionField selectedPlan$default = getSelectedPlan$default(this, flowMode, false, 1, null);
        if (selectedPlan$default != null) {
            SignupErrorReporter signupErrorReporter = this.signupErrorReporter;
            Field field = selectedPlan$default.getField(SignupConstants.Field.PLAN_PRICE);
            Object value = field != null ? field.getValue() : null;
            if (value == null) {
                str = SignupConstants.Error.MISSING_FIELD_ERROR;
            } else if (value instanceof String) {
                obj = value;
                return (String) obj;
            } else {
                str = SignupConstants.Error.DATA_MANIPULATION_ERROR;
            }
            signupErrorReporter.onDataError(str, SignupConstants.Field.PLAN_PRICE, null);
            return (String) obj;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0037 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getAllPlanAmountsAndStrings(com.netflix.android.moneyball.FlowMode r10) {
        /*
            r9 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r10, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r1 = access$getSignupErrorReporter(r9)
            java.lang.String r2 = "planChoice"
            com.netflix.android.moneyball.fields.Field r10 = r10.getField(r2)
            java.lang.String r3 = "SignupNativeDataManipulationError"
            java.lang.String r4 = "SignupNativeFieldError"
            r5 = 0
            if (r10 != 0) goto L1f
            r1.onDataError(r4, r2, r5)
            goto L26
        L1f:
            boolean r6 = r10 instanceof com.netflix.android.moneyball.fields.ChoiceField
            if (r6 != 0) goto L27
            r1.onDataError(r3, r2, r5)
        L26:
            r10 = r5
        L27:
            com.netflix.android.moneyball.fields.ChoiceField r10 = (com.netflix.android.moneyball.fields.ChoiceField) r10
            if (r10 == 0) goto L30
            java.util.List r10 = r10.getOptions()
            goto L31
        L30:
            r10 = r5
        L31:
            if (r10 == 0) goto L94
            java.util.Iterator r10 = r10.iterator()
        L37:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L94
            java.lang.Object r1 = r10.next()
            com.netflix.android.moneyball.fields.OptionField r1 = (com.netflix.android.moneyball.fields.OptionField) r1
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r2 = access$getSignupErrorReporter(r9)
            java.lang.String r6 = "planPrice"
            com.netflix.android.moneyball.fields.Field r7 = r1.getField(r6)
            if (r7 == 0) goto L54
            java.lang.Object r7 = r7.getValue()
            goto L55
        L54:
            r7 = r5
        L55:
            if (r7 != 0) goto L5b
            r2.onDataError(r4, r6, r5)
            goto L62
        L5b:
            boolean r8 = r7 instanceof java.lang.String
            if (r8 != 0) goto L63
            r2.onDataError(r3, r6, r5)
        L62:
            r7 = r5
        L63:
            java.lang.String r7 = (java.lang.String) r7
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r2 = access$getSignupErrorReporter(r9)
            java.lang.String r6 = "planPriceAmount"
            com.netflix.android.moneyball.fields.Field r1 = r1.getField(r6)
            if (r1 == 0) goto L76
            java.lang.Object r1 = r1.getValue()
            goto L77
        L76:
            r1 = r5
        L77:
            if (r1 != 0) goto L7d
            r2.onDataError(r4, r6, r5)
            goto L84
        L7d:
            boolean r8 = r1 instanceof java.lang.String
            if (r8 != 0) goto L85
            r2.onDataError(r3, r6, r5)
        L84:
            r1 = r5
        L85:
            java.lang.String r1 = (java.lang.String) r1
            if (r7 == 0) goto L37
            if (r1 == 0) goto L37
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r1, r7)
            r0.add(r2)
            goto L37
        L94:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.getAllPlanAmountsAndStrings(com.netflix.android.moneyball.FlowMode):java.util.List");
    }

    public final String getLowestCostPlanPriceString(FlowMode flowMode) {
        List c;
        Object x;
        C8632dsu.c((Object) flowMode, "");
        c = C8576dqs.c((Iterable) getAllPlanAmountsAndStrings(flowMode), new Comparator() { // from class: com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer$getLowestCostPlanPriceString$$inlined$compareBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compareValues;
                compareValues = ComparisonsKt__ComparisonsKt.compareValues(Double.valueOf(Double.parseDouble((String) ((Pair) t).d())), Double.valueOf(Double.parseDouble((String) ((Pair) t2).d())));
                return compareValues;
            }
        });
        x = C8576dqs.x(c);
        Pair pair = (Pair) x;
        if (pair != null) {
            return (String) pair.a();
        }
        return null;
    }

    public final String getHighestCostPlanPriceString(FlowMode flowMode) {
        List c;
        Object D;
        C8632dsu.c((Object) flowMode, "");
        c = C8576dqs.c((Iterable) getAllPlanAmountsAndStrings(flowMode), new Comparator() { // from class: com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer$getHighestCostPlanPriceString$$inlined$compareBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compareValues;
                compareValues = ComparisonsKt__ComparisonsKt.compareValues(Double.valueOf(Double.parseDouble((String) ((Pair) t).d())), Double.valueOf(Double.parseDouble((String) ((Pair) t2).d())));
                return compareValues;
            }
        });
        if (c.isEmpty()) {
            return null;
        }
        D = C8576dqs.D((List<? extends Object>) c);
        Pair pair = (Pair) D;
        if (pair != null) {
            return (String) pair.a();
        }
        return null;
    }

    public final List<List<Field>> extractGroupedFields(GetField getField, List<? extends List<String>> list) {
        C8632dsu.c((Object) list, "");
        ArrayList arrayList = new ArrayList();
        for (List<String> list2 : list) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Field field = getField != null ? getField.getField((String) it.next()) : null;
                if (field != null) {
                    arrayList2.add(field);
                }
            }
            if (arrayList2.size() != list2.size()) {
                if (!arrayList2.isEmpty()) {
                    this.signupErrorReporter.onDataError(SignupConstants.Error.MULTI_FIELD_MERGE_ERROR, list2);
                }
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                arrayList.add(arrayList2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x001c, code lost:
        if (r3 == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.netflix.android.moneyball.fields.OptionField getSelectedPlan(com.netflix.android.moneyball.FlowMode r11, boolean r12) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r11, r0)
            access$getSignupErrorReporter(r10)
            java.lang.String r0 = "planChoice"
            com.netflix.android.moneyball.fields.Field r1 = r11.getField(r0)
            r2 = 0
            if (r1 == 0) goto L16
            java.lang.Object r1 = r1.getValue()
            goto L17
        L16:
            r1 = r2
        L17:
            if (r1 != 0) goto L1a
            goto L1e
        L1a:
            boolean r3 = r1 instanceof java.lang.String
            if (r3 != 0) goto L1f
        L1e:
            r1 = r2
        L1f:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L24
            return r2
        L24:
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r3 = access$getSignupErrorReporter(r10)
            com.netflix.android.moneyball.fields.Field r11 = r11.getField(r0)
            java.lang.String r4 = "SignupNativeDataManipulationError"
            java.lang.String r5 = "SignupNativeFieldError"
            if (r11 != 0) goto L38
            if (r12 == 0) goto L41
            r3.onDataError(r5, r0, r2)
            goto L41
        L38:
            boolean r6 = r11 instanceof com.netflix.android.moneyball.fields.ChoiceField
            if (r6 != 0) goto L42
            if (r12 == 0) goto L41
            r3.onDataError(r4, r0, r2)
        L41:
            r11 = r2
        L42:
            com.netflix.android.moneyball.fields.ChoiceField r11 = (com.netflix.android.moneyball.fields.ChoiceField) r11
            if (r11 == 0) goto L4b
            java.util.List r11 = r11.getOptions()
            goto L4c
        L4b:
            r11 = r2
        L4c:
            if (r11 == 0) goto L8b
            java.util.Iterator r11 = r11.iterator()
        L52:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L8b
            java.lang.Object r3 = r11.next()
            com.netflix.android.moneyball.fields.OptionField r3 = (com.netflix.android.moneyball.fields.OptionField) r3
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r6 = access$getSignupErrorReporter(r10)
            java.lang.String r7 = "offerId"
            com.netflix.android.moneyball.fields.Field r8 = r3.getField(r7)
            if (r8 == 0) goto L6f
            java.lang.Object r8 = r8.getValue()
            goto L70
        L6f:
            r8 = r2
        L70:
            if (r8 != 0) goto L78
            if (r12 == 0) goto L81
            r6.onDataError(r5, r7, r2)
            goto L81
        L78:
            boolean r9 = r8 instanceof java.lang.String
            if (r9 != 0) goto L82
            if (r12 == 0) goto L81
            r6.onDataError(r4, r7, r2)
        L81:
            r8 = r2
        L82:
            java.lang.String r8 = (java.lang.String) r8
            boolean r6 = o.C8632dsu.c(r1, r8)
            if (r6 == 0) goto L52
            return r3
        L8b:
            if (r12 == 0) goto L9a
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r11 = r10.signupErrorReporter
            java.lang.String[] r12 = new java.lang.String[]{r0, r1}
            java.util.List r12 = o.C8570dqm.b(r12)
            r11.onDataError(r5, r12)
        L9a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.getSelectedPlan(com.netflix.android.moneyball.FlowMode, boolean):com.netflix.android.moneyball.fields.OptionField");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0069 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.netflix.android.moneyball.fields.OptionField getPlan(com.netflix.android.moneyball.FlowMode r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r10, r0)
            o.C8632dsu.c(r11, r0)
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r0 = access$getSignupErrorReporter(r9)
            java.lang.String r1 = "planChoice"
            com.netflix.android.moneyball.fields.Field r10 = r10.getField(r1)
            java.lang.String r2 = "SignupNativeDataManipulationError"
            java.lang.String r3 = "SignupNativeFieldError"
            r4 = 0
            if (r10 != 0) goto L1d
            r0.onDataError(r3, r1, r4)
            goto L24
        L1d:
            boolean r5 = r10 instanceof com.netflix.android.moneyball.fields.ChoiceField
            if (r5 != 0) goto L25
            r0.onDataError(r2, r1, r4)
        L24:
            r10 = r4
        L25:
            com.netflix.android.moneyball.fields.ChoiceField r10 = (com.netflix.android.moneyball.fields.ChoiceField) r10
            if (r10 == 0) goto L2e
            java.util.List r10 = r10.getOptions()
            goto L2f
        L2e:
            r10 = r4
        L2f:
            if (r10 == 0) goto L6a
            java.util.Iterator r10 = r10.iterator()
        L35:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r10.next()
            com.netflix.android.moneyball.fields.OptionField r0 = (com.netflix.android.moneyball.fields.OptionField) r0
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r5 = access$getSignupErrorReporter(r9)
            java.lang.String r6 = "offerId"
            com.netflix.android.moneyball.fields.Field r7 = r0.getField(r6)
            if (r7 == 0) goto L52
            java.lang.Object r7 = r7.getValue()
            goto L53
        L52:
            r7 = r4
        L53:
            if (r7 != 0) goto L59
            r5.onDataError(r3, r6, r4)
            goto L60
        L59:
            boolean r8 = r7 instanceof java.lang.String
            if (r8 != 0) goto L61
            r5.onDataError(r2, r6, r4)
        L60:
            r7 = r4
        L61:
            java.lang.String r7 = (java.lang.String) r7
            boolean r5 = o.C8632dsu.c(r11, r7)
            if (r5 == 0) goto L35
            return r0
        L6a:
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r10 = r9.signupErrorReporter
            java.lang.String[] r11 = new java.lang.String[]{r1, r11}
            java.util.List r11 = o.C8570dqm.b(r11)
            r10.onDataError(r3, r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.getPlan(com.netflix.android.moneyball.FlowMode, java.lang.String):com.netflix.android.moneyball.fields.OptionField");
    }
}
