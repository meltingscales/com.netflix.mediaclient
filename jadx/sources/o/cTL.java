package o;

import com.netflix.model.leafs.SearchPageEntity;
import o.C2502ahL;

/* loaded from: classes4.dex */
public class cTL implements SearchPageEntity {
    private final String a;
    private final C2502ahL.k b;

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

    public cTL(String str, C2502ahL.k kVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) kVar, "");
        this.a = str;
        this.b = kVar;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getEntityId() {
        return this.b.c();
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getUnifiedEntityId() {
        return this.b.c();
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getTitle() {
        return this.b.d();
    }
}
