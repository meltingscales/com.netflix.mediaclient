package com.netflix.mediaclient.acquisition.lib.rdid;

import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public abstract class RdidDeviceConsentState {
    public /* synthetic */ RdidDeviceConsentState(C8627dsp c8627dsp) {
        this();
    }

    private RdidDeviceConsentState() {
    }

    /* loaded from: classes3.dex */
    public static final class Approved extends RdidDeviceConsentState {
        private final String rdid;

        public static /* synthetic */ Approved copy$default(Approved approved, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = approved.rdid;
            }
            return approved.copy(str);
        }

        public final String component1() {
            return this.rdid;
        }

        public final Approved copy(String str) {
            C8632dsu.c((Object) str, "");
            return new Approved(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Approved) && C8632dsu.c((Object) this.rdid, (Object) ((Approved) obj).rdid);
        }

        public final String getRdid() {
            return this.rdid;
        }

        public int hashCode() {
            return this.rdid.hashCode();
        }

        public String toString() {
            String str = this.rdid;
            return "Approved(rdid=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Approved(String str) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.rdid = str;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Denied extends RdidDeviceConsentState {
        public static final Denied INSTANCE = new Denied();

        private Denied() {
            super(null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Undetermined extends RdidDeviceConsentState {
        public static final Undetermined INSTANCE = new Undetermined();

        private Undetermined() {
            super(null);
        }
    }
}
