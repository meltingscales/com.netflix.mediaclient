package com.netflix.mediaclient.ui.nux.impl;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class NewUserExperienceCtaType {
    private static final /* synthetic */ InterfaceC8598drn h;
    private static final /* synthetic */ NewUserExperienceCtaType[] j;
    public static final NewUserExperienceCtaType d = new NewUserExperienceCtaType("NONE", 0);
    public static final NewUserExperienceCtaType a = new NewUserExperienceCtaType("NEXT", 1);
    public static final NewUserExperienceCtaType b = new NewUserExperienceCtaType("DONE", 2);
    public static final NewUserExperienceCtaType e = new NewUserExperienceCtaType("TAKE_TOUR", 3);
    public static final NewUserExperienceCtaType c = new NewUserExperienceCtaType("BACK", 4);

    private static final /* synthetic */ NewUserExperienceCtaType[] e() {
        return new NewUserExperienceCtaType[]{d, a, b, e, c};
    }

    public static NewUserExperienceCtaType valueOf(String str) {
        return (NewUserExperienceCtaType) Enum.valueOf(NewUserExperienceCtaType.class, str);
    }

    public static NewUserExperienceCtaType[] values() {
        return (NewUserExperienceCtaType[]) j.clone();
    }

    private NewUserExperienceCtaType(String str, int i) {
    }

    static {
        NewUserExperienceCtaType[] e2 = e();
        j = e2;
        h = C8600drp.e(e2);
    }
}
