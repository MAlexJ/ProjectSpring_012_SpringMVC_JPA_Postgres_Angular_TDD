'use strict';

// DRY роутинг в AngularJS:  https://habrahabr.ru/post/190958/
var myApp = angular.module('myApp', ["ngRoute"]).config(function ($routeProvider) {

    // ************  Home Page  ******************  

    $routeProvider.when('/home',
        {
            templateUrl: 'home.html',
            controller: 'homeController'
        });

    $routeProvider.when('/create',
        {
            templateUrl: 'create.html',
            controller: 'createController'
        });

    $routeProvider.when('/update',
        {
            templateUrl: 'update.html',
            controller: 'updateController'
        });

    $routeProvider.when('/delete',
        {
            templateUrl: 'delete.html',
            controller: 'deleteController'
        });

   
    $routeProvider.otherwise({redirectTo: '/home'});

});