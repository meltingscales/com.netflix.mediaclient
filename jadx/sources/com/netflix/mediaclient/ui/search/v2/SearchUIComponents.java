package com.netflix.mediaclient.ui.search.v2;

import o.C3080asG;
import o.C3090asQ;
import o.C3091asR;
import o.C3098asY;
import o.C3120asu;
import o.C3158atf;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class SearchUIComponents {
    public static final d a;
    private static final /* synthetic */ SearchUIComponents[] h;
    private static final /* synthetic */ InterfaceC8598drn i;
    public static final SearchUIComponents j = new SearchUIComponents("VideoList", 0);
    public static final SearchUIComponents g = new SearchUIComponents("VideoGallery", 1);
    public static final SearchUIComponents f = new SearchUIComponents("VideoCarousel", 2);
    public static final SearchUIComponents d = new SearchUIComponents("SearchNameList", 3);
    public static final SearchUIComponents e = new SearchUIComponents("GameCarousel", 4);
    public static final SearchUIComponents b = new SearchUIComponents("OocVideoCarousel", 5);
    public static final SearchUIComponents c = new SearchUIComponents("PillCarousel", 6);

    private static final /* synthetic */ SearchUIComponents[] c() {
        return new SearchUIComponents[]{j, g, f, d, e, b, c};
    }

    public static SearchUIComponents valueOf(String str) {
        return (SearchUIComponents) Enum.valueOf(SearchUIComponents.class, str);
    }

    public static SearchUIComponents[] values() {
        return (SearchUIComponents[]) h.clone();
    }

    private SearchUIComponents(String str, int i2) {
    }

    static {
        SearchUIComponents[] c2 = c();
        h = c2;
        i = C8600drp.e(c2);
        a = new d(null);
    }

    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final SearchUIComponents c(String str) {
            C8632dsu.c((Object) str, "");
            if (C8632dsu.c((Object) str, (Object) C3158atf.a.a().b()) || C8632dsu.c((Object) str, (Object) C3098asY.c.d().b()) || C8632dsu.c((Object) str, (Object) "VideoList")) {
                return SearchUIComponents.j;
            }
            if (C8632dsu.c((Object) str, (Object) C3091asR.d.e().b()) || C8632dsu.c((Object) str, (Object) "VideoGallery") || C8632dsu.c((Object) str, (Object) "CreatorHome") || C8632dsu.c((Object) str, (Object) C3080asG.a.b().b())) {
                return SearchUIComponents.g;
            }
            if (C8632dsu.c((Object) str, (Object) C3120asu.a.e().b()) || C8632dsu.c((Object) str, (Object) "VideoCarousel")) {
                return SearchUIComponents.f;
            }
            if (C8632dsu.c((Object) str, (Object) "OocVideoCarousel")) {
                return SearchUIComponents.b;
            }
            if (C8632dsu.c((Object) str, (Object) "GameCarousel")) {
                return SearchUIComponents.e;
            }
            if (C8632dsu.c((Object) str, (Object) C3090asQ.e.b().b()) || C8632dsu.c((Object) str, (Object) "EntityNameList")) {
                return SearchUIComponents.d;
            }
            return C8632dsu.c((Object) str, (Object) "PillCarousel") ? SearchUIComponents.c : SearchUIComponents.f;
        }
    }
}
