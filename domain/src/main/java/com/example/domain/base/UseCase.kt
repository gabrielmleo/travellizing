package com.example.domain.base

/**
 * Created by gleonardo on 29/12/2017.
 */
abstract class UseCase<T , P: UseCase.Params> {

    fun run(){}

    interface Params

}