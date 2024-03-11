package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Map;
import o.AbstractC0941Im;
import o.C1045Mp;
import o.C8627dsp;
import o.C8632dsu;
import o.C9688vC;
import o.InterfaceC0952Ix;
import o.InterfaceC5153btQ;
import o.InterfaceC5159btW;
import o.InterfaceC8319diD;

/* loaded from: classes5.dex */
public final class ListOfProfileIconsImpl extends AbstractC0941Im implements InterfaceC8319diD, InterfaceC0952Ix, InterfaceC5153btQ {
    public static final Companion Companion = new Companion(null);
    private static final String ROW_ICONS = "icons";
    private static final String ROW_IMAGE_URL = "rowImageUrl";
    private static final String ROW_TITLE = "rowTitle";
    @SerializedName(ROW_ICONS)
    private ArrayList<InterfaceC5159btW> profileIcons;
    @SerializedName(ROW_IMAGE_URL)
    private String rowImageUrl;
    @SerializedName(ROW_TITLE)
    private String rowTitle;

    @Override // o.InterfaceC5153btQ
    public ArrayList<InterfaceC5159btW> getProfileIcons() {
        return this.profileIcons;
    }

    @Override // o.InterfaceC5153btQ
    public String getRowImageUrl() {
        return this.rowImageUrl;
    }

    @Override // o.InterfaceC5153btQ
    public String getRowTitle() {
        return this.rowTitle;
    }

    public void setProfileIcons(ArrayList<InterfaceC5159btW> arrayList) {
        this.profileIcons = arrayList;
    }

    public void setRowImageUrl(String str) {
        this.rowImageUrl = str;
    }

    public void setRowTitle(String str) {
        this.rowTitle = str;
    }

    /* loaded from: classes5.dex */
    public static final class Companion extends C1045Mp {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
            super("ListOfProfileIconsImpl");
        }
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        C8632dsu.c((Object) jsonElement, "");
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        Companion.getLogTag();
        for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
            C8632dsu.d(entry);
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (key != null) {
                int hashCode = key.hashCode();
                if (hashCode != -165870066) {
                    if (hashCode != 33263774) {
                        if (hashCode == 100029210 && key.equals(ROW_ICONS)) {
                            setProfileIcons(ProfileIconImpl.Companion.asList(value.getAsJsonArray()));
                        }
                    } else if (key.equals(ROW_TITLE)) {
                        C8632dsu.d(value);
                        setRowTitle(C9688vC.c(value));
                    }
                } else if (key.equals(ROW_IMAGE_URL)) {
                    C8632dsu.d(value);
                    setRowImageUrl(C9688vC.c(value));
                }
            }
        }
    }
}
