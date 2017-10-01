package com.example.miss2008_resource_ui;

import java.util.ArrayList;
import java.util.List;

/**
 * @version : 1.0
 * @Description : TODO
 * @autho : dongyiming
 * @data : 2017/9/30 3:04
 * @package : com.example.miss2008_resource_ui
 */
public class LoginSuccessSubjectImpl implements ILoginSuccessSubject {

    //所有注册的观察者集合
    private List<Observer> observers = new ArrayList<>();

    private LoginSuccessSubjectImpl() {
    }

    private static ILoginSuccessSubject loginSuccessSubjectImpl = new LoginSuccessSubjectImpl();

    public static ILoginSuccessSubject getInstance() {
        return loginSuccessSubjectImpl;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update();
        }
    }
}
