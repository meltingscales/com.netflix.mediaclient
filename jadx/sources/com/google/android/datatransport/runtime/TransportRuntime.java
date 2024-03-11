package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.Collections;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes2.dex */
public class TransportRuntime implements TransportInternal {
    private static volatile TransportRuntimeComponent instance;
    private final Clock eventClock;
    private final Scheduler scheduler;
    private final Uploader uploader;
    private final Clock uptimeClock;

    public Uploader getUploader() {
        return this.uploader;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Inject
    public TransportRuntime(Clock clock, Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        this.eventClock = clock;
        this.uptimeClock = clock2;
        this.scheduler = scheduler;
        this.uploader = uploader;
        workInitializer.ensureContextsScheduled();
    }

    public static void initialize(Context context) {
        if (instance == null) {
            synchronized (TransportRuntime.class) {
                if (instance == null) {
                    instance = DaggerTransportRuntimeComponent.builder().setApplicationContext(context).build();
                }
            }
        }
    }

    public static TransportRuntime getInstance() {
        TransportRuntimeComponent transportRuntimeComponent = instance;
        if (transportRuntimeComponent == null) {
            throw new IllegalStateException("Not initialized!");
        }
        return transportRuntimeComponent.getTransportRuntime();
    }

    public TransportFactory newFactory(Destination destination) {
        return new TransportFactoryImpl(getSupportedEncodings(destination), TransportContext.builder().setBackendName(destination.getName()).setExtras(destination.getExtras()).build(), this);
    }

    private static Set<Encoding> getSupportedEncodings(Destination destination) {
        if (destination instanceof EncodedDestination) {
            return Collections.unmodifiableSet(((EncodedDestination) destination).getSupportedEncodings());
        }
        return Collections.singleton(Encoding.of("proto"));
    }

    @Override // com.google.android.datatransport.runtime.TransportInternal
    public void send(SendRequest sendRequest, TransportScheduleCallback transportScheduleCallback) {
        this.scheduler.schedule(sendRequest.getTransportContext().withPriority(sendRequest.getEvent().getPriority()), convert(sendRequest), transportScheduleCallback);
    }

    private EventInternal convert(SendRequest sendRequest) {
        return EventInternal.builder().setEventMillis(this.eventClock.getTime()).setUptimeMillis(this.uptimeClock.getTime()).setTransportName(sendRequest.getTransportName()).setEncodedPayload(new EncodedPayload(sendRequest.getEncoding(), sendRequest.getPayload())).setCode(sendRequest.getEvent().getCode()).build();
    }
}
