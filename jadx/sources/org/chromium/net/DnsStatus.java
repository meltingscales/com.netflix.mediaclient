package org.chromium.net;

import java.net.InetAddress;
import java.util.List;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes5.dex */
public class DnsStatus {
    private final List<InetAddress> mDnsServers;
    private final boolean mPrivateDnsActive;
    private final String mPrivateDnsServerName;
    private final String mSearchDomains;

    @CalledByNative
    public boolean getPrivateDnsActive() {
        return this.mPrivateDnsActive;
    }

    @CalledByNative
    public String getPrivateDnsServerName() {
        return this.mPrivateDnsServerName;
    }

    @CalledByNative
    public String getSearchDomains() {
        return this.mSearchDomains;
    }

    public DnsStatus(List<InetAddress> list, boolean z, String str, String str2) {
        this.mDnsServers = list;
        this.mPrivateDnsActive = z;
        this.mPrivateDnsServerName = str == null ? "" : str;
        this.mSearchDomains = str2 == null ? "" : str2;
    }

    @CalledByNative
    public byte[][] getDnsServers() {
        byte[][] bArr = new byte[this.mDnsServers.size()];
        for (int i = 0; i < this.mDnsServers.size(); i++) {
            bArr[i] = this.mDnsServers.get(i).getAddress();
        }
        return bArr;
    }
}
