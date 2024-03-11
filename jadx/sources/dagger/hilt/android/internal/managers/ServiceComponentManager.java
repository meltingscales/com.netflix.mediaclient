package dagger.hilt.android.internal.managers;

import android.app.Application;
import android.app.Service;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.Preconditions;

/* loaded from: classes.dex */
public final class ServiceComponentManager implements GeneratedComponentManager<Object> {
    private Object component;
    private final Service service;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes5.dex */
    public interface ServiceComponentBuilderEntryPoint {
        ServiceComponentBuilder serviceComponentBuilder();
    }

    public ServiceComponentManager(Service service) {
        this.service = service;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public Object generatedComponent() {
        if (this.component == null) {
            this.component = createComponent();
        }
        return this.component;
    }

    private Object createComponent() {
        Application application = this.service.getApplication();
        Preconditions.checkState(application instanceof GeneratedComponentManager, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
        return ((ServiceComponentBuilderEntryPoint) EntryPoints.get(application, ServiceComponentBuilderEntryPoint.class)).serviceComponentBuilder().service(this.service).build();
    }
}
