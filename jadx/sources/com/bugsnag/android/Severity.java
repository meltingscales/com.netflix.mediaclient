package com.bugsnag.android;

import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import java.util.Arrays;
import o.C8627dsp;
import o.C8632dsu;
import o.C9246lv;

/* loaded from: classes2.dex */
public enum Severity implements C9246lv.a {
    ERROR(UmaAlert.ICON_ERROR),
    WARNING("warning"),
    INFO(UmaAlert.ICON_INFO);
    
    public static final a Companion = new a(null);
    private final String str;

    Severity(String str) {
        this.str = str;
    }

    @Override // o.C9246lv.a
    public void toStream(C9246lv c9246lv) {
        c9246lv.e(this.str);
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final Severity d(String str) {
            Severity[] valuesCustom;
            for (Severity severity : Severity.valuesCustom()) {
                if (C8632dsu.c((Object) severity.str, (Object) str)) {
                    return severity;
                }
            }
            return null;
        }
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static Severity[] valuesCustom() {
        Severity[] valuesCustom = values();
        return (Severity[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
