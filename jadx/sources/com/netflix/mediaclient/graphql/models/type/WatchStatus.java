package com.netflix.mediaclient.graphql.models.type;

import java.util.Iterator;
import java.util.List;
import o.C8569dql;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C9033hu;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class WatchStatus {
    public static final b e;
    private static final /* synthetic */ WatchStatus[] f;
    private static final /* synthetic */ InterfaceC8598drn h;
    private static final C9033hu j;
    private final String g;
    public static final WatchStatus d = new WatchStatus("NEVER_WATCHED", 0, "NEVER_WATCHED");
    public static final WatchStatus b = new WatchStatus("STARTED", 1, "STARTED");
    public static final WatchStatus a = new WatchStatus("COMPLETED", 2, "COMPLETED");
    public static final WatchStatus c = new WatchStatus("UNKNOWN__", 3, "UNKNOWN__");

    private static final /* synthetic */ WatchStatus[] b() {
        return new WatchStatus[]{d, b, a, c};
    }

    public static InterfaceC8598drn<WatchStatus> e() {
        return h;
    }

    public static WatchStatus valueOf(String str) {
        return (WatchStatus) Enum.valueOf(WatchStatus.class, str);
    }

    public static WatchStatus[] values() {
        return (WatchStatus[]) f.clone();
    }

    public final String d() {
        return this.g;
    }

    private WatchStatus(String str, int i, String str2) {
        this.g = str2;
    }

    static {
        List j2;
        WatchStatus[] b2 = b();
        f = b2;
        h = C8600drp.e(b2);
        e = new b(null);
        j2 = C8569dql.j("NEVER_WATCHED", "STARTED", "COMPLETED");
        j = new C9033hu("WatchStatus", j2);
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final C9033hu c() {
            return WatchStatus.j;
        }

        public final WatchStatus e(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = WatchStatus.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((WatchStatus) obj).d(), (Object) str)) {
                    break;
                }
            }
            WatchStatus watchStatus = (WatchStatus) obj;
            return watchStatus == null ? WatchStatus.c : watchStatus;
        }
    }
}
