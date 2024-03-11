package dagger.hilt.android.internal.builders;

import android.app.Service;
import dagger.BindsInstance;
import dagger.hilt.DefineComponent;
import dagger.hilt.android.components.ServiceComponent;

@DefineComponent.Builder
/* loaded from: classes5.dex */
public interface ServiceComponentBuilder {
    ServiceComponent build();

    ServiceComponentBuilder service(@BindsInstance Service service);
}
