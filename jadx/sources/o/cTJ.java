package o;

import com.netflix.model.leafs.SearchPageEntity;
import o.C2502ahL;

/* loaded from: classes4.dex */
public class cTJ implements SearchPageEntity {
    private final String c;
    private final C2502ahL.o d;

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

    public cTJ(String str, C2502ahL.o oVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) oVar, "");
        this.c = str;
        this.d = oVar;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getEntityId() {
        return this.d.e();
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getUnifiedEntityId() {
        return this.d.e();
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getTitle() {
        return this.d.a();
    }
}
