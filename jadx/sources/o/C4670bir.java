package o;

import com.netflix.mediaclient.service.net.NetworkType;

/* renamed from: o.bir  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4670bir extends C4598bhY {
    private final int c;
    private final int d;
    private final NetworkType e;

    public C4670bir(String str, int i, boolean z, boolean z2, String str2, NetworkType networkType, int i2, int i3) {
        super(str, i, z, z2, str2);
        this.e = networkType;
        this.c = i2;
        this.d = i3;
    }

    public boolean c() {
        return NetworkType.d(this.e);
    }

    public boolean a() {
        return NetworkType.a(this.e);
    }

    public boolean j() {
        return NetworkType.e(this.e);
    }
}
