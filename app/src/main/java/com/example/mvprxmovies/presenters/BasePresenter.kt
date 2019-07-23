package com.example.mvprxmovies.presenters

import com.example.mvprxmovies.ui.BaseView

class BasePresenter<V : BaseView> : BaseMVPPresenter<V> {


    private var mView: V? = null


    override val isAttached: Boolean
        get() = mView != null

    override fun attach(view: V) {
        this.mView = view
    }

    override fun detach() {
        this.mView = null
    }

    fun getmView(): V? {
        return this.mView
    }
}
