package o;

import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.model.leafs.originals.BillboardCTA;
import com.netflix.model.leafs.originals.TagSummary;
import kotlin.NotImplementedError;
import o.C2312adq;

/* renamed from: o.aDy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1509aDy {
    /* JADX INFO: Access modifiers changed from: private */
    public static final BillboardCTA e(C2312adq.d dVar, int i) {
        if (dVar == null || dVar.c() == null) {
            return null;
        }
        return new e(dVar, i);
    }

    /* renamed from: o.aDy$e */
    /* loaded from: classes3.dex */
    public static final class e extends BillboardCTA {
        final /* synthetic */ C2312adq.d c;
        final /* synthetic */ int d;

        @Override // com.netflix.model.leafs.originals.BillboardCTA
        public String billboardPhase() {
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardCTA
        public String bookmarkPosition() {
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardCTA
        public String galleryId() {
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardCTA
        public int index() {
            return this.d;
        }

        @Override // com.netflix.model.leafs.originals.BillboardCTA
        public String sequenceNumber() {
            return null;
        }

        e(C2312adq.d dVar, int i) {
            this.c = dVar;
            this.d = i;
        }

        @Override // com.netflix.model.leafs.originals.BillboardCTA
        public String name() {
            return this.c.b();
        }

        @Override // com.netflix.model.leafs.originals.BillboardCTA
        public String type() {
            return this.c.e();
        }

        @Override // com.netflix.model.leafs.originals.BillboardCTA
        public String videoId() {
            return String.valueOf(this.c.c());
        }

        @Override // com.netflix.model.leafs.originals.BillboardCTA
        public boolean suppressPostPlay() {
            return C8632dsu.c(this.c.a(), Boolean.TRUE);
        }

        @Override // com.netflix.model.leafs.originals.BillboardCTA
        public boolean ignoreBookmark() {
            return C8632dsu.c(this.c.d(), Boolean.TRUE);
        }
    }

    /* renamed from: o.aDy$d */
    /* loaded from: classes3.dex */
    public static final class d implements TagSummary {
        final /* synthetic */ C2312adq.y a;

        d(C2312adq.y yVar) {
            this.a = yVar;
        }

        @Override // o.InterfaceC5178btp
        public String getId() {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // o.InterfaceC5178btp
        public String getTitle() {
            return this.a.b();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final TagSummary e(C2312adq.y yVar) {
        return new d(yVar);
    }
}
