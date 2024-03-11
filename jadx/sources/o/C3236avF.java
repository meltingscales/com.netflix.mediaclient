package o;

import com.netflix.mediaclient.graphql.models.type.UXConfigDeviceLevel;
import com.netflix.mediaclient.graphql.models.type.UXConfigDeviceResolution;
import java.util.List;
import o.AbstractC8997hK;

/* renamed from: o.avF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3236avF {
    private final AbstractC8997hK<C3235avE> a;
    private final AbstractC8997hK<List<String>> b;
    private final AbstractC8997hK<UXConfigDeviceLevel> c;
    private final AbstractC8997hK<UXConfigDeviceResolution> e;

    public C3236avF() {
        this(null, null, null, null, 15, null);
    }

    public final AbstractC8997hK<UXConfigDeviceResolution> a() {
        return this.e;
    }

    public final AbstractC8997hK<List<String>> b() {
        return this.b;
    }

    public final AbstractC8997hK<UXConfigDeviceLevel> c() {
        return this.c;
    }

    public final AbstractC8997hK<C3235avE> d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3236avF) {
            C3236avF c3236avF = (C3236avF) obj;
            return C8632dsu.c(this.e, c3236avF.e) && C8632dsu.c(this.c, c3236avF.c) && C8632dsu.c(this.a, c3236avF.a) && C8632dsu.c(this.b, c3236avF.b);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.e.hashCode() * 31) + this.c.hashCode()) * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        AbstractC8997hK<UXConfigDeviceResolution> abstractC8997hK = this.e;
        AbstractC8997hK<UXConfigDeviceLevel> abstractC8997hK2 = this.c;
        AbstractC8997hK<C3235avE> abstractC8997hK3 = this.a;
        AbstractC8997hK<List<String>> abstractC8997hK4 = this.b;
        return "UXConfigGeneralPropertiesInput(resolution=" + abstractC8997hK + ", level=" + abstractC8997hK2 + ", hawkins=" + abstractC8997hK3 + ", installedApps=" + abstractC8997hK4 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3236avF(AbstractC8997hK<? extends UXConfigDeviceResolution> abstractC8997hK, AbstractC8997hK<? extends UXConfigDeviceLevel> abstractC8997hK2, AbstractC8997hK<C3235avE> abstractC8997hK3, AbstractC8997hK<? extends List<String>> abstractC8997hK4) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        C8632dsu.c((Object) abstractC8997hK3, "");
        C8632dsu.c((Object) abstractC8997hK4, "");
        this.e = abstractC8997hK;
        this.c = abstractC8997hK2;
        this.a = abstractC8997hK3;
        this.b = abstractC8997hK4;
    }

    public /* synthetic */ C3236avF(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, AbstractC8997hK abstractC8997hK3, AbstractC8997hK abstractC8997hK4, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2, (i & 4) != 0 ? AbstractC8997hK.e.c : abstractC8997hK3, (i & 8) != 0 ? AbstractC8997hK.e.c : abstractC8997hK4);
    }
}
