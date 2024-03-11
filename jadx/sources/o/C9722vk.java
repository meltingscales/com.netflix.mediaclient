package o;

import com.netflix.mediaclient.util.gfx.ImageLoader;

/* renamed from: o.vk  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9722vk implements ImageLoader.c {
    private final int a;
    private final int d;

    @Override // com.netflix.mediaclient.util.gfx.ImageLoader.c
    public int b() {
        return this.d;
    }

    @Override // com.netflix.mediaclient.util.gfx.ImageLoader.c
    public int d() {
        return this.a;
    }

    public C9722vk(int i, int i2) {
        this.a = i;
        this.d = i2;
    }

    public final boolean a() {
        return e();
    }

    @Override // com.netflix.mediaclient.util.gfx.ImageLoader.c
    public boolean e() {
        return d() != 0;
    }
}
