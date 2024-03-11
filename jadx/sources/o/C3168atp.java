package o;

import com.netflix.mediaclient.graphql.models.type.PinotSectionKind;
import com.netflix.mediaclient.graphql.models.type.PinotUnifiedEntityKind;
import java.util.List;

/* renamed from: o.atp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3168atp {
    private final List<PinotUnifiedEntityKind> a;
    private final PinotSectionKind c;

    public final List<PinotUnifiedEntityKind> a() {
        return this.a;
    }

    public final PinotSectionKind d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3168atp) {
            C3168atp c3168atp = (C3168atp) obj;
            return this.c == c3168atp.c && C8632dsu.c(this.a, c3168atp.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        PinotSectionKind pinotSectionKind = this.c;
        List<PinotUnifiedEntityKind> list = this.a;
        return "PinotSearchSectionCapabilityInput(sectionKind=" + pinotSectionKind + ", supportedEntityKinds=" + list + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3168atp(PinotSectionKind pinotSectionKind, List<? extends PinotUnifiedEntityKind> list) {
        C8632dsu.c((Object) pinotSectionKind, "");
        C8632dsu.c((Object) list, "");
        this.c = pinotSectionKind;
        this.a = list;
    }
}
