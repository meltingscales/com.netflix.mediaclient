package org.slf4j.helpers;

import org.slf4j.ILoggerFactory;
import org.slf4j.IMarkerFactory;
import org.slf4j.spi.MDCAdapter;
import org.slf4j.spi.SLF4JServiceProvider;

/* loaded from: classes5.dex */
public class SubstituteServiceProvider implements SLF4JServiceProvider {
    private final SubstituteLoggerFactory loggerFactory = new SubstituteLoggerFactory();
    private final IMarkerFactory markerFactory = new BasicMarkerFactory();
    private final MDCAdapter mdcAdapter = new BasicMDCAdapter();

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public ILoggerFactory getLoggerFactory() {
        return this.loggerFactory;
    }

    public SubstituteLoggerFactory getSubstituteLoggerFactory() {
        return this.loggerFactory;
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public void initialize() {
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public String getRequestedApiVersion() {
        throw new UnsupportedOperationException();
    }
}
