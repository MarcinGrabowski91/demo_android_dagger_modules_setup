package com.elyeproj.modular1bottombase

import com.elyeproj.base.ActivityScope
import com.elyeproj.base.BaseComponent
import dagger.Component

@ActivityScope
@Component(dependencies = [BaseComponent::class], modules = [AppDependentModule::class])
interface MainComponent {
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        fun build(): MainComponent
        fun appDependentModule(appDependentModule: AppDependentModule): Builder
        fun baseComponent(baseComponent: BaseComponent): Builder
    }
}
