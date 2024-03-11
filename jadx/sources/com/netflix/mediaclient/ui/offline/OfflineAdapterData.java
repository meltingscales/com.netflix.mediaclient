package com.netflix.mediaclient.ui.offline;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.C7460cwd;
import o.C7463cwg;
import o.InterfaceC5206buQ;

/* loaded from: classes4.dex */
public class OfflineAdapterData {
    private final b b;
    private final C7460cwd[] e;

    /* loaded from: classes4.dex */
    public enum ViewType {
        MOVIE,
        SHOW
    }

    public b a() {
        return this.b;
    }

    public C7460cwd[] b() {
        return this.e;
    }

    /* loaded from: classes4.dex */
    public static class b {
        public final C7460cwd a;
        public final ViewType b;
        public final String c;
        public final int e;

        public b(ViewType viewType, C7460cwd c7460cwd, int i, String str) {
            this.b = viewType;
            this.a = c7460cwd;
            this.e = i;
            this.c = str;
        }
    }

    public OfflineAdapterData(C7460cwd c7460cwd, List<C7460cwd> list, String str) {
        if (c7460cwd.getType() == VideoType.MOVIE) {
            this.b = new b(ViewType.MOVIE, c7460cwd, 1, str);
            this.e = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C7460cwd c7460cwd2 = list.get(i);
            int x = c7460cwd2.aE_().x();
            arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
            arrayList2.add(c7460cwd2);
            if (i == list.size() - 1 || x != list.get(i + 1).aE_().x()) {
                arrayList.add(new C7463cwg((C7460cwd) arrayList2.get(0), c7460cwd.a(x)));
                arrayList.addAll(arrayList2);
                arrayList2 = null;
            }
        }
        this.e = (C7460cwd[]) arrayList.toArray(new C7460cwd[arrayList.size()]);
        this.b = new b(ViewType.SHOW, c7460cwd, list.size(), str);
    }

    /* renamed from: com.netflix.mediaclient.ui.offline.OfflineAdapterData$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ViewType.values().length];
            a = iArr;
            try {
                iArr[ViewType.MOVIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ViewType.SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public long a(Map<String, InterfaceC5206buQ> map) {
        C7460cwd[] c7460cwdArr;
        int i = AnonymousClass1.a[this.b.b.ordinal()];
        if (i != 1) {
            long j = 0;
            if (i != 2) {
                return 0L;
            }
            for (C7460cwd c7460cwd : this.e) {
                if (c7460cwd.getType() == VideoType.EPISODE) {
                    j += c7460cwd.aP_();
                }
            }
            return j;
        }
        return this.b.a.aP_();
    }
}
