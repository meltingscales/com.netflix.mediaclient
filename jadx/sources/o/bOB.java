package o;

import com.netflix.mediaclient.android.widget.NetflixTagsTextView;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3895bOq;

/* loaded from: classes4.dex */
public abstract class bOB extends AbstractC3336ax<d> {
    public static final e b = new e(null);
    private List<String> d;

    @Override // o.AbstractC3073as
    public int a() {
        return C3895bOq.c.a;
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return i;
    }

    public final void b_(List<String> list) {
        this.d = list;
    }

    public final List<String> i() {
        return this.d;
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("GameMotionBillboardIconAndTitleModel");
        }
    }

    @Override // o.AbstractC3336ax
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        List<String> list = this.d;
        if (list != null && !list.isEmpty()) {
            dVar.e().setTags(list);
            dVar.e().setVisibility(0);
            return;
        }
        dVar.e().setVisibility(8);
    }

    /* loaded from: classes4.dex */
    public static final class d extends bIG {
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(d.class, "tags", "getTags()Lcom/netflix/mediaclient/android/widget/NetflixTagsTextView;", 0))};
        private final dsZ c = bIF.d(this, C3895bOq.b.ai, false, 2, null);

        public final NetflixTagsTextView e() {
            return (NetflixTagsTextView) this.c.getValue(this, e[0]);
        }
    }
}
