package com.netflix.mediaclient.service.configuration.persistent.ab;

import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import kotlin.Pair;
import o.C1818aPj;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8598drn;
import o.aRM;
import o.dpD;
import o.dqE;

/* loaded from: classes.dex */
public final class Config_Ab55851_MobileNav extends aRM {
    public static final c a = new c(null);
    private static final d b;
    private static final Map<Integer, d> c;
    private final String i = "55851";
    private final int d = c.size();
    private final String e = "Mobile Nav";

    public static final d j() {
        return a.d();
    }

    @Override // o.aRM
    public boolean L_() {
        return true;
    }

    @Override // o.aRM
    public boolean M_() {
        return true;
    }

    @Override // o.aRM
    public boolean N_() {
        return true;
    }

    @Override // o.aRM
    public String d() {
        return this.i;
    }

    @Override // o.aRM
    /* renamed from: h */
    public String a() {
        return this.e;
    }

    /* loaded from: classes3.dex */
    public static final class d {
        private final Integer a;
        private final String b;
        private final boolean c;
        private final boolean d;
        private final boolean e;
        private final LolomoTabName f;
        private final boolean g;
        private final boolean h;
        private final NewAndHotTabName i;
        private final LolomoTabIcon j;
        private final boolean k;
        private final boolean m;

        public final LolomoTabIcon a() {
            return this.j;
        }

        public final boolean b() {
            return this.e;
        }

        public final boolean c() {
            return this.d;
        }

        public final Integer d() {
            return this.a;
        }

        public final boolean e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && this.m == dVar.m && this.h == dVar.h && this.d == dVar.d && C8632dsu.c(this.a, dVar.a) && this.f == dVar.f && this.j == dVar.j && this.i == dVar.i && this.g == dVar.g && this.k == dVar.k && this.e == dVar.e && this.c == dVar.c;
            }
            return false;
        }

        public final boolean f() {
            return this.g;
        }

        public final NewAndHotTabName g() {
            return this.i;
        }

        public final boolean h() {
            return this.h;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = Boolean.hashCode(this.m);
            int hashCode3 = Boolean.hashCode(this.h);
            int hashCode4 = Boolean.hashCode(this.d);
            Integer num = this.a;
            return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.f.hashCode()) * 31) + this.j.hashCode()) * 31) + this.i.hashCode()) * 31) + Boolean.hashCode(this.g)) * 31) + Boolean.hashCode(this.k)) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.c);
        }

        public final LolomoTabName i() {
            return this.f;
        }

        public final boolean j() {
            return this.m;
        }

        public final boolean o() {
            return this.k;
        }

        public String toString() {
            String str = this.b;
            boolean z = this.m;
            boolean z2 = this.h;
            boolean z3 = this.d;
            Integer num = this.a;
            LolomoTabName lolomoTabName = this.f;
            LolomoTabIcon lolomoTabIcon = this.j;
            NewAndHotTabName newAndHotTabName = this.i;
            boolean z4 = this.g;
            boolean z5 = this.k;
            boolean z6 = this.e;
            boolean z7 = this.c;
            return "Features(friendlyName=" + str + ", showSearchBarInActionBar=" + z + ", showBigSearchBar=" + z2 + ", launchToNewAndHot=" + z3 + ", cwRowPosition=" + num + ", lolomoTabName=" + lolomoTabName + ", lolomoTabIcon=" + lolomoTabIcon + ", newAndHotTabName=" + newAndHotTabName + ", reorderTabs=" + z4 + ", showTooltip=" + z5 + ", lolomoHasBillboard=" + z6 + ", cardsDesign=" + z7 + ")";
        }

        public d(String str, boolean z, boolean z2, boolean z3, Integer num, LolomoTabName lolomoTabName, LolomoTabIcon lolomoTabIcon, NewAndHotTabName newAndHotTabName, boolean z4, boolean z5, boolean z6, boolean z7) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) lolomoTabName, "");
            C8632dsu.c((Object) lolomoTabIcon, "");
            C8632dsu.c((Object) newAndHotTabName, "");
            this.b = str;
            this.m = z;
            this.h = z2;
            this.d = z3;
            this.a = num;
            this.f = lolomoTabName;
            this.j = lolomoTabIcon;
            this.i = newAndHotTabName;
            this.g = z4;
            this.k = z5;
            this.e = z6;
            this.c = z7;
        }

        public /* synthetic */ d(String str, boolean z, boolean z2, boolean z3, Integer num, LolomoTabName lolomoTabName, LolomoTabIcon lolomoTabIcon, NewAndHotTabName newAndHotTabName, boolean z4, boolean z5, boolean z6, boolean z7, int i, C8627dsp c8627dsp) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? LolomoTabName.b : lolomoTabName, (i & 64) != 0 ? LolomoTabIcon.e : lolomoTabIcon, (i & 128) != 0 ? NewAndHotTabName.e : newAndHotTabName, (i & JSONzip.end) != 0 ? false : z4, (i & 512) != 0 ? false : z5, (i & 1024) != 0 ? true : z6, (i & 2048) == 0 ? z7 : false);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final boolean a() {
            return c() != ABTestConfig.Cell.CELL_1;
        }

        public final d d() {
            Object e;
            e = dqE.e(Config_Ab55851_MobileNav.c, Integer.valueOf(c().getCellId()));
            return (d) e;
        }

        private final ABTestConfig.Cell c() {
            return C1818aPj.e(Config_Ab55851_MobileNav.class);
        }
    }

    static {
        Map<Integer, d> c2;
        d dVar = new d("Control", false, false, false, null, null, null, null, false, false, false, false, 4094, null);
        b = dVar;
        Pair a2 = dpD.a(1, dVar);
        Pair a3 = dpD.a(2, new d("N&H first tab", false, false, true, 2, null, null, null, true, false, false, true, 1766, null));
        Pair a4 = dpD.a(3, new d("No BB in lolomo", false, false, true, 2, null, null, null, true, false, false, true, 742, null));
        LolomoTabName lolomoTabName = LolomoTabName.d;
        LolomoTabIcon lolomoTabIcon = LolomoTabIcon.d;
        Pair a5 = dpD.a(4, new d("LOLOMO->Explore", false, false, true, 2, lolomoTabName, lolomoTabIcon, null, true, true, false, true, 134, null));
        NewAndHotTabName newAndHotTabName = NewAndHotTabName.c;
        Pair a6 = dpD.a(5, new d("N&H->Home", false, false, true, 2, lolomoTabName, lolomoTabIcon, newAndHotTabName, true, true, false, true, 6, null));
        LolomoTabName lolomoTabName2 = LolomoTabName.c;
        LolomoTabIcon lolomoTabIcon2 = LolomoTabIcon.b;
        c2 = dqE.c(a2, a3, a4, a5, a6, dpD.a(6, new d("Search+LOLOMO tab", true, false, true, 2, lolomoTabName2, lolomoTabIcon2, newAndHotTabName, true, true, false, true, 4, null)), dpD.a(7, new d("CW below first trailer", true, false, true, 1, lolomoTabName2, lolomoTabIcon2, newAndHotTabName, true, true, false, true, 4, null)), dpD.a(8, new d("Explore vs. Search", false, true, true, 2, lolomoTabName, lolomoTabIcon2, newAndHotTabName, true, true, false, true, 2, null)), dpD.a(9, new d("Play primary CTA", false, true, true, 2, lolomoTabName, lolomoTabIcon2, newAndHotTabName, true, true, false, true, 2, null)), dpD.a(10, new d("Secondary design control", false, true, true, 2, lolomoTabName, lolomoTabIcon2, newAndHotTabName, true, true, false, false, 2, null)));
        c = c2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class LolomoTabName {
        private static final /* synthetic */ InterfaceC8598drn a;
        private static final /* synthetic */ LolomoTabName[] e;
        public static final LolomoTabName b = new LolomoTabName("HOME", 0);
        public static final LolomoTabName d = new LolomoTabName("EXPLORE", 1);
        public static final LolomoTabName c = new LolomoTabName("SEARCH", 2);

        private static final /* synthetic */ LolomoTabName[] b() {
            return new LolomoTabName[]{b, d, c};
        }

        public static LolomoTabName valueOf(String str) {
            return (LolomoTabName) Enum.valueOf(LolomoTabName.class, str);
        }

        public static LolomoTabName[] values() {
            return (LolomoTabName[]) e.clone();
        }

        private LolomoTabName(String str, int i) {
        }

        static {
            LolomoTabName[] b2 = b();
            e = b2;
            a = C8600drp.e(b2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class LolomoTabIcon {
        private static final /* synthetic */ InterfaceC8598drn a;
        private static final /* synthetic */ LolomoTabIcon[] c;
        public static final LolomoTabIcon e = new LolomoTabIcon("HOME", 0);
        public static final LolomoTabIcon d = new LolomoTabIcon("GRID", 1);
        public static final LolomoTabIcon b = new LolomoTabIcon("SEARCH", 2);

        private static final /* synthetic */ LolomoTabIcon[] d() {
            return new LolomoTabIcon[]{e, d, b};
        }

        public static LolomoTabIcon valueOf(String str) {
            return (LolomoTabIcon) Enum.valueOf(LolomoTabIcon.class, str);
        }

        public static LolomoTabIcon[] values() {
            return (LolomoTabIcon[]) c.clone();
        }

        private LolomoTabIcon(String str, int i) {
        }

        static {
            LolomoTabIcon[] d2 = d();
            c = d2;
            a = C8600drp.e(d2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class NewAndHotTabName {
        private static final /* synthetic */ InterfaceC8598drn a;
        private static final /* synthetic */ NewAndHotTabName[] b;
        public static final NewAndHotTabName e = new NewAndHotTabName("NEW_AND_HOT", 0);
        public static final NewAndHotTabName c = new NewAndHotTabName("HOME", 1);

        private static final /* synthetic */ NewAndHotTabName[] d() {
            return new NewAndHotTabName[]{e, c};
        }

        public static NewAndHotTabName valueOf(String str) {
            return (NewAndHotTabName) Enum.valueOf(NewAndHotTabName.class, str);
        }

        public static NewAndHotTabName[] values() {
            return (NewAndHotTabName[]) b.clone();
        }

        private NewAndHotTabName(String str, int i) {
        }

        static {
            NewAndHotTabName[] d = d();
            b = d;
            a = C8600drp.e(d);
        }
    }
}
