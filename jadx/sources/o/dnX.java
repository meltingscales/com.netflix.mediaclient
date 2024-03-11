package o;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.yuyakaido.android.cardstackview.Direction;
import com.yuyakaido.android.cardstackview.Duration;

/* loaded from: classes5.dex */
public class dnX implements dnY {
    private final Direction a;
    private final int c;
    private final Interpolator e;

    @Override // o.dnY
    public Interpolator a() {
        return this.e;
    }

    @Override // o.dnY
    public Direction b() {
        return this.a;
    }

    @Override // o.dnY
    public int c() {
        return this.c;
    }

    private dnX(Direction direction, int i, Interpolator interpolator) {
        this.a = direction;
        this.c = i;
        this.e = interpolator;
    }

    /* loaded from: classes5.dex */
    public static class e {
        private Direction c = Direction.Bottom;
        private int e = Duration.Normal.c;
        private Interpolator d = new DecelerateInterpolator();

        public dnX c() {
            return new dnX(this.c, this.e, this.d);
        }
    }
}
