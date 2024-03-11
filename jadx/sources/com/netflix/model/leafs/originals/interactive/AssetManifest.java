package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class AssetManifest implements Parcelable {
    public static final Parcelable.Creator<AssetManifest> CREATOR = new Parcelable.Creator<AssetManifest>() { // from class: com.netflix.model.leafs.originals.interactive.AssetManifest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AssetManifest createFromParcel(Parcel parcel) {
            return new AssetManifest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AssetManifest[] newArray(int i) {
            return new AssetManifest[i];
        }
    };
    final Map<String, Audio> audioMap;
    final Map<String, Image> imageMap;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<String, Image> getImageMap() {
        return this.imageMap;
    }

    public Collection<Image> images() {
        return this.imageMap.values();
    }

    public Collection<Audio> audioCollection() {
        return this.audioMap.values();
    }

    public Image getImage(String str) {
        return this.imageMap.get(str);
    }

    public Audio getAudio(String str) {
        return this.audioMap.get(str);
    }

    public AssetManifest merge(AssetManifest assetManifest) {
        if (assetManifest == null) {
            return this;
        }
        HashMap hashMap = new HashMap(assetManifest.imageMap);
        assetManifest.imageMap.putAll(this.imageMap);
        HashMap hashMap2 = new HashMap(assetManifest.audioMap);
        assetManifest.audioMap.putAll(this.audioMap);
        return new AssetManifest(hashMap, hashMap2);
    }

    public AssetManifest(Map<String, Image> map, Map<String, Audio> map2) {
        this.imageMap = map;
        this.audioMap = map2;
    }

    protected AssetManifest(Parcel parcel) {
        this.imageMap = new HashMap();
        this.audioMap = new HashMap();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.imageMap.put(parcel.readString(), (Image) parcel.readParcelable(Image.class.getClassLoader()));
        }
        int readInt2 = parcel.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.audioMap.put(parcel.readString(), (Audio) parcel.readParcelable(Audio.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.imageMap.size());
        for (Map.Entry<String, Image> entry : this.imageMap.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeParcelable(entry.getValue(), 0);
        }
        parcel.writeInt(this.audioMap.size());
        for (Map.Entry<String, Audio> entry2 : this.audioMap.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeParcelable(entry2.getValue(), 0);
        }
    }
}
