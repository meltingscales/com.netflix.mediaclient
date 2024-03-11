package o;

import java.util.Map;
import o.C7939dav;

/* renamed from: o.daU  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7912daU {
    private static final Map<String, String> a;
    private static final Map<String, Integer> b;
    private static final Map<String, Integer> c;
    public static final a d = new a(null);

    /* renamed from: o.daU$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final Map<String, Integer> e() {
            return C7912daU.c;
        }

        public final Map<String, String> c() {
            return C7912daU.a;
        }

        public final Map<String, Integer> d() {
            return C7912daU.b;
        }
    }

    static {
        Map<String, Integer> c2;
        Map<String, String> c3;
        Map<String, Integer> c4;
        c2 = dqE.c(dpD.a("COMING_SOON_SECTION_DESCRIPTOR", Integer.valueOf(C7939dav.c.c)), dpD.a("MOST_WATCHED_SECTION_DESCRIPTOR", Integer.valueOf(C7939dav.c.j)), dpD.a("POPULAR_TITLES_SECTION_DESCRIPTOR", Integer.valueOf(C7939dav.c.b)), dpD.a("POPULAR_GAMES_SECTION_DESCRIPTOR", Integer.valueOf(C7939dav.c.d)));
        c = c2;
        c3 = dqE.c(dpD.a("COMING_SOON_SECTION_DESCRIPTOR", "comingSoon"), dpD.a("MOST_WATCHED_SECTION_DESCRIPTOR", "mostWatched"), dpD.a("POPULAR_TITLES_SECTION_DESCRIPTOR", "popularTitles"), dpD.a("POPULAR_GAMES_SECTION_DESCRIPTOR", "popularGames"));
        a = c3;
        c4 = dqE.c(dpD.a("comingSoon", Integer.valueOf(C7939dav.c.c)), dpD.a("mostWatched", Integer.valueOf(C7939dav.c.j)), dpD.a("popularTitles", Integer.valueOf(C7939dav.c.b)), dpD.a("popularGames", Integer.valueOf(C7939dav.c.d)));
        b = c4;
    }
}
