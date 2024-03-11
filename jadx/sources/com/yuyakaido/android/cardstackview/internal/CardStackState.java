package com.yuyakaido.android.cardstackview.internal;

import com.yuyakaido.android.cardstackview.Direction;

/* loaded from: classes5.dex */
public class CardStackState {
    public Boolean a;
    public Boolean g;
    public Status h = Status.Idle;
    public int f = 0;
    public int b = 0;
    public int e = 0;
    public int c = 0;
    public int j = 0;
    public int i = -1;
    public float d = 0.0f;

    public void b(Status status) {
        this.h = status;
    }

    public CardStackState() {
        Boolean bool = Boolean.FALSE;
        this.a = bool;
        this.g = bool;
    }

    /* renamed from: com.yuyakaido.android.cardstackview.internal.CardStackState$2  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[Status.values().length];
            e = iArr;
            try {
                iArr[Status.ManualSwipeAnimating.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[Status.AutomaticSwipeAnimating.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public enum Status {
        Idle,
        Dragging,
        RewindAnimating,
        AutomaticSwipeAnimating,
        AutomaticSwipeAnimated,
        ManualSwipeAnimating,
        ManualSwipeAnimated;

        public boolean a() {
            return this != Idle;
        }

        public boolean c() {
            return this == Dragging;
        }

        public boolean d() {
            return this == ManualSwipeAnimating || this == AutomaticSwipeAnimating;
        }

        public Status e() {
            int i = AnonymousClass2.e[ordinal()];
            return i != 1 ? i != 2 ? Idle : AutomaticSwipeAnimated : ManualSwipeAnimated;
        }
    }

    public Direction b() {
        if (Math.abs(this.c) < Math.abs(this.e)) {
            if (this.e < 0.0f) {
                return Direction.Left;
            }
            return Direction.Right;
        } else if (this.c < 0.0f) {
            return Direction.Top;
        } else {
            return Direction.Bottom;
        }
    }

    public float e() {
        float f;
        int i;
        int abs = Math.abs(this.e);
        int abs2 = Math.abs(this.c);
        if (abs < abs2) {
            f = abs2;
            i = this.b;
        } else {
            f = abs;
            i = this.f;
        }
        return Math.min(f / (i / 2.0f), 1.0f);
    }

    public boolean d() {
        if (!this.h.d() || this.j >= this.i) {
            return false;
        }
        return this.f < Math.abs(this.e) || this.b < Math.abs(this.c);
    }

    public boolean a(int i, int i2) {
        return i != this.j && i >= 0 && i2 >= i && !this.h.a();
    }
}
