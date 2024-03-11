package o;

import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.util.ConnectivityUtils;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;

/* renamed from: o.bZl  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4187bZl {
    private final aKF b;
    private final Context c;
    public static final b d = new b(null);
    public static final int a = 8;

    @Inject
    public C4187bZl(@ApplicationContext Context context, aKF akf) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) akf, "");
        this.c = context;
        this.b = akf;
    }

    /* renamed from: o.bZl$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    public final boolean b(Intent intent, boolean z, boolean z2) {
        C8632dsu.c((Object) intent, "");
        return (z || !z2 || !ConnectivityUtils.l(this.c) || C8151dev.h() || this.b.a()) ? false : true;
    }
}
