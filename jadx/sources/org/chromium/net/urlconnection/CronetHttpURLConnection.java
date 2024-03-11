package org.chromium.net.urlconnection;

import android.net.TrafficStats;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes6.dex */
public class CronetHttpURLConnection extends HttpURLConnection {
    private static final String TAG = "CronetHttpURLConnection";
    private final CronetEngine mCronetEngine;
    private IOException mException;
    private boolean mHasResponseHeadersOrCompleted;
    private CronetInputStream mInputStream;
    private final MessageLoop mMessageLoop;
    private boolean mOnRedirectCalled;
    private CronetOutputStream mOutputStream;
    private UrlRequest mRequest;
    private final List<Pair<String, String>> mRequestHeaders;
    private List<Map.Entry<String, String>> mResponseHeadersList;
    private Map<String, List<String>> mResponseHeadersMap;
    private UrlResponseInfo mResponseInfo;
    private int mTrafficStatsTag;
    private boolean mTrafficStatsTagSet;
    private int mTrafficStatsUid;
    private boolean mTrafficStatsUidSet;

    private long getStreamingModeContentLength() {
        long j = ((HttpURLConnection) this).fixedContentLength;
        long j2 = ((HttpURLConnection) this).fixedContentLengthLong;
        return j2 != -1 ? j2 : j;
    }

    private boolean isChunkedUpload() {
        return ((HttpURLConnection) this).chunkLength > 0;
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return false;
    }

    public CronetHttpURLConnection(URL url, CronetEngine cronetEngine) {
        super(url);
        this.mCronetEngine = cronetEngine;
        this.mMessageLoop = new MessageLoop();
        this.mInputStream = new CronetInputStream(this);
        this.mRequestHeaders = new ArrayList();
    }

    @Override // java.net.URLConnection
    public void connect() {
        getOutputStream();
        startRequest();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        if (((HttpURLConnection) this).connected) {
            this.mRequest.cancel();
        }
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        getResponse();
        return this.mResponseInfo.getHttpStatusText();
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        getResponse();
        return this.mResponseInfo.getHttpStatusCode();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        try {
            getResponse();
            return getAllHeaders();
        } catch (IOException unused) {
            return Collections.emptyMap();
        }
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        try {
            getResponse();
            Map<String, List<String>> allHeaders = getAllHeaders();
            if (allHeaders.containsKey(str)) {
                List<String> list = allHeaders.get(str);
                return list.get(list.size() - 1);
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        Map.Entry<String, String> headerFieldEntry = getHeaderFieldEntry(i);
        if (headerFieldEntry == null) {
            return null;
        }
        return headerFieldEntry.getKey();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        Map.Entry<String, String> headerFieldEntry = getHeaderFieldEntry(i);
        if (headerFieldEntry == null) {
            return null;
        }
        return headerFieldEntry.getValue();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        getResponse();
        if (!((HttpURLConnection) this).instanceFollowRedirects && this.mOnRedirectCalled) {
            throw new IOException("Cannot read response body of a redirect.");
        }
        if (this.mResponseInfo.getHttpStatusCode() < 400) {
            return this.mInputStream;
        }
        throw new FileNotFoundException(((HttpURLConnection) this).url.toString());
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        if (this.mOutputStream == null && ((HttpURLConnection) this).doOutput) {
            if (((HttpURLConnection) this).connected) {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            }
            if (isChunkedUpload()) {
                this.mOutputStream = new CronetChunkedOutputStream(this, ((HttpURLConnection) this).chunkLength, this.mMessageLoop);
                startRequest();
            } else {
                long streamingModeContentLength = getStreamingModeContentLength();
                if (streamingModeContentLength != -1) {
                    this.mOutputStream = new CronetFixedModeOutputStream(this, streamingModeContentLength, this.mMessageLoop);
                    startRequest();
                } else {
                    Log.d(TAG, "Outputstream is being buffered in memory.");
                    String requestProperty = getRequestProperty("Content-Length");
                    if (requestProperty == null) {
                        this.mOutputStream = new CronetBufferedOutputStream(this);
                    } else {
                        this.mOutputStream = new CronetBufferedOutputStream(this, Long.parseLong(requestProperty));
                    }
                }
            }
        }
        return this.mOutputStream;
    }

    private void startRequest() {
        if (((HttpURLConnection) this).connected) {
            return;
        }
        ExperimentalUrlRequest.Builder builder = (ExperimentalUrlRequest.Builder) this.mCronetEngine.newUrlRequestBuilder(getURL().toString(), new CronetUrlRequestCallback(), this.mMessageLoop);
        if (((HttpURLConnection) this).doOutput) {
            if (((HttpURLConnection) this).method.equals("GET")) {
                ((HttpURLConnection) this).method = "POST";
            }
            CronetOutputStream cronetOutputStream = this.mOutputStream;
            if (cronetOutputStream != null) {
                builder.setUploadDataProvider(cronetOutputStream.getUploadDataProvider(), (Executor) this.mMessageLoop);
                if (getRequestProperty("Content-Length") == null && !isChunkedUpload()) {
                    addRequestProperty("Content-Length", Long.toString(this.mOutputStream.getUploadDataProvider().getLength()));
                }
                this.mOutputStream.setConnected();
            } else if (getRequestProperty("Content-Length") == null) {
                addRequestProperty("Content-Length", "0");
            }
            if (getRequestProperty("Content-Type") == null) {
                addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            }
        }
        for (Pair<String, String> pair : this.mRequestHeaders) {
            builder.addHeader((String) pair.first, (String) pair.second);
        }
        if (!getUseCaches()) {
            builder.disableCache();
        }
        builder.setHttpMethod(((HttpURLConnection) this).method);
        if (checkTrafficStatsTag()) {
            builder.setTrafficStatsTag(this.mTrafficStatsTag);
        }
        if (checkTrafficStatsUid()) {
            builder.setTrafficStatsUid(this.mTrafficStatsUid);
        }
        ExperimentalUrlRequest build = builder.build();
        this.mRequest = build;
        build.start();
        ((HttpURLConnection) this).connected = true;
    }

    private boolean checkTrafficStatsTag() {
        if (this.mTrafficStatsTagSet) {
            return true;
        }
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        if (threadStatsTag != -1) {
            this.mTrafficStatsTag = threadStatsTag;
            this.mTrafficStatsTagSet = true;
        }
        return this.mTrafficStatsTagSet;
    }

    private boolean checkTrafficStatsUid() {
        int threadStatsUid;
        if (this.mTrafficStatsUidSet) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        threadStatsUid = TrafficStats.getThreadStatsUid();
        if (threadStatsUid != -1) {
            this.mTrafficStatsUid = threadStatsUid;
            this.mTrafficStatsUidSet = true;
        }
        return this.mTrafficStatsUidSet;
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        try {
            getResponse();
            if (this.mResponseInfo.getHttpStatusCode() >= 400) {
                return this.mInputStream;
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        setRequestPropertyInternal(str, str2, false);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        setRequestPropertyInternal(str, str2, true);
    }

    private final void setRequestPropertyInternal(String str, String str2, boolean z) {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException("Cannot modify request property after connection is made.");
        }
        int findRequestProperty = findRequestProperty(str);
        if (findRequestProperty >= 0) {
            if (z) {
                this.mRequestHeaders.remove(findRequestProperty);
            } else {
                throw new UnsupportedOperationException("Cannot add multiple headers of the same key, " + str + ". crbug.com/432719.");
            }
        }
        this.mRequestHeaders.add(Pair.create(str, str2));
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException("Cannot access request headers after connection is set.");
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Pair<String, String> pair : this.mRequestHeaders) {
            if (treeMap.containsKey(pair.first)) {
                throw new IllegalStateException("Should not have multiple values.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add((String) pair.second);
            treeMap.put((String) pair.first, Collections.unmodifiableList(arrayList));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        int findRequestProperty = findRequestProperty(str);
        if (findRequestProperty >= 0) {
            return (String) this.mRequestHeaders.get(findRequestProperty).second;
        }
        return null;
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i) {
        Log.d(TAG, "setConnectTimeout is not supported by CronetHttpURLConnection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getMoreData(ByteBuffer byteBuffer) {
        this.mRequest.read(byteBuffer);
        this.mMessageLoop.loop(getReadTimeout());
    }

    private int findRequestProperty(String str) {
        for (int i = 0; i < this.mRequestHeaders.size(); i++) {
            if (((String) this.mRequestHeaders.get(i).first).equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class CronetUrlRequestCallback extends UrlRequest.Callback {
        public CronetUrlRequestCallback() {
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            CronetHttpURLConnection.this.mHasResponseHeadersOrCompleted = true;
            CronetHttpURLConnection.this.mMessageLoop.quit();
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
            CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            CronetHttpURLConnection.this.mMessageLoop.quit();
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
            CronetHttpURLConnection.this.mOnRedirectCalled = true;
            try {
                URL url = new URL(str);
                boolean equals = url.getProtocol().equals(((HttpURLConnection) CronetHttpURLConnection.this).url.getProtocol());
                if (((HttpURLConnection) CronetHttpURLConnection.this).instanceFollowRedirects) {
                    ((HttpURLConnection) CronetHttpURLConnection.this).url = url;
                }
                if (((HttpURLConnection) CronetHttpURLConnection.this).instanceFollowRedirects && equals) {
                    CronetHttpURLConnection.this.mRequest.followRedirect();
                    return;
                }
            } catch (MalformedURLException unused) {
            }
            CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            CronetHttpURLConnection.this.mRequest.cancel();
            setResponseDataCompleted(null);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            setResponseDataCompleted(null);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
            if (cronetException == null) {
                throw new IllegalStateException("Exception cannot be null in onFailed.");
            }
            CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            setResponseDataCompleted(cronetException);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            setResponseDataCompleted(new IOException("disconnect() called"));
        }

        private void setResponseDataCompleted(IOException iOException) {
            CronetHttpURLConnection.this.mException = iOException;
            if (CronetHttpURLConnection.this.mInputStream != null) {
                CronetHttpURLConnection.this.mInputStream.setResponseDataCompleted(iOException);
            }
            if (CronetHttpURLConnection.this.mOutputStream != null) {
                CronetHttpURLConnection.this.mOutputStream.setRequestCompleted(iOException);
            }
            CronetHttpURLConnection.this.mHasResponseHeadersOrCompleted = true;
            CronetHttpURLConnection.this.mMessageLoop.quit();
        }
    }

    private void getResponse() {
        CronetOutputStream cronetOutputStream = this.mOutputStream;
        if (cronetOutputStream != null) {
            cronetOutputStream.checkReceivedEnoughContent();
            if (isChunkedUpload()) {
                this.mOutputStream.close();
            }
        }
        if (!this.mHasResponseHeadersOrCompleted) {
            startRequest();
            this.mMessageLoop.loop();
        }
        checkHasResponseHeaders();
    }

    private void checkHasResponseHeaders() {
        if (!this.mHasResponseHeadersOrCompleted) {
            throw new IllegalStateException("No response.");
        }
        IOException iOException = this.mException;
        if (iOException != null) {
            throw iOException;
        }
        if (this.mResponseInfo == null) {
            throw new NullPointerException("Response info is null when there is no exception.");
        }
    }

    private Map.Entry<String, String> getHeaderFieldEntry(int i) {
        try {
            getResponse();
            List<Map.Entry<String, String>> allHeadersAsList = getAllHeadersAsList();
            if (i >= allHeadersAsList.size()) {
                return null;
            }
            return allHeadersAsList.get(i);
        } catch (IOException unused) {
            return null;
        }
    }

    private Map<String, List<String>> getAllHeaders() {
        Map<String, List<String>> map = this.mResponseHeadersMap;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry<String, String> entry : getAllHeadersAsList()) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add(entry.getValue());
            treeMap.put(entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        Map<String, List<String>> unmodifiableMap = Collections.unmodifiableMap(treeMap);
        this.mResponseHeadersMap = unmodifiableMap;
        return unmodifiableMap;
    }

    private List<Map.Entry<String, String>> getAllHeadersAsList() {
        List<Map.Entry<String, String>> list = this.mResponseHeadersList;
        if (list != null) {
            return list;
        }
        this.mResponseHeadersList = new ArrayList();
        for (Map.Entry<String, String> entry : this.mResponseInfo.getAllHeadersAsList()) {
            if (!entry.getKey().equalsIgnoreCase("Content-Encoding")) {
                this.mResponseHeadersList.add(new AbstractMap.SimpleImmutableEntry(entry));
            }
        }
        List<Map.Entry<String, String>> unmodifiableList = Collections.unmodifiableList(this.mResponseHeadersList);
        this.mResponseHeadersList = unmodifiableList;
        return unmodifiableList;
    }
}
