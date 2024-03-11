package com.netflix.mediaclient.servicemgr.interface_.details;

import com.netflix.mediaclient.service.pushnotification.Payload;
import o.C8600drp;
import o.C8627dsp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ThumbRating {
    public static final c d;
    private static final /* synthetic */ ThumbRating[] i;
    private static final /* synthetic */ InterfaceC8598drn j;
    private final String g;
    private final int h;
    public static final ThumbRating b = new ThumbRating("THUMBS_UNRATED", 0, 0, "UNRATED");
    public static final ThumbRating a = new ThumbRating(Payload.Action.THUMBS_DOWN, 1, 1, Payload.Action.THUMBS_DOWN);
    public static final ThumbRating e = new ThumbRating(Payload.Action.THUMBS_UP, 2, 2, Payload.Action.THUMBS_UP);
    public static final ThumbRating c = new ThumbRating("THUMBS_WAY_UP", 3, 3, "THUMBS_WAY_UP");

    private static final /* synthetic */ ThumbRating[] b() {
        return new ThumbRating[]{b, a, e, c};
    }

    public static ThumbRating valueOf(String str) {
        return (ThumbRating) Enum.valueOf(ThumbRating.class, str);
    }

    public static ThumbRating[] values() {
        return (ThumbRating[]) i.clone();
    }

    public final int e() {
        return this.h;
    }

    private ThumbRating(String str, int i2, int i3, String str2) {
        this.h = i3;
        this.g = str2;
    }

    static {
        ThumbRating[] b2 = b();
        i = b2;
        j = C8600drp.e(b2);
        d = new c(null);
    }

    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final ThumbRating b(int i) {
            ThumbRating thumbRating;
            ThumbRating[] values = ThumbRating.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    thumbRating = null;
                    break;
                }
                thumbRating = values[i2];
                if (thumbRating.e() == i) {
                    break;
                }
                i2++;
            }
            if (thumbRating != null) {
                return thumbRating;
            }
            throw new IllegalArgumentException("wrong digital value: " + i);
        }
    }
}
