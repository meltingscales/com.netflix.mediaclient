package o;

import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import kotlin.NotImplementedError;
import o.C2287adR;

/* loaded from: classes3.dex */
public final class aDE implements ContextualText {
    public static final a e = new a(null);
    private final C2287adR b;

    public aDE(C2287adR c2287adR) {
        this.b = c2287adR;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.ContextualText
    public String text() {
        C2287adR.e e2;
        C2287adR c2287adR = this.b;
        if (c2287adR == null || (e2 = c2287adR.e()) == null) {
            return null;
        }
        return e2.a();
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.ContextualText
    public String evidenceKey() {
        C2287adR.e e2;
        C2287adR c2287adR = this.b;
        if (c2287adR == null || (e2 = c2287adR.e()) == null) {
            return null;
        }
        return e2.e();
    }

    @Override // o.InterfaceC8321diF
    public void setExpires(Long l) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC8321diF
    public boolean needsRefresh(long j) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC8323diH
    public long getTimestamp() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC8323diH
    public void setTimestamp(long j) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final ContextualText e(ContextualText.TextContext textContext, C2287adR c2287adR) {
            C8632dsu.c((Object) c2287adR, "");
            ContextualText.TextContext textContext2 = ContextualText.TextContext.b;
            if (textContext != textContext2) {
                if ((textContext != null ? textContext.e() : null) != textContext2) {
                    throw new IllegalArgumentException("Unsupported context: " + textContext);
                }
            }
            return new aDE(c2287adR);
        }
    }
}
