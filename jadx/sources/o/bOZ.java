package o;

import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.ui.games.impl.games.GamesLolomoActivity;
import o.C3895bOq;

/* loaded from: classes4.dex */
public final class bOZ implements bNR {
    public static final c a = new c(null);

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("javaClass");
        }
    }

    @Override // o.bNR
    public String a() {
        String d = C8168dfL.d(C3895bOq.e.P);
        C8632dsu.a(d, "");
        return d;
    }

    @Override // o.bNR
    public Intent e(Context context) {
        C8632dsu.c((Object) context, "");
        return GamesLolomoActivity.a.d(context);
    }
}
