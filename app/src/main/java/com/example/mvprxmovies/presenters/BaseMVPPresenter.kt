package com.example.mvprxmovies.presenters

import com.example.mvprxmovies.ui.BaseView

interface BaseMVPPresenter<V : BaseView> {

    /**
     * @return true if view is attached to presenter
     */
    val isAttached: Boolean

    /**
     * Called when view attached to presenter
     *
     * @param view
     */
    fun attach(view: V)

    /**
     * Called when view is detached from presenter
     */
    fun detach()
}
