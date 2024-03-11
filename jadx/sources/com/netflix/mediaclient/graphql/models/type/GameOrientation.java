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
/* loaded from: classes6.dex */
public final class GameOrientation {
    private static final /* synthetic */ InterfaceC8598drn b;
    public static final c d;
    private static final /* synthetic */ GameOrientation[] f;
    private static final C9033hu g;
    private final String i;
    public static final GameOrientation a = new GameOrientation("LANDSCAPE", 0, "LANDSCAPE");
    public static final GameOrientation c = new GameOrientation("PORTRAIT", 1, "PORTRAIT");
    public static final GameOrientation e = new GameOrientation("UNKNOWN__", 2, "UNKNOWN__");

    public static InterfaceC8598drn<GameOrientation> a() {
        return b;
    }

    private static final /* synthetic */ GameOrientation[] c() {
        return new GameOrientation[]{a, c, e};
    }

    public static GameOrientation valueOf(String str) {
        return (GameOrientation) Enum.valueOf(GameOrientation.class, str);
    }

    public static GameOrientation[] values() {
        return (GameOrientation[]) f.clone();
    }

    public final String d() {
        return this.i;
    }

    private GameOrientation(String str, int i, String str2) {
        this.i = str2;
    }

    static {
        List j;
        GameOrientation[] c2 = c();
        f = c2;
        b = C8600drp.e(c2);
        d = new c(null);
        j = C8569dql.j("LANDSCAPE", "PORTRAIT");
        g = new C9033hu("GameOrientation", j);
    }

    /* loaded from: classes6.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final C9033hu e() {
            return GameOrientation.g;
        }

        public final GameOrientation d(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = GameOrientation.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((GameOrientation) obj).d(), (Object) str)) {
                    break;
                }
            }
            GameOrientation gameOrientation = (GameOrientation) obj;
            return gameOrientation == null ? GameOrientation.e : gameOrientation;
        }
    }
}
