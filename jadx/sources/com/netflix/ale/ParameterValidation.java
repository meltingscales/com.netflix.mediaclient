package com.netflix.ale;

import java.util.List;
import o.C8632dsu;
import o.InterfaceC8660dtv;

/* loaded from: classes5.dex */
public interface ParameterValidation {
    String checkParameter(String str, Object obj, InterfaceC8660dtv<?> interfaceC8660dtv);

    List<String> enumerateProblems();

    boolean isValid();

    /* loaded from: classes5.dex */
    public static final class DefaultImpls {
        public static String checkParameter(ParameterValidation parameterValidation, String str, Object obj, InterfaceC8660dtv<?> interfaceC8660dtv) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) interfaceC8660dtv, "");
            if (obj == null) {
                return '`' + str + "' parameter is null or missing";
            } else if (interfaceC8660dtv.d(obj)) {
                return null;
            } else {
                return '`' + str + "' is not of type `" + interfaceC8660dtv.b() + '\'';
            }
        }
    }
}
