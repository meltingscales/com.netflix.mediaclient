package com.netflix.android.moneyball;

import com.netflix.android.moneyball.fields.ChoiceField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.android.moneyball.fields.FieldFactory;
import com.netflix.android.moneyball.fields.OptionField;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import o.C8572dqo;
import o.C8632dsu;
import o.C8657dts;
import o.dpD;
import o.dqD;
import o.dqK;
import o.dsH;

/* loaded from: classes2.dex */
public interface GetField {
    OptionField findOptionField(String str, ChoiceField choiceField);

    Field getField(String str);

    Field getFieldNonResursive(String str);

    Map<String, Field> getFields();

    void initFields(Map<String, ? extends Object> map, FlowMode flowMode);

    void setFields(Map<String, ? extends Field> map);

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static OptionField findOptionField(GetField getField, String str, ChoiceField choiceField) {
            Object obj;
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) choiceField, "");
            Iterator<T> it = choiceField.getOptions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((OptionField) obj).getField(str) != null) {
                    break;
                }
            }
            return (OptionField) obj;
        }

        public static Field getField(GetField getField, String str) {
            List n;
            Object obj;
            C8632dsu.c((Object) str, "");
            if (getField.getFields().isEmpty()) {
                return null;
            }
            Field field = getField.getFields().get(str);
            if (field == null) {
                Map<String, Field> fields = getField.getFields();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Field> entry : fields.entrySet()) {
                    if (entry.getValue() instanceof ChoiceField) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                n = dqK.n(linkedHashMap);
                Iterator it = n.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    Field field2 = (Field) ((Pair) obj).c();
                    C8632dsu.d(field2);
                    if (getField.findOptionField(str, (ChoiceField) field2) != null) {
                        break;
                    }
                }
                Pair pair = (Pair) obj;
                if (pair != null) {
                    Object a = pair.a();
                    C8632dsu.d(a);
                    OptionField findOptionField = getField.findOptionField(str, (ChoiceField) a);
                    return findOptionField != null ? findOptionField.getField(str) : null;
                }
                return field;
            }
            return field;
        }

        public static Field getFieldNonResursive(GetField getField, String str) {
            C8632dsu.c((Object) str, "");
            if (getField.getFields().isEmpty()) {
                return null;
            }
            return getField.getFields().get(str);
        }

        public static void initFields(GetField getField, Map<String, ? extends Object> map, FlowMode flowMode) {
            int d;
            int e;
            int b;
            C8632dsu.c((Object) map, "");
            C8632dsu.c((Object) flowMode, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                if (entry.getValue() instanceof Map) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Set<Map.Entry> entrySet = linkedHashMap.entrySet();
            d = C8572dqo.d(entrySet, 10);
            e = dqD.e(d);
            b = C8657dts.b(e, 16);
            Map<String, ? extends Field> linkedHashMap2 = new LinkedHashMap<>(b);
            for (Map.Entry entry2 : entrySet) {
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                C8632dsu.d(value);
                Pair a = dpD.a(key, FieldFactory.INSTANCE.createField((String) entry2.getKey(), dsH.d(value), flowMode, null));
                linkedHashMap2.put(a.d(), a.a());
            }
            getField.setFields(linkedHashMap2);
        }
    }
}
