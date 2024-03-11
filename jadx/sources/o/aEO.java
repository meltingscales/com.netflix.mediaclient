package o;

import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.model.leafs.originals.TagSummary;
import kotlin.NotImplementedError;
import o.C2635ajm;

/* loaded from: classes3.dex */
public final class aEO implements TagSummary {
    private final C2635ajm.d b;

    public aEO(C2635ajm.d dVar) {
        this.b = dVar;
    }

    @Override // o.InterfaceC5178btp
    public String getId() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5178btp
    public String getTitle() {
        C2635ajm.d dVar = this.b;
        if (dVar != null) {
            return dVar.e();
        }
        return null;
    }

    @Override // o.InterfaceC5178btp
    public LoMoType getType() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.netflix.model.leafs.originals.TagSummary
    public void setRank(int i) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.netflix.model.leafs.originals.TagSummary
    public int getRank() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.netflix.model.leafs.originals.TagSummary
    public int getPosition() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
