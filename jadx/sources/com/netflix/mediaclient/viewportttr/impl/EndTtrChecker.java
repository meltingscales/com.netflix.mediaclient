package com.netflix.mediaclient.viewportttr.impl;

import com.netflix.android.imageloader.api.ImageDataSource;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.viewportttr.impl.ViewPortMembershipTracker;
import java.util.ArrayList;
import java.util.List;
import o.C1045Mp;
import o.C8362diu;
import o.C8600drp;
import o.C8632dsu;
import o.InterfaceC8357dip;
import o.InterfaceC8358diq;
import o.InterfaceC8598drn;

/* loaded from: classes5.dex */
public final class EndTtrChecker extends C1045Mp {
    public static final EndTtrChecker d = new EndTtrChecker();
    private static final c b = new c(false, null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public static final class Reason {
        private static final /* synthetic */ Reason[] g;
        private static final /* synthetic */ InterfaceC8598drn h;
        public static final Reason d = new Reason("SUCCESS", 0);
        public static final Reason c = new Reason("CANCELED_UI_DESTROYED", 1);
        public static final Reason e = new Reason("CANCELED_USER_SCROLLED", 2);
        public static final Reason a = new Reason("CANCELED_OTHER", 3);
        public static final Reason b = new Reason("PLAYBACK_STARTED", 4);

        private static final /* synthetic */ Reason[] a() {
            return new Reason[]{d, c, e, a, b};
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) g.clone();
        }

        private Reason(String str, int i) {
        }

        static {
            Reason[] a2 = a();
            g = a2;
            h = C8600drp.e(a2);
        }
    }

    private EndTtrChecker() {
        super("ViewPortTtr-EndChecker");
    }

    /* loaded from: classes5.dex */
    public static final class c {
        private final boolean b;
        private final Reason c;

        public final boolean b() {
            return this.b;
        }

        public final Reason d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.b == cVar.b && this.c == cVar.c;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.b);
            Reason reason = this.c;
            return (hashCode * 31) + (reason == null ? 0 : reason.hashCode());
        }

        public String toString() {
            boolean z = this.b;
            Reason reason = this.c;
            return "IsTtrCompleteResult(isComplete=" + z + ", reason=" + reason + ")";
        }

        public c(boolean z, Reason reason) {
            this.b = z;
            this.c = reason;
        }
    }

    public final InterfaceC8358diq.c d(Reason reason, List<? extends InterfaceC8357dip> list) {
        C8632dsu.c((Object) reason, "");
        C8632dsu.c((Object) list, "");
        List<InterfaceC8357dip> b2 = b(list);
        ArrayList arrayList = new ArrayList();
        for (InterfaceC8357dip interfaceC8357dip : b2) {
            arrayList.add(interfaceC8357dip.b());
        }
        InterfaceC8357dip a = a(b2);
        return new InterfaceC8358diq.c(reason == Reason.d, reason.name(), a != null ? a.c() : 0L, arrayList);
    }

    private final InterfaceC8357dip a(List<? extends InterfaceC8357dip> list) {
        InterfaceC8357dip interfaceC8357dip = null;
        for (InterfaceC8357dip interfaceC8357dip2 : list) {
            if (interfaceC8357dip == null || interfaceC8357dip.c() < interfaceC8357dip2.c()) {
                interfaceC8357dip = interfaceC8357dip2;
            }
        }
        return interfaceC8357dip;
    }

    private final long c(List<C8362diu> list) {
        long j = 0;
        for (C8362diu c8362diu : list) {
            if (j < c8362diu.f()) {
                j = c8362diu.f();
            }
        }
        return j;
    }

    private final boolean g(List<C8362diu> list) {
        for (C8362diu c8362diu : list) {
            if (c8362diu.g()) {
                return true;
            }
        }
        return false;
    }

    private final boolean e(List<? extends InterfaceC8357dip> list) {
        for (InterfaceC8357dip interfaceC8357dip : list) {
            if (interfaceC8357dip.d() != ImageDataSource.b) {
                getLogTag();
                return false;
            }
        }
        return true;
    }

    private final boolean d(List<C8362diu> list) {
        for (C8362diu c8362diu : list) {
            if (c8362diu.h()) {
                return true;
            }
        }
        return false;
    }

    public final c a(boolean z, boolean z2, List<? extends InterfaceC8357dip> list) {
        C8632dsu.c((Object) list, "");
        if (!z2) {
            List<InterfaceC8357dip> b2 = b(list);
            List<C8362diu> arrayList = new ArrayList<>();
            for (Object obj : b2) {
                if (obj instanceof C8362diu) {
                    arrayList.add(obj);
                }
            }
            if (!d(arrayList)) {
                if (!b2.isEmpty()) {
                    for (InterfaceC8357dip interfaceC8357dip : b2) {
                        if (!interfaceC8357dip.e()) {
                            getLogTag();
                            return b;
                        }
                    }
                    if (z || e(b2)) {
                        if (g(arrayList)) {
                            InterfaceC8357dip a = a(b2);
                            if ((a != null ? a.d() : null) == ImageDataSource.b && c(arrayList) < a.c()) {
                                getLogTag();
                                return b;
                            }
                        }
                        getLogTag();
                        return new c(true, Reason.d);
                    }
                    getLogTag();
                    return b;
                }
                getLogTag();
                return b;
            }
            getLogTag();
            return new c(true, Reason.e);
        }
        getLogTag();
        return new c(true, Reason.b);
    }

    private final List<InterfaceC8357dip> b(List<? extends InterfaceC8357dip> list) {
        ShowImageRequest.a j;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            InterfaceC8357dip interfaceC8357dip = (InterfaceC8357dip) obj;
            if (interfaceC8357dip.i() == ViewPortMembershipTracker.Membership.a && (!(interfaceC8357dip instanceof C8362diu) || (j = ((C8362diu) interfaceC8357dip).j()) == null || !j.b())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
