package org.linphone.core;

import org.linphone.core.LinphoneAddress;

/* loaded from: classes6.dex */
public class LinphoneAddressImpl implements LinphoneAddress {
    protected final long nativePtr;

    /* loaded from: classes6.dex */
    public enum WrapMode {
        FromNew,
        FromConst,
        FromExisting
    }

    private native long clone(long j);

    private native String getDisplayName(long j);

    private native String getDomain(long j);

    private native int getPort(long j);

    private native int getTransport(long j);

    private native String getUserName(long j);

    private native long newLinphoneAddressImpl(String str, String str2);

    private native long ref(long j);

    private native void setDisplayName(long j, String str);

    private native void setDomain(long j, String str);

    private native void setPort(long j, int i);

    private native void setTransport(long j, int i);

    private native void setUserName(long j, String str);

    private native String toString(long j);

    private native String toUri(long j);

    private native void unref(long j);

    /* JADX INFO: Access modifiers changed from: protected */
    public LinphoneAddressImpl(String str) {
        long newLinphoneAddressImpl = newLinphoneAddressImpl(str, null);
        this.nativePtr = newLinphoneAddressImpl;
        if (newLinphoneAddressImpl != 0) {
            return;
        }
        throw new LinphoneCoreException("Cannot create LinphoneAdress from [" + str + "]");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public LinphoneAddressImpl(String str, String str2, String str3) {
        this.nativePtr = newLinphoneAddressImpl(null, str3);
        setUserName(str);
        setDomain(str2);
    }

    private LinphoneAddressImpl(long j) {
        this(j, WrapMode.FromConst);
    }

    /* renamed from: org.linphone.core.LinphoneAddressImpl$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$linphone$core$LinphoneAddressImpl$WrapMode;

        static {
            int[] iArr = new int[WrapMode.values().length];
            $SwitchMap$org$linphone$core$LinphoneAddressImpl$WrapMode = iArr;
            try {
                iArr[WrapMode.FromNew.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$linphone$core$LinphoneAddressImpl$WrapMode[WrapMode.FromConst.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$linphone$core$LinphoneAddressImpl$WrapMode[WrapMode.FromExisting.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public LinphoneAddressImpl(long j, WrapMode wrapMode) {
        int i = AnonymousClass1.$SwitchMap$org$linphone$core$LinphoneAddressImpl$WrapMode[wrapMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    this.nativePtr = 0L;
                    return;
                } else {
                    this.nativePtr = ref(j);
                    return;
                }
            }
            j = clone(j);
        }
        this.nativePtr = j;
    }

    protected void finalize() {
        long j = this.nativePtr;
        if (j != 0) {
            unref(j);
        }
    }

    @Override // org.linphone.core.LinphoneAddress
    public String getDisplayName() {
        return getDisplayName(this.nativePtr);
    }

    @Override // org.linphone.core.LinphoneAddress
    public String getDomain() {
        return getDomain(this.nativePtr);
    }

    @Override // org.linphone.core.LinphoneAddress
    public String getUserName() {
        return getUserName(this.nativePtr);
    }

    @Override // org.linphone.core.LinphoneAddress
    public LinphoneAddress.TransportType getTransport() {
        return LinphoneAddress.TransportType.fromInt(getTransport(this.nativePtr));
    }

    @Override // org.linphone.core.LinphoneAddress
    public int getPort() {
        return getPort(this.nativePtr);
    }

    @Override // org.linphone.core.LinphoneAddress
    public String toString() {
        return toString(this.nativePtr);
    }

    public String toUri() {
        return toUri(this.nativePtr);
    }

    @Override // org.linphone.core.LinphoneAddress
    public String asString() {
        return toString();
    }

    @Override // org.linphone.core.LinphoneAddress
    public String asStringUriOnly() {
        return toUri(this.nativePtr);
    }

    @Override // org.linphone.core.LinphoneAddress
    public void clean() {
        throw new RuntimeException("Not implemented");
    }

    @Override // org.linphone.core.LinphoneAddress
    public void setDisplayName(String str) {
        setDisplayName(this.nativePtr, str);
    }

    @Override // org.linphone.core.LinphoneAddress
    public void setDomain(String str) {
        setDomain(this.nativePtr, str);
    }

    @Override // org.linphone.core.LinphoneAddress
    public void setPort(int i) {
        setPort(this.nativePtr, i);
    }

    @Override // org.linphone.core.LinphoneAddress
    public void setUserName(String str) {
        setUserName(this.nativePtr, str);
    }

    @Override // org.linphone.core.LinphoneAddress
    public void setTransport(LinphoneAddress.TransportType transportType) {
        setTransport(this.nativePtr, transportType.toInt());
    }
}
