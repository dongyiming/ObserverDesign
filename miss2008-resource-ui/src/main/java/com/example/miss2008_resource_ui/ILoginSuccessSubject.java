package com.example.miss2008_resource_ui;

/**
 * @version : 1.0
 * @Description : TODO
 * @autho : dongyiming
 * @data : 2017/9/30 2:40
 * @package : com.example.miss2008_resource_ui
 */
public interface ILoginSuccessSubject {


    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
