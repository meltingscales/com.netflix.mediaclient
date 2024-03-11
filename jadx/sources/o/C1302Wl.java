package o;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForBifFrames$2;
import com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1;
import dagger.hilt.android.scopes.ActivityScoped;
import java.nio.ByteBuffer;
import javax.inject.Inject;

@ActivityScoped
/* renamed from: o.Wl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1302Wl implements InterfaceC1285Vu {
    private final dwQ a;
    private final ComponentActivity d;
    private final InterfaceC8812dzl<VM> e;
    private final dwQ j;
    public static final c c = new c(null);
    private static final ColorDrawable b = new ColorDrawable(0);

    /* renamed from: o.Wl$d */
    /* loaded from: classes3.dex */
    public interface d {
        Drawable c(int i);
    }

    @Override // o.InterfaceC1285Vu
    public InterfaceC8822dzv<VM> d() {
        return this.e;
    }

    @Inject
    public C1302Wl(Activity activity, dwQ dwq, dwQ dwq2) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) dwq, "");
        C8632dsu.c((Object) dwq2, "");
        this.a = dwq;
        this.j = dwq2;
        this.d = (ComponentActivity) C9737vz.e(activity, ComponentActivity.class);
        this.e = dzB.d(new VM(null, 1, null));
    }

    /* renamed from: o.Wl$c */
    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("BifInfraImpl");
        }
    }

    @Override // o.InterfaceC1285Vu
    public VM b() {
        return this.e.b();
    }

    /* renamed from: o.Wl$a */
    /* loaded from: classes3.dex */
    public static final class a implements d {
        final /* synthetic */ C4332bcX b;
        final /* synthetic */ BitmapFactory.Options e;

        a(C4332bcX c4332bcX, BitmapFactory.Options options) {
            this.b = c4332bcX;
            this.e = options;
        }

        @Override // o.C1302Wl.d
        public Drawable c(int i) {
            ByteBuffer b = this.b.b(i);
            if (b != null) {
                try {
                    this.e.inBitmap = BitmapFactory.decodeByteArray(b.array(), b.position(), b.limit(), this.e);
                    if (this.e.inBitmap != null) {
                        return new BitmapDrawable(AbstractApplicationC1040Mh.getInstance().getResources(), this.e.inBitmap);
                    }
                } catch (IllegalArgumentException unused) {
                    c cVar = C1302Wl.c;
                }
            }
            return null;
        }
    }

    @Override // o.InterfaceC1285Vu
    public InterfaceC8822dzv<Drawable> e(InterfaceC8812dzl<Long> interfaceC8812dzl) {
        C8632dsu.c((Object) interfaceC8812dzl, "");
        InterfaceC8812dzl d2 = dzB.d(null);
        Lifecycle lifecycle = this.d.getLifecycle();
        C8632dsu.a(lifecycle, "");
        C8737dwr.c(LifecycleKt.getCoroutineScope(lifecycle), this.a, null, new BifInfraImpl$startListeningForSeekChanges$1(interfaceC8812dzl, d2, null), 2, null);
        return d2;
    }

    @Override // o.InterfaceC1285Vu
    public void d(InterfaceC8822dzv<? extends Drawable> interfaceC8822dzv) {
        C8632dsu.c((Object) interfaceC8822dzv, "");
        c.getLogTag();
        Lifecycle lifecycle = this.d.getLifecycle();
        C8632dsu.a(lifecycle, "");
        C8737dwr.c(LifecycleKt.getCoroutineScope(lifecycle), this.j, null, new BifInfraImpl$startListeningForBifFrames$2(interfaceC8822dzv, this, null), 2, null);
    }

    @Override // o.InterfaceC1285Vu
    public void e() {
        c.getLogTag();
        this.e.d(new VM(null, 1, null));
    }

    @Override // o.InterfaceC1285Vu
    public void d(String str) {
        if (str != null) {
            c.getLogTag();
            Object o2 = AbstractApplicationC1040Mh.getInstance().i().o();
            InterfaceC4942bpR interfaceC4942bpR = o2 instanceof InterfaceC4942bpR ? (InterfaceC4942bpR) o2 : null;
            if (interfaceC4942bpR != null) {
                C4332bcX c4332bcX = new C4332bcX(interfaceC4942bpR, str);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inMutable = true;
                C1317Xa.e.d(new a(c4332bcX, options));
                return;
            }
            return;
        }
        c.getLogTag();
    }
}
