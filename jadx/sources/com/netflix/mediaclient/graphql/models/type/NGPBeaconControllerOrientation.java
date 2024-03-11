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
public final class NGPBeaconControllerOrientation {
    public static final a a;
    private static final C9033hu f;
    private static final /* synthetic */ NGPBeaconControllerOrientation[] i;
    private static final /* synthetic */ InterfaceC8598drn j;
    private final String g;
    public static final NGPBeaconControllerOrientation c = new NGPBeaconControllerOrientation("PORTRAIT_PRIMARY", 0, "PORTRAIT_PRIMARY");
    public static final NGPBeaconControllerOrientation b = new NGPBeaconControllerOrientation("PORTRAIT_SECONDARY", 1, "PORTRAIT_SECONDARY");
    public static final NGPBeaconControllerOrientation d = new NGPBeaconControllerOrientation("LANDSCAPE_PRIMARY", 2, "LANDSCAPE_PRIMARY");
    public static final NGPBeaconControllerOrientation e = new NGPBeaconControllerOrientation("LANDSCAPE_SECONDARY", 3, "LANDSCAPE_SECONDARY");
    public static final NGPBeaconControllerOrientation h = new NGPBeaconControllerOrientation("UNKNOWN__", 4, "UNKNOWN__");

    private static final /* synthetic */ NGPBeaconControllerOrientation[] d() {
        return new NGPBeaconControllerOrientation[]{c, b, d, e, h};
    }

    public static InterfaceC8598drn<NGPBeaconControllerOrientation> e() {
        return j;
    }

    public static NGPBeaconControllerOrientation valueOf(String str) {
        return (NGPBeaconControllerOrientation) Enum.valueOf(NGPBeaconControllerOrientation.class, str);
    }

    public static NGPBeaconControllerOrientation[] values() {
        return (NGPBeaconControllerOrientation[]) i.clone();
    }

    public final String c() {
        return this.g;
    }

    private NGPBeaconControllerOrientation(String str, int i2, String str2) {
        this.g = str2;
    }

    static {
        List j2;
        NGPBeaconControllerOrientation[] d2 = d();
        i = d2;
        j = C8600drp.e(d2);
        a = new a(null);
        j2 = C8569dql.j("PORTRAIT_PRIMARY", "PORTRAIT_SECONDARY", "LANDSCAPE_PRIMARY", "LANDSCAPE_SECONDARY");
        f = new C9033hu("NGPBeaconControllerOrientation", j2);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final C9033hu d() {
            return NGPBeaconControllerOrientation.f;
        }

        public final List<NGPBeaconControllerOrientation> b() {
            List<NGPBeaconControllerOrientation> j;
            j = C8569dql.j(NGPBeaconControllerOrientation.c, NGPBeaconControllerOrientation.b, NGPBeaconControllerOrientation.d, NGPBeaconControllerOrientation.e);
            return j;
        }

        public final NGPBeaconControllerOrientation[] c() {
            return (NGPBeaconControllerOrientation[]) b().toArray(new NGPBeaconControllerOrientation[0]);
        }

        public final NGPBeaconControllerOrientation c(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = NGPBeaconControllerOrientation.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((NGPBeaconControllerOrientation) obj).c(), (Object) str)) {
                    break;
                }
            }
            NGPBeaconControllerOrientation nGPBeaconControllerOrientation = (NGPBeaconControllerOrientation) obj;
            return nGPBeaconControllerOrientation == null ? NGPBeaconControllerOrientation.h : nGPBeaconControllerOrientation;
        }
    }
}
