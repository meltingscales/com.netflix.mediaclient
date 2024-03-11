package o;

import com.netflix.mediaclient.util.gfx.ImageLoader;
import java.io.File;
import javax.inject.Inject;

/* renamed from: o.dgB  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8211dgB implements InterfaceC8260dgy {
    private final InterfaceC8230dgU b;

    @Inject
    public C8211dgB(InterfaceC8230dgU interfaceC8230dgU) {
        C8632dsu.c((Object) interfaceC8230dgU, "");
        this.b = interfaceC8230dgU;
    }

    @Override // o.InterfaceC8260dgy
    public ImageLoader e(C9865xz c9865xz, int i, long j, File file) {
        C8632dsu.c((Object) c9865xz, "");
        C8632dsu.c((Object) file, "");
        return new C8298dhj(this.b, c9865xz, i, j, file);
    }
}
