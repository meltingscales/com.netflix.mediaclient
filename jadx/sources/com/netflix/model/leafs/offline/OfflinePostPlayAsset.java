package com.netflix.model.leafs.offline;

import com.netflix.model.leafs.PostPlayAsset;

/* loaded from: classes5.dex */
class OfflinePostPlayAsset implements PostPlayAsset {
    private String assetType;
    private int height;
    private boolean isBadged;
    private String tone;
    private PostPlayAsset.Type type;
    private String url;
    private int width;

    private void setUrl(String str) {
        this.url = str;
    }

    @Override // com.netflix.model.leafs.PostPlayAsset
    public String getAssetType() {
        return this.assetType;
    }

    @Override // com.netflix.model.leafs.PostPlayAsset
    public int getHeight() {
        return this.height;
    }

    @Override // com.netflix.model.leafs.PostPlayAsset
    public String getTone() {
        return this.tone;
    }

    @Override // com.netflix.model.leafs.PostPlayAsset
    public PostPlayAsset.Type getType() {
        return this.type;
    }

    @Override // com.netflix.model.leafs.PostPlayAsset
    public String getUrl() {
        return this.url;
    }

    @Override // com.netflix.model.leafs.PostPlayAsset
    public int getWidth() {
        return this.width;
    }

    @Override // com.netflix.model.leafs.PostPlayAsset
    public boolean isBadged() {
        return this.isBadged;
    }

    public void setAssetType(String str) {
        this.assetType = str;
    }

    public void setBadged(boolean z) {
        this.isBadged = z;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setTone(String str) {
        this.tone = str;
    }

    public void setType(PostPlayAsset.Type type) {
        this.type = type;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public OfflinePostPlayAsset(String str) {
        this(PostPlayAsset.Type.DISPLAY_ART);
        setUrl(str);
    }

    private OfflinePostPlayAsset(PostPlayAsset.Type type) {
        this.width = 0;
        this.height = 0;
        this.isBadged = false;
        this.type = type;
    }
}
