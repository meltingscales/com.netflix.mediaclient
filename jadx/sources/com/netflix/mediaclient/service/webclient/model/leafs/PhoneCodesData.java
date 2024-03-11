package com.netflix.mediaclient.service.webclient.model.leafs;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C8572dqo;
import o.C8632dsu;

/* loaded from: classes4.dex */
public final class PhoneCodesData implements Serializable {
    private final List<PhoneCode> phoneCodes;

    public final List<PhoneCode> getPhoneCodes() {
        return this.phoneCodes;
    }

    public PhoneCodesData(List<? extends Map<String, String>> list) {
        int d;
        C8632dsu.c((Object) list, "");
        d = C8572dqo.d(list, 10);
        ArrayList arrayList = new ArrayList(d);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            String str = (String) map.get(SignupConstants.Field.LANG_ID);
            str = str == null ? "" : str;
            String str2 = (String) map.get("code");
            str2 = str2 == null ? "" : str2;
            String str3 = (String) map.get("name");
            if (str3 == null) {
                str3 = "";
            }
            arrayList.add(new PhoneCode(str, str2, str3));
        }
        this.phoneCodes = arrayList;
    }
}
