package o;

import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import javax.inject.Inject;

/* loaded from: classes4.dex */
public final class bSG {
    private final boolean a;
    private final boolean c;

    @EntryPoint
    @InstallIn({aFU.class})
    /* loaded from: classes4.dex */
    public interface e {
        bSG l();
    }

    public final boolean a() {
        return this.c;
    }

    public final boolean d() {
        return this.a;
    }

    @Inject
    public bSG(boolean z, boolean z2) {
        this.c = z;
        this.a = z2;
    }
}
