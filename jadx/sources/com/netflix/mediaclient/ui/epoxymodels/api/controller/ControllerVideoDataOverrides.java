package com.netflix.mediaclient.ui.epoxymodels.api.controller;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o.C1045Mp;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8598drn;
import o.bLJ;
import o.bLL;
import o.dpR;
import o.dqE;

/* loaded from: classes4.dex */
public final class ControllerVideoDataOverrides {
    private static int d;
    private int a;
    private Map<String, bLJ> f;
    public static final c c = new c(null);
    public static final int b = 8;
    private static final dpR e = dpR.c;

    public final int e() {
        return this.a;
    }

    public ControllerVideoDataOverrides() {
        Map<String, bLJ> d2;
        d2 = dqE.d();
        this.f = d2;
        this.a = -1;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class VideoOverrideName {
        private static final /* synthetic */ InterfaceC8598drn b;
        private static final /* synthetic */ VideoOverrideName[] e;
        public static final VideoOverrideName d = new VideoOverrideName("MyList", 0);
        public static final VideoOverrideName c = new VideoOverrideName("RemindMe", 1);
        public static final VideoOverrideName a = new VideoOverrideName("Expanded", 2);

        private static final /* synthetic */ VideoOverrideName[] e() {
            return new VideoOverrideName[]{d, c, a};
        }

        public static VideoOverrideName valueOf(String str) {
            return (VideoOverrideName) Enum.valueOf(VideoOverrideName.class, str);
        }

        public static VideoOverrideName[] values() {
            return (VideoOverrideName[]) e.clone();
        }

        private VideoOverrideName(String str, int i) {
        }

        static {
            VideoOverrideName[] e2 = e();
            e = e2;
            b = C8600drp.e(e2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("ControllerVideoDataOverrides");
        }
    }

    public final Boolean c(String str, VideoOverrideName videoOverrideName) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoOverrideName, "");
        bLJ blj = this.f.get(str);
        if (blj != null) {
            return blj.a(videoOverrideName);
        }
        return null;
    }

    public final int d(String str, bLL bll) {
        int a;
        Map<String, bLJ> k;
        bLJ blj;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) bll, "");
        synchronized (e) {
            a = a();
            k = dqE.k(this.f);
            bLJ blj2 = k.get(str);
            if (blj2 == null || (blj = blj2.b(bll, a)) == null) {
                blj = new bLJ(bll, a);
            }
            k.put(str, blj);
            this.f = k;
        }
        return a;
    }

    public final void b(Set<Integer> set) {
        dpR dpr;
        C8632dsu.c((Object) set, "");
        synchronized (e) {
            if (this.f.isEmpty()) {
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it = this.f.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                bLJ a = ((bLJ) entry.getValue()).a(set);
                if (a != null) {
                    c.getLogTag();
                    linkedHashMap.put(str, a);
                    dpr = dpR.c;
                } else {
                    dpr = null;
                }
                if (dpr == null) {
                    c.getLogTag();
                }
            }
            this.f = linkedHashMap;
            dpR dpr2 = dpR.c;
        }
    }

    private final int a() {
        int i;
        synchronized (e) {
            i = d;
            d = i + 1;
            this.a = i;
        }
        return i;
    }

    public final boolean b() {
        return this.f.isEmpty();
    }

    public String toString() {
        Map<String, bLJ> map = this.f;
        return "ControllerVideoDataOverrides(" + map + ")";
    }
}
