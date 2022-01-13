package com.sumin.shoppinglist.presentation

import android.app.Application
import com.sumin.shoppinglist.di.DaggerApplicationComponent

class ShopApplication : Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this)
    }
}
