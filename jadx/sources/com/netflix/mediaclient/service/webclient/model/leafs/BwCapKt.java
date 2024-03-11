package com.netflix.mediaclient.service.webclient.model.leafs;

import com.netflix.mediaclient.service.player.StreamProfileType;
import o.C8632dsu;

/* loaded from: classes4.dex */
public final class BwCapKt {

    /* loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StreamProfileType.values().length];
            try {
                iArr[StreamProfileType.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StreamProfileType.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StreamProfileType.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StreamProfileType.a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StreamProfileType.f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final BwCap getBwCapForProfile(StreamProfileType streamProfileType, StreamProfileData streamProfileData) {
        C8632dsu.c((Object) streamProfileType, "");
        C8632dsu.c((Object) streamProfileData, "");
        int i = WhenMappings.$EnumSwitchMapping$0[streamProfileType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return streamProfileData.getLiveCellularCap();
                        }
                        return streamProfileData.getCe3CellularCap();
                    }
                    return streamProfileData.getCe4CellularCap();
                }
                return streamProfileData.getAv1CellularCap();
            }
            return streamProfileData.getCe3CellularCap();
        }
        return streamProfileData.getAl1CellularCap();
    }
}
