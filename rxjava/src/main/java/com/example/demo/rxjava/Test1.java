package com.example.demo.rxjava;

import com.sun.org.apache.xpath.internal.operations.String;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;


/**
 * @author lxl
 * @date 2021/2/1 10:03
 */


public class Test1 {

    public static void main(String[] args) {

        StringBuilder mRxOperatorsText = new StringBuilder();



        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<Integer> e) throws Exception {
                mRxOperatorsText.append("Observable emit 1" + "\n");

                e.onNext(1);
                mRxOperatorsText.append("Observable emit 2" + "\n");

                e.onNext(2);
                mRxOperatorsText.append("Observable emit 3" + "\n");

                e.onNext(3);
                e.onComplete();
                mRxOperatorsText.append("Observable emit 4" + "\n");

                e.onNext(4);
            }
        }).subscribe(new Observer<Integer>() {
            private int i;
            private Disposable mDisposable;

            @Override
            public void onSubscribe(@NonNull Disposable d) {
                mRxOperatorsText.append("onSubscribe : " + d.isDisposed() + "\n");

                mDisposable = d;
            }

            @Override
            public void onNext(@NonNull Integer integer) {
                mRxOperatorsText.append("onNext : value : " + integer + "\n");

                i++;
                if (i == 2) {
                    // 在RxJava 2.x 中，新增的Disposable可以做到切断的操作，让Observer观察者不再接收上游事件
                    mDisposable.dispose();
                    mRxOperatorsText.append("onNext : isDisposable : " + mDisposable.isDisposed() + "\n");

                }
            }

            @Override
            public void onError(@NonNull Throwable e) {
                mRxOperatorsText.append("onError : value : " + e.getMessage() + "\n");

            }

            @Override
            public void onComplete() {
                mRxOperatorsText.append("onComplete" + "\n");

            }
        });
    }
}
