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
public final class UXConfigPinotUnifiedEntityKind {
    public static final a d;
    private static final /* synthetic */ InterfaceC8598drn l;

    /* renamed from: o  reason: collision with root package name */
    private static final /* synthetic */ UXConfigPinotUnifiedEntityKind[] f13187o;
    private static final C9033hu t;
    private final String q;
    public static final UXConfigPinotUnifiedEntityKind a = new UXConfigPinotUnifiedEntityKind("Character", 0, "Character");
    public static final UXConfigPinotUnifiedEntityKind b = new UXConfigPinotUnifiedEntityKind("Collection", 1, "Collection");
    public static final UXConfigPinotUnifiedEntityKind j = new UXConfigPinotUnifiedEntityKind("Game", 2, "Game");
    public static final UXConfigPinotUnifiedEntityKind f = new UXConfigPinotUnifiedEntityKind("Person", 3, "Person");
    public static final UXConfigPinotUnifiedEntityKind k = new UXConfigPinotUnifiedEntityKind("Video", 4, "Video");
    public static final UXConfigPinotUnifiedEntityKind n = new UXConfigPinotUnifiedEntityKind("VIDEO", 5, "VIDEO");
    public static final UXConfigPinotUnifiedEntityKind e = new UXConfigPinotUnifiedEntityKind("GAME", 6, "GAME");
    public static final UXConfigPinotUnifiedEntityKind i = new UXConfigPinotUnifiedEntityKind("PERSON", 7, "PERSON");
    public static final UXConfigPinotUnifiedEntityKind c = new UXConfigPinotUnifiedEntityKind("CHARACTER", 8, "CHARACTER");
    public static final UXConfigPinotUnifiedEntityKind h = new UXConfigPinotUnifiedEntityKind("GENRE", 9, "GENRE");
    public static final UXConfigPinotUnifiedEntityKind g = new UXConfigPinotUnifiedEntityKind("GENERIC_CONTAINER", 10, "GENERIC_CONTAINER");
    public static final UXConfigPinotUnifiedEntityKind m = new UXConfigPinotUnifiedEntityKind("UNKNOWN__", 11, "UNKNOWN__");

    public static InterfaceC8598drn<UXConfigPinotUnifiedEntityKind> b() {
        return l;
    }

    private static final /* synthetic */ UXConfigPinotUnifiedEntityKind[] d() {
        return new UXConfigPinotUnifiedEntityKind[]{a, b, j, f, k, n, e, i, c, h, g, m};
    }

    public static UXConfigPinotUnifiedEntityKind valueOf(String str) {
        return (UXConfigPinotUnifiedEntityKind) Enum.valueOf(UXConfigPinotUnifiedEntityKind.class, str);
    }

    public static UXConfigPinotUnifiedEntityKind[] values() {
        return (UXConfigPinotUnifiedEntityKind[]) f13187o.clone();
    }

    public final String e() {
        return this.q;
    }

    private UXConfigPinotUnifiedEntityKind(String str, int i2, String str2) {
        this.q = str2;
    }

    static {
        List j2;
        UXConfigPinotUnifiedEntityKind[] d2 = d();
        f13187o = d2;
        l = C8600drp.e(d2);
        d = new a(null);
        j2 = C8569dql.j("Character", "Collection", "Game", "Person", "Video", "VIDEO", "GAME", "PERSON", "CHARACTER", "GENRE", "GENERIC_CONTAINER");
        t = new C9033hu("UXConfigPinotUnifiedEntityKind", j2);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final UXConfigPinotUnifiedEntityKind b(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = UXConfigPinotUnifiedEntityKind.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((UXConfigPinotUnifiedEntityKind) obj).e(), (Object) str)) {
                    break;
                }
            }
            UXConfigPinotUnifiedEntityKind uXConfigPinotUnifiedEntityKind = (UXConfigPinotUnifiedEntityKind) obj;
            return uXConfigPinotUnifiedEntityKind == null ? UXConfigPinotUnifiedEntityKind.m : uXConfigPinotUnifiedEntityKind;
        }
    }
}
