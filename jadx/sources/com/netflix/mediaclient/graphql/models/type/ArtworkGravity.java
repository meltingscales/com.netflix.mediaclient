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
public final class ArtworkGravity {
    public static final d e;
    private static final /* synthetic */ ArtworkGravity[] k;
    private static final /* synthetic */ InterfaceC8598drn l;
    private static final C9033hu m;
    private final String n;
    public static final ArtworkGravity a = new ArtworkGravity("CENTER", 0, "CENTER");
    public static final ArtworkGravity b = new ArtworkGravity("NORTH", 1, "NORTH");
    public static final ArtworkGravity g = new ArtworkGravity("SOUTH", 2, "SOUTH");
    public static final ArtworkGravity d = new ArtworkGravity("EAST", 3, "EAST");

    /* renamed from: o  reason: collision with root package name */
    public static final ArtworkGravity f13171o = new ArtworkGravity("WEST", 4, "WEST");
    public static final ArtworkGravity i = new ArtworkGravity("NORTHWEST", 5, "NORTHWEST");
    public static final ArtworkGravity c = new ArtworkGravity("NORTHEAST", 6, "NORTHEAST");
    public static final ArtworkGravity j = new ArtworkGravity("SOUTHWEST", 7, "SOUTHWEST");
    public static final ArtworkGravity f = new ArtworkGravity("SOUTHEAST", 8, "SOUTHEAST");
    public static final ArtworkGravity h = new ArtworkGravity("UNKNOWN__", 9, "UNKNOWN__");

    public static InterfaceC8598drn<ArtworkGravity> d() {
        return l;
    }

    private static final /* synthetic */ ArtworkGravity[] e() {
        return new ArtworkGravity[]{a, b, g, d, f13171o, i, c, j, f, h};
    }

    public static ArtworkGravity valueOf(String str) {
        return (ArtworkGravity) Enum.valueOf(ArtworkGravity.class, str);
    }

    public static ArtworkGravity[] values() {
        return (ArtworkGravity[]) k.clone();
    }

    public final String c() {
        return this.n;
    }

    private ArtworkGravity(String str, int i2, String str2) {
        this.n = str2;
    }

    static {
        List j2;
        ArtworkGravity[] e2 = e();
        k = e2;
        l = C8600drp.e(e2);
        e = new d(null);
        j2 = C8569dql.j("CENTER", "NORTH", "SOUTH", "EAST", "WEST", "NORTHWEST", "NORTHEAST", "SOUTHWEST", "SOUTHEAST");
        m = new C9033hu("ArtworkGravity", j2);
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final ArtworkGravity e(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = ArtworkGravity.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((ArtworkGravity) obj).c(), (Object) str)) {
                    break;
                }
            }
            ArtworkGravity artworkGravity = (ArtworkGravity) obj;
            return artworkGravity == null ? ArtworkGravity.h : artworkGravity;
        }
    }
}
