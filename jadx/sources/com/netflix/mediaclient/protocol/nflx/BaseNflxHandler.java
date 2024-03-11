package com.netflix.mediaclient.protocol.nflx;

import android.util.SparseArray;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.protocol.nflx.BaseNflxHandler;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import java.util.Map;
import o.C1044Mm;
import o.C1071Np;
import o.C1079Nx;
import o.C1722aLv;
import o.C8073ddW;
import o.C8166dfJ;
import o.C8168dfL;
import o.C8194dfl;

/* loaded from: classes3.dex */
public abstract class BaseNflxHandler implements NflxHandler {
    public NetflixActivity b;
    public Map<String, String> d;

    protected abstract NflxHandler.Response c(String str, String str2, String str3);

    protected abstract NflxHandler.Response d(String str, String str2, String str3);

    @Override // com.netflix.mediaclient.protocol.nflx.NflxHandler
    public boolean j() {
        return true;
    }

    public BaseNflxHandler(NetflixActivity netflixActivity, Map<String, String> map) {
        this.b = netflixActivity;
        this.d = map;
    }

    public void c() {
        new C1722aLv(this.b, this.d).I_();
    }

    public C8194dfl.d e() {
        C8194dfl.d a;
        String str = this.d.get("movieid");
        if (C8168dfL.g(str)) {
            return a();
        }
        C8194dfl.d d = C8194dfl.d(str, this.d);
        String a2 = C8194dfl.a(this.d);
        return (!C8168dfL.h(a2) || d == null || (a = C8194dfl.d.a(d.d(), a2)) == null) ? d : a;
    }

    protected C8194dfl.d a() {
        final String c = C8194dfl.c(this.d);
        if (C8168dfL.g(c)) {
            C1044Mm.b("NflxHandler", "movie id uri and tiny url both doesn't exist in params map");
            return null;
        }
        C1044Mm.b("NflxHandler", "movie id uri doesn't exist in params map, but tiny url does. Resolve it");
        new C1071Np().d(new C1079Nx.b() { // from class: o.aLp
            @Override // o.C1079Nx.b
            public final void run() {
                BaseNflxHandler.this.c(c);
            }
        });
        return C8194dfl.d.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        C1044Mm.e("NflxHandler", "Resolving tiny URL in background");
        e(str, C8194dfl.e(this.d.get("targetid")), C8194dfl.d(this.d));
    }

    /* loaded from: classes3.dex */
    public enum TinyTypes {
        NO_TYPE,
        MOVIE_TYPE,
        DISC_TYPE,
        PROGRAM_TYPE,
        SERIES_TYPE,
        SEASON_TYPE,
        CLIP_TYPE,
        PERSON_TYPE;
        
        private static final SparseArray<TinyTypes> f = new SparseArray<>();

        static {
            TinyTypes[] values;
            int i;
            for (TinyTypes tinyTypes : values()) {
                f.put(tinyTypes.ordinal(), tinyTypes);
            }
        }

        public static TinyTypes e(int i) {
            return f.get(i);
        }
    }

    protected void e(String str, String str2, String str3) {
        C8166dfJ.c();
        NflxHandler.Response response = NflxHandler.Response.HANDLING;
        try {
            String valueOf = String.valueOf(C8073ddW.c(C8194dfl.b(str), 62));
            boolean z = TinyTypes.MOVIE_TYPE == TinyTypes.e(Integer.parseInt(valueOf.substring(0, 1)));
            String substring = valueOf.substring(1);
            if (C8168dfL.g(substring)) {
                C1044Mm.d("NflxHandler", "No catalog_title in JSON object! Go to LOLOMO.");
                c();
            } else if (z) {
                C1044Mm.e("NflxHandler", "This was a movie url");
                response = d(substring, str2, str3);
            } else {
                C1044Mm.e("NflxHandler", "This was a TV Show url");
                response = c(substring, str2, str3);
            }
        } catch (Throwable th) {
            C1044Mm.e("NflxHandler", "We failed to get expanded URL ", th);
            c();
        }
        if (NflxHandler.Response.HANDLING_WITH_DELAY.equals(response)) {
            return;
        }
        C8194dfl.c(this.b);
    }
}
