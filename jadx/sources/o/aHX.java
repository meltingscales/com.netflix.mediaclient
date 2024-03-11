package o;

import com.netflix.mediaclient.net.NetflixCronetProvider;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.util.List;

@EntryPoint
@InstallIn({SingletonComponent.class})
/* loaded from: classes3.dex */
public interface aHX {
    List<NetflixCronetProvider.PreferredCronetProvider> as();
}
