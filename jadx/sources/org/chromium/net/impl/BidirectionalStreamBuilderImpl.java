package org.chromium.net.impl;

import android.annotation.SuppressLint;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;

/* loaded from: classes6.dex */
public class BidirectionalStreamBuilderImpl extends ExperimentalBidirectionalStream.Builder {
    private final BidirectionalStream.Callback mCallback;
    private final CronetEngineBase mCronetEngine;
    private boolean mDelayRequestHeadersUntilFirstFlush;
    private final Executor mExecutor;
    private Collection<Object> mRequestAnnotations;
    private int mTrafficStatsTag;
    private boolean mTrafficStatsTagSet;
    private int mTrafficStatsUid;
    private boolean mTrafficStatsUidSet;
    private final String mUrl;
    private final ArrayList<Map.Entry<String, String>> mRequestHeaders = new ArrayList<>();
    private String mHttpMethod = "POST";
    private int mPriority = 3;
    private long mNetworkHandle = -1;

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder
    public ExperimentalBidirectionalStream.Builder bindToNetwork(long j) {
        this.mNetworkHandle = j;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public BidirectionalStreamBuilderImpl delayRequestHeadersUntilFirstFlush(boolean z) {
        this.mDelayRequestHeadersUntilFirstFlush = z;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public BidirectionalStreamBuilderImpl setPriority(int i) {
        this.mPriority = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public ExperimentalBidirectionalStream.Builder setTrafficStatsTag(int i) {
        this.mTrafficStatsTagSet = true;
        this.mTrafficStatsTag = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public ExperimentalBidirectionalStream.Builder setTrafficStatsUid(int i) {
        this.mTrafficStatsUidSet = true;
        this.mTrafficStatsUid = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BidirectionalStreamBuilderImpl(String str, BidirectionalStream.Callback callback, Executor executor, CronetEngineBase cronetEngineBase) {
        if (str == null) {
            throw new NullPointerException("URL is required.");
        }
        if (callback == null) {
            throw new NullPointerException("Callback is required.");
        }
        if (executor == null) {
            throw new NullPointerException("Executor is required.");
        }
        if (cronetEngineBase == null) {
            throw new NullPointerException("CronetEngine is required.");
        }
        this.mUrl = str;
        this.mCallback = callback;
        this.mExecutor = executor;
        this.mCronetEngine = cronetEngineBase;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public BidirectionalStreamBuilderImpl setHttpMethod(String str) {
        if (str != null) {
            this.mHttpMethod = str;
            return this;
        }
        throw new NullPointerException("Method is required.");
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public BidirectionalStreamBuilderImpl addHeader(String str, String str2) {
        if (str != null) {
            if (str2 == null) {
                throw new NullPointerException("Invalid header value.");
            }
            this.mRequestHeaders.add(new AbstractMap.SimpleImmutableEntry(str, str2));
            return this;
        }
        throw new NullPointerException("Invalid header name.");
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public ExperimentalBidirectionalStream.Builder addRequestAnnotation(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Invalid metrics annotation.");
        }
        if (this.mRequestAnnotations == null) {
            this.mRequestAnnotations = new ArrayList();
        }
        this.mRequestAnnotations.add(obj);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    @SuppressLint({"WrongConstant"})
    public ExperimentalBidirectionalStream build() {
        return this.mCronetEngine.createBidirectionalStream(this.mUrl, this.mCallback, this.mExecutor, this.mHttpMethod, this.mRequestHeaders, this.mPriority, this.mDelayRequestHeadersUntilFirstFlush, this.mRequestAnnotations, this.mTrafficStatsTagSet, this.mTrafficStatsTag, this.mTrafficStatsUidSet, this.mTrafficStatsUid, this.mNetworkHandle);
    }
}
