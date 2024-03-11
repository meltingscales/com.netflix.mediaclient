package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.model.leafs.originals.interactive.Moment;

/* loaded from: classes4.dex */
public abstract class cBZ extends ConstraintLayout {
    public static final e a = new e(null);
    private static final LinearInterpolator c = new LinearInterpolator();
    protected InterfaceC9638uF b;
    private boolean d;
    private final NetflixActivity e;
    protected Moment f;
    private aJY g;
    private int i;
    private cHR j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cBZ(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cBZ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(InterfaceC9638uF interfaceC9638uF) {
        C8632dsu.c((Object) interfaceC9638uF, "");
        this.b = interfaceC9638uF;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(aJY ajy) {
        this.g = ajy;
    }

    public abstract void e();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(Moment moment) {
        C8632dsu.c((Object) moment, "");
        this.f = moment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(cHR chr) {
        this.j = chr;
    }

    public abstract void l();

    public abstract void s();

    public final void setDebug(boolean z) {
        this.d = z;
    }

    public final void setSubtitleY(int i) {
        this.i = i;
    }

    public final cHR u() {
        return this.j;
    }

    public final int v() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final NetflixActivity w() {
        return this.e;
    }

    public final boolean x() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final aJY y() {
        return this.g;
    }

    public /* synthetic */ cBZ(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cBZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        this.e = (NetflixActivity) C8141del.d(context, NetflixActivity.class);
    }

    public final Moment q() {
        Moment moment = this.f;
        if (moment != null) {
            return moment;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC9638uF r() {
        InterfaceC9638uF interfaceC9638uF = this.b;
        if (interfaceC9638uF != null) {
            return interfaceC9638uF;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("BaseInteractiveScene");
        }

        public final LinearInterpolator a() {
            return cBZ.c;
        }
    }
}
