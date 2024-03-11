package com.netflix.mediaclient.graphql.models.type;

import com.netflix.mediaclient.service.pushnotification.Payload;
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
public final class ThumbRating {
    public static final c a;
    private static final /* synthetic */ InterfaceC8598drn f;
    private static final /* synthetic */ ThumbRating[] h;
    private static final C9033hu j;
    private final String g;
    public static final ThumbRating d = new ThumbRating("THUMBS_UNRATED", 0, "THUMBS_UNRATED");
    public static final ThumbRating c = new ThumbRating(Payload.Action.THUMBS_DOWN, 1, Payload.Action.THUMBS_DOWN);
    public static final ThumbRating b = new ThumbRating(Payload.Action.THUMBS_UP, 2, Payload.Action.THUMBS_UP);
    public static final ThumbRating e = new ThumbRating("THUMBS_WAY_UP", 3, "THUMBS_WAY_UP");
    public static final ThumbRating i = new ThumbRating("UNKNOWN__", 4, "UNKNOWN__");

    private static final /* synthetic */ ThumbRating[] a() {
        return new ThumbRating[]{d, c, b, e, i};
    }

    public static InterfaceC8598drn<ThumbRating> b() {
        return f;
    }

    public static ThumbRating valueOf(String str) {
        return (ThumbRating) Enum.valueOf(ThumbRating.class, str);
    }

    public static ThumbRating[] values() {
        return (ThumbRating[]) h.clone();
    }

    public final String e() {
        return this.g;
    }

    private ThumbRating(String str, int i2, String str2) {
        this.g = str2;
    }

    static {
        List j2;
        ThumbRating[] a2 = a();
        h = a2;
        f = C8600drp.e(a2);
        a = new c(null);
        j2 = C8569dql.j("THUMBS_UNRATED", Payload.Action.THUMBS_DOWN, Payload.Action.THUMBS_UP, "THUMBS_WAY_UP");
        j = new C9033hu("ThumbRating", j2);
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final C9033hu d() {
            return ThumbRating.j;
        }

        public final ThumbRating e(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = ThumbRating.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((ThumbRating) obj).e(), (Object) str)) {
                    break;
                }
            }
            ThumbRating thumbRating = (ThumbRating) obj;
            return thumbRating == null ? ThumbRating.i : thumbRating;
        }
    }
}
