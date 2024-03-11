package com.netflix.android.moneyball.fields;

import java.util.Map;
import o.C8632dsu;

/* loaded from: classes2.dex */
public interface DataBacked {
    Object getAttr(String str);

    Object getAttrWithDefault(String str, Object obj);

    Map<String, Object> getData();

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static Object getAttr(DataBacked dataBacked, String str) {
            C8632dsu.c((Object) str, "");
            if (dataBacked.getData().containsKey(str)) {
                return dataBacked.getData().get(str);
            }
            return null;
        }

        public static Object getAttrWithDefault(DataBacked dataBacked, String str, Object obj) {
            Object obj2;
            C8632dsu.c((Object) str, "");
            C8632dsu.c(obj, "");
            return (!dataBacked.getData().containsKey(str) || (obj2 = dataBacked.getData().get(str)) == null) ? obj : obj2;
        }
    }
}
