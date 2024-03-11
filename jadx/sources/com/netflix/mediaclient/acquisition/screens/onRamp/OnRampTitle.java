package com.netflix.mediaclient.acquisition.screens.onRamp;

import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class OnRampTitle {
    public static final int $stable = 8;
    private final String id;
    private boolean selected;
    private final String title;
    private final String url;

    public static /* synthetic */ OnRampTitle copy$default(OnRampTitle onRampTitle, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onRampTitle.id;
        }
        if ((i & 2) != 0) {
            str2 = onRampTitle.url;
        }
        if ((i & 4) != 0) {
            str3 = onRampTitle.title;
        }
        if ((i & 8) != 0) {
            z = onRampTitle.selected;
        }
        return onRampTitle.copy(str, str2, str3, z);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.title;
    }

    public final boolean component4() {
        return this.selected;
    }

    public final OnRampTitle copy(String str, String str2, String str3, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        return new OnRampTitle(str, str2, str3, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnRampTitle) {
            OnRampTitle onRampTitle = (OnRampTitle) obj;
            return C8632dsu.c((Object) this.id, (Object) onRampTitle.id) && C8632dsu.c((Object) this.url, (Object) onRampTitle.url) && C8632dsu.c((Object) this.title, (Object) onRampTitle.title) && this.selected == onRampTitle.selected;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.url.hashCode()) * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.selected);
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.url;
        String str3 = this.title;
        boolean z = this.selected;
        return "OnRampTitle(id=" + str + ", url=" + str2 + ", title=" + str3 + ", selected=" + z + ")";
    }

    public OnRampTitle(String str, String str2, String str3, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        this.id = str;
        this.url = str2;
        this.title = str3;
        this.selected = z;
    }

    public /* synthetic */ OnRampTitle(String str, String str2, String str3, boolean z, int i, C8627dsp c8627dsp) {
        this(str, str2, str3, (i & 8) != 0 ? false : z);
    }
}
