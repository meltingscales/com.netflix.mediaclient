package com.netflix.model.leafs;

import com.netflix.model.leafs.VideoInfo;
import o.AbstractC0941Im;
import o.InterfaceC0952Ix;

/* loaded from: classes5.dex */
public final class SharingImpl extends AbstractC0941Im implements InterfaceC0952Ix, VideoInfo.Sharing {
    public String boxArtUrl;
    public String titleLogoUrl;
    public String verticalBillboardUrl;

    @Override // com.netflix.model.leafs.VideoInfo.Sharing
    public String getBoxArtUrl() {
        return this.boxArtUrl;
    }

    @Override // com.netflix.model.leafs.VideoInfo.Sharing
    public String getTitleLogoUrl() {
        return this.titleLogoUrl;
    }

    @Override // com.netflix.model.leafs.VideoInfo.Sharing
    public String getVerticalBillboardUrl() {
        return this.verticalBillboardUrl;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0066 A[SYNTHETIC] */
    @Override // o.InterfaceC0952Ix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void populate(com.google.gson.JsonElement r7) {
        /*
            r6 = this;
            com.google.gson.JsonObject r7 = r7.getAsJsonObject()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        Lc:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            com.google.gson.JsonElement r1 = (com.google.gson.JsonElement) r1
            boolean r2 = r1.isJsonNull()
            if (r2 != 0) goto Lc
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r0.hashCode()
            int r2 = r0.hashCode()
            r3 = -2127195066(0xffffffff81359446, float:-3.335083E-38)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L59
            r3 = 237517239(0xe2839b7, float:2.0735387E-30)
            if (r2 == r3) goto L4e
            r3 = 1072416332(0x3febc64c, float:1.841989)
            if (r2 == r3) goto L43
            goto L61
        L43:
            java.lang.String r2 = "titleLogoUrl"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L4c
            goto L61
        L4c:
            r0 = r4
            goto L64
        L4e:
            java.lang.String r2 = "boxArtUrl"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L57
            goto L61
        L57:
            r0 = r5
            goto L64
        L59:
            java.lang.String r2 = "verticalBillboardUrl"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L63
        L61:
            r0 = -1
            goto L64
        L63:
            r0 = 0
        L64:
            if (r0 == 0) goto L79
            if (r0 == r5) goto L72
            if (r0 == r4) goto L6b
            goto Lc
        L6b:
            java.lang.String r0 = r1.getAsString()
            r6.titleLogoUrl = r0
            goto Lc
        L72:
            java.lang.String r0 = r1.getAsString()
            r6.boxArtUrl = r0
            goto Lc
        L79:
            java.lang.String r0 = r1.getAsString()
            r6.verticalBillboardUrl = r0
            goto Lc
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.model.leafs.SharingImpl.populate(com.google.gson.JsonElement):void");
    }

    public String toString() {
        return "sharing {  verticalBillboardUrl: " + this.verticalBillboardUrl + "  titleLogoUrl: " + this.titleLogoUrl + "  boxArtUrl: " + this.boxArtUrl + "}";
    }
}
