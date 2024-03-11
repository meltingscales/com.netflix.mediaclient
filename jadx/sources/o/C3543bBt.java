package o;

import android.view.animation.AccelerateInterpolator;
import com.yuyakaido.android.cardstackview.Direction;
import com.yuyakaido.android.cardstackview.Duration;
import o.C8504doa;

/* renamed from: o.bBt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3543bBt {
    public static final C3535bBl d() {
        C8504doa.b b = new C8504doa.b().b(Direction.Left);
        Duration duration = Duration.Slow;
        C8504doa a = b.d(duration.c).b(new AccelerateInterpolator()).a();
        C8632dsu.a(a, "");
        C8504doa a2 = new C8504doa.b().b(Direction.Right).d(duration.c).b(new AccelerateInterpolator()).a();
        C8632dsu.a(a2, "");
        C8504doa a3 = new C8504doa.b().b(Direction.Bottom).d(duration.c).b(new AccelerateInterpolator()).a();
        C8632dsu.a(a3, "");
        return new C3535bBl(a, a2, a3);
    }
}
