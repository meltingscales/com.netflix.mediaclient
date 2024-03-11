package org.slf4j.spi;

import org.slf4j.ILoggerFactory;

/* loaded from: classes5.dex */
public interface SLF4JServiceProvider {
    ILoggerFactory getLoggerFactory();

    String getRequestedApiVersion();

    void initialize();
}
