package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.netflix.model.leafs.advisory.ContentAdvisory;
import com.netflix.model.leafs.advisory.RatingDetails;

/* renamed from: o.bxa  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5375bxa implements InterfaceC1610aHr {
    public static final e b = new e(null);
    private final C5376bxb c = new C5376bxb();

    /* renamed from: o.bxa$e */
    /* loaded from: classes.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("AdvisoryModuleImpl");
        }

        public final void c() {
            C1332Xp.a(InterfaceC1610aHr.class, new C5375bxa());
        }
    }

    @Override // o.InterfaceC1610aHr
    public Drawable b(RatingDetails ratingDetails, boolean z) {
        C8632dsu.c((Object) ratingDetails, "");
        return this.c.d(ratingDetails, z);
    }

    @Override // o.InterfaceC1610aHr
    public View b(Context context, ContentAdvisory contentAdvisory, boolean z) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) contentAdvisory, "");
        return this.c.e(context, contentAdvisory, z);
    }

    @Override // o.InterfaceC1610aHr
    public View b(Context context, CharSequence charSequence, CharSequence charSequence2) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) charSequence, "");
        return this.c.b(context, charSequence, charSequence2);
    }
}
