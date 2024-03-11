package com.netflix.mediaclient.servicemgr.interface_.offline;

/* loaded from: classes4.dex */
public enum WatchState {
    UNKNOWN(-1),
    NOT_WATCHABLE_DUE_TO_NOT_ENOUGH_DATA(1),
    WATCHING_ALLOWED(2),
    LICENSE_EXPIRED(3),
    PLAY_WINDOW_EXPIRED_BUT_RENEWABLE(5),
    PLAY_WINDOW_EXPIRED_FINAL(6),
    VIEW_WINDOW_EXPIRED(7),
    GEO_BLOCKED(8);
    
    private final int f;

    /* loaded from: classes4.dex */
    public enum Simplified {
        NOT_AVAILABLE,
        EXPIRED,
        EXPIRING
    }

    public int a() {
        return this.f;
    }

    public boolean b() {
        return this == LICENSE_EXPIRED || this == PLAY_WINDOW_EXPIRED_BUT_RENEWABLE;
    }

    WatchState(int i) {
        this.f = i;
    }

    public static WatchState c(int i) {
        WatchState[] values;
        for (WatchState watchState : values()) {
            if (watchState.a() == i) {
                return watchState;
            }
        }
        return UNKNOWN;
    }

    public boolean c() {
        return a() != WATCHING_ALLOWED.a();
    }

    /* renamed from: com.netflix.mediaclient.servicemgr.interface_.offline.WatchState$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[WatchState.values().length];
            b = iArr;
            try {
                iArr[WatchState.WATCHING_ALLOWED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[WatchState.LICENSE_EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[WatchState.PLAY_WINDOW_EXPIRED_FINAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[WatchState.VIEW_WINDOW_EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[WatchState.GEO_BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public Simplified d() {
        int i = AnonymousClass3.b[ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4) {
                return Simplified.EXPIRED;
            }
            if (i != 5) {
                return null;
            }
            return Simplified.NOT_AVAILABLE;
        }
        return Simplified.EXPIRING;
    }
}
