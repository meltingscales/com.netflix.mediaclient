package o;

import com.netflix.mediaclient.ui.lightbox.api.LightBoxItem;
import java.util.ArrayList;
import o.C4199bZx;
import o.C8632dsu;
import o.InterfaceC8906fZ;

/* loaded from: classes4.dex */
public final class bZE extends C9943zX<C4199bZx> {
    public static final a e = new a(null);

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC8906fZ<bZE, C4199bZx> {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public bZE create(AbstractC8979gt abstractC8979gt, C4199bZx c4199bZx) {
            return (bZE) InterfaceC8906fZ.b.d(this, abstractC8979gt, c4199bZx);
        }

        /* renamed from: initialState */
        public C4199bZx m3169initialState(AbstractC8979gt abstractC8979gt) {
            C8632dsu.c((Object) abstractC8979gt, "");
            return new C4199bZx(null, 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bZE(C4199bZx c4199bZx) {
        super(c4199bZx);
        C8632dsu.c((Object) c4199bZx, "");
    }

    public final void e(final ArrayList<LightBoxItem> arrayList) {
        C8632dsu.c((Object) arrayList, "");
        b(new drM<C4199bZx, C4199bZx>() { // from class: com.netflix.mediaclient.ui.lightbox.impl.mvrx.LightBoxViewModel$setItems$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final C4199bZx invoke(C4199bZx c4199bZx) {
                C8632dsu.c((Object) c4199bZx, "");
                return c4199bZx.d(arrayList);
            }
        });
    }
}
