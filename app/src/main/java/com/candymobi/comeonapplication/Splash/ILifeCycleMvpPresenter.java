package com.candymobi.comeonapplication.Splash;

import java.lang.ref.WeakReference;

public abstract class ILifeCycleMvpPresenter<T> implements ILifeCycle {
 protected    WeakReference<T> weakReference;

    protected ILifeCycleMvpPresenter() {
        super();
    }

    public ILifeCycleMvpPresenter(IMvpView mvpView) {
        super();
        onAttachView(mvpView);
    }

    @Override
    public void onAttachView(IMvpView iMvpView) {

        if (weakReference == null) {
            weakReference = new WeakReference(iMvpView);
        } else {
            T view = (T) weakReference.get();
            if (view != iMvpView) {
                weakReference = new WeakReference(iMvpView);
            }
        }
    }

    @Override
    public void onDestroy() {
        weakReference = null;

    }

    protected T getView() {
        T view = weakReference != null ? (T) weakReference.get() : null;
        if (view == null) {
            return getEmptyView();
        }
        return view;
    }

    protected abstract T getEmptyView();
}
