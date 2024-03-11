package o;

import com.netflix.mediaclient.graphql.models.type.TextEvidenceClassification;
import com.netflix.mediaclient.servicemgr.interface_.SupplementalMessageType;
import com.netflix.model.leafs.TaglineMessage;
import kotlin.NoWhenBranchMatchedException;
import o.C2560aiQ;

/* loaded from: classes3.dex */
public final class aER implements TaglineMessage {
    private final C2560aiQ.c e;

    /* loaded from: classes3.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[TextEvidenceClassification.values().length];
            try {
                iArr[TextEvidenceClassification.g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextEvidenceClassification.j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextEvidenceClassification.k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextEvidenceClassification.b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TextEvidenceClassification.f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TextEvidenceClassification.l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TextEvidenceClassification.a.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TextEvidenceClassification.c.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TextEvidenceClassification.n.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TextEvidenceClassification.m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TextEvidenceClassification.h.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TextEvidenceClassification.d.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[TextEvidenceClassification.f13185o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[TextEvidenceClassification.i.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            c = iArr;
        }
    }

    public aER(C2560aiQ.c cVar) {
        C8632dsu.c((Object) cVar, "");
        this.e = cVar;
    }

    @Override // com.netflix.model.leafs.TaglineMessage
    public String getTagline() {
        return this.e.c();
    }

    @Override // com.netflix.model.leafs.TaglineMessage
    public SupplementalMessageType getClassification() {
        TextEvidenceClassification b = this.e.b();
        switch (b == null ? -1 : e.c[b.ordinal()]) {
            case -1:
                return SupplementalMessageType.l;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return SupplementalMessageType.g;
            case 2:
                return SupplementalMessageType.j;
            case 3:
                return SupplementalMessageType.s;
            case 4:
                return SupplementalMessageType.a;
            case 5:
                return SupplementalMessageType.m;
            case 6:
                return SupplementalMessageType.n;
            case 7:
                return SupplementalMessageType.b;
            case 8:
                return SupplementalMessageType.d;
            case 9:
                return SupplementalMessageType.k;
            case 10:
                return SupplementalMessageType.f13237o;
            case 11:
                return SupplementalMessageType.h;
            case 12:
                return SupplementalMessageType.i;
            case 13:
                return SupplementalMessageType.l;
            case 14:
                return SupplementalMessageType.f;
        }
    }
}
