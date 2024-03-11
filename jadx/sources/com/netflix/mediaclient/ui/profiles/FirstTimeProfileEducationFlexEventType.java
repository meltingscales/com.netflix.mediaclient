package com.netflix.mediaclient.ui.profiles;

import com.netflix.mediaclient.clutils.CLv2Utils;
import java.util.Map;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8598drn;
import o.dqE;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class FirstTimeProfileEducationFlexEventType {
    public static final e b;
    private static final /* synthetic */ InterfaceC8598drn j;
    private static final /* synthetic */ FirstTimeProfileEducationFlexEventType[] k;
    private final String l;
    public static final FirstTimeProfileEducationFlexEventType g = new FirstTimeProfileEducationFlexEventType("FIRST_TIME_PROFILE_EDUCATION_TUTORIAL_SHOWN", 0, "FirstTimeProfileEducationTutorialShown");
    public static final FirstTimeProfileEducationFlexEventType i = new FirstTimeProfileEducationFlexEventType("FIRST_TIME_PROFILE_EDUCATION_TUTORIAL_CANCELED", 1, "FirstTimeProfileEducationTutorialCanceled");
    public static final FirstTimeProfileEducationFlexEventType h = new FirstTimeProfileEducationFlexEventType("FIRST_TIME_PROFILE_EDUCATION_TUTORIAL_COMPLETED", 2, "FirstTimeProfileEducationTutorialCompleted");
    public static final FirstTimeProfileEducationFlexEventType d = new FirstTimeProfileEducationFlexEventType("FIRST_TIME_PROFILE_EDUCATION_SLIDE_LOADED", 3, "FirstTimeProfileEducationTutorialSlideLoaded");
    public static final FirstTimeProfileEducationFlexEventType e = new FirstTimeProfileEducationFlexEventType("FIRST_TIME_PROFILE_EDUCATION_NEXT_BUTTON_CLICKED", 4, "FirstTimeProfileEducationTutorialNextButtonClicked");
    public static final FirstTimeProfileEducationFlexEventType f = new FirstTimeProfileEducationFlexEventType("FIRST_TIME_PROFILE_EDUCATION_SWIPED", 5, "FirstTimeProfileEducationTutorialSwiped");
    public static final FirstTimeProfileEducationFlexEventType c = new FirstTimeProfileEducationFlexEventType("FIRST_TIME_PROFILE_EDUCATION_ANIMATION_LOADED", 6, "FirstTimeProfileEducationAnimationLoaded");
    public static final FirstTimeProfileEducationFlexEventType a = new FirstTimeProfileEducationFlexEventType("FIRST_TIME_PROFILE_EDUCATION_PERMANENT_ENTRY_POINT_CLICKED", 7, "FirstTimeProfileEducationPermanentEntryPointClicked");

    public static final void a(FirstTimeProfileEducationFlexEventType firstTimeProfileEducationFlexEventType) {
        b.c(firstTimeProfileEducationFlexEventType);
    }

    private static final /* synthetic */ FirstTimeProfileEducationFlexEventType[] d() {
        return new FirstTimeProfileEducationFlexEventType[]{g, i, h, d, e, f, c, a};
    }

    public static FirstTimeProfileEducationFlexEventType valueOf(String str) {
        return (FirstTimeProfileEducationFlexEventType) Enum.valueOf(FirstTimeProfileEducationFlexEventType.class, str);
    }

    public static FirstTimeProfileEducationFlexEventType[] values() {
        return (FirstTimeProfileEducationFlexEventType[]) k.clone();
    }

    public final String a() {
        return this.l;
    }

    private FirstTimeProfileEducationFlexEventType(String str, int i2, String str2) {
        this.l = str2;
    }

    static {
        FirstTimeProfileEducationFlexEventType[] d2 = d();
        k = d2;
        j = C8600drp.e(d2);
        b = new e(null);
    }

    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        public final void c(FirstTimeProfileEducationFlexEventType firstTimeProfileEducationFlexEventType) {
            C8632dsu.c((Object) firstTimeProfileEducationFlexEventType, "");
            c(this, firstTimeProfileEducationFlexEventType, null, null, 6, null);
        }

        private e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void c(e eVar, FirstTimeProfileEducationFlexEventType firstTimeProfileEducationFlexEventType, Map map, Map map2, int i, Object obj) {
            if ((i & 2) != 0) {
                map = dqE.d();
            }
            if ((i & 4) != 0) {
                map2 = dqE.d();
            }
            eVar.e(firstTimeProfileEducationFlexEventType, map, map2);
        }

        public final void e(FirstTimeProfileEducationFlexEventType firstTimeProfileEducationFlexEventType, Map<String, Integer> map, Map<String, String> map2) {
            C8632dsu.c((Object) firstTimeProfileEducationFlexEventType, "");
            C8632dsu.c((Object) map, "");
            C8632dsu.c((Object) map2, "");
            CLv2Utils.d(firstTimeProfileEducationFlexEventType.a(), map, map2, new String[]{"firstTimeProfileEducation"});
        }
    }
}
