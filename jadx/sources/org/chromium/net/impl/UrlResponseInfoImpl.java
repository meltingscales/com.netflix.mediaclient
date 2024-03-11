package org.chromium.net.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes6.dex */
public final class UrlResponseInfoImpl extends UrlResponseInfo {
    private final HeaderBlockImpl mHeaders;
    private final int mHttpStatusCode;
    private final String mHttpStatusText;
    private final String mNegotiatedProtocol;
    private final String mProxyServer;
    private final AtomicLong mReceivedByteCount;
    private final List<String> mResponseInfoUrlChain;
    private final boolean mWasCached;

    @Override // org.chromium.net.UrlResponseInfo
    public int getHttpStatusCode() {
        return this.mHttpStatusCode;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public String getHttpStatusText() {
        return this.mHttpStatusText;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public String getNegotiatedProtocol() {
        return this.mNegotiatedProtocol;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public String getProxyServer() {
        return this.mProxyServer;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public List<String> getUrlChain() {
        return this.mResponseInfoUrlChain;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public boolean wasCached() {
        return this.mWasCached;
    }

    /* loaded from: classes6.dex */
    public static final class HeaderBlockImpl extends UrlResponseInfo.HeaderBlock {
        private final List<Map.Entry<String, String>> mAllHeadersList;
        private Map<String, List<String>> mHeadersMap;

        @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
        public List<Map.Entry<String, String>> getAsList() {
            return this.mAllHeadersList;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public HeaderBlockImpl(List<Map.Entry<String, String>> list) {
            this.mAllHeadersList = list;
        }

        @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
        public Map<String, List<String>> getAsMap() {
            Map<String, List<String>> map = this.mHeadersMap;
            if (map != null) {
                return map;
            }
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (Map.Entry<String, String> entry : this.mAllHeadersList) {
                ArrayList arrayList = new ArrayList();
                if (treeMap.containsKey(entry.getKey())) {
                    arrayList.addAll((Collection) treeMap.get(entry.getKey()));
                }
                arrayList.add(entry.getValue());
                treeMap.put(entry.getKey(), Collections.unmodifiableList(arrayList));
            }
            Map<String, List<String>> unmodifiableMap = Collections.unmodifiableMap(treeMap);
            this.mHeadersMap = unmodifiableMap;
            return unmodifiableMap;
        }
    }

    public UrlResponseInfoImpl(List<String> list, int i, String str, List<Map.Entry<String, String>> list2, boolean z, String str2, String str3, long j) {
        this.mResponseInfoUrlChain = Collections.unmodifiableList(list);
        this.mHttpStatusCode = i;
        this.mHttpStatusText = str;
        this.mHeaders = new HeaderBlockImpl(Collections.unmodifiableList(list2));
        this.mWasCached = z;
        this.mNegotiatedProtocol = str2;
        this.mProxyServer = str3;
        this.mReceivedByteCount = new AtomicLong(j);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public String getUrl() {
        List<String> list = this.mResponseInfoUrlChain;
        return list.get(list.size() - 1);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public List<Map.Entry<String, String>> getAllHeadersAsList() {
        return this.mHeaders.getAsList();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public Map<String, List<String>> getAllHeaders() {
        return this.mHeaders.getAsMap();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public long getReceivedByteCount() {
        return this.mReceivedByteCount.get();
    }

    public String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String url = getUrl();
        String obj = getUrlChain().toString();
        int httpStatusCode = getHttpStatusCode();
        String httpStatusText = getHttpStatusText();
        String obj2 = getAllHeadersAsList().toString();
        boolean wasCached = wasCached();
        return String.format(locale, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", hexString, url, obj, Integer.valueOf(httpStatusCode), httpStatusText, obj2, Boolean.valueOf(wasCached), getNegotiatedProtocol(), getProxyServer(), Long.valueOf(getReceivedByteCount()));
    }

    public void setReceivedByteCount(long j) {
        this.mReceivedByteCount.set(j);
    }
}
