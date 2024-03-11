package o;

import android.content.Context;
import android.view.SurfaceHolder;
import com.netflix.mediaclient.service.player.common.NetflixCroppingMetadataEntry;

/* renamed from: o.aKk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class SurfaceHolder$CallbackC1684aKk extends AbstractC1678aKe implements SurfaceHolder.Callback {
    public static final b b = new b(null);
    private final InterfaceC1679aKf a;
    private NetflixCroppingMetadataEntry e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurfaceHolder$CallbackC1684aKk(Context context, InterfaceC1679aKf interfaceC1679aKf) {
        super(context);
        C8632dsu.c((Object) context, "");
        this.a = interfaceC1679aKf;
        b.getLogTag();
        getHolder().addCallback(this);
    }

    @Override // o.AbstractC1678aKe
    public void c() {
        if (getHolder() != null) {
            getHolder().removeCallback(this);
        }
    }

    /* renamed from: o.aKk$b */
    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("CropAwareSurface");
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        C8632dsu.c((Object) surfaceHolder, "");
        b.getLogTag();
        InterfaceC1679aKf interfaceC1679aKf = this.a;
        if (interfaceC1679aKf != null) {
            interfaceC1679aKf.c(this);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C8632dsu.c((Object) surfaceHolder, "");
        b.getLogTag();
        InterfaceC1679aKf interfaceC1679aKf = this.a;
        if (interfaceC1679aKf != null) {
            interfaceC1679aKf.e(this, i2, i3, this.e);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C8632dsu.c((Object) surfaceHolder, "");
        b.getLogTag();
        InterfaceC1679aKf interfaceC1679aKf = this.a;
        if (interfaceC1679aKf != null) {
            interfaceC1679aKf.b(this);
        }
    }
}
