package o;

import com.netflix.mediaclient.graphql.models.type.UXConfigPinotSectionKind;
import com.netflix.mediaclient.graphql.models.type.UXConfigPinotUnifiedEntityKind;
import java.util.List;

/* renamed from: o.awK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3294awK {
    private final List<UXConfigPinotUnifiedEntityKind> c;
    private final UXConfigPinotSectionKind d;

    public final List<UXConfigPinotUnifiedEntityKind> c() {
        return this.c;
    }

    public final UXConfigPinotSectionKind d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3294awK) {
            C3294awK c3294awK = (C3294awK) obj;
            return this.d == c3294awK.d && C8632dsu.c(this.c, c3294awK.c);
        }
        return false;
    }

    public int hashCode() {
        return (this.d.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        UXConfigPinotSectionKind uXConfigPinotSectionKind = this.d;
        List<UXConfigPinotUnifiedEntityKind> list = this.c;
        return "UXConfigPinotSearchSectionCapabilityInput(sectionKind=" + uXConfigPinotSectionKind + ", supportedEntityKinds=" + list + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3294awK(UXConfigPinotSectionKind uXConfigPinotSectionKind, List<? extends UXConfigPinotUnifiedEntityKind> list) {
        C8632dsu.c((Object) uXConfigPinotSectionKind, "");
        C8632dsu.c((Object) list, "");
        this.d = uXConfigPinotSectionKind;
        this.c = list;
    }
}
