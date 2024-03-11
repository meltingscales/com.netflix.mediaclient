package o;

import com.netflix.model.leafs.SearchPageEntity;
import o.C2416afo;

/* loaded from: classes4.dex */
public class cTU implements SearchPageEntity {
    private final String a;
    private final C2416afo.x e;

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getBoxartId() {
        return null;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getDisplayHeader() {
        return null;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public boolean getEnableTitleGroupTreatment() {
        return false;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getEntityType() {
        return "";
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getImageUrl() {
        return null;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getPreQueryBoxartId() {
        return null;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getPreQueryImgUrl() {
        return null;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getVideoId() {
        return null;
    }

    public cTU(String str, C2416afo.x xVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) xVar, "");
        this.a = str;
        this.e = xVar;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getEntityId() {
        return this.e.e();
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getUnifiedEntityId() {
        return this.e.e();
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getTitle() {
        return this.e.c();
    }
}
