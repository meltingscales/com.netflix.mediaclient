package com.bugsnag.android;

import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import java.util.Arrays;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes2.dex */
public enum BreadcrumbType {
    ERROR(UmaAlert.ICON_ERROR),
    LOG("log"),
    MANUAL("manual"),
    NAVIGATION("navigation"),
    PROCESS("process"),
    REQUEST("request"),
    STATE("state"),
    USER("user");
    
    public static final c Companion = new c(null);
    private final String type;

    @Override // java.lang.Enum
    public String toString() {
        return this.type;
    }

    BreadcrumbType(String str) {
        this.type = str;
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final BreadcrumbType d(String str) {
            BreadcrumbType[] valuesCustom;
            BreadcrumbType breadcrumbType = null;
            boolean z = false;
            for (BreadcrumbType breadcrumbType2 : BreadcrumbType.valuesCustom()) {
                if (C8632dsu.c((Object) breadcrumbType2.type, (Object) str)) {
                    if (z) {
                        return null;
                    }
                    z = true;
                    breadcrumbType = breadcrumbType2;
                }
            }
            if (z) {
                return breadcrumbType;
            }
            return null;
        }
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static BreadcrumbType[] valuesCustom() {
        BreadcrumbType[] valuesCustom = values();
        return (BreadcrumbType[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
