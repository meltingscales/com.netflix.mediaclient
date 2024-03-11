package o;

import android.os.Bundle;
import com.netflix.mediaclient.ui.offline.ErrorDownloadSheetFragment;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;

/* renamed from: o.csU  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7239csU extends AbstractC8899fS<C7243csY> {
    public static final c c = new c(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public C7239csU(@Assisted C7243csY c7243csY) {
        super(c7243csY, null, 2, null);
        C8632dsu.c((Object) c7243csY, "");
    }

    /* renamed from: o.csU$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC8906fZ<C7239csU, C7243csY> {
        private final /* synthetic */ C1644aIy<C7239csU, C7243csY> d;

        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        public C7239csU create(AbstractC8979gt abstractC8979gt, C7243csY c7243csY) {
            C8632dsu.c((Object) abstractC8979gt, "");
            C8632dsu.c((Object) c7243csY, "");
            return this.d.create(abstractC8979gt, c7243csY);
        }

        private c() {
            this.d = new C1644aIy<>(C7239csU.class);
        }

        /* renamed from: initialState */
        public C7243csY m3183initialState(AbstractC8979gt abstractC8979gt) {
            C8632dsu.c((Object) abstractC8979gt, "");
            Object b = abstractC8979gt.b();
            C8632dsu.d(b);
            ErrorDownloadSheetFragment.b.c a = ErrorDownloadSheetFragment.e.a((Bundle) b);
            return new C7243csY(a.e(), a.c(), a.a());
        }
    }
}
