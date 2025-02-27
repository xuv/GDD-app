package net.aiscope.gdd_app.dagger

import dagger.Subcomponent
import dagger.android.AndroidInjector
import net.aiscope.gdd_app.ui.selectDisease.SelectDiseaseActivity


@PerActivity
@Subcomponent(modules = [(SelectDiseaseModule::class)])
interface SelectDiseaseSubComponents : AndroidInjector<SelectDiseaseActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<SelectDiseaseActivity>()
}

