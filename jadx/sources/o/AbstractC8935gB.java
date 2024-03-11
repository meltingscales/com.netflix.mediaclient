package o;

import android.content.Context;

/* renamed from: o.gB  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8935gB {

    /* renamed from: o.gB$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private final Context d;

        private b(Context context) {
            this.d = context;
        }

        public AbstractC8935gB b() {
            Context context = this.d;
            if (context == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            return new C8943gJ(context);
        }
    }

    public static b d(Context context) {
        return new b(context);
    }

    public abstract void a();

    public abstract C8939gF b();

    public abstract void b(InterfaceC8940gG interfaceC8940gG);
}
