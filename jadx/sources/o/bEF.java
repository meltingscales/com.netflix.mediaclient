package o;

import android.view.ViewGroup;
import android.view.Window;
import o.bEF;

/* loaded from: classes4.dex */
public final class bEF extends AbstractC9944zY<Object> implements bEE {
    public static final e e = new e(null);
    private final InterfaceC8554dpx b;
    private final ViewGroup d;

    @Override // o.AbstractC9944zY
    /* renamed from: i */
    public ViewGroup e() {
        return this.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bEF(ViewGroup viewGroup) {
        super(viewGroup);
        InterfaceC8554dpx b;
        C8632dsu.c((Object) viewGroup, "");
        this.d = viewGroup;
        b = dpB.b(new drO<Integer>() { // from class: com.netflix.mediaclient.ui.common.immersive.ImmersiveModeUIView$containerId$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final Integer invoke() {
                return Integer.valueOf(bEF.this.e().getId());
            }
        });
        this.b = b;
    }

    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    @Override // o.bEE
    public void e(Window window) {
        C8632dsu.c((Object) window, "");
        C8150deu.b(window);
    }

    @Override // o.bEE
    public void b(Window window) {
        C8632dsu.c((Object) window, "");
        C8150deu.a(window);
    }
}
