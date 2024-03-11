package o;

import com.netflix.mediaclient.graphql.models.type.SubtitleColor;
import com.netflix.mediaclient.graphql.models.type.SubtitleEdgeAttribute;
import com.netflix.mediaclient.graphql.models.type.SubtitleFontStyle;
import com.netflix.mediaclient.graphql.models.type.SubtitleSize;
import com.netflix.mediaclient.graphql.models.type.SubtitleTextOpacity;
import o.AbstractC8997hK;

/* renamed from: o.aut  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3224aut {
    private final AbstractC8997hK<SubtitleColor> a;
    private final AbstractC8997hK<SubtitleTextOpacity> b;
    private final AbstractC8997hK<SubtitleSize> c;
    private final AbstractC8997hK<SubtitleColor> d;
    private final AbstractC8997hK<SubtitleEdgeAttribute> e;
    private final AbstractC8997hK<SubtitleFontStyle> g;

    public C3224aut() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final AbstractC8997hK<SubtitleEdgeAttribute> a() {
        return this.e;
    }

    public final AbstractC8997hK<SubtitleSize> b() {
        return this.c;
    }

    public final AbstractC8997hK<SubtitleColor> c() {
        return this.d;
    }

    public final AbstractC8997hK<SubtitleColor> d() {
        return this.a;
    }

    public final AbstractC8997hK<SubtitleTextOpacity> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3224aut) {
            C3224aut c3224aut = (C3224aut) obj;
            return C8632dsu.c(this.d, c3224aut.d) && C8632dsu.c(this.b, c3224aut.b) && C8632dsu.c(this.e, c3224aut.e) && C8632dsu.c(this.a, c3224aut.a) && C8632dsu.c(this.c, c3224aut.c) && C8632dsu.c(this.g, c3224aut.g);
        }
        return false;
    }

    public final AbstractC8997hK<SubtitleFontStyle> h() {
        return this.g;
    }

    public int hashCode() {
        return (((((((((this.d.hashCode() * 31) + this.b.hashCode()) * 31) + this.e.hashCode()) * 31) + this.a.hashCode()) * 31) + this.c.hashCode()) * 31) + this.g.hashCode();
    }

    public String toString() {
        AbstractC8997hK<SubtitleColor> abstractC8997hK = this.d;
        AbstractC8997hK<SubtitleTextOpacity> abstractC8997hK2 = this.b;
        AbstractC8997hK<SubtitleEdgeAttribute> abstractC8997hK3 = this.e;
        AbstractC8997hK<SubtitleColor> abstractC8997hK4 = this.a;
        AbstractC8997hK<SubtitleSize> abstractC8997hK5 = this.c;
        AbstractC8997hK<SubtitleFontStyle> abstractC8997hK6 = this.g;
        return "SubtitleTextInput(color=" + abstractC8997hK + ", opacity=" + abstractC8997hK2 + ", edgeAttribute=" + abstractC8997hK3 + ", edgeColor=" + abstractC8997hK4 + ", size=" + abstractC8997hK5 + ", style=" + abstractC8997hK6 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3224aut(AbstractC8997hK<? extends SubtitleColor> abstractC8997hK, AbstractC8997hK<? extends SubtitleTextOpacity> abstractC8997hK2, AbstractC8997hK<? extends SubtitleEdgeAttribute> abstractC8997hK3, AbstractC8997hK<? extends SubtitleColor> abstractC8997hK4, AbstractC8997hK<? extends SubtitleSize> abstractC8997hK5, AbstractC8997hK<? extends SubtitleFontStyle> abstractC8997hK6) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        C8632dsu.c((Object) abstractC8997hK3, "");
        C8632dsu.c((Object) abstractC8997hK4, "");
        C8632dsu.c((Object) abstractC8997hK5, "");
        C8632dsu.c((Object) abstractC8997hK6, "");
        this.d = abstractC8997hK;
        this.b = abstractC8997hK2;
        this.e = abstractC8997hK3;
        this.a = abstractC8997hK4;
        this.c = abstractC8997hK5;
        this.g = abstractC8997hK6;
    }

    public /* synthetic */ C3224aut(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, AbstractC8997hK abstractC8997hK3, AbstractC8997hK abstractC8997hK4, AbstractC8997hK abstractC8997hK5, AbstractC8997hK abstractC8997hK6, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2, (i & 4) != 0 ? AbstractC8997hK.e.c : abstractC8997hK3, (i & 8) != 0 ? AbstractC8997hK.e.c : abstractC8997hK4, (i & 16) != 0 ? AbstractC8997hK.e.c : abstractC8997hK5, (i & 32) != 0 ? AbstractC8997hK.e.c : abstractC8997hK6);
    }
}
