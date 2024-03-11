package o;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import com.yuyakaido.android.cardstackview.Direction;
import com.yuyakaido.android.cardstackview.Duration;

/* renamed from: o.doa  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8504doa implements dnY {
    private final Interpolator a;
    private final int d;
    private final Direction e;

    @Override // o.dnY
    public Interpolator a() {
        return this.a;
    }

    @Override // o.dnY
    public Direction b() {
        return this.e;
    }

    @Override // o.dnY
    public int c() {
        return this.d;
    }

    private C8504doa(Direction direction, int i, Interpolator interpolator) {
        this.e = direction;
        this.d = i;
        this.a = interpolator;
    }

    /* renamed from: o.doa$b */
    /* loaded from: classes5.dex */
    public static class b {
        private Direction a = Direction.Right;
        private int d = Duration.Normal.c;
        private Interpolator e = new AccelerateInterpolator();

        public b b(Interpolator interpolator) {
            this.e = interpolator;
            return this;
        }

        public b b(Direction direction) {
            this.a = direction;
            return this;
        }

        public b d(int i) {
            this.d = i;
            return this;
        }

        public C8504doa a() {
            return new C8504doa(this.a, this.d, this.e);
        }
    }
}
