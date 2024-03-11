package com.netflix.mediaclient.cdx.api;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class Rating {
    private static final /* synthetic */ InterfaceC8598drn c;
    private static final /* synthetic */ Rating[] h;
    private final int i;
    public static final Rating a = new Rating("RemoveRating", 0, 0);
    public static final Rating b = new Rating("ThumbDown", 1, 1);
    public static final Rating d = new Rating("ThumbUp", 2, 2);
    public static final Rating e = new Rating("ThumbWayUp", 3, 3);

    private static final /* synthetic */ Rating[] a() {
        return new Rating[]{a, b, d, e};
    }

    public static Rating valueOf(String str) {
        return (Rating) Enum.valueOf(Rating.class, str);
    }

    public static Rating[] values() {
        return (Rating[]) h.clone();
    }

    public final int c() {
        return this.i;
    }

    private Rating(String str, int i, int i2) {
        this.i = i2;
    }

    static {
        Rating[] a2 = a();
        h = a2;
        c = C8600drp.e(a2);
    }
}
