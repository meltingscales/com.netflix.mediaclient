package o;

import com.netflix.model.leafs.SearchPageEntity;
import o.C2492ahB;

/* loaded from: classes4.dex */
public class cTM implements SearchPageEntity {
    private final C2492ahB.e b;
    private final String c;

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

    public cTM(String str, C2492ahB.e eVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) eVar, "");
        this.c = str;
        this.b = eVar;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getEntityId() {
        return this.b.b();
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getUnifiedEntityId() {
        return this.b.b();
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getTitle() {
        return this.b.d();
    }
}
