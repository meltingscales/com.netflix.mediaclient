package com.netflix.mediaclient.service.player.bladerunnerclient.volley;

import com.netflix.mediaclient.StatusCode;

/* loaded from: classes3.dex */
public enum ClientActionFromLase {
    NO_ACTION(0),
    ACQUIRE_NEW_LICENSE(1),
    DELETE_LICENSES(2),
    MARK_PLAYABLE(3),
    DELETE_CONTENT_ON_REVOCATION(4);
    
    private final int i;

    public int c() {
        return this.i;
    }

    ClientActionFromLase(int i) {
        this.i = i;
    }

    /* renamed from: com.netflix.mediaclient.service.player.bladerunnerclient.volley.ClientActionFromLase$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ClientActionFromLase.values().length];
            a = iArr;
            try {
                iArr[ClientActionFromLase.NO_ACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ClientActionFromLase.ACQUIRE_NEW_LICENSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ClientActionFromLase.DELETE_LICENSES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ClientActionFromLase.MARK_PLAYABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ClientActionFromLase.DELETE_CONTENT_ON_REVOCATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public StatusCode b() {
        int i = AnonymousClass2.a[ordinal()];
        if (i != 2) {
            if (i == 5) {
                return StatusCode.DL_ENCODES_DELETE_ON_REVOCATION;
            }
            return StatusCode.OK;
        }
        return StatusCode.OFFLINE_LICENSE_FETCH_NEW;
    }

    public static ClientActionFromLase a(int i) {
        ClientActionFromLase[] values;
        for (ClientActionFromLase clientActionFromLase : values()) {
            if (clientActionFromLase.i == i) {
                return clientActionFromLase;
            }
        }
        return NO_ACTION;
    }
}
