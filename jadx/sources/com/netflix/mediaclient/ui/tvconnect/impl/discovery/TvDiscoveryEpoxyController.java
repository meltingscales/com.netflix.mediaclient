package com.netflix.mediaclient.ui.tvconnect.impl.discovery;

import android.content.Context;
import com.airbnb.epoxy.Typed2EpoxyController;
import java.util.List;
import o.AbstractC6163cWe;
import o.C8627dsp;
import o.C8632dsu;
import o.C9935zP;
import o.bJH;
import o.cVR;

/* loaded from: classes6.dex */
public final class TvDiscoveryEpoxyController extends Typed2EpoxyController<AbstractC6163cWe, b> {
    private final Context context;
    private final C9935zP eventBusFactory;

    public final C9935zP getEventBusFactory() {
        return this.eventBusFactory;
    }

    public TvDiscoveryEpoxyController(C9935zP c9935zP, Context context) {
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) context, "");
        this.eventBusFactory = c9935zP;
        this.context = context;
    }

    /* loaded from: classes6.dex */
    public static final class b {
        private final boolean a;
        private final boolean c;
        private final List<cVR> d;

        public final boolean a() {
            return this.a;
        }

        public final List<cVR> c() {
            return this.d;
        }

        public final boolean e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c(this.d, bVar.d) && this.c == bVar.c && this.a == bVar.a;
            }
            return false;
        }

        public int hashCode() {
            return (((this.d.hashCode() * 31) + Boolean.hashCode(this.c)) * 31) + Boolean.hashCode(this.a);
        }

        public String toString() {
            List<cVR> list = this.d;
            boolean z = this.c;
            boolean z2 = this.a;
            return "Data(devices=" + list + ", dark=" + z + ", stopped=" + z2 + ")";
        }

        public b(List<cVR> list, boolean z, boolean z2) {
            C8632dsu.c((Object) list, "");
            this.d = list;
            this.c = z;
            this.a = z2;
        }

        public /* synthetic */ b(List list, boolean z, boolean z2, int i, C8627dsp c8627dsp) {
            this(list, z, (i & 4) != 0 ? false : z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public void buildModels(AbstractC6163cWe abstractC6163cWe, b bVar) {
        C8632dsu.c((Object) abstractC6163cWe, "");
        C8632dsu.c((Object) bVar, "");
        bJH.c(abstractC6163cWe, this, this.context, bVar);
    }
}
