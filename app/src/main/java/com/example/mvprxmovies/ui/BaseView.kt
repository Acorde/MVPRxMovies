package com.example.mvprxmovies.ui

import android.content.Context
import android.view.View

interface BaseView {

    fun getContext(): Context
    fun getActivityContext(): Context
    fun getView(): View
}