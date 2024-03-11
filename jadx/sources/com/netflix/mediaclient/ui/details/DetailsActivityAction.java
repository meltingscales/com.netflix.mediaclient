package com.netflix.mediaclient.ui.details;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class DetailsActivityAction {
    private static final /* synthetic */ InterfaceC8598drn f;
    private static final /* synthetic */ DetailsActivityAction[] h;
    public static final DetailsActivityAction a = new DetailsActivityAction("AddToMyList", 0);
    public static final DetailsActivityAction i = new DetailsActivityAction("RemoveFromMyList", 1);
    public static final DetailsActivityAction j = new DetailsActivityAction("RemindMe", 2);
    public static final DetailsActivityAction c = new DetailsActivityAction("Download", 3);
    public static final DetailsActivityAction d = new DetailsActivityAction("Like", 4);
    public static final DetailsActivityAction b = new DetailsActivityAction("Dislike", 5);
    public static final DetailsActivityAction e = new DetailsActivityAction("Love", 6);

    private static final /* synthetic */ DetailsActivityAction[] a() {
        return new DetailsActivityAction[]{a, i, j, c, d, b, e};
    }

    public static DetailsActivityAction valueOf(String str) {
        return (DetailsActivityAction) Enum.valueOf(DetailsActivityAction.class, str);
    }

    public static DetailsActivityAction[] values() {
        return (DetailsActivityAction[]) h.clone();
    }

    private DetailsActivityAction(String str, int i2) {
    }

    static {
        DetailsActivityAction[] a2 = a();
        h = a2;
        f = C8600drp.e(a2);
    }
}
