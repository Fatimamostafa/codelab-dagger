package com.example.android.dagger.user

import javax.inject.Scope

/**
 * Since we've been using the scope annotation @ActivityScope
 * to annotate components that have the Activity managing its lifetime,
 * we need a scope that can cover multiple activities but not all the application,
 * we don't have anything like that yet so we need to create a new scope.
 */
@Scope
@MustBeDocumented
@Retention(value = AnnotationRetention.RUNTIME)
annotation class LoggedUserScope