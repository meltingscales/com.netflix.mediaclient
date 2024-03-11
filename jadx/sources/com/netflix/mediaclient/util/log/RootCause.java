package com.netflix.mediaclient.util.log;

/* loaded from: classes5.dex */
public enum RootCause {
    dnsTimeout,
    dnsLookupFailure,
    tcpConnectionTimeout,
    tcpNoRouteToHost,
    tcpConnectionRefusal,
    sslUntrustedCert,
    sslExpiredCert,
    sslNoCipher,
    sslHandshakeFailure,
    networkFailure,
    http4xx,
    http5xx,
    clientRequestBad,
    clientFailure,
    serverResponseBad,
    serverFailure,
    unknownFailure,
    handledException,
    unhandledException
}
