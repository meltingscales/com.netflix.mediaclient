package com.netflix.mediaclient.android.widget.recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import o.C1221Ti;
import o.C8600drp;
import o.C8632dsu;
import o.InterfaceC1225Tm;
import o.InterfaceC8598drn;

/* loaded from: classes3.dex */
public final class SnapOnScrollListener extends RecyclerView.OnScrollListener {
    private Behavior a;
    private final SnapHelper c;
    private int d;
    private InterfaceC1225Tm e;

    public SnapOnScrollListener(SnapHelper snapHelper, Behavior behavior, InterfaceC1225Tm interfaceC1225Tm) {
        C8632dsu.c((Object) snapHelper, "");
        C8632dsu.c((Object) behavior, "");
        this.c = snapHelper;
        this.a = behavior;
        this.e = interfaceC1225Tm;
        this.d = -1;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class Behavior {
        private static final /* synthetic */ Behavior[] a;
        private static final /* synthetic */ InterfaceC8598drn e;
        public static final Behavior d = new Behavior("NOTIFY_ON_SCROLL", 0);
        public static final Behavior c = new Behavior("NOTIFY_ON_SCROLL_STATE_IDLE", 1);

        private static final /* synthetic */ Behavior[] e() {
            return new Behavior[]{d, c};
        }

        public static Behavior valueOf(String str) {
            return (Behavior) Enum.valueOf(Behavior.class, str);
        }

        public static Behavior[] values() {
            return (Behavior[]) a.clone();
        }

        private Behavior(String str, int i) {
        }

        static {
            Behavior[] e2 = e();
            a = e2;
            e = C8600drp.e(e2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C8632dsu.c((Object) recyclerView, "");
        if (this.a == Behavior.d) {
            e(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C8632dsu.c((Object) recyclerView, "");
        if (this.a == Behavior.c && i == 0) {
            e(recyclerView);
        }
    }

    private final void e(RecyclerView recyclerView) {
        int e = C1221Ti.e(this.c, recyclerView);
        if (this.d != e) {
            InterfaceC1225Tm interfaceC1225Tm = this.e;
            if (interfaceC1225Tm != null) {
                interfaceC1225Tm.a(e);
            }
            this.d = e;
        }
    }
}
