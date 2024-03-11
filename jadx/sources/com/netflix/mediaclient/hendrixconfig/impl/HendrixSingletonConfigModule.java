package com.netflix.mediaclient.hendrixconfig.impl;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Provider;
import javax.inject.Singleton;
import o.AbstractC7773dEv;
import o.C1555aFq;
import o.C1563aFy;
import o.C8632dsu;
import o.InterfaceC1551aFm;
import o.aFB;
import o.dEB;
import o.dEG;
import o.dEI;
import o.dEP;
import o.drM;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes3.dex */
public final class HendrixSingletonConfigModule {
    @Provides
    public final boolean b(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Boolean) c1555aFq.b(c1555aFq.a(), "ads.pauseAdsEnabled", Boolean.FALSE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configAdsPauseAdsEnabled$1
            @Override // o.drM
            /* renamed from: b */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        })).booleanValue();
    }

    @Provides
    public final boolean a(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Boolean) c1555aFq.b(c1555aFq.a(), "deppProductization.isEnabled", Boolean.FALSE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configDeppProductizationIsEnabled$1
            @Override // o.drM
            /* renamed from: c */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        })).booleanValue();
    }

    @Provides
    public final boolean e(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Boolean) c1555aFq.b(c1555aFq.a(), "downloads.downloadLimitErrorCalenderMonthEnabled", Boolean.TRUE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configDownloadsDownloadLimitErrorCalenderMonthEnabled$1
            @Override // o.drM
            /* renamed from: b */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        })).booleanValue();
    }

    @Provides
    public final boolean d(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Boolean) c1555aFq.b(c1555aFq.a(), "downloads.isExpiredDownloadSheetEnabled", Boolean.FALSE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configDownloadsIsExpiredDownloadSheetEnabled$1
            @Override // o.drM
            /* renamed from: e */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        })).booleanValue();
    }

    @Provides
    public final boolean c(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Boolean) c1555aFq.b(c1555aFq.a(), "games.isGamesThumbsEnabled", Boolean.FALSE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configGamesIsGamesThumbsEnabled$1
            @Override // o.drM
            /* renamed from: b */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        })).booleanValue();
    }

    @Provides
    public final boolean j(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Boolean) c1555aFq.b(c1555aFq.a(), "graphql.graphqlManualChainedCacheEnabled", Boolean.TRUE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configGraphqlGraphqlManualChainedCacheEnabled$1
            @Override // o.drM
            /* renamed from: a */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        })).booleanValue();
    }

    @Provides
    public final long g(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Number) c1555aFq.b(c1555aFq.a(), "hendrix_migration_test.sampleLegacyUnstable", 42L, new drM<dEI, Long>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configHendrixMigrationTestSampleLegacyUnstable$1
            @Override // o.drM
            /* renamed from: b */
            public final Long invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.c(dei);
            }
        })).longValue();
    }

    @Provides
    @Reusable
    public final dEB a() {
        return dEG.d(AbstractC7773dEv.a.e("[\"hello\",\"world\"]"));
    }

    @Provides
    public final dEB a(C1555aFq c1555aFq, Provider<dEB> provider) {
        C8632dsu.c((Object) c1555aFq, "");
        C8632dsu.c((Object) provider, "");
        C1563aFy a = c1555aFq.a();
        dEB deb = provider.get();
        C8632dsu.a(deb, "");
        return (dEB) c1555aFq.b(a, "hendrixTest.sampleArray", deb, new drM<dEI, dEB>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configHendrixTestSampleArray$1
            @Override // o.drM
            /* renamed from: c */
            public final dEB invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.b(dei);
            }
        });
    }

    @Provides
    public final long c(C1555aFq c1555aFq, Provider<Long> provider) {
        C8632dsu.c((Object) c1555aFq, "");
        C8632dsu.c((Object) provider, "");
        C1563aFy f = c1555aFq.f();
        Long l = provider.get();
        C8632dsu.a(l, "");
        return ((Number) c1555aFq.b(f, "hendrixTest.sampleDynamicDefault", l, new drM<dEI, Long>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configHendrixTestSampleDynamicDefault$1
            @Override // o.drM
            /* renamed from: c */
            public final Long invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.c(dei);
            }
        })).longValue();
    }

    @Provides
    public final boolean h(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Boolean) c1555aFq.b(c1555aFq.f(), "hendrixTest.sampleEnabled", Boolean.TRUE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configHendrixTestSampleEnabled$1
            @Override // o.drM
            /* renamed from: e */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        })).booleanValue();
    }

    @Provides
    public final long c(C1555aFq c1555aFq, C1563aFy c1563aFy) {
        C8632dsu.c((Object) c1555aFq, "");
        C8632dsu.c((Object) c1563aFy, "");
        return ((Number) c1555aFq.b(c1563aFy, "hendrixTest.sampleGroup1", 9000L, new drM<dEI, Long>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configHendrixTestSampleGroup1$1
            @Override // o.drM
            /* renamed from: d */
            public final Long invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.c(dei);
            }
        })).longValue();
    }

    @Provides
    public final long e(C1555aFq c1555aFq, C1563aFy c1563aFy) {
        C8632dsu.c((Object) c1555aFq, "");
        C8632dsu.c((Object) c1563aFy, "");
        return ((Number) c1555aFq.b(c1563aFy, "hendrixTest.sampleGroup2", 9001L, new drM<dEI, Long>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configHendrixTestSampleGroup2$1
            @Override // o.drM
            /* renamed from: e */
            public final Long invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.c(dei);
            }
        })).longValue();
    }

    @Provides
    public final int i(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Number) c1555aFq.b(c1555aFq.f(), "hendrixTest.sampleInt", 42, new drM<dEI, Integer>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configHendrixTestSampleInt$1
            @Override // o.drM
            /* renamed from: e */
            public final Integer invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.e(dei);
            }
        })).intValue();
    }

    @Provides
    @Reusable
    public final dEP c() {
        return dEG.c(AbstractC7773dEv.a.e("{\"hello\":\"world\"}"));
    }

    @Provides
    public final dEP b(C1555aFq c1555aFq, Provider<dEP> provider) {
        C8632dsu.c((Object) c1555aFq, "");
        C8632dsu.c((Object) provider, "");
        C1563aFy a = c1555aFq.a();
        dEP dep = provider.get();
        C8632dsu.a(dep, "");
        return (dEP) c1555aFq.b(a, "hendrixTest.sampleObject", dep, new drM<dEI, dEP>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configHendrixTestSampleObject$1
            @Override // o.drM
            /* renamed from: b */
            public final dEP invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.a(dei);
            }
        });
    }

    @Provides
    @Singleton
    public final long o(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Number) c1555aFq.b(c1555aFq.i(), "hendrixTest.sampleSelf", 420L, new drM<dEI, Long>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configHendrixTestSampleSelf$1
            @Override // o.drM
            /* renamed from: e */
            public final Long invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.c(dei);
            }
        })).longValue();
    }

    @Provides
    public final String m(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return (String) c1555aFq.b(c1555aFq.f(), "hendrixTest.sampleString", "hello", new drM<dEI, String>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configHendrixTestSampleString$1
            @Override // o.drM
            /* renamed from: b */
            public final String invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.i(dei);
            }
        });
    }

    @Provides
    @Singleton
    public final InterfaceC1551aFm<Long> n(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return c1555aFq.d("hendrixTest.sampleVolatile", 1337L, new drM<dEI, Long>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configHendrixTestSampleVolatile$1
            @Override // o.drM
            /* renamed from: d */
            public final Long invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.c(dei);
            }
        });
    }

    @Provides
    public final long f(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Number) c1555aFq.b(c1555aFq.f(), "hendrixTestSampleNoGroup", 123L, new drM<dEI, Long>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configHendrixTestSampleNoGroup$1
            @Override // o.drM
            /* renamed from: b */
            public final Long invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.c(dei);
            }
        })).longValue();
    }

    @Provides
    public final boolean l(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Boolean) c1555aFq.b(c1555aFq.a(), "home.baselineLicencedBillboardUpdateEnabled", Boolean.TRUE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configHomeBaselineLicencedBillboardUpdateEnabled$1
            @Override // o.drM
            /* renamed from: a */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        })).booleanValue();
    }

    @Provides
    public final boolean k(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Boolean) c1555aFq.b(c1555aFq.a(), "home.serverColorThievingEnabled", Boolean.TRUE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configHomeServerColorThievingEnabled$1
            @Override // o.drM
            /* renamed from: a */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        })).booleanValue();
    }

    @Provides
    public final boolean q(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Boolean) c1555aFq.b(c1555aFq.a(), "insomnia.refreshConfigEnabled", Boolean.TRUE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configInsomniaRefreshConfigEnabled$1
            @Override // o.drM
            /* renamed from: a */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        })).booleanValue();
    }

    @Provides
    public final long s(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Number) c1555aFq.b(c1555aFq.a(), "insomnia.refreshConfigTimeInHours", 24L, new drM<dEI, Long>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configInsomniaRefreshConfigTimeInHours$1
            @Override // o.drM
            /* renamed from: a */
            public final Long invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.c(dei);
            }
        })).longValue();
    }

    @Provides
    @Reusable
    public final dEB b() {
        return dEG.d(AbstractC7773dEv.a.e("[\"KR\"]"));
    }

    @Provides
    public final dEB d(C1555aFq c1555aFq, Provider<dEB> provider) {
        C8632dsu.c((Object) c1555aFq, "");
        C8632dsu.c((Object) provider, "");
        C1563aFy a = c1555aFq.a();
        dEB deb = provider.get();
        C8632dsu.a(deb, "");
        return (dEB) c1555aFq.b(a, "localDiscovery.consentCountries", deb, new drM<dEI, dEB>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configLocalDiscoveryConsentCountries$1
            @Override // o.drM
            /* renamed from: c */
            public final dEB invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.b(dei);
            }
        });
    }

    @Provides
    public final boolean r(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Boolean) c1555aFq.b(c1555aFq.a(), "localDiscovery.consentEnabled", Boolean.TRUE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configLocalDiscoveryConsentEnabled$1
            @Override // o.drM
            /* renamed from: c */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        })).booleanValue();
    }

    @Provides
    public final boolean t(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Boolean) c1555aFq.b(c1555aFq.a(), "localDiscovery.liveDiscoveryEnabled", Boolean.TRUE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configLocalDiscoveryLiveDiscoveryEnabled$1
            @Override // o.drM
            /* renamed from: d */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        })).booleanValue();
    }

    @Provides
    @Reusable
    public final dEB d() {
        return dEG.d(AbstractC7773dEv.a.e("[\"native\",\"play\"]"));
    }

    @Provides
    public final dEB e(C1555aFq c1555aFq, Provider<dEB> provider) {
        C8632dsu.c((Object) c1555aFq, "");
        C8632dsu.c((Object) provider, "");
        C1563aFy a = c1555aFq.a();
        dEB deb = provider.get();
        C8632dsu.a(deb, "");
        return (dEB) c1555aFq.b(a, "net.preferredCronetProviders", deb, new drM<dEI, dEB>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configNetPreferredCronetProviders$1
            @Override // o.drM
            /* renamed from: d */
            public final dEB invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.b(dei);
            }
        });
    }

    @Provides
    public final boolean p(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Boolean) c1555aFq.b(c1555aFq.a(), "net.switchTestConfigEnabled", Boolean.FALSE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configNetSwitchTestConfigEnabled$1
            @Override // o.drM
            /* renamed from: d */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        })).booleanValue();
    }

    @Provides
    public final boolean u(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Boolean) c1555aFq.b(c1555aFq.a(), "nonMemberHome.signUpCopyLinkBannerEnabled", Boolean.FALSE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configNonMemberHomeSignUpCopyLinkBannerEnabled$1
            @Override // o.drM
            /* renamed from: d */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        })).booleanValue();
    }

    @Provides
    public final String v(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return (String) c1555aFq.b(c1555aFq.a(), "nonMemberHome.signUpCopyLinkDisplayUrl", "netflix.com/signup...", new drM<dEI, String>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configNonMemberHomeSignUpCopyLinkDisplayUrl$1
            @Override // o.drM
            /* renamed from: c */
            public final String invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.i(dei);
            }
        });
    }

    @Provides
    public final String x(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return (String) c1555aFq.b(c1555aFq.a(), "nonMemberHome.signUpCopyLinkPath", "signup", new drM<dEI, String>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configNonMemberHomeSignUpCopyLinkPath$1
            @Override // o.drM
            /* renamed from: e */
            public final String invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.i(dei);
            }
        });
    }

    @Provides
    public final boolean y(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Boolean) c1555aFq.b(c1555aFq.a(), "nonMemberHome.upNextFeedBackButtonEnabled", Boolean.FALSE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configNonMemberHomeUpNextFeedBackButtonEnabled$1
            @Override // o.drM
            /* renamed from: a */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        })).booleanValue();
    }

    @Provides
    public final boolean w(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Boolean) c1555aFq.b(c1555aFq.a(), "player.prePlayComposeEnabled", Boolean.FALSE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configPlayerPrePlayComposeEnabled$1
            @Override // o.drM
            /* renamed from: c */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        })).booleanValue();
    }

    @Provides
    public final boolean z(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Boolean) c1555aFq.b(c1555aFq.a(), "PlayerUIGraphqlMigration.playerUIEpisodeListOnGraphqlEnabled", Boolean.TRUE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configPlayerUIGraphqlMigrationPlayerUIEpisodeListOnGraphqlEnabled$1
            @Override // o.drM
            /* renamed from: b */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        })).booleanValue();
    }

    @Provides
    public final boolean D(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Boolean) c1555aFq.b(c1555aFq.a(), "postPlay.postplayScaleAnimationEnabled", Boolean.FALSE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configPostPlayPostplayScaleAnimationEnabled$1
            @Override // o.drM
            /* renamed from: c */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        })).booleanValue();
    }

    @Provides
    public final boolean B(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Boolean) c1555aFq.b(c1555aFq.a(), "postPlay.threeUpPreviewsEnabled", Boolean.FALSE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configPostPlayThreeUpPreviewsEnabled$1
            @Override // o.drM
            /* renamed from: a */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        })).booleanValue();
    }

    @Provides
    public final boolean C(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Boolean) c1555aFq.b(c1555aFq.a(), "profile.profileLockEnabled", Boolean.TRUE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configProfileProfileLockEnabled$1
            @Override // o.drM
            /* renamed from: d */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        })).booleanValue();
    }

    @Provides
    public final boolean A(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Boolean) c1555aFq.b(c1555aFq.a(), "profile.viewingRestrictionsEnabled", Boolean.TRUE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configProfileViewingRestrictionsEnabled$1
            @Override // o.drM
            /* renamed from: e */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        })).booleanValue();
    }

    @Provides
    public final boolean G(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Boolean) c1555aFq.b(c1555aFq.a(), "pushNotifications.preTiramisuKoreaPushConsentEnabled", Boolean.FALSE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configPushNotificationsPreTiramisuKoreaPushConsentEnabled$1
            @Override // o.drM
            /* renamed from: a */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        })).booleanValue();
    }

    @Provides
    public final boolean I(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return ((Boolean) c1555aFq.b(c1555aFq.a(), "requests.removeClientRequestIdEnabled", Boolean.TRUE, new drM<dEI, Boolean>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule$configRequestsRemoveClientRequestIdEnabled$1
            @Override // o.drM
            /* renamed from: b */
            public final Boolean invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return aFB.d(dei);
            }
        })).booleanValue();
    }

    @Provides
    @Singleton
    public final C1563aFy F(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return c1555aFq.i().c("hendrixTest.sampleGroup1", "hendrixTest.sampleGroup2");
    }
}
