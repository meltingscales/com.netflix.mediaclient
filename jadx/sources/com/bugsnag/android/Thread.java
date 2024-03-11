package com.bugsnag.android;

import java.lang.Thread;
import java.util.List;
import o.C9246lv;
import o.C9278ma;
import o.C9279mb;
import o.C9288mk;
import o.InterfaceC9200lB;

/* loaded from: classes2.dex */
public class Thread implements C9246lv.a {
    private final InterfaceC9200lB c;
    private final C9288mk e;

    public Thread(String str, String str2, ErrorType errorType, boolean z, State state, C9278ma c9278ma, InterfaceC9200lB interfaceC9200lB) {
        this.e = new C9288mk(str, str2, errorType, z, state.e(), c9278ma);
        this.c = interfaceC9200lB;
    }

    public Thread(C9288mk c9288mk, InterfaceC9200lB interfaceC9200lB) {
        this.e = c9288mk;
        this.c = interfaceC9200lB;
    }

    public boolean c() {
        return this.e.b();
    }

    public List<C9279mb> d() {
        return this.e.d();
    }

    @Override // o.C9246lv.a
    public void toStream(C9246lv c9246lv) {
        this.e.toStream(c9246lv);
    }

    /* loaded from: classes2.dex */
    public enum State {
        NEW("NEW"),
        BLOCKED("BLOCKED"),
        RUNNABLE("RUNNABLE"),
        TERMINATED("TERMINATED"),
        TIMED_WAITING("TIMED_WAITING"),
        WAITING("WAITING"),
        UNKNOWN("UNKNOWN");
        
        private final String j;

        public String e() {
            return this.j;
        }

        State(String str) {
            this.j = str;
        }

        public static State b(java.lang.Thread thread) {
            return b(thread.getState());
        }

        private static State b(Thread.State state) {
            switch (AnonymousClass2.b[state.ordinal()]) {
                case 1:
                    return NEW;
                case 2:
                    return BLOCKED;
                case 3:
                    return RUNNABLE;
                case 4:
                    return TERMINATED;
                case 5:
                    return TIMED_WAITING;
                case 6:
                    return WAITING;
                default:
                    return UNKNOWN;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bugsnag.android.Thread$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Thread.State.values().length];
            b = iArr;
            try {
                iArr[Thread.State.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[Thread.State.BLOCKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[Thread.State.RUNNABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[Thread.State.TERMINATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[Thread.State.TIMED_WAITING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[Thread.State.WAITING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }
}
